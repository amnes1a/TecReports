package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Notas
{
  private String objectId;
  private String Description;
  private java.util.Date updated;
  private java.util.Date created;
  private String ownerId;
  public String getObjectId()
  {
    return objectId;
  }

  public String getDescription()
  {
    return Description;
  }

  public void setDescription( String Description )
  {
    this.Description = Description;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

                                                    
  public Notas save()
  {
    return Backendless.Data.of( Notas.class ).save( this );
  }

  public Future<Notas> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Notas> future = new Future<Notas>();
      Backendless.Data.of( Notas.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Notas> callback )
  {
    Backendless.Data.of( Notas.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Notas.class ).remove( this );
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
      Backendless.Data.of( Notas.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Notas.class ).remove( this, callback );
  }

  public static Notas findById( String id )
  {
    return Backendless.Data.of( Notas.class ).findById( id );
  }

  public static Future<Notas> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Notas> future = new Future<Notas>();
      Backendless.Data.of( Notas.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Notas> callback )
  {
    Backendless.Data.of( Notas.class ).findById( id, callback );
  }

  public static Notas findFirst()
  {
    return Backendless.Data.of( Notas.class ).findFirst();
  }

  public static Future<Notas> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Notas> future = new Future<Notas>();
      Backendless.Data.of( Notas.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Notas> callback )
  {
    Backendless.Data.of( Notas.class ).findFirst( callback );
  }

  public static Notas findLast()
  {
    return Backendless.Data.of( Notas.class ).findLast();
  }

  public static Future<Notas> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Notas> future = new Future<Notas>();
      Backendless.Data.of( Notas.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Notas> callback )
  {
    Backendless.Data.of( Notas.class ).findLast( callback );
  }

  public static BackendlessCollection<Notas> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Notas.class ).find( query );
  }

  public static Future<BackendlessCollection<Notas>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Notas>> future = new Future<BackendlessCollection<Notas>>();
      Backendless.Data.of( Notas.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Notas>> callback )
  {
    Backendless.Data.of( Notas.class ).find( query, callback );
  }
}