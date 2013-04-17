package au.com.leighton.portal.profile.view;


import au.com.leighton.portal.profile.IExperienceItem;
import au.com.leighton.portal.profile.IWorkHistoryItem;
import au.com.leighton.portal.profile.ProfileResponse;
import au.com.leighton.portal.profile.Utility;
import au.com.leighton.portal.profile.model.common.AppModule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


/**
 * Bean encapsulating the profile data for a single webcenter profile
 */
public class LeightonProfileBean implements Serializable
{
    @SuppressWarnings("compatibility:6539899474579200881")
    private static final long serialVersionUID = 1L;
    private ExperienceBean _experienceBean;
    private WorkHistoryBean _workHistoryBean;
    //    private transient AppModule _appModule = null;
    private ProfileResponse _profileResponse = null;

    public LeightonProfileBean()
    {
        _experienceBean = new ExperienceBean();
        _workHistoryBean = new WorkHistoryBean();

        AppModule appModule = null;

        try
        {
            appModule = Utility.createApplicationModule();

            if (appModule != null)
            {
                initialiseExperience(appModule);
                initialiseWorkHistory(appModule);
            }
            else
            {
                Utility.addError("Unable to retrieve profile information.");
            }
        }
        catch (Exception e)
        {
            Utility.logWarning(getClass(), "Unable to initialise profile", e);
            Utility.addError("Unable to retrieve profile information. " +
                             e.getMessage());
        }
        finally
        {
            Utility.releaseApplicationModule(appModule);
        }
    }

    public ExperienceBean getExperienceBean()
    {
        return _experienceBean;
    }

    public WorkHistoryBean getWorkHistoryBean()
    {
        return _workHistoryBean;
    }

    protected String getUsername()
    {
        return (String)Utility.getFacesValue(Utility.FacesValue.TASKFLOW_PARAMETER_USERNAME);
    }

    protected void initialiseExperience(AppModule appModule)
    {
        String username = getUsername();

        if (Utility.isNullOrEmpty(username))
        {
            Utility.addError("Invalid username");
        }
        else if (appModule != null)
        {
            if (setProfileResponse(appModule.getExperience(username)))
            {
                _experienceBean.setAbstractBase(_profileResponse.getExperience());

                List<ExperienceItemBean> items =
                    new ArrayList<ExperienceItemBean>();

                if (_experienceBean.getExperience() != null)
                {
                    for (IExperienceItem item :
                         _experienceBean.getExperience().getExperienceItems())
                    {
                        ExperienceItemBean i = new ExperienceItemBean();

                        i.setExperienceItem(_experienceBean, item);

                        items.add(i);
                    }
                }

                if (items.size() == 0)
                {
                    if (setProfileResponse(appModule.createExperienceItem(_experienceBean.getExperience(),
                                                                          "Summary",
                                                                          "Please enter a summary about yourself here")) &&
                        setProfileResponse(appModule.createExperienceItem(_experienceBean.getExperience(),
                                                                          "Achievements",
                                                                          "Please enter your achievements here")) &&
                        setProfileResponse(appModule.createExperienceItem(_experienceBean.getExperience(),
                                                                          "Professional or Tertiary Qualifications",
                                                                          "Please enter all your qualifications here")))
                    {
                        initialiseExperience(appModule);
                    }
                }
                else
                {
                    _experienceBean._experienceItemBeans = items;
                    _experienceBean._selectedExperienceItemBean = null;
                }
            }
        }
    }

    protected void initialiseWorkHistory(AppModule appModule)
    {
        String username = getUsername();

        if (Utility.isNullOrEmpty(username))
        {
            Utility.addError("Invalid username");
        }
        else if (appModule != null)
        {
            if (setProfileResponse(appModule.getWorkHistory(username)))
            {
                _workHistoryBean.setAbstractBase(_profileResponse.getWorkHistory());

                List<WorkHistoryItemBean> items =
                    new ArrayList<WorkHistoryItemBean>();

                if (_workHistoryBean.getWorkHistory() != null)
                {
                    for (IWorkHistoryItem item :
                         _workHistoryBean.getWorkHistory().getWorkHistoryItems())
                    {
                        WorkHistoryItemBean i = new WorkHistoryItemBean();

                        i.setWorkHistoryItem(_workHistoryBean, item);

                        items.add(i);
                    }
                }
                _workHistoryBean._workHistoryItemBeans = items;
                _workHistoryBean._selectedWorkHistoryItem = null;
            }
        }
    }

