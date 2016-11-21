package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Events
{
  private String objectId;
  private java.util.Date updated;
  private String ownerId;
  private java.util.Date created;
  private String Event_Name;
  private Hour IDr_Hour;
  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getEvent_Name()
  {
    return Event_Name;
  }

  public void setEvent_Name( String Event_Name )
  {
    this.Event_Name = Event_Name;
  }

  public Hour getIDr_Hour()
  {
    return IDr_Hour;
  }

  public void setIDr_Hour( Hour IDr_Hour )
  {
    this.IDr_Hour = IDr_Hour;
  }

                                                    
  public Events save()
  {
    return Backendless.Data.of( Events.class ).save( this );
  }

  public Future<Events> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Events> future = new Future<Events>();
      Backendless.Data.of( Events.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Events> callback )
  {
    Backendless.Data.of( Events.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Events.class ).remove( this );
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
      Backendless.Data.of( Events.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Events.class ).remove( this, callback );
  }

  public static Events findById( String id )
  {
    return Backendless.Data.of( Events.class ).findById( id );
  }

  public static Future<Events> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Events> future = new Future<Events>();
      Backendless.Data.of( Events.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Events> callback )
  {
    Backendless.Data.of( Events.class ).findById( id, callback );
  }

  public static Events findFirst()
  {
    return Backendless.Data.of( Events.class ).findFirst();
  }

  public static Future<Events> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Events> future = new Future<Events>();
      Backendless.Data.of( Events.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Events> callback )
  {
    Backendless.Data.of( Events.class ).findFirst( callback );
  }

  public static Events findLast()
  {
    return Backendless.Data.of( Events.class ).findLast();
  }

  public static Future<Events> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Events> future = new Future<Events>();
      Backendless.Data.of( Events.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Events> callback )
  {
    Backendless.Data.of( Events.class ).findLast( callback );
  }

  public static BackendlessCollection<Events> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Events.class ).find( query );
  }

  public static Future<BackendlessCollection<Events>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Events>> future = new Future<BackendlessCollection<Events>>();
      Backendless.Data.of( Events.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Events>> callback )
  {
    Backendless.Data.of( Events.class ).find( query, callback );
  }
}