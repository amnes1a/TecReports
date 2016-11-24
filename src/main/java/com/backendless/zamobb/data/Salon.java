package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Salon
{
  private String Name;
  private String objectId;
  private java.util.Date created;
  private String Accountable;
  private String ownerId;
  private java.util.Date updated;
  private String Image;
  private Location IDr_Location;
  private java.util.List<Notas> IDr_Notas;

  public Salon(){

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

  public String getAccountable()
  {
    return Accountable;
  }

  public void setAccountable( String Accountable )
  {
    this.Accountable = Accountable;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getImage()
  {
    return Image;
  }

  public void setImage( String Image )
  {
    this.Image = Image;
  }

  public Location getIDr_Location()
  {
    return IDr_Location;
  }

  public void setIDr_Location( Location IDr_Location )
  {
    this.IDr_Location = IDr_Location;
  }

  public java.util.List<Notas> getIDr_Notas()
  {
    return IDr_Notas;
  }

  public void setIDr_Notas( java.util.List<Notas> IDr_Notas )
  {
    this.IDr_Notas = IDr_Notas;
  }

                                                    
  public Salon save()
  {
    return Backendless.Data.of( Salon.class ).save( this );
  }

  public Future<Salon> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Salon> future = new Future<Salon>();
      Backendless.Data.of( Salon.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Salon> callback )
  {
    Backendless.Data.of( Salon.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Salon.class ).remove( this );
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
      Backendless.Data.of( Salon.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Salon.class ).remove( this, callback );
  }

  public static Salon findById( String id )
  {
    return Backendless.Data.of( Salon.class ).findById( id );
  }

  public static Future<Salon> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Salon> future = new Future<Salon>();
      Backendless.Data.of( Salon.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Salon> callback )
  {
    Backendless.Data.of( Salon.class ).findById( id, callback );
  }

  public static Salon findFirst()
  {
    return Backendless.Data.of( Salon.class ).findFirst();
  }

  public static Future<Salon> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Salon> future = new Future<Salon>();
      Backendless.Data.of( Salon.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Salon> callback )
  {
    Backendless.Data.of( Salon.class ).findFirst( callback );
  }

  public static Salon findLast()
  {
    return Backendless.Data.of( Salon.class ).findLast();
  }

  public static Future<Salon> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Salon> future = new Future<Salon>();
      Backendless.Data.of( Salon.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Salon> callback )
  {
    Backendless.Data.of( Salon.class ).findLast( callback );
  }

  public static BackendlessCollection<Salon> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Salon.class ).find( query );
  }

  public static Future<BackendlessCollection<Salon>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Salon>> future = new Future<BackendlessCollection<Salon>>();
      Backendless.Data.of( Salon.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Salon>> callback )
  {
    Backendless.Data.of( Salon.class ).find( query, callback );
  }
}