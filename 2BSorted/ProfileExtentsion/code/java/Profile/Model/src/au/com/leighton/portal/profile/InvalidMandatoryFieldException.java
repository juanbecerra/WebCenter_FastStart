package au.com.leighton.portal.profile;

import java.util.List;

public class InvalidMandatoryFieldException extends Exception
{
    @SuppressWarnings("compatibility:-3796737772843593907")
    private static final long serialVersionUID = 1L;
    private String _message;

    public InvalidMandatoryFieldException(Throwable throwable)
    {
        super(throwable);
    }

    public InvalidMandatoryFieldException(List<String> fieldNames,
                                          Throwable throwable)
    {
        super(throwable);

        buildMessage(fieldNames);
    }

    private void buildMessage(List<String> fieldNames)
    {
        if ((fieldNames != null) && (fieldNames.size() > 0))
        {
            StringBuffer sb = new StringBuffer("Invalid required fields:");

            for (int x = 0; x < fieldNames.size(); x++)
            {
                if (x != 0)
                {
                    sb.append(", ");
                }

                sb.append(fieldNames.get(x));
            }

            _message = sb.toString();
        }
    }

    public InvalidMandatoryFieldException(List<String> fieldNames)
    {
        super();
        buildMessage(fieldNames);
    }

    public InvalidMandatoryFieldException()
    {
        super();
    }

    public String getMessage()
    {
        return Utility.isNullOrEmpty(_message) ? super.getMessage() : _message;
    }
}
