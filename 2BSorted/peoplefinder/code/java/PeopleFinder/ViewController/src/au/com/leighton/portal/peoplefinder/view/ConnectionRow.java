package au.com.leighton.portal.peoplefinder.view;

/**
 * Contains the connection data to be displayed in a single row on the UI.
 * a row may consist of up to 3 connection items
 */
public class ConnectionRow
{
    private ConnectionView _connection1;
    private ConnectionView _connection2;
  private ConnectionView _connection3;
  private ConnectionView _connection;

    public ConnectionRow()
    {
        super();
    }

  public void setConnection1(ConnectionView connection1)
  {
      this._connection1 = connection1;
  }

  public boolean isConnection1Valid()
  {
      return getConnection1() != null;
  }

  public ConnectionView getConnection1()
  {
      return _connection1;
  }
  
  
  public void setConnection(ConnectionView connection)
  {
      this._connection = connection;
  }

  public boolean isConnectionValid()
  {
      return getConnection() != null;
  }

  public ConnectionView getConnection()
  {
      return _connection;
  }
  
  

    public void setConnection2(ConnectionView connection2)
    {
        this._connection2 = connection2;
    }

    public boolean isConnection2Valid()
    {
        return getConnection2() != null;
    }

    public ConnectionView getConnection2()
    {
        return _connection2;
    }

    public void setConnection3(ConnectionView connection3)
    {
        this._connection3 = connection3;
    }

    public boolean isConnection3Valid()
    {
        return getConnection3() != null;
    }

    public ConnectionView getConnection3()
    {
        return _connection3;
    }
}
