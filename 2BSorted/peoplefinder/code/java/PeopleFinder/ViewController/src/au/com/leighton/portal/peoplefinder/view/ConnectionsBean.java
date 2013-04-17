package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.ActorDetail;
import au.com.leighton.portal.peoplefinder.model.LogUtility;
import au.com.leighton.portal.peoplefinder.model.Response;
import au.com.leighton.portal.peoplefinder.model.StdUtility;
import au.com.leighton.portal.peoplefinder.model.Utility;
import au.com.leighton.portal.peoplefinder.model.WCSConnectionItem;
import au.com.leighton.portal.peoplefinder.model.common.AppModule;

import au.com.leighton.portal.peoplefinder.model.peopledetail.generated.WCconnections;

import java.util.ArrayList;
import java.util.List;

public class ConnectionsBean
{
    private List<ConnectionRow> _connectionRows = null;

    public ConnectionsBean()
    {
        super();
    }

    public boolean isConnectionsOk()
    {
        return (getConnectionRows() != null) &&
            (getConnectionRows().size() > 0);
    }
/*
   public List<ConnectionRow> getConnectionRows()
    {
        if (_connectionRows == null)
        {
            List<ConnectionRow> result = new ArrayList<ConnectionRow>();

            try
            {
                List<ConnectionView> connections = getConnections();

                if ((connections != null) && (connections.size() > 0))
                {
                    for (int x = 0; x < connections.size(); )
                    {
                        ConnectionRow row = new ConnectionRow();

                        row.setConnection1(connections.get(x++));
                        

                        if (x < connections.size())
                        {
                            row.setConnection2(connections.get(x++));
                        }

                        if (x < connections.size())
                        {
                            row.setConnection3(connections.get(x++));
                        }

                        result.add(row);
                    }
                }

                _connectionRows = result;
            }
            catch (Exception e)
            {
                //StdUtility.addError("Unable to fetch connections", e);
                LogUtility.logWarning("Unable to fetch connections", e);
            }
        }

        return _connectionRows;
    }
*/
    
 public List<ConnectionRow> getConnectionRows()
     {
         if (_connectionRows == null)
         {
             List<ConnectionRow> result = new ArrayList<ConnectionRow>();

             try
             {
                 List<ConnectionView> connections = getConnections();

                 if ((connections != null) && (connections.size() > 0))
                 {
                     for (int x = 0; x < connections.size(); x++)
                     {
                         ConnectionRow row = new ConnectionRow();

                         row.setConnection1(connections.get(x));
                         
                         result.add(row);
                     }
                     
                   
                 }

                 _connectionRows = result;
             }
             catch (Exception e)
             {
                 //StdUtility.addError("Unable to fetch connections", e);
                 LogUtility.logWarning("Unable to fetch connections", e);
             }
         }

         return _connectionRows;
     }
    
    
    private List<ConnectionView> getConnections()
    {
        List<ConnectionView> result = new ArrayList<ConnectionView>();

        AppModule appModule = null;

        try
        {
            appModule = Utility.createApplicationModule();

            if (appModule != null)
            {
                Response resp =
                    appModule.getConnectionsForUser((String)StdUtility.getFacesValue("#{pageFlowScope.username}"));

                if ((resp != null) && !resp.isErrored())
                {
                    result = new ArrayList<ConnectionView>();

                    for (ActorDetail connection : resp.getConnections())
                    {
                        ConnectionView con = new ConnectionView();
                        con.setActorDetail(connection);

                        result.add(con);
                    }
                }
                else
                {
                    if (resp != null)
                    {
                        //StdUtility.addError(resp.getErrorMessage());
                    }
                }
            }
            else
            {
                LogUtility.logWarning("Unable to retrieve connections", null);
                // StdUtility.addError("Unable to retrieve connections");
            }
        }
        catch (Exception e)
        {
            LogUtility.logWarning("Unable to retrieve connections", e);
            // StdUtility.addError("Unable to retrieve connections");
        }
        finally
        {
            Utility.releaseApplicationModule(appModule);
        }

        return result;
    }
}
