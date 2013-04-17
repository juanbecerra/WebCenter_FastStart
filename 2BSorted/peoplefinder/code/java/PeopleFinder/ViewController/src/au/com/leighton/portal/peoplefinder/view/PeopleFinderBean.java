package au.com.leighton.portal.peoplefinder.view;


import au.com.leighton.portal.peoplefinder.model.DetailItem;
import au.com.leighton.portal.peoplefinder.model.DetailLocation;
import au.com.leighton.portal.peoplefinder.model.DetailPerson;
import au.com.leighton.portal.peoplefinder.model.SearchResultLocation;
import au.com.leighton.portal.peoplefinder.model.SearchResultPeople;
import au.com.leighton.portal.peoplefinder.model.StdUtility;
import au.com.leighton.portal.peoplefinder.model.Utility;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Properties;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;
import org.apache.myfaces.trinidad.model.TreeModel;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class PeopleFinderBean implements Serializable {


    @SuppressWarnings("compatibility:-1346590991064175714")
    private static final long serialVersionUID = 1L;
    private String _simpleSearchCriteria;
    private AdvancedCriteriaLocation _locationCriteria = new AdvancedCriteriaLocation();
    private AdvancedCriteriaPeople _peopleCriteria = new AdvancedCriteriaPeople();
    private boolean _showAdvancedSearchCriteria;
    private transient SearchDelegate _searchDelegate = new SearchDelegate();
    private AbstractItemDelegate _currentDelegate = null;
    private DetailItem _selectedItem = null;
    private DetailPerson _personalAssistant = null;
    private transient TreeModel _personalAssistantTreeModel = null;
    private BigDecimal clickedPersonId = null;
    private String clickedPersonUsername = null;
    private String adminEmailResult = null;
    private String adminEmailType = null;
    private String adminEmailBody = null;
    private String adminEmailSubmitter = null;
    private String userNameParam;

    public boolean isIncludeConnections() {
        return Utility.includeConnections();
    }

    public void setSimpleSearchCriteria(String simpleSearchCriteria) {
        this._simpleSearchCriteria = simpleSearchCriteria;
    }

    public String getSimpleSearchCriteria() {
        return _simpleSearchCriteria;
    }

    public void setShowAdvancedSearchCriteria(boolean showAdvancedSearchCriteria) {
        this._showAdvancedSearchCriteria = showAdvancedSearchCriteria;
    }

    public boolean isShowAdvancedSearchCriteria() {
        return _showAdvancedSearchCriteria;
    }


    protected SearchDelegate getSearchDelegate() {
        return _searchDelegate;
    }

    public boolean isShowSearchResults() {
        return (_currentDelegate != null);
    }

    public String resetSimpleSearch() {
        _simpleSearchCriteria = null;
        _selectedItem = null;
        _currentDelegate = null;
        setShowAdvancedSearchCriteria(false);
        return null;
    }

    public String advancedSearchLink() {
        setShowAdvancedSearchCriteria(!isShowAdvancedSearchCriteria());
        return null;
    }

    public void tableItemSelected(SelectionEvent selectionEvent) {
        if (_currentDelegate != null) {
            _currentDelegate.itemSelected(selectionEvent);
        }
    }

    public void ItemClick() {
        _currentDelegate.setClickedItem(getclickedPersonId(), getclickedPersonUsername(), getSelectedPerson());
    }


    public void searchDetails() {
        _currentDelegate.setClickedItem(getclickedPersonId(), getclickedPersonUsername(), getSelectedPerson());
    }
    /**
     * @param selectedItem
     */
    protected void setSelectedItem(DetailItem selectedItem) {
        _selectedItem = selectedItem;
    }

    public String getSearchSummary() {
        return _currentDelegate != null ? _currentDelegate.getSearchSummary() : null;
    }

    public boolean isErrored() {
        return _currentDelegate != null ? _currentDelegate.isErrored() : false;
    }

    public String getErrorMessage() {
        return isErrored() ? _currentDelegate.getErrorMessage() : null;
    }

    /*************************************************************************
    People Items
     *************************************************************************/

    public AdvancedCriteriaPeople getPeopleCriteria() {
        return _peopleCriteria;
    }

    public PeopleDelegate getPeopleDelegate() {
        return isPeopleSearch() ? (PeopleDelegate)_currentDelegate : null;
    }

    public boolean isPersonSelected() {
        return (_selectedItem != null) && _selectedItem.isPersonDetail();
    }

    public boolean isPeopleSearch() {
        return (_currentDelegate != null) && _currentDelegate.isPersonDelegate();
    }

    public String resetAdvancedPeople() {
        _selectedItem = null;
        _peopleCriteria = new AdvancedCriteriaPeople();
        _currentDelegate = null;
        return null;
    }

    public String simpleSearchPeople() {
        _selectedItem = null;
        _currentDelegate = PeopleDelegate.simpleSearch(this, getSimpleSearchCriteria());
        setShowAdvancedSearchCriteria(false);
        return null;
    }

    public DetailPerson getSelectedPerson() {
        DetailPerson detailPerson =null;
        if (isPersonSelected()){
        if (getPeopleDelegate().getDetailPerson()!=null){
            detailPerson =getPeopleDelegate().getDetailPerson();
        }else {
            detailPerson =(DetailPerson)_selectedItem;
        }
        }
        return detailPerson;
//        return isPersonSelected() ? getPeopleDelegate().getDetailPerson() : null;
//        return isPersonSelected() ? (DetailPerson)_selectedItem : null;
    }

    public boolean isShowPersonDetail() {
        return (getSelectedPerson() != null) && !isErrored();
    }

    public SearchResultPeople getPeopleResult() {
        return isPeopleSearch() ? (SearchResultPeople)getPeopleDelegate().getResult() : null;
    }

    public TreeModel getSelectedPersonTreeModel() {
        return isPersonSelected() ? getPeopleDelegate().getTreeModel() : null;
    }

    public TreeModel getPersonalAssistantTreeModel() {
        return _personalAssistantTreeModel;
    }

    public String advancedSearchPeople() {
        _selectedItem = null;
        _currentDelegate = PeopleDelegate.advancedSearch(this, getPeopleCriteria());
        return null;
    }

    /*************************************************************************
    Location Items
     *************************************************************************/

    public AdvancedCriteriaLocation getLocationCriteria() {
        return _locationCriteria;
    }

    public LocationDelegate getLocationDelegate() {
        return isLocationSearch() ? (LocationDelegate)_currentDelegate : null;
    }

    public boolean isLocationSelected() {
        return (_selectedItem != null) && _selectedItem.isLocationDetail();
    }

    public boolean isLocationSearch() {
        return (_currentDelegate != null) && _currentDelegate.isLocationDelegate();
    }

    public String resetAdvancedLocation() {
        _selectedItem = null;
        _locationCriteria = new AdvancedCriteriaLocation();
        _currentDelegate = null;
        return null;
    }

    public String simpleSearchLocation() {
        _selectedItem = null;
        _currentDelegate = LocationDelegate.simpleSearch(this, getSimpleSearchCriteria());
        setShowAdvancedSearchCriteria(false);
        return null;
    }

    public DetailLocation getSelectedLocation() {
        return isLocationSelected() ? (DetailLocation)_selectedItem : null;
    }

    public boolean isShowLocationDetail() {
        return (getSelectedLocation() != null) && !isErrored();
    }

    public SearchResultLocation getLocationResult() {
        return isLocationSearch() ? (SearchResultLocation)getLocationDelegate().getResult() : null;
    }

    public String advancedSearchLocation() {
        _selectedItem = null;
        _currentDelegate = LocationDelegate.advancedSearch(this, getLocationCriteria());
        return null;
    }

    public String peopleAtSelectedLocation() {
        DetailLocation location = getSelectedLocation();

        if (location != null) {
            _selectedItem = null;
            _currentDelegate = PeopleDelegate.searchAtLocation(this, location.getLocationId());
        }

        return null;
    }

    public DetailPerson getPersonalAssistant() {
        DetailPerson result = null;

        DetailPerson selected = getSelectedPerson();

        if (selected != null) {
            if (selected.isHasPersonalAssistant()) {
                if ((_personalAssistant != null) && (_personalAssistant.getPersonId().intValue() == selected.getPersonalAssistantId().intValue())) {
                    // the currently loaded pa is the one for the selected person
                    result = _personalAssistant;
                } else {
                    _personalAssistant = getSearchDelegate().getDetailPerson(selected.getPersonalAssistantId());


                    if (_personalAssistant != null) {
                        _personalAssistantTreeModel = new ChildPropertyTreeModel(_personalAssistant.getReportingLine(), "children");
                    }

                    result = _personalAssistant;
                }
            }
        }

        return result;
    }

    public void setclickedPersonId(BigDecimal clickedPersonId) {
        this.clickedPersonId = clickedPersonId;
        this.clickedPersonUsername = null;
    }

    public BigDecimal getclickedPersonId() {
        return clickedPersonId;
    }

    public void setclickedPersonUsername(String clickedPersonUsername) {
        this.clickedPersonUsername = clickedPersonUsername;
        this.clickedPersonId = null;
    }

    public String getclickedPersonUsername() {
        return clickedPersonUsername;
    }


    public void setAdminEmailResult(String adminEmailResult) {
        this.adminEmailResult = adminEmailResult;
    }

    public String getAdminEmailResult() {
        return adminEmailResult;
    }

    public void sendAdminEmail() {
        // Add event code here...
        DetailPerson selected = getSelectedPerson();
        String emailto = null;
        String emailcc = null;
        String emailfrom = null;
        String emailbody = null;
        String emailtype = null;
        String confirmmsg = null;


        emailcc = selected.getEmail();
        emailfrom = Utility.getAdminEmailFrom();

        if (this.adminEmailType.equalsIgnoreCase("hr")) {
            emailtype = "Reporting Line Details";

        } else if (this.adminEmailType.equalsIgnoreCase("phone")) {

            emailto = selected.getAdminEmail();
            emailtype = "Contact Details";
        } else {
            emailtype = "Collaboration Profile Details";
            emailto = Utility.getServiceDeskEmail();

        }


        String emailsubject = Utility.getAdminEmailSubject();
        //emailto = selected.getAdminEmail();

        emailbody = "Username = " + selected.getUserName() + "\n" +
                "Full Name = " + selected.getFullName() + "\n" +
                "Type = " + emailtype + "\n" +
                "Submitter Name = " + this.adminEmailSubmitter + "\n" +
                "\n\n" +
                this.adminEmailBody;


        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.lc.local");


        Session session = Session.getInstance(props);

        try {

            confirmmsg = "Your request was successfully sent to " + emailto + " for processing";

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailfrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailto));

            if (!StdUtility.isNullOrEmpty(emailcc)) {
                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(emailcc));
                confirmmsg = confirmmsg + "\n A copy was also sent to " + emailcc;
            }

            message.setSubject(emailsubject);
            message.setText(emailbody);

            Transport.send(message);
            this.setAdminEmailResult(confirmmsg);


        } catch (MessagingException e) {

            this.setAdminEmailResult("Error sending request to " + emailto + "," + emailcc + " <br>" + e);
        }

        this.setAdminEmailBody("");
        this.setAdminEmailType("");
        this.setAdminEmailSubmitter("");

    }

    public void setAdminEmailType(String adminEmailType) {
        this.adminEmailType = adminEmailType;
    }

    public String getAdminEmailType() {
        return adminEmailType;
    }

    public void setAdminEmailBody(String adminEmailBody) {
        this.adminEmailBody = adminEmailBody;
    }

    public String getAdminEmailBody() {
        return adminEmailBody;
    }


    public void setAdminEmailSubmitter(String adminEmailSubmitter) {
        this.adminEmailSubmitter = adminEmailSubmitter;
    }

    public String getAdminEmailSubmitter() {
        return adminEmailSubmitter;
    }

    public void searchPersonDetails() {
        _currentDelegate = PeopleDelegate.getPeopleDelegate();
        _selectedItem = _searchDelegate.getDetailPerson(userNameParam);
        clickedPersonUsername=userNameParam;
        searchDetails();
    }

    public void setUserNameParam(String userNameParam) {
        this.userNameParam = userNameParam;
    }

    public String getUserNameParam() {
        return userNameParam;
    }
}
