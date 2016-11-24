package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Hour
{
  private String objectId;
  private String Time_a;
  private String Time_b;
  private java.util.Date updated;
  private String ownerId;
  private java.util.Date created;

  public Hour(){

  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getTime_a()
  {
    return Time_a;
  }

  public void setTime_a( String Time_a )
  {
    this.Time_a = Time_a;
  }

  public String getTime_b()
  {
    return Time_b;
  }

  public void setTime_b( String Time_b )
  {
    this.Time_b = Time_b;
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

                                                    
  public Hour save()
  {
    return Backendless.Data.of( Hour.class ).save( this );
  }

  public Future<Hour> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Hour> future = new Future<Hour>();
      Backendless.Data.of( Hour.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Hour> callback )
  {
    Backendless.Data.of( Hour.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Hour.class ).remove( this );
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
      Backendless.Data.of( Hour.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Hour.class ).remove( this, callback );
  }

  public static Hour findById( String id )
  {
    return Backendless.Data.of( Hour.class ).findById( id );
  }

  public static Future<Hour> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Hour> future = new Future<Hour>();
      Backendless.Data.of( Hour.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Hour> callback )
  {
    Backendless.Data.of( Hour.class ).findById( id, callback );
  }

  public static Hour findFirst()
  {
    return Backendless.Data.of( Hour.class ).findFirst();
  }

  public static Future<Hour> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Hour> future = new Future<Hour>();
      Backendless.Data.of( Hour.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Hour> callback )
  {
    Backendless.Data.of( Hour.class ).findFirst( callback );
  }

  public static Hour findLast()
  {
    return Backendless.Data.of( Hour.class ).findLast();
  }

  public static Future<Hour> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Hour> future = new Future<Hour>();
      Backendless.Data.of( Hour.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Hour> callback )
  {
    Backendless.Data.of( Hour.class ).findLast( callback );
  }

  public static BackendlessCollection<Hour> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Hour.class ).find( query );
  }

  public static Future<BackendlessCollection<Hour>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Hour>> future = new Future<BackendlessCollection<Hour>>();
      Backendless.Data.of( Hour.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Hour>> callback )
  {
    Backendless.Data.of( Hour.class ).find( query, callback );
  }
}