package au.com.leighton.portal.innovation.model;

import java.util.logging.Level;

import oracle.adf.share.logging.ADFLogger;


/**
 * Encapsultes all of the logging methods
 */
public class UtilityLog
{
    private static ADFLogger _adfLogger =
        ADFLogger.createADFLogger(UtilityLog.class);

    private UtilityLog()
    {
        super();
    }

    private static void log(Class clazz, Level logLevel, String message,
                            Throwable t)
    {
        if (_adfLogger != null)
        {
            // only log the class name and the immediate package before it. just for convenience
            String className = clazz.getName();

            int index = className.lastIndexOf('.');
            index = className.substring(0, index - 1).lastIndexOf('.');

            className = className.substring(index + 1);

            _adfLogger.log(logLevel, "(Innovation)(" + className + ")" + message, t);
        }
    }

    public static void logSevere(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.SEVERE, message, throwable);
    }

    public static void logWarning(Class clazz, String message,
                                  Throwable throwable)
    {
        log(clazz, Level.WARNING, message, throwable);
    }

    public static void logInfo(Class clazz, String message,
                               Throwable throwable)
    {
        log(clazz, Level.INFO, message, throwable);
    }

    public static void logConfig(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.CONFIG, message, throwable);
    }

    public static void logFine(Class clazz, String message,
                               Throwable throwable)
    {
        log(clazz, Level.FINE, message, throwable);
    }

    public static void logFiner(Class clazz, String message,
                                Throwable throwable)
    {
        log(clazz, Level.FINER, message, throwable);
    }

    public static void logFinest(Class clazz, String message,
                                 Throwable throwable)
    {
        log(clazz, Level.FINEST, message, throwable);
    }
}
