package au.com.leighton.portal.profile.view;


import au.com.leighton.portal.profile.IExperience;
import au.com.leighton.portal.profile.Utility;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


public class ExperienceBean extends AbstractBean
{
    @SuppressWarnings("compatibility:5615236107341642767")
    private static final long serialVersionUID = 1L;
    protected List<ExperienceItemBean> _experienceItemBeans =
        new ArrayList<ExperienceItemBean>();
    protected ExperienceItemBean _selectedExperienceItemBean = null;

    public ExperienceBean()
    {
    }

    public String getSectionTitle()
    {
        String result =
            (String)Utility.getFacesValue(Utility.FacesValue.TASKFLOW_PARAMETER_TITLE);

        if (Utility.isNullOrEmpty(result))
        {
            result = Utility.getDefaultExperienceTitle();
        }

        return result;
    }

    public IExperience getExperience()
    {
        return (IExperience)getAbstractBase();
    }

    public List<ExperienceItemBean> getExperienceItemBeans()
    {
        return _experienceItemBeans;
    }

    public void setSelectedExperienceItem(ExperienceItemBean itemBean)
    {
        _selectedExperienceItemBean = itemBean;
    }

    public ExperienceItemBean getSelectedExperienceItem()
    {
        return _selectedExperienceItemBean;
    }
}
