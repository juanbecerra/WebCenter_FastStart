package au.com.leicon.ess.util;


public class ErrorUtil {
	public static String stackTraceToString(StackTraceElement[] stackTraceArray, String separator) {
		StringBuffer result = new StringBuffer();
		if (stackTraceArray.length > 0) {
			result.append(stackTraceArray[0].toString());
			for (int i = 1; i < stackTraceArray.length; i++) {
				result.append(separator);
				result.append(stackTraceArray[i].toString());
			}
		}
		return result.toString();
	}


	public static String stackTraceToString(StackTraceElement[] stackTraceArray) {
		return ErrorUtil.stackTraceToString(stackTraceArray, System
				.getProperty("line.separator"));
	}

	public static String getStackTraceAsString(Throwable throwable) {
		if (throwable.getCause() == null) {
			return stackTraceToString(throwable.getStackTrace());

		} else {
			return stackTraceToString(throwable.getCause().getStackTrace());
		}
	}

	public static String getMessageFrom(Throwable throwable) {
		if (throwable.getCause() == null) {
			return throwable.getMessage();

		} else {
			return throwable.getCause().getMessage();
		}
	}


}