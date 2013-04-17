package au.com.leighton.portal.peoplefinder.model;

import java.util.logging.Level;

import oracle.adf.share.logging.ADFLogger;


/**
 * Encapsulates the standard logging implementation
 */
public class LogUtility
{
    private static String ApplicationName = "PeopleFinder";

    private LogUtility()
    {
        super();
    }

    private static ADFLogger _adfLogger =
        ADFLogger.createADFLogger(ApplicationName);

    private static void log(Class clazz, Level logLevel, String message,
                            Throwable t)
    {
        if (_adfLogger != null)
        {
            // only log the class name and the immediate package before it. just for convenience
            String clazzName =
                clazz == null ? LogUtility.class.getName() : clazz.getName();

            int index = clazzName.lastIndexOf('.');
            index = clazzName.substring(0, index - 1).lastIndexOf('.');

            clazzName = clazzName.substring(index + 1);

            _adfLogger.log(logLevel,
                           "(" + ApplicationName + ")(" + clazzName + ")" +
                           message, t);
        }
    }

    public static void logSevere(String message)
    {
        log(null, Level.SEVERE, message, null);
    }

    public static void logSevere(String message, Throwable throwable)
    {
        log(null, Level.SEVERE, message, throwable);
    }

    public static void logSevere(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.SEVERE, message, throwable);
    }

    public static void logWarning(String message)
    {
        log(null, Level.WARNING, message, null);
    }

    public static void logWarning(String message, Throwable throwable)
    {
        log(null, Level.WARNING, message, throwable);
    }

    public static void logWarning(Class clazz, String message,
                                  Throwable throwable)
    {
        log(clazz, Level.WARNING, message, throwable);
    }

    public static void logInfo(String message)
    {
        log(null, Level.INFO, message, null);
    }

    public static void logInfo(String message, Throwable throwable)
    {
        log(null, Level.INFO, message, throwable);
    }

    public static void logInfo(Class clazz, String message,
                               Throwable throwable)
    {
        log(clazz, Level.INFO, message, throwable);
    }

    public static void logFine(String message)
    {
        log(null, Level.FINE, message, null);
    }

    public static void logFine(String message, Throwable throwable)
    {
        log(null, Level.FINE, message, throwable);
    }

    public static void logFine(Class clazz, String message,
                               Throwable throwable)
    {
        log(clazz, Level.FINE, message, throwable);
    }

    public static void logFiner(String message)
    {
        log(null, Level.FINER, message, null);
    }

    public static void logFiner(String message, Throwable throwable)
    {
        log(null, Level.FINER, message, throwable);
    }

    public static void logFiner(Class clazz, String message,
                                Throwable throwable)
    {
        log(clazz, Level.FINER, message, throwable);
    }

    public static void logFinest(String message)
    {
        log(null, Level.FINEST, message, null);
    }

    public static void logFinest(String message, Throwable throwable)
    {
        log(null, Level.FINEST, message, throwable);
    }

    public static void logFinest(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.FINEST, message, throwable);
    }
}
