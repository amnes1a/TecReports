package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Ticket_Enc_Bano
{
  private java.util.Date updated;
  private Boolean Solved;
  private java.util.Date created;
  private String ownerId;
  private String objectId;
  private String Details;
  private Bano IDr_Bano;
  public java.util.Date getUpdated()
  {
    return updated;
  }

  public Boolean getSolved()
  {
    return Solved;
  }

  public void setSolved( Boolean Solved )
  {
    this.Solved = Solved;
  }

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

  public String getDetails()
  {
    return Details;
  }

  public void setDetails( String Details )
  {
    this.Details = Details;
  }

  public Bano getIDr_Bano()
  {
    return IDr_Bano;
  }

  public void setIDr_Bano( Bano IDr_Bano )
  {
    this.IDr_Bano = IDr_Bano;
  }

                                                    
  public Ticket_Enc_Bano save()
  {
    return Backendless.Data.of( Ticket_Enc_Bano.class ).save( this );
  }

  public Future<Ticket_Enc_Bano> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Bano> future = new Future<Ticket_Enc_Bano>();
      Backendless.Data.of( Ticket_Enc_Bano.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Ticket_Enc_Bano> callback )
  {
    Backendless.Data.of( Ticket_Enc_Bano.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Ticket_Enc_Bano.class ).remove( this );
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
      Backendless.Data.of( Ticket_Enc_Bano.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Ticket_Enc_Bano.class ).remove( this, callback );
  }

  public static Ticket_Enc_Bano findById( String id )
  {
    return Backendless.Data.of( Ticket_Enc_Bano.class ).findById( id );
  }

  public static Future<Ticket_Enc_Bano> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Bano> future = new Future<Ticket_Enc_Bano>();
      Backendless.Data.of( Ticket_Enc_Bano.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Ticket_Enc_Bano> callback )
  {
    Backendless.Data.of( Ticket_Enc_Bano.class ).findById( id, callback );
  }

  public static Ticket_Enc_Bano findFirst()
  {
    return Backendless.Data.of( Ticket_Enc_Bano.class ).findFirst();
  }

  public static Future<Ticket_Enc_Bano> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Bano> future = new Future<Ticket_Enc_Bano>();
      Backendless.Data.of( Ticket_Enc_Bano.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Ticket_Enc_Bano> callback )
  {
    Backendless.Data.of( Ticket_Enc_Bano.class ).findFirst( callback );
  }

  public static Ticket_Enc_Bano findLast()
  {
    return Backendless.Data.of( Ticket_Enc_Bano.class ).findLast();
  }

  public static Future<Ticket_Enc_Bano> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Bano> future = new Future<Ticket_Enc_Bano>();
      Backendless.Data.of( Ticket_Enc_Bano.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Ticket_Enc_Bano> callback )
  {
    Backendless.Data.of( Ticket_Enc_Bano.class ).findLast( callback );
  }

  public static BackendlessCollection<Ticket_Enc_Bano> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Ticket_Enc_Bano.class ).find( query );
  }

  public static Future<BackendlessCollection<Ticket_Enc_Bano>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Ticket_Enc_Bano>> future = new Future<BackendlessCollection<Ticket_Enc_Bano>>();
      Backendless.Data.of( Ticket_Enc_Bano.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Ticket_Enc_Bano>> callback )
  {
    Backendless.Data.of( Ticket_Enc_Bano.class ).find( query, callback );
  }
}