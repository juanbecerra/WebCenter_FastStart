package au.com.leighton.portal.innovation.view;


import au.com.leighton.portal.innovation.model.FilterBean;
import au.com.leighton.portal.innovation.model.IdeaBean;
import au.com.leighton.portal.innovation.model.InnovationBean;
import au.com.leighton.portal.innovation.model.Utility;
import au.com.leighton.portal.innovation.model.UtilityFaces;
import au.com.leighton.portal.innovation.model.UtilityLog;
import au.com.leighton.portal.innovation.model.common.AppModuleModel;
import au.com.leighton.portal.innovation.wcmodel.common.AppModuleWcModel;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.model.SelectItem;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.binding.BindingContainer;

import oracle.jbo.domain.Date;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.RowKeySet;


public class ListHandlerBean implements Serializable
{
    @SuppressWarnings("compatibility:-1712249391368247776")
    private static final long serialVersionUID = 1L;
    private ViewIdeaBean _selected = null;
    private ViewInnovationBean _selectedInnovation = null;
    private InnovationBean _newInnovation = null;
    private FilterBean _filterBean = null;
    private FilterBean _storedFilterBean = null;
    //    private transient AppModuleModel _appModule = null;
    //    private transient AppModuleWcModel _appModuleEmail = null;
    private List<ViewIdeaBean> _ideaList = null;
    private boolean _ideaListFull = false;
    private List<ViewInnovationBean> _innovationList = null;
    private Map<String, List<String>> _divisionMap =
        new HashMap<String, List<String>>();
    private List<SelectItem> _dropDownDivisionsList;
    private List<SelectItem> _dropDownDivisionsFilterList;
    private List<SelectItem> _dropDownIdeaStatusFilterList;
    private List<SelectItem> _dropDownInnovationStatusFilterList;
    private List<SelectItem> _dropDownCategoriesList;
    private List<SelectItem> _dropDownInnovationCategoryFilterList;
    private List<SelectItem> _dropDownBenefitsList;
    private List<SelectItem> _dropDownInnovationStatusList;
    private List<SelectItem> _dropDownBusinessOptimisationList;

