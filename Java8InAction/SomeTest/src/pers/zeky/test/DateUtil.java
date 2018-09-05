/**
 * DateUtil.java
 *
 * Copyright(c) HAND Enterprise Solutions Company Ltd.
 *           All Rights Reserved
 */
package pers.zeky.test;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author AllenLiu
 *
 */
public class DateUtil {
	public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss"; // yyyy-Year/MM-Month/dd-Day
																		// of
																		// Month/HH-24Hours|hh-12Hours/mm-Minutes/ss-Seconds
	public static final String YYYYMMDDTHHMMSS = "yyyy-MM-dd'T'HH:mm:ss";

	/**
	 * Convert a String to Date Based on YYYYMMDDHH24MISS format
	 *
	 * @param str
	 * @return date
	 */
	public static Date convertToDate(final String str) {
		if (null!=str&&!"".equals(str)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YYYYMMDDHHMMSS);
			try {
				return simpleDateFormat.parse(str);
			} catch (final Exception e) {
				// LOG.error("Convert Date from String error: "+e.getMessage());
			}

			// add by tingting @20170628 特殊日期处理
			simpleDateFormat = new SimpleDateFormat(YYYYMMDDTHHMMSS);
			try {
				return simpleDateFormat.parse(str);
			} catch (final Exception e) {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Convert a Date to String Based on YYYYMMDDHH24MISS format
	 *
	 * @param date
	 * @return string
	 */
	public static String convertToString(final Date date) {
		if (date != null) {
			final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YYYYMMDDHHMMSS);
			try {
				return simpleDateFormat.format(date);
			} catch (final Exception e) {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Convert a Date to String Based on format
	 *
	 * @param date
	 * @return string
	 */
	public static String convertToString(final Date date, final String format) {
		if (date != null) {
			final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
			try {
				return simpleDateFormat.format(date);
			} catch (final Exception e) {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Calculate currentDate and interval in seconds
	 *
	 * @param currentDate
	 * @param interval
	 * @return result date
	 */
	public static Date forwardSecondsToDate(final Date currentDate, final int interval) {
		final GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.SECOND, interval);
		return calendar.getTime();
	}

	/**
	 * Calculate currentDate and interval in milliseconds
	 *
	 * @param currentDate
	 * @param interval
	 * @return result date
	 */
	public static Date forwardMillisecondsToDate(final Date currentDate, final int interval) {
		final GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(Calendar.MILLISECOND, interval);
		return calendar.getTime();
	}

	/**
	 * add interval to currentDate
	 *
	 * @param currentDate
	 *            当前日期
	 * @param interval
	 *            时间间隔
	 * @param calendarType
	 *            Calender.YEAR/MONTH/DAY...
	 * @return
	 */
	public static Date forwordIntervalToDate(final Date currentDate, final int interval, final int calendarType) {
		final GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);
		calendar.add(calendarType, interval);
		return calendar.getTime();
	}

	public static List<Date> TimeDivision(final Date start, final Date end, final int times) {
		final List<Date> dates = new ArrayList<Date>();
		final long intervalMilliseconds = Math.abs(end.getTime() - start.getTime());

		final long division = intervalMilliseconds / times;
		dates.add(start);
		for (int i = 1; i < times; i++) {
			final Date date = new Date(start.getTime() + division * i);
			dates.add(date);
		}
		dates.add(end);
		return dates;
	}

	/**
	 * Calculate milliseconds between startDate and endDate
	 *
	 * @param startDate
	 * @param endDate
	 * @return result milliseconds
	 */
	public static long intervalMilliseconds(final Date startDate, final Date endDate) {
		return Math.abs(endDate.getTime() - startDate.getTime());
	}
    public static boolean dateIsInSatrDateAndEndTime(Date starDate,Date endDate,Date date){
		if (null!=starDate && null!=endDate
				&& date.getTime()>=starDate.getTime() && date.getTime() <= endDate.getTime()){
			return true;
		}
		return false;
	}
	public static void main(final String[] args) {
		final Date date = new Date();
/*		final Date date2 = DateOperationHelper.getPreDateByMonth(date, 1);
		final List<Date> l = TimeDivision(date2, date, 4);
		for (final Date d : l) {
			System.out.println(d);
		}*/
		// final String str = "20150306014000";
		// Date currentDispatchDate = DateUtil.convertToDate(str);
		// final long interval =
		// DateUtil.intervalMilliseconds(DateUtil.forwardSecondsToDate(currentDispatchDate,
		// 0),
		// DateUtil.forwardSecondsToDate(currentDispatchDate, 86400));
		//
		// final int loops = 4;
		// final int step = (int) Math.ceil(interval / loops);
		// System.out.println("Step: " + step);
		// for (int i = 0; i < loops; i++)
		// {
		// final Date startTime = currentDispatchDate;
		// final Date endTime =
		// DateUtil.forwardMillisecondsToDate(currentDispatchDate, step);
		//
		// if (endTime.getTime() > System.currentTimeMillis())
		// {
		// break;
		// }
		//
		// currentDispatchDate = endTime;
		// System.out.println("Start Time: " + startTime + "/" +
		// DateUtil.convertToString(startTime));
		// System.out.println("End Time: " + endTime + "/" +
		// DateUtil.convertToString(endTime));
		// }
	}
}
