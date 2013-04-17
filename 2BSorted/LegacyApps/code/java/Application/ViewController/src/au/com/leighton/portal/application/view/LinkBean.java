package au.com.leighton.portal.application.view;

import java.math.BigDecimal;

public class LinkBean
{
    private String _url;
    private String _displayText;
    private BigDecimal _groupOrder;
    
    public LinkBean()
    {
        super();
    }

    protected void setUrl(String url)
    {
        this._url = url;
    }

    public String getUrl()
    {
        return _url;
    }

    protected void setDisplayText(String displayText)
    {
        this._displayText = displayText;
    }

    public String getDisplayText()
    {
        return _displayText;
    }

    protected void setGroupOrder(BigDecimal _groupOrder)
    {
        this._groupOrder = _groupOrder;
    }

    protected BigDecimal getGroupOrder()
    {
        return _groupOrder;
    }
}
