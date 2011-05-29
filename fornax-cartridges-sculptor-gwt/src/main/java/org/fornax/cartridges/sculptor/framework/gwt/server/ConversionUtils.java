package org.fornax.cartridges.sculptor.framework.gwt.server;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class ConversionUtils {
	
	public static Date convert(DateTime from, Date targetDummy) {
		return from.toDate();
	}
	
	public static DateTime convert(DateTime from, DateTime targetDummy) {
		return from;
	}

	public static Date convert(Date from, Date targetDummy) {
		return from;
	}

	public static DateTime convert(Date from, DateTime targetDummy) {
		return new DateTime(from);
	}

	public static LocalDate convert(Date from, LocalDate targetDummy) {
		return new LocalDate(from);
	}

	public static Date convert(LocalDate from, Date targetDummy) {
		return from.toDateMidnight().toDate();
	}


}
