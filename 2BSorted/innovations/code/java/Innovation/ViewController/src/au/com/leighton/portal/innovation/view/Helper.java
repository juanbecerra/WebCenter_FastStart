package au.com.leighton.portal.innovation.view;


import au.com.leighton.portal.innovation.model.IdeaBean;
import au.com.leighton.portal.innovation.model.InnovationBean;

import java.util.ArrayList;
import java.util.List;


public class Helper
{
    public static List<ViewIdeaBean> convertIdeas(List<IdeaBean> list)
    {
        List<ViewIdeaBean> result = new ArrayList<ViewIdeaBean>();

        if (list != null)
        {
            for (IdeaBean bean : list)
            {
                result.add(convert(bean));
            }
        }
        return result;
    }

    public static List<ViewInnovationBean> convertInnovations(List<InnovationBean> list)
    {
        List<ViewInnovationBean> result = new ArrayList<ViewInnovationBean>();

        if (list != null)
        {
            for (InnovationBean bean : list)
            {
                result.add(convert(bean));
            }
        }
        return result;
    }

    public static ViewInnovationBean convert(InnovationBean bean)
    {
        ViewInnovationBean result = null;

        if (bean != null)
        {
            result = new ViewInnovationBean();

            result.setInnovationBean(bean);
            result.setIrNumber(bean.getIrNumber());
            result.setDateSubmitted(bean.getDateSubmitted());
            result.setDivision(bean.getDivision());
            result.setProject(bean.getProject());
            result.setOwner(bean.getOwner());
            result.setCategory(bean.getCategory());
            result.setInitiativeName(bean.getInitiativeName());
            result.setInnovationDescription(bean.getInnovationDescription());
            result.setBenefit(bean.getBenefit());
            result.setBusinessValue(bean.getBusinessValue());
            result.setStatus(bean.getStatus());
            result.setBusinessOptimisation(bean.getBusinessOptimisation());
            result.setContactDetails(bean.getContactDetails());
            result.setCaseStudy(bean.getCaseStudy());
            result.setFlashOn(bean.getFlashOn());
            result.setAdditionalComments(bean.getAdditionalComments());
            result.setAdoptedBy(bean.getAdoptedBy());
            result.setAdoptedDate(bean.getAdoptedDate());
            result.setIdeaSubmittedBy(bean.getIdeaSubmittedBy());
            result.setLastModifiedBy(bean.getLastModifiedBy());
            result.setLastModifiedDate(bean.getLastModifiedDate());
            result.setIdeaId(bean.getIdeaId());
        }

        return result;
    }

    public static InnovationBean convert(ViewInnovationBean bean)
    {
        InnovationBean result = null;

        if (bean != null)
        {
            result = new InnovationBean();

            result.setIrNumber(bean.getIrNumber());
            result.setDateSubmitted(bean.getDateSubmitted());
            result.setDivision(bean.getDivision());
            result.setProject(bean.getProject());
            result.setOwner(bean.getOwner());
            result.setCategory(bean.getCategory());
            result.setInitiativeName(bean.getInitiativeName());
            result.setInnovationDescription(bean.getInnovationDescription());
            result.setBenefit(bean.getBenefit());
            result.setBusinessValue(bean.getBusinessValue());
            result.setStatus(bean.getStatus());
            result.setBusinessOptimisation(bean.getBusinessOptimisation());
            result.setContactDetails(bean.getContactDetails());
            result.setCaseStudy(bean.getCaseStudy());
            result.setFlashOn(bean.getFlashOn());
            result.setAdditionalComments(bean.getAdditionalComments());
            result.setAdoptedBy(bean.getAdoptedBy());
            result.setAdoptedDate(bean.getAdoptedDate());
            result.setIdeaSubmittedBy(bean.getIdeaSubmittedBy());
            result.setLastModifiedBy(bean.getLastModifiedBy());
            result.setLastModifiedDate(bean.getLastModifiedDate());
            result.setIdeaId(bean.getIdeaId());
        }

        return result;
    }

    public static ViewIdeaBean convert(IdeaBean bean)
    {
        ViewIdeaBean result = null;

        if (bean != null)
        {
            result = new ViewIdeaBean();

            result.setIdeaBean(bean);
            result.setBusinessValue(bean.getBusinessValue());
            result.setContactDetails(bean.getContactDetails());
            result.setDateSubmitted(bean.getDateSubmitted());
            result.setDivision(bean.getDivision());
            result.setIdea(bean.getIdea());
            result.setOriginator(bean.getOriginator());
            result.setSource(bean.getSource());
            result.setStatus(bean.getStatus());
            result.setSubmittedBy(bean.getSubmittedBy());
            result.setSubmittedId(bean.getSubmittedId());
            result.setComments(bean.getComments());
        }
        return result;
    }
}
