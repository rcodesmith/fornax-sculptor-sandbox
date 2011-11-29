package org.fornax.cartridges.sculptor.framework.gwt.server;

import java.util.Calendar;
import java.util.Date;

import junit.framework.Assert;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Test;

public class ConversionUtilsTest {

	LocalDate localDate = new LocalDate(2011, 4, 22);
	Date date = localDate.toDateMidnight().toDate();
	
	@Test
	public void assertConvertLocalDateToDate() {
		Date dt = ConversionUtils.convert(localDate, new Date());
		Assert.assertNotNull(dt);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		
		Assert.assertEquals(2011, cal.get(Calendar.YEAR));
		Assert.assertEquals(3, cal.get(Calendar.MONTH));
		Assert.assertEquals(22, cal.get(Calendar.DAY_OF_MONTH));
		
	}
	
	@Test
	public void assertConvertDateToDateTimeNull() {
		DateTime dt = ConversionUtils.convert((Date)null, new DateTime());
		Assert.assertNull(dt);
	}
}
