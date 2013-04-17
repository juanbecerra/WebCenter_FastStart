package au.com.leighton.portal.aggregatedtasklist.model.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class XmlUtil
{

    public static String convertJAXBToXML(Object o, String context)
    {
        StringWriter sw = new StringWriter();
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(context);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty("jaxb.formatted.output", true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

            marshaller.marshal(o, sw);
            LogUtility.logInfo("Converted JAXB Object " +
                               o.getClass().getSimpleName() + " to XML :  \n" +
                    sw.toString());

        }
        catch (JAXBException e)
        {
            LogUtility.logFine(e.getMessage());
        }

        return sw.toString();
    }

    public static void convertJAXBToXML(JAXBElement document)
    {
        Class<?> clazz = document.getValue().getClass();
        StringWriter sw = new StringWriter();
        try
        {
            JAXBContext context =
                JAXBContext.newInstance(clazz.getPackage().getName());
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(document, sw);
            LogUtility.logFine(sw.toString());
        }
        catch (JAXBException e)
        {
            LogUtility.logFine(e.getMessage());
        }
    }
}

