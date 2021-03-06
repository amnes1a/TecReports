package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Location
{
  private String ownerId;
  private String Name;
  private String objectId;
  private java.util.Date created;
  private java.util.Date updated;
  public String getOwnerId()
  {
    return ownerId;
  }

  public String getName()
  {
    return Name;
  }

  public void setName( String Name )
  {
    this.Name = Name;
  }

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

                                                    
  public Location save()
  {
    return Backendless.Data.of( Location.class ).save( this );
  }

  public Future<Location> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Location> future = new Future<Location>();
      Backendless.Data.of( Location.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Location> callback )
  {
    Backendless.Data.of( Location.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Location.class ).remove( this );
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
      Backendless.Data.of( Location.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Location.class ).remove( this, callback );
  }

  public static Location findById( String id )
  {
    return Backendless.Data.of( Location.class ).findById( id );
  }

  public static Future<Location> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Location> future = new Future<Location>();
      Backendless.Data.of( Location.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Location> callback )
  {
    Backendless.Data.of( Location.class ).findById( id, callback );
  }

  public static Location findFirst()
  {
    return Backendless.Data.of( Location.class ).findFirst();
  }

  public static Future<Location> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Location> future = new Future<Location>();
      Backendless.Data.of( Location.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Location> callback )
  {
    Backendless.Data.of( Location.class ).findFirst( callback );
  }

  public static Location findLast()
  {
    return Backendless.Data.of( Location.class ).findLast();
  }

  public static Future<Location> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Location> future = new Future<Location>();
      Backendless.Data.of( Location.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Location> callback )
  {
    Backendless.Data.of( Location.class ).findLast( callback );
  }

  public static BackendlessCollection<Location> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Location.class ).find( query );
  }

  public static Future<BackendlessCollection<Location>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Location>> future = new Future<BackendlessCollection<Location>>();
      Backendless.Data.of( Location.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Location>> callback )
  {
    Backendless.Data.of( Location.class ).find( query, callback );
  }
}