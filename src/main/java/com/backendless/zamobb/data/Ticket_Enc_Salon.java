package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Ticket_Enc_Salon
{
  private Boolean Solved;
  private java.util.Date created;
  private String ownerId;
  private String Details;
  private String objectId;
  private java.util.Date updated;
  private Salon IDr_Salon;

  public Ticket_Enc_Salon(){

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

  public String getDetails()
  {
    return Details;
  }

  public void setDetails( String Details )
  {
    this.Details = Details;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public Salon getIDr_Salon()
  {
    return IDr_Salon;
  }

  public void setIDr_Salon( Salon IDr_Salon )
  {
    this.IDr_Salon = IDr_Salon;
  }

                                                    
  public Ticket_Enc_Salon save()
  {
    return Backendless.Data.of( Ticket_Enc_Salon.class ).save( this );
  }

  public Future<Ticket_Enc_Salon> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Salon> future = new Future<Ticket_Enc_Salon>();
      Backendless.Data.of( Ticket_Enc_Salon.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Ticket_Enc_Salon> callback )
  {
    Backendless.Data.of( Ticket_Enc_Salon.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Ticket_Enc_Salon.class ).remove( this );
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
      Backendless.Data.of( Ticket_Enc_Salon.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Ticket_Enc_Salon.class ).remove( this, callback );
  }

  public static Ticket_Enc_Salon findById( String id )
  {
    return Backendless.Data.of( Ticket_Enc_Salon.class ).findById( id );
  }

  public static Future<Ticket_Enc_Salon> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Salon> future = new Future<Ticket_Enc_Salon>();
      Backendless.Data.of( Ticket_Enc_Salon.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Ticket_Enc_Salon> callback )
  {
    Backendless.Data.of( Ticket_Enc_Salon.class ).findById( id, callback );
  }

  public static Ticket_Enc_Salon findFirst()
  {
    return Backendless.Data.of( Ticket_Enc_Salon.class ).findFirst();
  }

  public static Future<Ticket_Enc_Salon> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Salon> future = new Future<Ticket_Enc_Salon>();
      Backendless.Data.of( Ticket_Enc_Salon.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Ticket_Enc_Salon> callback )
  {
    Backendless.Data.of( Ticket_Enc_Salon.class ).findFirst( callback );
  }

  public static Ticket_Enc_Salon findLast()
  {
    return Backendless.Data.of( Ticket_Enc_Salon.class ).findLast();
  }

  public static Future<Ticket_Enc_Salon> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Ticket_Enc_Salon> future = new Future<Ticket_Enc_Salon>();
      Backendless.Data.of( Ticket_Enc_Salon.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Ticket_Enc_Salon> callback )
  {
    Backendless.Data.of( Ticket_Enc_Salon.class ).findLast( callback );
  }

  public static BackendlessCollection<Ticket_Enc_Salon> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Ticket_Enc_Salon.class ).find( query );
  }

  public static Future<BackendlessCollection<Ticket_Enc_Salon>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Ticket_Enc_Salon>> future = new Future<BackendlessCollection<Ticket_Enc_Salon>>();
      Backendless.Data.of( Ticket_Enc_Salon.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Ticket_Enc_Salon>> callback )
  {
    Backendless.Data.of( Ticket_Enc_Salon.class ).find( query, callback );
  }
}