package au.com.leicon.ess.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {
    public static String formatDate(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date convertedDate =null;
        try {
         
        XMLGregorianCalendar  xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
        convertedDate = xgc.toGregorianCalendar().getTime(); 
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateFormat.format(convertedDate);
    }
}
