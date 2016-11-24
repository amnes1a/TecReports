package tecreports;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.persistence.BackendlessDataQuery;
import com.backendless.persistence.QueryOptions;
import com.backendless.zamobb.data.*;


import javax.ejb.Schedules;
import java.util.*;

/**
 * Created by arturozamora on 11/19/16.
 */
public final class TecReports {
    private static final String APP_ID = "72CC8507-1E4F-B3D0-FF94-E57BD75C6700";
    private static final String APP_KEY = "C7773C5B-65FF-ACA3-FF04-55C718BEA200";
    private static final String VERSION = "v1";

    public static Iterator getLocations(){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        BackendlessCollection<Location> location = Backendless.Data.of( Location.class ).find( dataQuery );
        return location.getCurrentPage().iterator();
    }

    public static Iterator<Salon> getRooms(String locationId){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "IDr_Location.objectId = '"+locationId+"'");

        BackendlessCollection<Salon> rooms = Backendless.Data.of( Salon.class ).find(dataQuery);
        return rooms.getCurrentPage().iterator();
    }

    public static Iterator<Bano> getBathrooms(String locationId){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "IDr_Location.objectId = '"+locationId+"'");

        BackendlessCollection<Bano> banos = Backendless.Data.of( Bano.class ).find(dataQuery);
        return banos.getCurrentPage().iterator();
    }

    public static Salon getRoom(String roomId){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "objectId = '"+roomId+"'");

        BackendlessCollection<Salon> rooms = Backendless.Data.of( Salon.class ).find(dataQuery);
        Iterator<Salon> iterator = rooms.getCurrentPage().iterator();

        return iterator.next();
    }

    public static Bano getBano(String banoId){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "objectId = '"+banoId+"'");

        BackendlessCollection<Bano> bano = Backendless.Data.of( Bano.class ).find(dataQuery);
        Iterator<Bano> iterator = bano.getCurrentPage().iterator();

        return iterator.next();
    }


    public static boolean setScheduleEvent(String hourId, String eventName, String roomId,
                                        String dayId, String studentId){

        HashMap hour = new HashMap();
        hour.put( "___class", "Hour" );
        hour.put( "objectId", hourId);

        HashMap event = new HashMap();
        event.put( "___class", "Events" );
        event.put( "IDr_Hour", hour);
        event.put( "Event_Name", eventName);

        HashMap salon = new HashMap();
        salon.put( "___class", "Salon" );
        salon.put( "objectId", roomId);

        HashMap day = new HashMap();
        day.put( "___class", "Day" );
        day.put( "objectId", dayId);


        HashMap schedule = new HashMap();
        schedule.put( "___class", "Schedule" );
        schedule.put( "IDr_Salon", salon);
        schedule.put( "IDr_Day", day);
        schedule.put( "IDr_Event", event);


        HashMap ticketsDica = new HashMap();
        ticketsDica.put( "___class", "Tickets_Dica" );
        ticketsDica.put( "IDr_Dica", "3060DFC6-5215-E7E7-FFA4-B54E31896400");
        ticketsDica.put( "Student_ID", studentId);
        ticketsDica.put( "IDr_Schedule", schedule);

        boolean okStatus = false;
        try {
            Backendless.Persistence.of("Tickets_Dica").save(ticketsDica);
            okStatus = true;
        }catch (Exception e ){
            System.out.print(e.toString());
        }
        return okStatus;
    }

    private static void setHour(Events e){
        BackendlessDataQuery hourQuery = new BackendlessDataQuery();
        hourQuery.setWhereClause( "objectId = '"+e.getObjectId()+"'");

        QueryOptions queryOptionsHour = new QueryOptions();
        queryOptionsHour.addRelated("IDr_Hour");
        hourQuery.setQueryOptions(queryOptionsHour);

        BackendlessCollection<Events> hour = Backendless.Data.of( Events.class ).find(hourQuery);
        Iterator<Events> hourEvents = hour.getCurrentPage().iterator();

        Events newEvent = hourEvents.next();

        e.setIDr_Hour(newEvent.getIDr_Hour());

    }

    public static Map<Day, ArrayList<Events>> getRoomShcedule(String roomId){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "active = true AND IDr_Salon.objectId = '"+roomId+"'");
        //dataQuery.setWhereClause( "active = true AND IDr_Salon.objectId = '879F9A1C-3E8B-AD29-FF52-EC478AD18400'");

        QueryOptions queryOptions = new QueryOptions();
        queryOptions.addRelated("IDr_Day");
        queryOptions.addRelated("IDr_Event");
        dataQuery.setQueryOptions(queryOptions);

        BackendlessCollection<Schedule> schedules = Backendless.Data.of( Schedule.class ).find(dataQuery);
        Iterator<Schedule> iterator = schedules.getCurrentPage().iterator();

        Map <Day, ArrayList<Events>> dayEvents = new HashMap<Day, ArrayList<Events>>();


        while( iterator.hasNext() ) {
            Schedule s = iterator.next();
            String day = s.getIDr_Day().getObjectId();

            if(dayEvents.get(day) == null){
                ArrayList<Events> events = new ArrayList<Events>();
                events.add(s.getIDr_Event());
                dayEvents.put(s.getIDr_Day(), events);
                setHour(s.getIDr_Event());
            }else{
                ArrayList<Events> events = dayEvents.get(day);
                events.add(s.getIDr_Event());
                setHour(s.getIDr_Event());
            }
        }

        return dayEvents;
    }

    public static ArrayList<Tickets_Dica> getDicaTickets(String dicaId){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "Status = false AND IDr_Dica = '"+dicaId+"'");
        //dataQuery.setWhereClause( "Status = false AND IDr_Dica = '3060DFC6-5215-E7E7-FFA4-B54E31896400'");

        QueryOptions queryOptions = new QueryOptions();
        queryOptions.addRelated("IDr_Schedule");
        queryOptions.addRelated("IDr_Event");
        queryOptions.addRelated("IDr_Hour");
        dataQuery.setQueryOptions(queryOptions);

        BackendlessCollection<Tickets_Dica> ticketsD = Backendless.Data.of( Tickets_Dica.class ).find(dataQuery);
        Iterator<Tickets_Dica> iterator = ticketsD.getCurrentPage().iterator();

        ArrayList<Tickets_Dica> ticketsDica = new ArrayList<Tickets_Dica>();

        while( iterator.hasNext() ) {
            Tickets_Dica s = iterator.next();

            Schedule sch = s.getIDr_Schedule();
            /*
            System.out.println("Alumno: "+s.getStudent_ID());
            System.out.println("Salon: "+sch.getIDr_Salon().getName());
            System.out.println("Day: "+sch.getIDr_Day().getDay());
            */

            // GET HOURS
            BackendlessDataQuery hoursQuery = new BackendlessDataQuery();
            hoursQuery.setWhereClause( "objectId = '"+sch.getIDr_Event().getObjectId()+"'");

            QueryOptions hoursOptions = new QueryOptions();
            hoursOptions.addRelated("IDr_Hour");
            hoursQuery.setQueryOptions(hoursOptions);

            BackendlessCollection<Events> event = Backendless.Data.of( Events.class ).find(hoursQuery);
            Iterator<Events> iteratore = event.getCurrentPage().iterator();

            sch.setIDr_Event(iteratore.next());

            //System.out.println("Hour: "+sch.getIDr_Event().getIDr_Hour().getTime_a()+" to "
            //                           +sch.getIDr_Event().getIDr_Hour().getTime_b());

            // END GET HOURS
            //System.out.println("Event: "+sch.getIDr_Event().getEvent_Name());
            ticketsDica.add(s);
        }

        return ticketsDica;
    }


    public static boolean solveTicketDica(boolean option, String scheduleId, String ticketId){
        HashMap schedule = new HashMap();
        schedule.put( "___class", "Schedule" );
        schedule.put("objectId", scheduleId);
        schedule.put("Active", option);

        HashMap ticketsDica = new HashMap();
        ticketsDica.put( "___class", "Tickets_Dica" );
        ticketsDica.put("objectId", ticketId);
        ticketsDica.put("Status", true);
        ticketsDica.put("IDr_Schedule", schedule);

        boolean okStatus = false;
        try {
            Backendless.Persistence.of("Tickets_Dica").save(ticketsDica);
            okStatus = true;
        }catch (Exception e ){
            System.out.print(e.toString());
        }
        return okStatus;

    }

    public static Iterator<Ticket_Enc_Salon> getEncTicketsSalon(){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "Solved = false" );

        QueryOptions queryOptions = new QueryOptions();
        queryOptions.addRelated("IDr_Salon");
        dataQuery.setQueryOptions(queryOptions);

        BackendlessCollection<Ticket_Enc_Salon> tickets = Backendless.Data.of( Ticket_Enc_Salon.class ).find(dataQuery);
        Iterator<Ticket_Enc_Salon> iterator = tickets.getCurrentPage().iterator();

        return iterator;

    }

    public static Iterator<Ticket_Enc_Bano> getEncTicketsBano(){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "Solved = false" );

        QueryOptions queryOptions = new QueryOptions();
        queryOptions.addRelated("IDr_Bano");
        dataQuery.setQueryOptions(queryOptions);

        BackendlessCollection<Ticket_Enc_Bano> tickets = Backendless.Data.of( Ticket_Enc_Bano.class ).find(dataQuery);
        Iterator<Ticket_Enc_Bano> iterator = tickets.getCurrentPage().iterator();

        return iterator;

    }

    public static boolean solveTicketEnc(String typeTicket, String ticketId){

        HashMap ticketsEnc = new HashMap();
        if(typeTicket.equals("bano")){
            ticketsEnc.put( "___class", "Ticket_Enc_Bano" );
        }else{
            ticketsEnc.put( "___class", "Ticket_Enc_Salon" );
        }
        ticketsEnc.put("objectId", ticketId);
        ticketsEnc.put("Solved", true);

        boolean okStatus = false;
        try {
            if(typeTicket.equals("bano")){
                Backendless.Persistence.of("Ticket_Enc_Bano").save(ticketsEnc);
            }else{
                Backendless.Persistence.of("Ticket_Enc_Salon").save(ticketsEnc);
            }
            okStatus = true;
        }catch (Exception e ){
            System.out.print(e.toString());
        }
        return okStatus;

    }

    public static String getAppId() {
        return APP_ID;
    }

    public static String getAppKey() {
        return APP_KEY;
    }

    public static String getVERSION() {
        return VERSION;
    }
}
