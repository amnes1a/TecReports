package com.backendless.zamobb.data;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Tickets_Dica
{
  private String ownerId;
  private java.util.Date created;
  private String Student_ID;
  private String IDr_Dica;
  private java.util.Date updated;
  private Boolean Status;
  private String objectId;
  private Schedule IDr_Schedule;
  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getStudent_ID()
  {
    return Student_ID;
  }

  public void setStudent_ID( String Student_ID )
  {
    this.Student_ID = Student_ID;
  }

  public String getIDr_Dica()
  {
    return IDr_Dica;
  }

  public void setIDr_Dica( String IDr_Dica )
  {
    this.IDr_Dica = IDr_Dica;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public Boolean getStatus()
  {
    return Status;
  }

  public void setStatus( Boolean Status )
  {
    this.Status = Status;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public Schedule getIDr_Schedule()
  {
    return IDr_Schedule;
  }

  public void setIDr_Schedule( Schedule IDr_Schedule )
  {
    this.IDr_Schedule = IDr_Schedule;
  }


  public Tickets_Dica save()
  {
    return Backendless.Data.of( Tickets_Dica.class ).save( this );
  }

  public Future<Tickets_Dica> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Tickets_Dica> future = new Future<Tickets_Dica>();
      Backendless.Data.of( Tickets_Dica.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Tickets_Dica> callback )
  {
    Backendless.Data.of( Tickets_Dica.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Tickets_Dica.class ).remove( this );
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
      Backendless.Data.of( Tickets_Dica.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Tickets_Dica.class ).remove( this, callback );
  }

  public static Tickets_Dica findById( String id )
  {
    return Backendless.Data.of( Tickets_Dica.class ).findById( id );
  }

  public static Future<Tickets_Dica> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Tickets_Dica> future = new Future<Tickets_Dica>();
      Backendless.Data.of( Tickets_Dica.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Tickets_Dica> callback )
  {
    Backendless.Data.of( Tickets_Dica.class ).findById( id, callback );
  }

  public static Tickets_Dica findFirst()
  {
    return Backendless.Data.of( Tickets_Dica.class ).findFirst();
  }

  public static Future<Tickets_Dica> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Tickets_Dica> future = new Future<Tickets_Dica>();
      Backendless.Data.of( Tickets_Dica.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Tickets_Dica> callback )
  {
    Backendless.Data.of( Tickets_Dica.class ).findFirst( callback );
  }

  public static Tickets_Dica findLast()
  {
    return Backendless.Data.of( Tickets_Dica.class ).findLast();
  }

  public static Future<Tickets_Dica> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Tickets_Dica> future = new Future<Tickets_Dica>();
      Backendless.Data.of( Tickets_Dica.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Tickets_Dica> callback )
  {
    Backendless.Data.of( Tickets_Dica.class ).findLast( callback );
  }

  public static BackendlessCollection<Tickets_Dica> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Tickets_Dica.class ).find( query );
  }

  public static Future<BackendlessCollection<Tickets_Dica>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Tickets_Dica>> future = new Future<BackendlessCollection<Tickets_Dica>>();
      Backendless.Data.of( Tickets_Dica.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Tickets_Dica>> callback )
  {
    Backendless.Data.of( Tickets_Dica.class ).find( query, callback );
  }
}