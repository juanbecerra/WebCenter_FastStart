package au.com.leighton.portal.application.view;


import au.com.leighton.portal.application.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.WebServiceRef;


public class ApplicationBean
{
    private List<ColumnBean> _columns = new ArrayList<ColumnBean>();
    private boolean _containsData = false;

    @WebServiceRef
    private static au.com.leighton.portal.application.dev.EAgetAppsList _devService;

    @WebServiceRef
    private static au.com.leighton.portal.application.sit.EAgetAppsList _testService;

    @WebServiceRef
    private static au.com.leighton.portal.application.uat.EAgetAppsList _uatService;

    @WebServiceRef
    private static au.com.leighton.portal.application.prod.EAgetAppsList _prodService;

    public ApplicationBean()
    {
        super();

        Utility.logFinest(getClass(), "ApplicationBean", null);

        String environmentString = System.getProperty("Env");
            //(String)Utility.getFacesValue("#{pageFlowScope.environment}");
        
        

        if (Utility.isNullOrEmpty(environmentString))
        {
            Utility.logFinest(getClass(),
                              "No environment set. Defaulting to PROD", null);
            environmentString = "PROD";
        }

        environmentString = environmentString.toUpperCase();

        try
        {
            if (environmentString.indexOf("DEV") >= 0)
            {
                buildFromDev();
            }
            else if ((environmentString.indexOf("SIT") >= 0) ||
                     (environmentString.indexOf("UAT") >= 0))
            {
                buildFromTest();
            }
            else if (environmentString.indexOf("PSUP") >= 0)
            {
                buildFromUat();
            }
            else
            {
                buildFromProd();
            }
        }
        catch (Exception e)
        {
            String msg = "Unable to initialise applications";

            Utility.logWarning(getClass(), msg, e);
            Utility.addErrorMessage("Application", msg + " " + e.getMessage());
        }
    }

    private void buildFromDev()
    {
        Utility.logFinest(getClass(), "buildFromDev", null);
        if (_devService == null)
        {
            _devService =
                    new au.com.leighton.portal.application.dev.EAgetAppsList();
        }
        au.com.leighton.portal.application.dev.Execute_ptt execute_ppt =
            _devService.getExecute_pt();
        au.com.leighton.portal.application.dev.generated.DbGetAppsListInput input =
            new au.com.leighton.portal.application.dev.generated.DbGetAppsListInput();
        input.setIHome("APPS");
        String username =
            (String)Utility.getFacesValue("#{pageFlowScope.username}");

        Utility.logFinest(getClass(),
                          "getting applications for user " + username, null);

        if (username == null)
        {
            Utility.addErrorMessage("Application",
                                    "Unable to determine the currently logged on user");
        }
        else
        {
            input.setIUser(username.toUpperCase());
            au.com.leighton.portal.application.dev.generated.DbGetAppsListOutputCollection output =
                execute_ppt.execute(input);

            if ((output != null) &&
                (output.getDbGetAppsListOutput() != null) &&
                (output.getDbGetAppsListOutput().size() > 0))
            {
                List<au.com.leighton.portal.application.dev.generated.DbGetAppsListOutput> outList =
                    output.getDbGetAppsListOutput();

                Map<String, ColumnBean> columns =
                    new HashMap<String, ColumnBean>();

                for (au.com.leighton.portal.application.dev.generated.DbGetAppsListOutput row :
                     outList)
                {
                    String groupChannel = row.getGrpChannel();

                    ColumnBean columnBean = null;

                    if (columns.containsKey(groupChannel))
                    {
                        columnBean = columns.get(groupChannel);
                    }
                    else
                    {
                        columnBean = new ColumnBean();
                        columnBean.setGroupChannel(groupChannel);
                        columns.put(groupChannel, columnBean);
                        Utility.logFinest(getClass(),
                                          "Adding column " + columnBean, null);
                    }

                    if (columnBean != null)
                    {
                        GroupBean group =
                            columnBean.getGroup(row.getGrpTitle());

                        if (group == null)
                        {
                            group = new GroupBean();
                            group.setStandardGroupType("STANDARD".equalsIgnoreCase(row.getGrpType()));
                            group.setTitle(row.getGrpTitle());
                            columnBean.getGroups().add(group);

                            Utility.logFinest(getClass(),
                                              "Adding group " + group, null);
                        }

                        LinkBean link = new LinkBean();
                        link.setDisplayText(row.getInstTitle());
                        link.setGroupOrder(row.getGrpOrder());
                        if (group.isStandardGroupType())
                        {
                            link.setUrl(row.getUrl());
                        }
                        else
                        {
                            link.setUrl(row.getPORTLETSRC());
                        }

                        Utility.logFinest(getClass(), "Adding link + " + link,
                                          null);
                        group.addLink(link);
                        _containsData = true;
                    }
                }

                // sort the column order
                ArrayList<String> keys = new ArrayList<String>();
                keys.addAll(columns.keySet());
                Collections.sort(keys);

                for (String key : keys)
                {
                    Utility.logFinest(getClass(),
                                      "Adding sorted column " + key, null);
                    _columns.add(columns.get(key));
                }
            }
            else
            {
                Utility.logFinest(getClass(),
                                  "Web Service did not return any applications",
                                  null);
            }
        }
    }