    protected boolean setProfileResponse(ProfileResponse response)
    {
        boolean result = false;
        _profileResponse = response;

        String message = null;

        if ((response != null) && (response.getException() != null))
        {
            message =
                    Utility.extractClassnameMinusPackage(response.getException()) +
                    " " + response.getException().getMessage();
        }


        if (!Utility.isNullOrEmpty(message))
        {
            Utility.addError(message);
        }
        else
        {
            result = true;
        }

        return result;
    }


    protected void delete(ExperienceItemBean bean)
    {
        if (bean != null)
        {
            AppModule appModule = null;

            try
            {
                appModule = Utility.createApplicationModule();

                if (setProfileResponse(appModule.deleteExperienceItem(getExperienceBean().getExperience(),
                                                                      bean.getExperienceItem())))
                {
                    initialiseExperience(appModule);
                }
            }
            catch (Exception e)
            {
                Utility.logWarning(getClass(), "Failed to delete item", e);
                Utility.addError("Failed to delete item");
            }
            finally
            {
                Utility.releaseApplicationModule(appModule);
            }
        }
    }

    protected void delete(WorkHistoryItemBean bean)
    {
        if (bean != null)
        {
            AppModule appModule = null;

            try
            {
                appModule = Utility.createApplicationModule();

                if (setProfileResponse(appModule.deleteWorkHistoryItem(getWorkHistoryBean().getWorkHistory(),
                                                                       bean.getWorkHistoryItem())))
                {
                    initialiseWorkHistory(appModule);
                }
            }
            catch (Exception e)
            {
                Utility.logWarning(getClass(), "Failed to delete item", e);
                Utility.addError("Failed to delete item");
            }
            finally
            {
                Utility.releaseApplicationModule(appModule);
            }
        }
    }

    protected void update(ExperienceItemBean bean)
    {
        if (bean != null)
        {
            AppModule appModule = null;

            try
            {
                appModule = Utility.createApplicationModule();

                if (setProfileResponse(appModule.updateExperienceItem(bean.getExperienceItem(),
                                                                      bean.getTitle(),
                                                                      bean.getExperienceDescription())))
                {
                    initialiseExperience(appModule);
                }
            }
            catch (Exception e)
            {
                Utility.logWarning(getClass(), "Failed to update item", e);
                Utility.addError("Failed to update item");
            }
            finally
            {
                Utility.releaseApplicationModule(appModule);
            }
        }
    }

    protected void update(WorkHistoryItemBean bean)
    {
        if (bean != null)
        {
            AppModule appModule = null;

            try
            {
                appModule = Utility.createApplicationModule();

                if (setProfileResponse(appModule.updateWorkHistoryItem(bean.getWorkHistoryItem(),
                                                                       bean.getRole(),
                                                                       bean.getCompany(),
                                                                       bean.getLocation(),
                                                                       Utility.convert(bean.getFromDate()),
                                                                       Utility.convert(bean.getToDate()),
                                                                       bean.getJobDescription())))
                {
                    initialiseWorkHistory(appModule);
                }
            }
            catch (Exception e)
            {
                Utility.logWarning(getClass(), "Failed to update item", e);
                Utility.addError("Failed to update item");
            }
            finally
            {
                Utility.releaseApplicationModule(appModule);
            }
        }
    }

    protected void saveNew(ExperienceItemBean bean)
    {
        if (bean != null)
        {
            AppModule appModule = null;

            try
            {
                appModule = Utility.createApplicationModule();

                if (setProfileResponse(appModule.createExperienceItem(getExperienceBean().getExperience(),
                                                                      bean.getTitle(),
                                                                      bean.getExperienceDescription())))
                {
                    initialiseExperience(appModule);
                }
            }
            catch (Exception e)
            {
                Utility.logWarning(getClass(), "Failed to save new item", e);
                Utility.addError("Failed to save new item");
            }
            finally
            {
                Utility.releaseApplicationModule(appModule);
            }
        }
    }

    protected void saveNew(WorkHistoryItemBean bean)
    {
        if (bean != null)
        {
            AppModule appModule = null;

            try
            {
                appModule = Utility.createApplicationModule();

                if (setProfileResponse(appModule.createWorkHistoryItem(getWorkHistoryBean().getWorkHistory(),
                                                                       bean.getRole(),
                                                                       bean.getCompany(),
                                                                       bean.getLocation(),
                                                                       Utility.convert(bean.getFromDate()),
                                                                       Utility.convert(bean.getToDate()),
                                                                       bean.getJobDescription())))
                {
                    initialiseWorkHistory(appModule);
                }
            }
            catch (Exception e)
            {
                Utility.logWarning(getClass(), "Failed to save new item", e);
                Utility.addError("Failed to save new item");
            }
            finally
            {
                Utility.releaseApplicationModule(appModule);
            }
        }
    }
}
