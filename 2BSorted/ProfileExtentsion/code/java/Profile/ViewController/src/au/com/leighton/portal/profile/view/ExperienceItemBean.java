package au.com.leighton.portal.profile.view;


import au.com.leighton.portal.profile.IExperienceItem;
import au.com.leighton.portal.profile.Utility;

import java.io.Serializable;

import javax.faces.event.ValueChangeEvent;


public class ExperienceItemBean extends AbstractBean
{
    @SuppressWarnings("compatibility:1084884649579156460")
    private static final long serialVersionUID = 1L;
    private String _title;
    private String _experienceDescription;
    private ExperienceBean _parentBean;

    public ExperienceItemBean()
    {
        super();
    }

    public void setExperienceItem(ExperienceBean parentBean,
                                  IExperienceItem item)
    {
        setAbstractBase(item);
        _parentBean = parentBean;
        setTitle(item == null ? null : item.getTitle());
        setExperienceDescription(item == null ? null :
                                 item.getExperienceDescription());
    }

    public IExperienceItem getExperienceItem()
    {
        return (IExperienceItem)getAbstractBase();
    }

    public void setSelected(boolean selected)
    {
        if ((_parentBean != null) && selected)
        {
            _parentBean.setSelectedExperienceItem(this);
        }
    }

    public boolean isSelected()
    {
        return (_parentBean != null) &&
            (_parentBean.getSelectedExperienceItem() != null) &&
            (_parentBean.getSelectedExperienceItem().getId() == getId());
    }

    public String getTitle()
    {
        return _title;
    }

    public void setTitle(String title)
    {
        _title = title;
    }

    public String getExperienceDescription()
    {
        return _experienceDescription;
    }

    public void setExperienceDescription(String value)
    {
        _experienceDescription = value;
    }

    public String getViewExperienceDescription()
    {
        return Utility.makeMultilineDisplayable(getExperienceDescription());
    }

    public void selectionChange(ValueChangeEvent valueChangeEvent)
    {
        if ((valueChangeEvent != null) &&
            (Boolean.TRUE.equals(valueChangeEvent.getNewValue()) &&
             (_parentBean != null)))
        {
            _parentBean.setSelectedExperienceItem(this);
        }
    }

    public String delete()
    {
        LeightonProfileBean profileBean = getProfileBean();

        if (profileBean != null)
        {
            profileBean.delete(this);
            //            if (setProfileResponse(profileBean.getAppModule().deleteExperienceItem(profileBean.getExperienceBean().getExperience(),
            //                                                                               getExperienceItem())))
            //            {
            //                profileBean.initialiseExperience();
            //
            //                //              ViewUtility.addInfoMessage("Experience Item", "\"" + getTitle() + "\" deleted.");
            //            }
        }

        return "ok";
    }

    public String saveEdit()
    {
        LeightonProfileBean profileBean = getProfileBean();

        if (profileBean != null)
        {
            profileBean.update(this);
            //            ExperienceBean expBean = (ExperienceBean)facesValue;
            //
            //            if (expBean.getAppModule() != null)
            //            {
            //                if (setProfileResponse(expBean.getAppModule().updateExperienceItem(getExperienceItem(),
            //                                                                                   getTitle(),
            //                                                                                   getExperienceDescription())))
            //                {
            //                    expBean.initialiseExperience(getAppModule());
            //
            //                    //     ViewUtility.addInfoMessage("Experience Item", "\"" + getTitle() + "\" updated.");
            //                }
            //            }
        }
        return "ok";
    }

    public String saveNew()
    {
        LeightonProfileBean profileBean = getProfileBean();

        if (profileBean != null)
        {
            profileBean.saveNew(this);
        }
        //        Object facesValue =
        //            Utility.getFacesValue(Utility.FacesValue.EXPERIENCE_BEAN);
        //
        //        if (facesValue instanceof ExperienceBean)
        //        {
        //            ExperienceBean expBean = (ExperienceBean)facesValue;
        //
        //            if (expBean.getAppModule() != null)
        //            {
        //                if (setProfileResponse(expBean.getAppModule().createExperienceItem(expBean.getExperience(),
        //                                                                                   getTitle(),
        //                                                                                   getExperienceDescription())))
        //                {
        //                    expBean.initialiseExperience(getAppModule());
        //
        //                    //   ViewUtility.addInfoMessage("Experience Item", "\"" + getTitle() + "\" created.");
        //                }
        //            }
        //        }
        return "ok";
    }
}
