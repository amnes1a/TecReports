package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Bano
{
  private java.util.Date created;
  private String ownerId;
  private String objectId;
  private String Descripcion;
  private String Tipo;
  private java.util.Date updated;
  private Location IDr_Location;
  private java.util.List<Notas> IDr_Nota;
  public java.util.Date getCreated()
  {
    return created;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getDescripcion()
  {
    return Descripcion;
  }

  public void setDescripcion( String Descripcion )
  {
    this.Descripcion = Descripcion;
  }

  public String getTipo()
  {
    return Tipo;
  }

  public void setTipo( String Tipo )
  {
    this.Tipo = Tipo;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public Location getIDr_Location()
  {
    return IDr_Location;
  }

  public void setIDr_Location( Location IDr_Location )
  {
    this.IDr_Location = IDr_Location;
  }

  public java.util.List<Notas> getIDr_Nota()
  {
    return IDr_Nota;
  }

  public void setIDr_Nota( java.util.List<Notas> IDr_Nota )
  {
    this.IDr_Nota = IDr_Nota;
  }

                                                    
  public Bano save()
  {
    return Backendless.Data.of( Bano.class ).save( this );
  }

  public Future<Bano> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Bano> future = new Future<Bano>();
      Backendless.Data.of( Bano.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Bano> callback )
  {
    Backendless.Data.of( Bano.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Bano.class ).remove( this );
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
      Backendless.Data.of( Bano.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Bano.class ).remove( this, callback );
  }

  public static Bano findById( String id )
  {
    return Backendless.Data.of( Bano.class ).findById( id );
  }

  public static Future<Bano> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Bano> future = new Future<Bano>();
      Backendless.Data.of( Bano.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Bano> callback )
  {
    Backendless.Data.of( Bano.class ).findById( id, callback );
  }

  public static Bano findFirst()
  {
    return Backendless.Data.of( Bano.class ).findFirst();
  }

  public static Future<Bano> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Bano> future = new Future<Bano>();
      Backendless.Data.of( Bano.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Bano> callback )
  {
    Backendless.Data.of( Bano.class ).findFirst( callback );
  }

  public static Bano findLast()
  {
    return Backendless.Data.of( Bano.class ).findLast();
  }

  public static Future<Bano> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Bano> future = new Future<Bano>();
      Backendless.Data.of( Bano.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Bano> callback )
  {
    Backendless.Data.of( Bano.class ).findLast( callback );
  }

  public static BackendlessCollection<Bano> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Bano.class ).find( query );
  }

  public static Future<BackendlessCollection<Bano>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Bano>> future = new Future<BackendlessCollection<Bano>>();
      Backendless.Data.of( Bano.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Bano>> callback )
  {
    Backendless.Data.of( Bano.class ).find( query, callback );
  }
}