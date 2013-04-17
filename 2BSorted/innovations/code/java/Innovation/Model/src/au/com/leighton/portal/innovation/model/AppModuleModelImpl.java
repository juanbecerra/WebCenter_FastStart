package au.com.leighton.portal.innovation.model;

import au.com.leighton.portal.innovation.model.common.AppModuleModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 17 11:50:27 EST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleModelImpl extends ApplicationModuleImpl implements AppModuleModel
{
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleModelImpl()
    {
    }

    /**
     * Container's getter for InnoFilterRegisterView1.
     * @return InnoFilterRegisterView1
     */
    public InnoFilterRegisterViewImpl getInnoFilterRegisterView1()
    {
        return (InnoFilterRegisterViewImpl)findViewObject("InnoFilterRegisterView1");
    }

    /**
     * Container's getter for InnoIdeaRegisterView1.
     * @return InnoIdeaRegisterView1
     */
    public InnoIdeaRegisterViewImpl getInnoIdeaRegisterView1()
    {
        return (InnoIdeaRegisterViewImpl)findViewObject("InnoIdeaRegisterView1");
    }

    /**
     * Container's getter for InnoInnovationRegisterView1.
     * @return InnoInnovationRegisterView1
     */
    public InnoInnovationRegisterViewImpl getInnoInnovationRegisterView1()
    {
        return (InnoInnovationRegisterViewImpl)findViewObject("InnoInnovationRegisterView1");
    }

    /**
     * Container's getter for InnoBenefitsView1.
     * @return InnoBenefitsView1
     */
    public InnoBenefitsViewImpl getInnoBenefitsView1()
    {
        return (InnoBenefitsViewImpl)findViewObject("InnoBenefitsView1");
    }

    /**
     * Container's getter for InnoBusinessOptimisationView1.
     * @return InnoBusinessOptimisationView1
     */
    public InnoBusinessOptimisationViewImpl getInnoBusinessOptimisationView1()
    {
        return (InnoBusinessOptimisationViewImpl)findViewObject("InnoBusinessOptimisationView1");
    }

    /**
     * Container's getter for InnoCategoryView1.
     * @return InnoCategoryView1
     */
    public InnoCategoryViewImpl getInnoCategoryView1()
    {
        return (InnoCategoryViewImpl)findViewObject("InnoCategoryView1");
    }

    /**
     * Container's getter for InnoCategoryDdView1.
     * @return InnoCategoryDdView1
     */
    public InnoCategoryDdViewImpl getInnoCategoryDdView1()
    {
        return (InnoCategoryDdViewImpl)findViewObject("InnoCategoryDdView1");
    }

    /**
     * Container's getter for InnoDivisionsView1.
     * @return InnoDivisionsView1
     */
    public InnoDivisionsViewImpl getInnoDivisionsView1()
    {
        return (InnoDivisionsViewImpl)findViewObject("InnoDivisionsView1");
    }

    /**
     * Container's getter for InnoDivisionDdView1.
     * @return InnoDivisionDdView1
     */
    public InnoDivisionDdViewImpl getInnoDivisionDdView1()
    {
        return (InnoDivisionDdViewImpl)findViewObject("InnoDivisionDdView1");
    }

    /**
     * Container's getter for InnoDivisionRoleMapView1.
     * @return InnoDivisionRoleMapView1
     */
    public InnoDivisionRoleMapViewImpl getInnoDivisionRoleMapView1()
    {
        return (InnoDivisionRoleMapViewImpl)findViewObject("InnoDivisionRoleMapView1");
    }

    /**
     * Container's getter for InnoIdeaStatusView1.
     * @return InnoIdeaStatusView1
     */
    public InnoIdeaStatusViewImpl getInnoIdeaStatusView1()
    {
        return (InnoIdeaStatusViewImpl)findViewObject("InnoIdeaStatusView1");
    }

    /**
     * Container's getter for InnoIdeaStatusDdView1.
     * @return InnoIdeaStatusDdView1
     */
    public InnoIdeaStatusDdViewImpl getInnoIdeaStatusDdView1()
    {
        return (InnoIdeaStatusDdViewImpl)findViewObject("InnoIdeaStatusDdView1");
    }

    /**
     * Container's getter for InnoInnovationStatusView1.
     * @return InnoInnovationStatusView1
     */
    public InnoInnovationStatusViewImpl getInnoInnovationStatusView1()
    {
        return (InnoInnovationStatusViewImpl)findViewObject("InnoInnovationStatusView1");
    }

    /**
     * Container's getter for InnoInnovationStatusDdView1.
     * @return InnoInnovationStatusDdView1
     */
    public InnoInnovationStatusDdViewImpl getInnoInnovationStatusDdView1()
    {
        return (InnoInnovationStatusDdViewImpl)findViewObject("InnoInnovationStatusDdView1");
    }
    /**********************************************************************/
    /* INNOVATION CUSTOMISATIONS                                          */

    /**********************************************************************/

    private Number getNextId() throws SQLException
    {
        UtilityLog.logFinest(getClass(), "getNextId", null);
        Number result = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try
        {
            statement =
                    getInnoInnovationRegisterView1().getDBTransaction().createStatement(0);
            resultSet =
                    statement.executeQuery("SELECT LEIGHTON_SEQUENCE_IDEA.NEXTVAL FROM DUAL");

            if (resultSet.next())
            {
                result = new Number(resultSet.getInt(1));
            }
        }
        catch (SQLException e)
        {
            UtilityLog.logWarning(getClass(), "getNextId", e);
            throw e;
        }
        finally
        {
            if (resultSet != null)
            {
                try
                {
                    resultSet.close();
                }
                catch (Exception ex)
                {
                    UtilityLog.logWarning(getClass(),
                                          "getNextId, closing resultset", ex);

                    // do not want a clean up excepton to hide real errors
                    UtilityFaces.addError(ex.getMessage());
                }
            }

            if (statement != null)
            {
                try
                {
                    statement.close();
                }
                catch (Exception ex)
                {
                    UtilityLog.logWarning(getClass(),
                                          "getNextId, closing statement", ex);
                    // do not want a clean up excepton to hide real errors
                    UtilityFaces.addError(ex.getMessage());
                }
            }
        }

        UtilityLog.logFinest(getClass(), "getNextId returned " + result, null);
        return result;
    }

    public void storeNewIdea(IdeaBean newIdeaBean, String currentUsername,
                             String emailAddress)
    {
        String errorMessage = null;

        Number nextId = null;
        boolean canSendNotification = false;

        String parmStuff = Utility.buildParmStuff(new String[]
                { "New Idea Bean",
                  newIdeaBean == null ? null : newIdeaBean.toString(),
                  "Current Username", currentUsername, "Email Address",
                  emailAddress });

        UtilityLog.logFinest(getClass(), "newIdea. " + parmStuff, null);

        try
        {
            nextId = getNextId();

            InnoIdeaRegisterViewRowImpl row =
                (InnoIdeaRegisterViewRowImpl)getInnoIdeaRegisterView1().createRow();

            newIdeaBean.setSubmittedId(nextId);
            newIdeaBean.setSubmittedBy(currentUsername);
            newIdeaBean.setStatus("Pending");
            newIdeaBean.setDateSubmitted(new Date(Date.getCurrentDate()));

            row.fromBean(newIdeaBean);

            getInnoIdeaRegisterView1().insertRow(row);
            getInnoIdeaRegisterView1().getDBTransaction().commit();

            UtilityFaces.addInfo(UtilityResource.newIdeaAccepted(nextId));

            canSendNotification = true;

            getInnoIdeaRegisterView1().clearCache();
        }
        catch (Exception e)
        {
            this.getDBTransaction().reconnect();
            UtilityLog.logWarning(getClass(),
                                  "Failed storing new idea. " + parmStuff, e);
            errorMessage = e.getMessage();
        }

        if ((errorMessage != null) && (errorMessage.trim().length() > 0))
        {
            UtilityFaces.addError("Unable to save your idea. " + errorMessage);
        }

        if (canSendNotification)
        {
            Utility.sendNotification(UtilityFaces.getCurrentUsername(),
                                     emailAddress,
                                     UtilityResource.newIdeaNotificationSubject(nextId),
                                     UtilityResource.newIdeaNotificationMessage(nextId));
        }
    }

    private void updateIdeaStatusAndSendNotificationToOriginator(Number ideaId,
                                                                 String newStatus,
                                                                 String comment,
                                                                 String notificationSubjectLine,
                                                                 String notificationMessage,
                                                                 String emailAddress)
    {
        String submittedBy = null;

        String parmStuff = Utility.buildParmStuff(new String[]
                { "Idea ID", ideaId == null ? null : ideaId.toString(),
                  "New Status", newStatus, "Comment", comment,
                  "Notification Subject Line", notificationSubjectLine,
                  "Notification Message", notificationMessage, "Email Address",
                  emailAddress });

        UtilityLog.logFinest(getClass(),
                             "updateIdeaStatusAndSendNotificationToOriginator. " +
                             parmStuff, null);

        try
        {
            Row[] rows =
                getInnoIdeaRegisterView1().findByKey(new Key(new Object[]
                        { ideaId }), 1);

            if ((rows != null) && (rows.length == 1))
            {
                InnoIdeaRegisterViewRowImpl row =
                    (InnoIdeaRegisterViewRowImpl)rows[0];

                row.setStatus(newStatus);
                row.setComments(comment);

                submittedBy = row.getSubmittedBy();

                getInnoInnovationRegisterView1().getDBTransaction().commit();
                getInnoIdeaRegisterView1().clearCache();
            }
            else
            {
                String msg = "Unable to retrieve idea with id=" + ideaId;

                UtilityLog.logWarning(getClass(), msg, null);
                UtilityFaces.addError(msg);
            }
        }
        catch (Exception e)
        {
            String msg = "Failed to update your idea";
            UtilityLog.logWarning(getClass(), msg, e);
            UtilityFaces.addError(msg, e);
        }

        if (!Utility.isNullOrEmpty(notificationSubjectLine) &&
            !Utility.isNullOrEmpty(notificationMessage) &&
            !Utility.isNullOrEmpty(submittedBy))
        {
            Utility.sendNotification(submittedBy, emailAddress,
                                     notificationSubjectLine,
                                     notificationMessage);
        }
    }

    public void processNotAdopt(Number submittedInnovationId, String newStatus,
                                String comment, String emailAddress)
    {
        String parmStuff = Utility.buildParmStuff(new String[]
                { "Submitted Innovation Id",
                  submittedInnovationId == null ? null :
                  submittedInnovationId.toString(), "New Status", newStatus,
                  "Comment", comment });

        UtilityLog.logFinest(getClass(), "processNotAdopt. " + parmStuff,
                             null);

        updateIdeaStatusAndSendNotificationToOriginator(submittedInnovationId,
                                                        newStatus, comment,
                                                        UtilityResource.ideaNotAdoptedNotificationSubject(submittedInnovationId,
                                                                                                          comment),
                                                        UtilityResource.ideaNotAdoptedNotificationMessage(submittedInnovationId,
                                                                                                          comment),
                                                        emailAddress);
    }

    public void processAdopt(IdeaBean ideaBean, InnovationBean innovationBean,
                             String emailAddress)
    {
        String parmStuff = Utility.buildParmStuff(new String[]
                { "Idea Bean", ideaBean == null ? null : ideaBean.toString(),
                  "Innovation Bean",
                  innovationBean == null ? null : innovationBean.toString(),
                  "Email Address", emailAddress });

        UtilityLog.logFinest(getClass(), "processAdopt. " + parmStuff, null);

        String nextId = null;
        try
        {
            // innovation ID = IR-# where # is the sequential number in the database. therefore set it to the count+1 of the database

            int count = getInnoInnovationRegisterView1().getRowCount();

            nextId = "IR-" + ++count;

            InnoInnovationRegisterViewRowImpl row =
                (InnoInnovationRegisterViewRowImpl)getInnoInnovationRegisterView1().createRow();

            innovationBean.setIrNumber(nextId);

            row.fromBean(innovationBean);

            getInnoInnovationRegisterView1().insertRow(row);
            getInnoInnovationRegisterView1().getDBTransaction().commit();

            String msg = "Innovation " + nextId + " has been submitted";
            UtilityLog.logFine(getClass(), msg, null);
            UtilityFaces.addInfo(msg);


            Number ideaId =
                ideaBean == null ? null : ideaBean.getSubmittedId();

            // now update status of idea to "Adopted"
            updateIdeaStatusAndSendNotificationToOriginator(ideaId, "Accepted",
                                                            "Innovation Register Number " +
                                                            nextId,
                                                            UtilityResource.ideaAdoptedNotificationSubject(ideaId,
                                                                                                           nextId),
                                                            UtilityResource.ideaAdoptedNotificationMessage(ideaId,
                                                                                                           nextId),
                                                            emailAddress);
        }
        catch (Exception e)
        {
            String msg = "Failed to complete the processing of the idea";
            UtilityLog.logWarning(getClass(), msg, e);
            UtilityFaces.addError(msg, e);
        }
    }

    public void updateInnovation(InnovationBean innovationBean,
                                 String emailAddress)
    {
        String parmStuff = Utility.buildParmStuff(new String[]
                { "Innovation Bean",
                  innovationBean == null ? null : innovationBean.toString(),
                  "Email Address", emailAddress });

        UtilityLog.logFinest(getClass(), "updateInnovation. " + parmStuff,
                             null);

        if (innovationBean != null)
        {
            try
            {
                Row[] rows =
                    getInnoInnovationRegisterView1().findByKey(new Key(new Object[]
                            { innovationBean.getIrNumber() }), 1);

                if ((rows != null) && (rows.length == 1))
                {
                    InnoInnovationRegisterViewRowImpl row =
                        (InnoInnovationRegisterViewRowImpl)rows[0];

                    row.fromBean(innovationBean);

                    getInnoInnovationRegisterView1().getDBTransaction().commit();
                    getInnoIdeaRegisterView1().clearCache();
                }
                else
                {
                    String msg =
                        "Unable to retrieve innovation " + innovationBean.getIrNumber();
                    UtilityLog.logWarning(getClass(), msg, null);
                    UtilityFaces.addError(msg);
                }
            }
            catch (Exception e)
            {
                String msg = "Failed to update innovation";
                UtilityLog.logWarning(getClass(), msg, e);
                UtilityFaces.addError(msg, e);
            }
        }
    }

    private List<SelectItem> getDropDownValues(ViewObjectImpl dropDownView)
    {
        UtilityLog.logFinest(getClass(),
                             "getDropDownValues for " + dropDownView.getName(),
                             null);

        List<SelectItem> result = new ArrayList<SelectItem>();

        dropDownView.executeQuery();

        Row row = null;

        while ((row = dropDownView.next()) != null)
        {
            String value = (String)row.getAttribute(0);

            result.add(new SelectItem(value, value));
        }

        return result;
    }

    public List<SelectItem> getDropDownValuesDivision()
    {
        return getDropDownValues(getInnoDivisionsView1());
    }

    public List<SelectItem> getDropDownValuesDivisionFilter()
    {
        return getDropDownValues(getInnoDivisionDdView1());
    }

    public List<SelectItem> getDropDownValuesIdeaStatusFilter()
    {
        return getDropDownValues(getInnoIdeaStatusDdView1());
    }

    public List<SelectItem> getDropDownValuesInnovationCategoryFilter()
    {
        return getDropDownValues(getInnoCategoryDdView1());
    }

    public List<SelectItem> getDropDownValuesInnovationStatusFilter()
    {
        return getDropDownValues(getInnoInnovationStatusDdView1());
    }

    public List<SelectItem> getDropDownValuesCategory()
    {
        return getDropDownValues(getInnoCategoryView1());
    }

    public List<SelectItem> getDropDownValuesBenefit()
    {
        return getDropDownValues(getInnoBenefitsView1());
    }

    public List<SelectItem> getDropDownValuesInnovationStatus()
    {
        return getDropDownValues(getInnoInnovationStatusView1());
    }

    public List<SelectItem> getDropDownValuesBusinessOptimisation()
    {
        return getDropDownValues(getInnoBusinessOptimisationView1());
    }


    public FilterBean getFilter(String username)
    {
        FilterBean result = null;

        String parmStuff = Utility.buildParmStuff(new String[]
                { "Username", username });

        UtilityLog.logFinest(getClass(), "getFilter." + parmStuff, null);

        if (!Utility.isNullOrEmpty(username))
        {
            Row[] rows =
                getInnoFilterRegisterView1().findByKey(new Key(new Object[]
                        { username }), 1);

            // find existing row, update if exists, create if not
            //            InnoFilterRegisterViewRowImpl[] rows =
            //                (InnoFilterRegisterViewRowImpl[])getInnoFilterRegisterView1().findByKey(new Key(new Object[]
            //                        { username }), 1);

            if ((rows != null) && (rows.length == 1))
            {
                result = ((InnoFilterRegisterViewRowImpl)rows[0]).toBean();
            }
        }

        return result;
    }

    public List<String> getDivisionsForUser(String username)
    {
        List<String> result = new ArrayList<String>();

        String parmStuff = Utility.buildParmStuff(new String[]
                { "Username", username });

        UtilityLog.logFinest(getClass(), "getDivisionsForUser " + parmStuff,
                             null);

        if (!Utility.isNullOrEmpty(username))
        {
            getInnoDivisionDdView1().executeQuery();

            InnoDivisionDdViewRowImpl row = null;

            while ((row =
                    (InnoDivisionDdViewRowImpl)getInnoDivisionDdView1().next()) !=
                   null)
            {
                if (isUserInRoleForDivision(username, row.getDivisionName()))
                {
                    result.add(row.getDivisionName());
                }
            }
        }

        UtilityLog.logFinest(getClass(),
                             "getDivisionsForUser " + parmStuff + "=" + result,
                             null);

        return result;
    }

    public List<IdeaBean> getIdeaList(String[] divisions, String[] statuses,
                                      Date fromDate, Date toDate)
    {
        String parmStuff = Utility.buildParmStuff(new String[]
                { "Divisions", divisions == null ? null : divisions.toString(),
                  "Statuses", statuses == null ? null : statuses.toString(),
                  "From Date", fromDate == null ? null : fromDate.toString(),
                  "To Date", toDate == null ? null : toDate.toString() });

        UtilityLog.logFinest(getClass(), "getIdeaList " + parmStuff, null);

        List<IdeaBean> result = new ArrayList<IdeaBean>();

        try
        {
            StringBuffer whereClause = new StringBuffer();

            Utility.addWhereClause(whereClause,
                                   Utility.TableIdeaRegister.DIVISION,
                                   divisions);
            Utility.addWhereClause(whereClause,
                                   Utility.TableIdeaRegister.STATUS, statuses);
            Utility.addWhereClause(whereClause,
                                   Utility.TableIdeaRegister.DATE_SUBMITTED,
                                   fromDate, toDate);

            UtilityLog.logFinest(getClass(),
                                 "Where clause = " + whereClause.toString(),
                                 null);

            getInnoIdeaRegisterView1().setWhereClause(whereClause.toString());

            getInnoIdeaRegisterView1().executeQuery();

            while (getInnoIdeaRegisterView1().hasNext())
            {
                InnoIdeaRegisterViewRowImpl row =
                    (InnoIdeaRegisterViewRowImpl)getInnoIdeaRegisterView1().next();

                result.add(row.toBean());
            }
        }
        catch (Exception e)
        {
            String msg = "Failed to get idea list";
            UtilityFaces.addError(msg, e);
            UtilityLog.logWarning(getClass(), msg + " " + parmStuff, e);
        }

        UtilityLog.logFinest(getClass(),
                             "getIdeaList " + parmStuff + "=" + result.size(),
                             null);

        return result;
    }

    public List<InnovationBean> getInnovationList(String[] categories,
                                                  String[] divisions,
                                                  String[] statuses,
                                                  Date fromDate, Date toDate,
                                                  String ideaSubmittedByUsername)
    {
        String parmStuff = Utility.buildParmStuff(new String[]
                { "Categories",
                  categories == null ? null : categories.toString(),
                  "Divisions", divisions == null ? null : divisions.toString(),
                  "Statuses", statuses == null ? null : statuses.toString(),
                  "From date", fromDate == null ? null : fromDate.toString(),
                  "To date", toDate == null ? null : toDate.toString(),
                  "Idea Submitted By Username", ideaSubmittedByUsername });

        UtilityLog.logFinest(getClass(), "getInnovationList " + parmStuff,
                             null);

        List<InnovationBean> result = new ArrayList<InnovationBean>();

        try
        {
            StringBuffer whereClause = new StringBuffer();

            Utility.addWhereClause(whereClause,
                                   Utility.TableInnovationRegister.DIVISION,
                                   divisions);

            Utility.addWhereClause(whereClause,
                                   Utility.TableInnovationRegister.STATUS,
                                   statuses);

            Utility.addWhereClause(whereClause,
                                   Utility.TableInnovationRegister.CATEGORY,
                                   categories);

            Utility.addWhereClause(whereClause,
                                   Utility.TableInnovationRegister.DATE_SUBMITTED,
                                   fromDate, toDate);

            Utility.addWhereClause(whereClause,
                                   Utility.TableInnovationRegister.IDEA_SUBMITTED_BY,
                                   ideaSubmittedByUsername);

            UtilityLog.logFinest(getClass(),
                                 "Where clause = " + whereClause.toString(),
                                 null);

            getInnoInnovationRegisterView1().setWhereClause(whereClause.toString());

            getInnoInnovationRegisterView1().executeQuery();

            while (getInnoInnovationRegisterView1().hasNext())
            {
                InnoInnovationRegisterViewRowImpl row =
                    (InnoInnovationRegisterViewRowImpl)getInnoInnovationRegisterView1().next();

                result.add(row.toBean());
            }
        }
        catch (Exception e)
        {
            String msg = "Failed to get innovation list";
            UtilityFaces.addError(msg, e);
            UtilityLog.logWarning(getClass(), msg + " " + parmStuff, e);
        }

        UtilityLog.logFinest(getClass(),
                             "getInnovationList " + parmStuff + "=" +
                             result.size(), null);

        return result;
    }

    public void storeFilter(FilterBean filterBean, boolean storeIdeaComponents,
                            boolean storeInnovationComponents)
    {
        String parmStuff = Utility.buildParmStuff(new String[]
                { "Filter Bean",
                  filterBean == null ? null : filterBean.toString() });

        UtilityLog.logFinest(getClass(), "storeIdeaFilter. " + parmStuff,
                             null);

        if (filterBean != null)
        {
            try
            {
                if (!Utility.isNullOrEmpty(filterBean.getUsername()))
                {
                    getInnoFilterRegisterView1().clearCache();

                    // find existing row, update if exists, create if not
                    Row[] rows =
                        getInnoFilterRegisterView1().findByKey(new Key(new Object[]
                                { filterBean.getUsername() }), 1);

                    InnoFilterRegisterViewRowImpl row = null;
                    boolean created = false;

                    if ((rows != null) && (rows.length == 1))
                    {
                        UtilityLog.logFinest(getClass(),
                                             "Row exists for user " +
                                             filterBean.getUsername(), null);
                        row = (InnoFilterRegisterViewRowImpl)rows[0];
                    }
                    else
                    {
                        UtilityLog.logFinest(getClass(),
                                             "Row did not exist. Creating new row for user " +
                                             filterBean.getUsername(), null);

                        row =
(InnoFilterRegisterViewRowImpl)getInnoFilterRegisterView1().createRow();
                        created = true;
                    }

                    row.fromBean(filterBean, storeIdeaComponents,
                                 storeInnovationComponents);

                    if (created)
                    {
                        getInnoFilterRegisterView1().insertRow(row);
                    }
                    getInnoFilterRegisterView1().getDBTransaction().commit();
                }
            }
            catch (Exception e)
            {
                String msg = "Unable to save filter";
                UtilityLog.logWarning(getClass(), msg, e);
                UtilityFaces.addError(msg, e);
            }
        }
    }

    public boolean isUserInRoleForDivision(String username,
                                           String divisionName)
    {
        boolean result = false;

        String parmStuff = Utility.buildParmStuff(new String[]
                { "Username", username, "Division Name", divisionName });

        UtilityLog.logFinest(getClass(),
                             "isUserInRoleForDivision " + parmStuff, null);

        if (!Utility.isNullOrEmpty(username) &&
            !Utility.isNullOrEmpty(divisionName))
        {
            if (UtilityFaces.isCurrentUserInAllDivisionsRole())
            {
                result = true;
            }
            else
            {
                String roleName = getRoleForDivision(divisionName);

                if (!Utility.isNullOrEmpty(roleName))
                {
                    result = UtilityFaces.isCurrentUserInRole(roleName);
                }
            }
        }

        UtilityLog.logFinest(getClass(),
                             "isUserInRoleForDivision " + parmStuff + "=" +
                             result, null);
        return result;
    }

    private String getRoleForDivision(String division)
    {
        String result = null;

        String parmStuff = Utility.buildParmStuff(new String[]
                { "Division", division });
        UtilityLog.logFinest(getClass(), "getRoleForDivision " + parmStuff,
                             null);

        try
        {
            getInnoDivisionRoleMapView1().setWhereClause("DIVISION_NAME='" +
                                                         division + "'");
            getInnoDivisionRoleMapView1().executeQuery();

            InnoDivisionRoleMapViewRowImpl row =
                (InnoDivisionRoleMapViewRowImpl)getInnoDivisionRoleMapView1().next();

            if (row != null)
            {
                result = row.getRoleName();
            }
            else
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to find role mapping for division \"" +
                                      division + "\"", null);
            }
        }
        catch (Exception e)
        {
            UtilityLog.logWarning(getClass(),
                                  "Unable to get division role map", e);
        }

        UtilityLog.logFinest(getClass(),
                             "getRoleForDivision " + parmStuff + "=" + result,
                             null);
        return result;
    }
}