    private void buildFromTest()
    {
        Utility.logFinest(getClass(), "buildFromTest", null);
        if (_testService == null)
        {
            _testService =
                    new au.com.leighton.portal.application.sit.EAgetAppsList();
        }
        au.com.leighton.portal.application.sit.Execute_ptt execute_ppt =
            _testService.getExecute_pt();
        au.com.leighton.portal.application.sit.generated.DbGetAppsListInput input =
            new au.com.leighton.portal.application.sit.generated.DbGetAppsListInput();
        input.setIHome("APPS");
        String username =
            (String)Utility.getFacesValue("#{pageFlowScope.username}");
        if (username == null)
        {
            Utility.addErrorMessage("Application",
                                    "Unable to determine the currently logged on user");
        }
        else
        {
            input.setIUser(username.toUpperCase());
            au.com.leighton.portal.application.sit.generated.DbGetAppsListOutputCollection output =
                execute_ppt.execute(input);

            if ((output != null) &&
                (output.getDbGetAppsListOutput() != null) &&
                (output.getDbGetAppsListOutput().size() > 0))
            {
                List<au.com.leighton.portal.application.sit.generated.DbGetAppsListOutput> outList =
                    output.getDbGetAppsListOutput();

                Map<String, ColumnBean> columns =
                    new HashMap<String, ColumnBean>();

                for (au.com.leighton.portal.application.sit.generated.DbGetAppsListOutput row :
                     outList)
                {
                    String groupChannel = row.getGrpChannel();

                    ColumnBean columnBean = null;

                    if (columns.containsKey(groupChannel))
                    {
                        columnBean = columns.get(groupChannel);
                    }
                    else
                    {
                        columnBean = new ColumnBean();
                        columnBean.setGroupChannel(groupChannel);
                        columns.put(groupChannel, columnBean);
                    }

                    if (columnBean != null)
                    {
                        GroupBean group =
                            columnBean.getGroup(row.getGrpTitle());

                        if (group == null)
                        {
                            group = new GroupBean();
                            group.setStandardGroupType("STANDARD".equalsIgnoreCase(row.getGrpType()));
                            group.setTitle(row.getGrpTitle());
                            columnBean.getGroups().add(group);
                        }

                        LinkBean link = new LinkBean();
                        link.setDisplayText(row.getInstTitle());
                        link.setGroupOrder(row.getGrpOrder());
                        if (group.isStandardGroupType())
                        {
                            link.setUrl(row.getUrl());
                        }
                        else
                        {
                            link.setUrl(row.getPORTLETSRC());
                        }
                        group.addLink(link);
                        _containsData = true;
                    }
                }

                // sort the column order
                ArrayList<String> keys = new ArrayList<String>();
                keys.addAll(columns.keySet());
                Collections.sort(keys);

                for (String key : keys)
                {
                    _columns.add(columns.get(key));
                }
            }
        }
    }

    private void buildFromUat()
    {
        Utility.logFinest(getClass(), "buildFromUat", null);
        if (_uatService == null)
        {
            _uatService =
                    new au.com.leighton.portal.application.uat.EAgetAppsList();
        }
        au.com.leighton.portal.application.uat.Execute_ptt execute_ppt =
            _uatService.getExecute_pt();
        au.com.leighton.portal.application.uat.generated.DbGetAppsListInput input =
            new au.com.leighton.portal.application.uat.generated.DbGetAppsListInput();
        input.setIHome("APPS");
        String username =
            (String)Utility.getFacesValue("#{pageFlowScope.username}");
        if (username == null)
        {
            Utility.addErrorMessage("Application",
                                    "Unable to determine the currently logged on user");
        }
        else
        {
            input.setIUser(username.toUpperCase());
            au.com.leighton.portal.application.uat.generated.DbGetAppsListOutputCollection output =
                execute_ppt.execute(input);

            if ((output != null) &&
                (output.getDbGetAppsListOutput() != null) &&
                (output.getDbGetAppsListOutput().size() > 0))
            {
                List<au.com.leighton.portal.application.uat.generated.DbGetAppsListOutput> outList =
                    output.getDbGetAppsListOutput();

                Map<String, ColumnBean> columns =
                    new HashMap<String, ColumnBean>();

                for (au.com.leighton.portal.application.uat.generated.DbGetAppsListOutput row :
                     outList)
                {
                    String groupChannel = row.getGrpChannel();

                    ColumnBean columnBean = null;

                    if (columns.containsKey(groupChannel))
                    {
                        columnBean = columns.get(groupChannel);
                    }
                    else
                    {
                        columnBean = new ColumnBean();
                        columnBean.setGroupChannel(groupChannel);
                        columns.put(groupChannel, columnBean);
                    }

                    if (columnBean != null)
                    {
                        GroupBean group =
                            columnBean.getGroup(row.getGrpTitle());

                        if (group == null)
                        {
                            group = new GroupBean();
                            group.setStandardGroupType("STANDARD".equalsIgnoreCase(row.getGrpType()));
                            group.setTitle(row.getGrpTitle());
                            columnBean.getGroups().add(group);
                        }

                        LinkBean link = new LinkBean();
                        link.setDisplayText(row.getInstTitle());
                        link.setGroupOrder(row.getGrpOrder());
                        if (group.isStandardGroupType())
                        {
                            link.setUrl(row.getUrl());
                        }
                        else
                        {
                            link.setUrl(row.getPORTLETSRC());
                        }
                        group.addLink(link);
                        _containsData = true;
                    }
                }

                // sort the column order
                ArrayList<String> keys = new ArrayList<String>();
                keys.addAll(columns.keySet());
                Collections.sort(keys);

                for (String key : keys)
                {
                    _columns.add(columns.get(key));
                }
            }
        }
    }

