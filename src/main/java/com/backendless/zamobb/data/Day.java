package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Day
{
  private String objectId;
  private java.util.Date created;
  private java.util.Date updated;
  private String Day;
  private String ownerId;
  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getDay()
  {
    return Day;
  }

  public void setDay( String Day )
  {
    this.Day = Day;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

                                                    
  public Day save()
  {
    return Backendless.Data.of( Day.class ).save( this );
  }

  public Future<Day> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Day> future = new Future<Day>();
      Backendless.Data.of( Day.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Day> callback )
  {
    Backendless.Data.of( Day.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Day.class ).remove( this );
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
      Backendless.Data.of( Day.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Day.class ).remove( this, callback );
  }

  public static Day findById( String id )
  {
    return Backendless.Data.of( Day.class ).findById( id );
  }

  public static Future<Day> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Day> future = new Future<Day>();
      Backendless.Data.of( Day.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Day> callback )
  {
    Backendless.Data.of( Day.class ).findById( id, callback );
  }

  public static Day findFirst()
  {
    return Backendless.Data.of( Day.class ).findFirst();
  }

  public static Future<Day> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Day> future = new Future<Day>();
      Backendless.Data.of( Day.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Day> callback )
  {
    Backendless.Data.of( Day.class ).findFirst( callback );
  }

  public static Day findLast()
  {
    return Backendless.Data.of( Day.class ).findLast();
  }

  public static Future<Day> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Day> future = new Future<Day>();
      Backendless.Data.of( Day.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Day> callback )
  {
    Backendless.Data.of( Day.class ).findLast( callback );
  }

  public static BackendlessCollection<Day> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Day.class ).find( query );
  }

  public static Future<BackendlessCollection<Day>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Day>> future = new Future<BackendlessCollection<Day>>();
      Backendless.Data.of( Day.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Day>> callback )
  {
    Backendless.Data.of( Day.class ).find( query, callback );
  }
}