    public ListHandlerBean()
    {
        super();

        UtilityLog.logFinest(getClass(), "created", null);

        AppModuleModel appModule = null;

        try
        {
            appModule = UtilityFaces.xcreateApplicationModule();

            if (appModule != null)
            {
                _dropDownDivisionsList = appModule.getDropDownValuesDivision();
                _dropDownDivisionsFilterList =
                        appModule.getDropDownValuesDivisionFilter();
                _dropDownIdeaStatusFilterList =
                        appModule.getDropDownValuesIdeaStatusFilter();
                _dropDownInnovationStatusFilterList =
                        appModule.getDropDownValuesInnovationStatusFilter();
                _dropDownCategoriesList =
                        appModule.getDropDownValuesCategory();
                _dropDownInnovationCategoryFilterList =
                        appModule.getDropDownValuesInnovationCategoryFilter();
                _dropDownBenefitsList = appModule.getDropDownValuesBenefit();
                _dropDownInnovationStatusList =
                        appModule.getDropDownValuesInnovationStatus();
                _dropDownBusinessOptimisationList =
                        appModule.getDropDownValuesBusinessOptimisation();
            }
            else
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to initialise drop down lists",
                                      null);
                UtilityFaces.addError("Unable to initialise drop down lists");
            }
        }
        catch (Exception e)
        {
            UtilityLog.logWarning(getClass(),
                                  "Unable to initialise drop down lists", e);
            UtilityFaces.addError("Unable to initialise drop down lists");
        }
        finally
        {
            UtilityFaces.releaseApplicationModule(appModule);
        }
    }

    public List<ViewIdeaBean> getFullIdeaList()
    {
        if ((_ideaList == null) || !_ideaListFull)
        {
            FilterBean filter = getFilterBean();

            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    _ideaList = getIdeaList(appModule, new String[]
                                { filter.getDivision() }, new String[]
                                { filter.getStatus() }, filter.getFromDate(),
                                filter.getToDate());

                    _ideaListFull = true;
                }
                else
                {
                    UtilityLog.logWarning(getClass(),
                                          "Unable to get full idea list",
                                          null);
                    UtilityFaces.addError("Unable to get full idea list");
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to get full idea list", e);
                UtilityFaces.addError("Unable to get full idea list");
            }
        }

        return _ideaList;
    }

    public List<ViewIdeaBean> getPartialIdeaList()
    {
        if ((_ideaList == null) || _ideaListFull)
        {
            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    List<String> divisions =
                        getDivisionsForUser(appModule, UtilityFaces.getCurrentUsername());

                    if (divisions.size() > 0)
                    {
                        _ideaList =
                                getIdeaList(appModule, divisions == null ? null :
                                                       divisions.toArray(new String[divisions.size()]),
                                            new String[]
                                    { "Pending", "Refine" }, null, null);
                    }
                    else
                    {
                        UtilityFaces.addInfo("You are not a member of any roles which will display any ideas");
                        _ideaList = new ArrayList<ViewIdeaBean>();
                    }
                }
                else
                {
                    UtilityLog.logWarning(getClass(),
                                          "Unable to get partial idea list",
                                          null);
                    UtilityFaces.addError("Unable to retrieve idea list");
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to get partial idea list", e);
                UtilityFaces.addError("Unable to retrieve idea list");
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }

        _ideaListFull = false;

        return _ideaList;
    }

    public List<ViewInnovationBean> getPartialInnovationList()
    {
        _innovationList = getInnovationList(getStoredFilterBean());

        return _innovationList;
    }

    public List<ViewInnovationBean> getFullInnovationList()
    {
        _innovationList = getInnovationList(getFilterBean());

        return _innovationList;
    }

    public boolean isCanEditSelectedInnovation()
    {
        boolean result = false;

        if (getSelectedInnovation() != null)
        {
            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    result =
                            appModule.isUserInRoleForDivision(UtilityFaces.getCurrentUsername(),
                                                              getSelectedInnovation().getDivision());
                }
                else
                {
                    UtilityLog.logWarning(getClass(),
                                          "Unable to determine if user can edit selected innovation",
                                          null);
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to determine if user can edit selected innovation",
                                      e);
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }
        return result;
    }

    private List<String> getDivisionsForUser(AppModuleModel appModule,
                                             String username)
    {
        List<String> result = null;

        if (!Utility.isNullOrEmpty(username) && (appModule != null))
        {
            if (_divisionMap.containsKey(username))
            {
                result = _divisionMap.get(username);
            }
            else
            {
                result = appModule.getDivisionsForUser(username);

                if ((result != null) && (result.size() > 0))
                {
                    _divisionMap.put(username, result);
                }
            }
        }
        return result;
    }

    private List<ViewIdeaBean> getIdeaList(AppModuleModel appModule,
                                           String[] divisions,
                                           String[] statuses, Date fromDate,
                                           Date toDate)
    {
        List<ViewIdeaBean> result = new ArrayList<ViewIdeaBean>();

        if (appModule != null)
        {
            UtilityLog.logFinest(getClass(), "getIdeaList", null);
            try
            {
                String currentUsername = UtilityFaces.getCurrentUsername();

                if (!Utility.isNullOrEmpty(currentUsername))
                {
                    UtilityLog.logFinest(getClass(),
                                         "Retrieving filtered idea list for " +
                                         currentUsername, null);

                    result =
                            Helper.convertIdeas(appModule.getIdeaList(divisions,
                                                                      statuses,
                                                                      fromDate,
                                                                      toDate));

                    UtilityLog.logFinest(getClass(),
                                         "Filtered idea list returned = " +
                                         result + " containing " +
                                         (result == null ? null :
                                          result.size()) + " ideas", null);
                }
                else
                {
                    UtilityLog.logFinest(getClass(),
                                         "Invalid username to get idea list for",
                                         null);
                }
            }
            catch (Exception e)
            {
                UtilityFaces.addError("Unable to retrieve idea registry", e);
            }
        }
        else
        {
            String msg =
                "Failed to retrieve ideas. Cannot access application module";

            UtilityLog.logWarning(getClass(), msg, null);
            UtilityFaces.addError(msg);
        }

        return result;
    }

    private List<ViewInnovationBean> getInnovationList(FilterBean filter)
    {
        List<ViewInnovationBean> result = new ArrayList<ViewInnovationBean>();

        UtilityLog.logFinest(getClass(), "getInnovationList", null);

        try
        {
            String currentUsername = UtilityFaces.getCurrentUsername();

            if (!Utility.isNullOrEmpty(currentUsername))
            {
                UtilityLog.logFinest(getClass(),
                                     "Retrieving innovation list for " +
                                     currentUsername, null);

                AppModuleModel appModule = null;

                try
                {
                    appModule = UtilityFaces.xcreateApplicationModule();

                    if (appModule != null)
                    {
                        List<String> categories = new ArrayList<String>();
                        List<String> divisions = new ArrayList<String>();
                        List<String> statuses = new ArrayList<String>();

                        if (!Utility.isNullOrEmpty(filter.getInnovationCategory()))
                        {
                            categories.add(filter.getInnovationCategory());
                        }

                        if (!Utility.isNullOrEmpty(filter.getInnovationDivision()))
                        {
                            divisions.add(filter.getInnovationDivision());
                        }

                        if (!Utility.isNullOrEmpty(filter.getInnovationStatus()))
                        {
                            statuses.add(filter.getInnovationStatus());
                        }

                        result =
                                Helper.convertInnovations(appModule.getInnovationList(categories.toArray(new String[categories.size()]),
                                                                                      divisions.toArray(new String[divisions.size()]),
                                                                                      statuses.toArray(new String[statuses.size()]),
                                                                                      filter.getInnovationFromDate(),
                                                                                      filter.getInnovationToDate(),
                                                                                      filter.isMySubmissionsOnly() ?
                                                                                      currentUsername :
                                                                                      null));

                        UtilityLog.logFinest(getClass(),
                                             "Innovation list returned = " +
                                             result + " containing " +
                                             (result == null ? null :
                                              result.size()) + " ideas", null);
                    }
                    else
                    {
                        String msg =
                            "Failed to retrieve innovation list. Cannot access application module";

                        UtilityLog.logWarning(getClass(), msg, null);
                        UtilityFaces.addError(msg);
                    }
                }
                catch (Exception e)
                {
                    UtilityLog.logWarning(getClass(),
                                          "Unable to get innovation list", e);
                }
                finally
                {
                    UtilityFaces.releaseApplicationModule(appModule);
                }
            }
            else
            {
                UtilityLog.logFinest(getClass(),
                                     "Invalid username to get innovation list for",
                                     null);
            }
        }
        catch (Exception e)
        {
            UtilityFaces.addError("Unable to retrieve innovation registry", e);
        }

        return result;
    }

    public void selectedListener(SelectionEvent selectionEvent)
    {
        setSelected(null);
        setNewInnovation(null);

        UtilityLog.logFinest(getClass(),
                             "Idea selection listener fired with " +
                             selectionEvent, null);

        if (_ideaList != null)
        {
            if (selectionEvent != null)
            {
                RowKeySet rowKeySet = selectionEvent.getAddedSet();

                UtilityLog.logFinest(getClass(),
                                     "row key set = " + rowKeySet + " with " +
                                     (rowKeySet == null ? 0 :
                                      rowKeySet.size()) +
                                     " items. expecting 1", null);

                if (rowKeySet.size() == 1)
                {
                    Object selectedObj = rowKeySet.toArray()[0];

                    UtilityLog.logFinest(getClass(),
                                         "selected object = " + selectedObj,
                                         null);

                    if (selectedObj instanceof Integer)
                    {
                        int selectedIndex = (Integer)selectedObj;

                        UtilityLog.logFinest(getClass(),
                                             "Selected index = " + selectedIndex +
                                             " total items in list = " +
                                             _ideaList.size(), null);

                        if (selectedIndex < _ideaList.size())
                        {
                            setSelected(_ideaList.get(selectedIndex));
                        }
                    }
                }
            }
        }
        else
        {
            UtilityLog.logWarning(getClass(),
                                  "No idea list exists when selection event fired",
                                  null);
        }
    }

    public void selectedInnovationListener(SelectionEvent selectionEvent)
    {
        setSelectedInnovation(null);

        UtilityLog.logFinest(getClass(),
                             "Innovation selection listener fired with " +
                             selectionEvent, null);

        if (_innovationList != null)
        {
            if (selectionEvent != null)
            {
                RowKeySet rowKeySet = selectionEvent.getAddedSet();

                UtilityLog.logFinest(getClass(),
                                     "row key set = " + rowKeySet + " with " +
                                     (rowKeySet == null ? 0 :
                                      rowKeySet.size()) +
                                     " items. expecting 1", null);

                if (rowKeySet.size() == 1)
                {
                    Object selectedObj = rowKeySet.toArray()[0];

                    UtilityLog.logFinest(getClass(),
                                         "selected object = " + selectedObj,
                                         null);

                    if (selectedObj instanceof Integer)
                    {
                        int selectedIndex = (Integer)selectedObj;

                        UtilityLog.logFinest(getClass(),
                                             "Selected index = " + selectedIndex +
                                             " total items in list = " +
                                             _innovationList.size(), null);

                        if (selectedIndex < _innovationList.size())
                        {
                            setSelectedInnovation(_innovationList.get(selectedIndex));
                        }
                    }
                }
            }
        }
        else
        {
            UtilityLog.logWarning(getClass(),
                                  "No innovation list exists when selection event fired",
                                  null);
        }
    }

    public void setSelected(ViewIdeaBean selected)
    {
        this._selected = selected;
    }

    public ViewIdeaBean getSelected()
    {
        RichTable table = (RichTable)UtilityFaces.findControl("tIdeas");

        if (table != null)
        {
            Object rowData = table.getSelectedRowData();

            if (rowData instanceof ViewIdeaBean)
            {
                return (ViewIdeaBean)rowData;
            }
        }

        // use this as a fallback, not as desirable because the listener does not
        // get fired if a row is programatically removed from the list
        return _selected;
    }

    public void setNewInnovation(InnovationBean newInnovationBean)
    {
        this._newInnovation = newInnovationBean;
    }

    public InnovationBean getNewInnovation()
    {
        if (_newInnovation == null)
        {
            _newInnovation = new InnovationBean();

            if (getSelected() != null)
            {
                _newInnovation.setInnovationDescription(getSelected().getIdea());
                _newInnovation.setBusinessValue(getSelected().getBusinessValue());
                _newInnovation.setContactDetails(getSelected().getContactDetails());
                _newInnovation.setDateSubmitted(getSelected().getDateSubmitted());
                _newInnovation.setDivision(getSelected().getDivision());
                _newInnovation.setOwner(getSelected().getOriginator());
            }
        }
        return _newInnovation;
    }

    public FilterBean getFilterBean()
    {
        if (_filterBean == null)
        {
            _filterBean = new FilterBean();
        }

        return _filterBean;
    }

    public FilterBean getStoredFilterBean()
    {
        String currentUsername = UtilityFaces.getCurrentUsername();

        if (_storedFilterBean == null)
        {
            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (!Utility.isNullOrEmpty(currentUsername) &&
                    (appModule != null))
                {
                    try
                    {
                        _storedFilterBean =
                                appModule.getFilter(currentUsername);
                    }
                    catch (Exception e)
                    {
                        UtilityFaces.addInfo("Unable to retrieve filter information. Using default filter values. " +
                                             e.getMessage());
                    }
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to get stored filter bean", e);
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }

        if (_storedFilterBean == null)
        {
            _storedFilterBean = new FilterBean();
            _storedFilterBean.setUsername(currentUsername);
        }

        return _storedFilterBean;
    }

    public void setSelectedInnovation(ViewInnovationBean selectedInnovation)
    {
        this._selectedInnovation = selectedInnovation;
    }

    public ViewInnovationBean getSelectedInnovation()
    {
        RichTable table = (RichTable)UtilityFaces.findControl("tInnov");

        if (table != null)
        {
            Object rowData = table.getSelectedRowData();

            if (rowData instanceof ViewInnovationBean)
            {
                return (ViewInnovationBean)rowData;
            }
        }

        // use this as a fallback, not as desirable because the listener does not
        // get fired if a row is programatically removed from the list
        return _selectedInnovation;
    }

    public String saveNewIdea()
    {
        Object obj = UtilityFaces.getFacesValue("#{newIdeaBean}");

        if (obj instanceof IdeaBean)
        {
            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    IdeaBean ideaBean = (IdeaBean)obj;

                    String currentUsername = UtilityFaces.getCurrentUsername();
                    String emailAddress = null;

                    AppModuleWcModel emailAppModule = null;

                    try
                    {
                        emailAppModule =
                                UtilityFaces.xcreateApplicationModuleEmail();

                        if (emailAppModule != null)
                        {
                            emailAddress =
                                    emailAppModule.getEmailForUsername(currentUsername);
                        }
                    }
                    catch (Exception e)
                    {
                        UtilityLog.logWarning(getClass(),
                                              "Unable to get email address for user " +
                                              currentUsername, e);
                    }
                    finally
                    {
                        UtilityFaces.releaseApplicationModule(emailAppModule);
                    }

                    appModule.storeNewIdea(ideaBean, currentUsername,
                                           emailAddress);

                    _ideaList = null;
                    setSelected(null);
                }
                else
                {
                    UtilityLog.logWarning(getClass(),
                                          "Unable to save new idea", null);
                    UtilityFaces.addError("Unable to save new idea");
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(), "Unable to save new idea",
                                      e);
                UtilityFaces.addError("Unable to save new idea");
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }
        else
        {
            UtilityFaces.addError("Unable to detect new idea bean");
        }

        return null;
    }

    public String saveFilter()
    {
        if (_storedFilterBean != null)
        {
            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    appModule.storeFilter(_storedFilterBean, false, true);

                    refreshInnovationList();
                }
                else
                {
                    UtilityLog.logWarning(getClass(), "Unable to save filter",
                                          null);
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(), "Unable to save filter", e);
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }

        return null;
    }

    public String refreshIdeaList()
    {
        _ideaList = null;

        return null;
    }

    public String refreshInnovationList()
    {
        _innovationList = null;

        return null;
    }

    public BindingContainer getBindings()
    {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String saveNewInnovation()
    {
        if ((_newInnovation != null) && (getSelected() != null))
        {
            String emailAddress = getEmailAddressForSelected();

            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    getNewInnovation().setIdeaSubmittedBy(getSelected().getSubmittedBy());
                    getNewInnovation().setIdeaId(getSelected().getSubmittedId());
                    getNewInnovation().setAdoptedBy(UtilityFaces.getCurrentUsername());
                    getNewInnovation().setAdoptedDate(new Date(Date.getCurrentDate()));
                    getNewInnovation().setLastModifiedBy(getNewInnovation().getAdoptedBy());
                    getNewInnovation().setLastModifiedDate(getNewInnovation().getAdoptedDate());

                    appModule.processAdopt(getSelected().getIdeaBean(),
                                           getNewInnovation(), emailAddress);

                    _innovationList = null;
                    setSelectedInnovation(null);
                }
                else
                {
                    UtilityLog.logWarning(getClass(),
                                          "Unable to save new innovation",
                                          null);
                    UtilityFaces.addError("Unable to save new innovation");
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to save new innovation", e);
                UtilityFaces.addError("Unable to save new innovation");
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }

        return null;
    }

    private String getEmailAddressForSelected()
    {
        String emailAddress = null;

        AppModuleWcModel emailAppModule = null;

        try
        {
            emailAppModule = UtilityFaces.xcreateApplicationModuleEmail();

            if (emailAppModule != null)
            {
                emailAddress =
                        emailAppModule.getEmailForUsername(getSelected().getSubmittedBy());
            }
        }
        catch (Exception e)
        {
            UtilityLog.logWarning(getClass(),
                                  "Unable to get email for username", e);
        }
        finally
        {
            UtilityFaces.releaseApplicationModule(emailAppModule);
        }
        return emailAddress;
    }

    public String saveNotAdoptedIdea()
    {
        if (getSelected() != null)
        {
            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    String emailAddress = getEmailAddressForSelected();

                    appModule.processNotAdopt(getSelected().getSubmittedId(),
                                              getSelected().getStatus(),
                                              getSelected().getComments(),
                                              emailAddress);

                    if ("Not Adopted".equalsIgnoreCase(getSelected().getStatus()))
                    {
                        if (!_ideaListFull)
                        {
                            _ideaList.remove(getSelected());
                        }
                    }
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to save not adopted idea", e);
                UtilityFaces.addError("Unable to save idea");
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }

        return null;
    }

    public List<SelectItem> getDropDownDivisionsList()
    {
        return _dropDownDivisionsList;
    }

    public List<SelectItem> getDropDownDivisionsFilterList()
    {
        return _dropDownDivisionsFilterList;
    }

    public List<SelectItem> getDropDownIdeaStatusFilterList()
    {
        return _dropDownIdeaStatusFilterList;
    }

    public List<SelectItem> getDropDownInnovationStatusFilterList()
    {
        return _dropDownInnovationStatusFilterList;
    }

    public List<SelectItem> getDropDownCategoriesList()
    {
        return _dropDownCategoriesList;
    }

    public List<SelectItem> getDropDownInnovationCategoryFilterList()
    {
        return _dropDownInnovationCategoryFilterList;
    }

    public List<SelectItem> getDropDownBenefitsList()
    {
        return _dropDownBenefitsList;
    }

    public List<SelectItem> getDropDownInnovationStatusList()
    {
        return _dropDownInnovationStatusList;
    }

    public List<SelectItem> getDropDownBusinessOptimisationList()
    {
        return _dropDownBusinessOptimisationList;
    }

    public String updateInnovation()
    {
        ViewInnovationBean selected = getSelectedInnovation();

        if (selected != null)
        {
            String emailAddress = getEmailAddressForSelected();

            selected.setLastModifiedBy(UtilityFaces.getCurrentUsername());
            selected.setLastModifiedDate(new Date(Date.getCurrentDate()));

            AppModuleModel appModule = null;

            try
            {
                appModule = UtilityFaces.xcreateApplicationModule();

                if (appModule != null)
                {
                    appModule.updateInnovation(Helper.convert(selected),
                                               emailAddress);
                }
                else
                {
                    UtilityLog.logWarning(getClass(),
                                          "Unable to update innovation", null);
                    UtilityFaces.addError("Unable to update innovation");
                }
            }
            catch (Exception e)
            {
                UtilityLog.logWarning(getClass(),
                                      "Unable to update innovation", e);
                UtilityFaces.addError("Unable to update innovation");
            }
            finally
            {
                UtilityFaces.releaseApplicationModule(appModule);
            }
        }
        return null;
    }
}