    private void buildFromProd()
    {
        Utility.logFinest(getClass(), "buildFromProd", null);
        if (_prodService == null)
        {
            _prodService =
                    new au.com.leighton.portal.application.prod.EAgetAppsList();
        }
        au.com.leighton.portal.application.prod.Execute_ptt execute_ppt =
            _prodService.getExecute_pt();
        au.com.leighton.portal.application.prod.generated.DbGetAppsListInput input =
            new au.com.leighton.portal.application.prod.generated.DbGetAppsListInput();
        input.setIHome("APPS");
        String username =
            (String)Utility.getFacesValue("#{pageFlowScope.username}");

        Utility.logFinest(getClass(),
                          "getting applications for user " + username, null);

        if (username == null)
        {
            Utility.addErrorMessage("Application",
                                    "Unable to determine the currently logged on user");
        }
        else
        {
            input.setIUser(username.toUpperCase());
            au.com.leighton.portal.application.prod.generated.DbGetAppsListOutputCollection output =
                execute_ppt.execute(input);

            if ((output != null) &&
                (output.getDbGetAppsListOutput() != null) &&
                (output.getDbGetAppsListOutput().size() > 0))
            {
                List<au.com.leighton.portal.application.prod.generated.DbGetAppsListOutput> outList =
                    output.getDbGetAppsListOutput();

                Map<String, ColumnBean> columns =
                    new HashMap<String, ColumnBean>();

                for (au.com.leighton.portal.application.prod.generated.DbGetAppsListOutput row :
                     outList)
                {
                    String groupChannel = row.getGrpChannel();

                    ColumnBean columnBean = null;

                    if (columns.containsKey(groupChannel))
                    {
                        columnBean = columns.get(groupChannel);
                    }
                    else
                    {
                        columnBean = new ColumnBean();
                        columnBean.setGroupChannel(groupChannel);
                        columns.put(groupChannel, columnBean);
                        Utility.logFinest(getClass(),
                                          "Adding column " + columnBean, null);
                    }

                    if (columnBean != null)
                    {
                        GroupBean group =
                            columnBean.getGroup(row.getGrpTitle());

                        if (group == null)
                        {
                            group = new GroupBean();
                            group.setStandardGroupType("STANDARD".equalsIgnoreCase(row.getGrpType()));
                            group.setTitle(row.getGrpTitle());
                            columnBean.getGroups().add(group);

                            Utility.logFinest(getClass(),
                                              "Adding group " + group, null);
                        }

                        LinkBean link = new LinkBean();
                        link.setDisplayText(row.getInstTitle());
                        link.setGroupOrder(row.getGrpOrder());
                        if (group.isStandardGroupType())
                        {
                            link.setUrl(row.getUrl());
                        }
                        else
                        {
                            link.setUrl(row.getPORTLETSRC());
                        }

                        Utility.logFinest(getClass(), "Adding link + " + link,
                                          null);
                        group.addLink(link);
                        _containsData = true;
                    }
                }

                // sort the column order
                ArrayList<String> keys = new ArrayList<String>();
                keys.addAll(columns.keySet());
                Collections.sort(keys);

                for (String key : keys)
                {
                    Utility.logFinest(getClass(),
                                      "Adding sorted column " + key, null);
                    _columns.add(columns.get(key));
                }
            }
            else
            {
                Utility.logFinest(getClass(),
                                  "Web Service did not return any applications",
                                  null);
            }
        }
    }

    public List<ColumnBean> getColumns()
    {
        return _columns;
    }

    public boolean isContainsData()
    {
        return _containsData;
    }
}
