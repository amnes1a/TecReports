package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Schedule
{
  private java.util.Date created;
  private String objectId;
  private String ownerId;
  private java.util.Date updated;
  private Boolean Active;
  private Events IDr_Event;
  private Day IDr_Day;
  private java.util.List<Salon> IDr_Salon;
  public java.util.Date getCreated()
  {
    return created;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public Boolean getActive()
  {
    return Active;
  }

  public void setActive( Boolean Active )
  {
    this.Active = Active;
  }

  public Events getIDr_Event()
  {
    return IDr_Event;
  }

  public void setIDr_Event( Events IDr_Event )
  {
    this.IDr_Event = IDr_Event;
  }

  public Day getIDr_Day()
  {
    return IDr_Day;
  }

  public void setIDr_Day( Day IDr_Day )
  {
    this.IDr_Day = IDr_Day;
  }

  public java.util.List<Salon> getIDr_Salon()
  {
    return IDr_Salon;
  }

  public void setIDr_Salon( java.util.List<Salon> IDr_Salon )
  {
    this.IDr_Salon = IDr_Salon;
  }

                                                    
  public Schedule save()
  {
    return Backendless.Data.of( Schedule.class ).save( this );
  }

  public Future<Schedule> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Schedule> future = new Future<Schedule>();
      Backendless.Data.of( Schedule.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Schedule> callback )
  {
    Backendless.Data.of( Schedule.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Schedule.class ).remove( this );
  }

  public Future<Long> removeAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Long> future = new Future<Long>();
      Backendless.Data.of( Schedule.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Schedule.class ).remove( this, callback );
  }

  public static Schedule findById( String id )
  {
    return Backendless.Data.of( Schedule.class ).findById( id );
  }

  public static Future<Schedule> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Schedule> future = new Future<Schedule>();
      Backendless.Data.of( Schedule.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Schedule> callback )
  {
    Backendless.Data.of( Schedule.class ).findById( id, callback );
  }

  public static Schedule findFirst()
  {
    return Backendless.Data.of( Schedule.class ).findFirst();
  }

  public static Future<Schedule> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Schedule> future = new Future<Schedule>();
      Backendless.Data.of( Schedule.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Schedule> callback )
  {
    Backendless.Data.of( Schedule.class ).findFirst( callback );
  }

  public static Schedule findLast()
  {
    return Backendless.Data.of( Schedule.class ).findLast();
  }

  public static Future<Schedule> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Schedule> future = new Future<Schedule>();
      Backendless.Data.of( Schedule.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Schedule> callback )
  {
    Backendless.Data.of( Schedule.class ).findLast( callback );
  }

  public static BackendlessCollection<Schedule> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Schedule.class ).find( query );
  }

  public static Future<BackendlessCollection<Schedule>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Schedule>> future = new Future<BackendlessCollection<Schedule>>();
      Backendless.Data.of( Schedule.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Schedule>> callback )
  {
    Backendless.Data.of( Schedule.class ).find( query, callback );
  }
}