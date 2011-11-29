package org.fornax.cartridges.sculptor.framework.gwt.server;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class ConversionUtils {
	
	public static Date convert(DateTime from, Date targetDummy) {
		return (from==null ? null : from.toDate());
	}

	public static Date convertToDate(DateTime from) {
		return (from==null ? null : from.toDate());
	}

	public static DateTime convert(DateTime from, DateTime targetDummy) {
		return from;
	}

	public static DateTime convertToDateTime(DateTime from) {
		return from;
	}

	public static Date convert(Date from, Date targetDummy) {
		return from;
	}

	public static Date convertToDate(Date from) {
		return from;
	}

	public static DateTime convert(Date from, DateTime targetDummy) {
		return (from==null ? null : new DateTime(from));
	}
	
	public static DateTime convertToDateTime(Date from) {
		return (from==null ? null : new DateTime(from));
	}

	public static LocalDate convert(Date from, LocalDate targetDummy) {
		return (from==null ? null : new LocalDate(from));
	}

	public static LocalDate convertToLocalDate(Date from) {
		return (from==null ? null : new LocalDate(from));
	}

	public static Date convert(LocalDate from, Date targetDummy) {
		return (from==null ? null : from.toDateMidnight().toDate());
	}

	public static Date convertToDate(LocalDate from) {
		return (from==null ? null : from.toDateMidnight().toDate());
	}

}
