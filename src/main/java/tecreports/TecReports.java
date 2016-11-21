package tecreports;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.persistence.BackendlessDataQuery;
import com.backendless.persistence.QueryOptions;
import com.backendless.zamobb.data.*;


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

    public static Iterator getRooms(String locationId){
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause( "IDr_Location.objectId = '"+locationId+"'");

        BackendlessCollection<Salon> rooms = Backendless.Data.of( Salon.class ).find(dataQuery);
        return rooms.getCurrentPage().iterator();
    }

    public static ArrayList getBathrooms(String locationId){

        return null;
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
