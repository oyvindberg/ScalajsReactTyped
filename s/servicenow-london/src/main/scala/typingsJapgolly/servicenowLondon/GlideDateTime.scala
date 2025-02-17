package typingsJapgolly.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideDateTime extends StObject {
  
  /**
    * Adds a GlideTime object to the current GlideDateTime object.
    *
    * @param gd The GlideTime object to add.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * var gtime1 = new GlideTime();
    * gtime1.setValue('00:00:20');
    * gdt.add(gtime1);
    * var gtime2 = gdt.getTime();
    * gs.info(gtime2.getByFormat('hh:mm:ss'));
    */
  def add(gd: GlideTime): Unit = js.native
  /**
    * Adds the specified number of milliseconds to the current GlideDateTime object.
    *
    * @param milliseconds The number of milliseconds to add.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gs.info(gdt.getNumericValue());
    * gdt.add(10);
    * gs.info(gdt.getNumericValue());
    */
  def add(milliseconds: Double): Unit = js.native
  
  /**
    * Adds a specified number of days to the current GlideDateTime object. A negative parameter
    * subtracts days. The method determines the local date and time equivalent to the value stored by
    * the GlideDateTime object, then adds or subtracts days using the local date and time values.
    *
    * @param days The number of days to add. Use a negative value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addDaysLocalTime(-1);
    * gs.info(gdt.getLocalDate());
    */
  def addDaysLocalTime(days: Double): Unit = js.native
  
  /**
    * Adds a specified number of days to the current GlideDateTime object. A negative parameter
    * subtracts days. The method determines the UTC date and time equivalent to the value stored by
    * the GlideDateTime object, then adds or subtracts days using the UTC date and time values.
    *
    * @param days The number of days to add. Use a negative number to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addDaysUTC(-1);
    * gs.info(gdt.getDate());
    */
  def addDaysUTC(amount: Double): Unit = js.native
  
  /**
    * Adds a specified number of months to the current GlideDateTime object. A negative parameter
    * subtracts months. The method determines the local date and time equivalent to the value stored
    * by the GlideDateTime object, then adds or subtracts months using the local date and time
    * values.
    *
    * @param months The number of months to add. use a negative value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addMonthsLocalTime(2);
    * gs.info(gdt.getDate());
    */
  def addMonthsLocalTime(amount: Double): Unit = js.native
  
  /**
    * Adds a specified number of months to the current GlideDateTime object. A negative parameter
    * subtracts months. The method determines the UTC date and time equivalent to the value stored by
    * the GlideDateTime object, then adds or subtracts months using the UTC date and time values.
    *
    * @param months The number of months to add. Use a negative value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addMonthsUTC(2);
    * gs.info(gdt.getDate());
    */
  def addMonthsUTC(amount: Double): Unit = js.native
  
  /**
    * Adds the specified number of seconds to the current GlideDateTime object.
    *
    * @param seconds The number of seconds to add.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-07 08:00:00');
    * gdt.addSeconds(1000);
    * gs.info(gdt.getValue());
    */
  def addSeconds(value: Double): Unit = js.native
  
  /**
    * Adds a specified number of weeks to the current GlideDateTime object. A negative parameter
    * subtracts weeks. The method determines the local date and time equivalent to the value stored
    * by the GlideDateTime object, then adds or subtracts weeks using the local date and time values.
    *
    * @param weeks The number of weeks to add. Use a negative value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addWeeksLocalTime(-1);
    * gs.info(gdt.getDate());
    */
  def addWeeksLocalTime(amount: Double): Unit = js.native
  
  /**
    * Adds a specified number of weeks to the current GlideDateTime object. A negative parameter
    * subtracts weeks. The method determines the UTC date and time equivalent to the value stored by
    * the GlideDateTime object, then adds or subtracts weeks using the UTC date and time values.
    *
    * @param weeks The number of weeks to add. Use a negative value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addWeeksUTC(-1);
    * gs.info(gdt.getDate());
    */
  def addWeeksUTC(amount: Double): Unit = js.native
  
  /**
    * Adds a specified number of years to the current GlideDateTime object. A negative parameter
    * subtracts years. The method determines the local date and time equivalent to the value stored
    * by the GlideDateTime object, then adds or subtracts years using the local date and time values.
    *
    * @param years The number of years to add.  Use a negative value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addYearsLocalTime(1);
    * gs.info(gdt.getDate());
    */
  def addYearsLocalTime(amount: Double): Unit = js.native
  
  /**
    * Adds a specified number of years to the current GlideDateTime object. A negative parameter
    * subtracts years. The date and time value stored by GlideDateTime object is interpreted as being
    * in the UTC time zone.
    *
    * @param years The number of years to add. Use a negative value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gdt.addYearsUTC(1);
    * gs.info(gdt.getDate());
    */
  def addYearsUTC(amount: Double): Unit = js.native
  
  /**
    * Determines if the GlideDateTime object occurs after the specified GlideDateTime.
    *
    * @param gdt The time to check against.
    * @returns Returns true if the GlideDateTime object's time is after the time specified by
    * the parameter.
    * @example
    *
    * var gdt1 = new GlideDateTime('2016-05-09 10:11:12');
    * var gdt2 = new GlideDateTime('2017-06-12 15:11:12');
    * gs.info(gdt1.after(gdt2));
    */
  def after(gdt: GlideDateTime): Boolean = js.native
  
  /**
    * Determines if the GlideDateTime object occurs before the specified GlideDateTime.
    *
    * @param gdt The time to check against.
    * @returns Returns true if the GlideDateTime object's time is before the time specified by
    * the parameter.
    * @example
    *
    * var gdt1 = new GlideDateTime('2016-05-09 10:11:12');
    * var gdt2 = new GlideDateTime('2017-06-12 15:11:12');
    * gs.info(gdt1.before(gdt2));
    */
  def before(gdt: GlideDateTime): Boolean = js.native
  
  /**
    * Compares two date and time objects to determine whether they are equivalent or one occurs
    * before or after the other.
    *
    * @param o Date and time object in GlideDateTime format
    * @returns
    * 0 = Dates are equal
    * 1 = The object's date is after the date specified in the parameter
    * -1 = The object's date is before the date specified in the parameter
    *
    * @example
    *
    * var initDate = new GlideDateTime('2011-08-01 12:00:00');
    * var compDate1 = new GlideDateTime('2011-08-01 12:00:00');
    * var compDate2 = new GlideDateTime('2011-07-31 12:00:00');
    * var compDate3 = new GlideDateTime('2011-08-04 16:00:00');
    * gs.info(initDate.compareTo(compDate1)); // Equals (0)
    * gs.info(initDate.compareTo(compDate2)); // initDate is after compDate2 (1)
    * gs.info(initDate.compareTo(compDate3)); // initDate is before compDate3 (-1)
    */
  def compareTo(o: js.Object): Double = js.native
  
  def equals(dateTime: String): Boolean = js.native
  /**
    * Compares a datetime with an existing value for equality.
    *
    * @param dateTime The datetime to compare.
    * @returns Returns true if they are equal; otherwise, false.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 00:00:00');
    * gs.info(gdt.equals('2011-09-30 00:12:01'));
    */
  def equals(dateTime: GlideDateTime): Boolean = js.native
  
  /**
    * Gets the amount of time that daylight saving time is offset.
    *
    * @returns Amount of time, in milliseconds, that daylight saving is offset. Returns 0 if there is
    * no offset or if the time is not during daylight saving time.
    * @example
    *
    * var gdt = new GlideDateTime('2014-08-31 08:00:00');
    * gs.info(gdt.getDSTOffset()); //uses current user session time zone (US/Pacific)
    */
  def getDSTOffset(): Double = js.native
  
  /**
    * Gets the date stored by the GlideDateTime object, expressed in the standard format, yyyy-MM-dd,
    * and the system time zone, UTC by default.
    *
    * @returns The date in the system time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 00:00:00');
    * gs.info(gdt.getDate());
    */
  def getDate(): GlideTime = js.native
  
  /**
    * Gets the day of the month stored by the GlideDateTime object, expressed in the current user's
    * time zone.
    *
    * @returns The day of the month in the user's time zone, from 1 to 31.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-02 12:00:00');
    * gs.info(gdt.getDayOfMonthLocalTime());
    */
  def getDayOfMonthLocalTime(): Double = js.native
  
  /**
    * Gets the day of the month stored by the GlideDateTime object, expressed in the UTC time zone.
    *
    * @returns The day of the month in the UTC time zone, from 1 to 31.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-02 12:00:00');
    * gs.info(gdt.getDayOfMonthUTC());
    */
  def getDayOfMonthUTC(): Double = js.native
  
  /**
    * Gets the day of the week stored by the GlideDateTime object, expressed in the user's time zone.
    *
    * @returns The day of week value, in the user's time zone, from 1 to 7. Monday equals 1, Sunday
    * equals 7.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-01 12:00:00');//Thursday
    * gs.info(gdt.getDayOfWeekLocalTime());
    */
  def getDayOfWeekLocalTime(): Double = js.native
  
  /**
    * Gets the day of the week stored by the GlideDateTime object, expressed in the UTC time zone.
    *
    * @returns The day of week value from 1 to 7. Monday equals 1, Sunday equals 7.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-01 12:00:00');//Thursday
    * gs.info(gdt.getDayOfWeekLocalTime());
    */
  def getDayOfWeekUTC(): Double = js.native
  
  /**
    * Gets the number of days in the month stored by the GlideDateTime object, expressed in the
    * current user's time zone.
    *
    * @returns The number of days in the current month in the user's time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-02 12:00:00'); //December
    * gs.info(gdt.getDaysInMonthLocalTime());
    */
  def getDaysInMonthLocalTime(): Double = js.native
  
  /**
    * Gets the number of days in the month stored by the GlideDateTime object, expressed in the UTC
    * time zone.
    *
    * @returns The number of days in the month stored by the GlideDateTime object, expressed in the
    * UTC time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2011-11-02 12:00:00'); //November
    * gs.info(gdt.getDaysInMonthUTC());
    */
  def getDaysInMonthUTC(): Double = js.native
  
  /**
    * Gets the date and time value in the current user's display format and time zone.
    *
    * @returns The date and time in the user's format and time zone. Keep in mind when designing
    * business rules or script includes that this method may return values in different formats for
    * different users.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gs.info(gdt.getDisplayValue()); //uses current user session time zone (US/Pacific)
    */
  def getDisplayValue(): String = js.native
  
  /**
    * Gets the display value in the internal format (yyyy-MM-dd HH:mm:ss).
    *
    * @returns The date and time values for the GlideDateTime object in the current user's time zone
    * and the internal date and time format of yyyy-MM-dd HH:mm:ss.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gs.info(gdt.getDisplayValueInternal()); //uses current user session time zone (US/Pacific)
    */
  def getDisplayValueInternal(): String = js.native
  
  /**
    * Gets the current error message.
    *
    * @returns The error message.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.setDisplayValue('2011-aa-01 00:00:00');
    * gs.info(gdt.getErrorMsg());
    */
  def getErrorMsg(): String = js.native
  
  /**
    * Returns the object's time in the local time zone and in the internal format.
    *
    * @returns The object's time in the local time zone and the internal format.
    */
  def getInternalFormattedLocalTime(): String = js.native
  
  /**
    * Gets the date stored by the GlideDateTime object, expressed in the standard format, yyyy-MM-dd,
    * and the current user's time zone.
    *
    * @returns The date in the user's time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gs.info(gdt.getLocalDate());
    */
  def getLocalDate(): GlideTime = js.native
  
  /**
    * Returns a GlideTime object that represents the time portion of the GlideDateTime object in the
    * user's time zone.
    *
    * @returns The time in the user's time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2014-08-31 08:00:00');
    * gt = gdt.getLocalTime();
    * gs.info("local time is " + gt.getByFormat('hh:mm:ss'));
    */
  def getLocalTime(): GlideTime = js.native
  
  /**
    * Gets the month stored by the GlideDateTime object, expressed in the current user's time zone.
    *
    * @returns The numerical value of the month.
    * @example
    *
    * var gdt = new GlideDateTime('2011-11-02 12:00:00'); //November
    * gs.info(gdt.getMonthLocalTime());
    */
  def getMonthLocalTime(): Double = js.native
  
  /**
    * Gets the month stored by the GlideDateTime object, expressed in the UTC time zone.
    *
    * @returns The numerical value of the month.
    * @example
    *
    * var gdt = new GlideDateTime('2011-11-02 12:00:00'); //November
    * gs.info(gdt.getMonthUTC());
    */
  def getMonthUTC(): Double = js.native
  
  /**
    * Gets the number of milliseconds since January 1, 1970, 00:00:00 GMT.
    *
    * @returns The number of milliseconds since January 1, 1970, 00:00:00 GMT.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gs.info(gdt.getNumericValue());
    */
  def getNumericValue(): Double = js.native
  
  /**
    * Gets the time zone offset in milliseconds.
    *
    * @returns The number of milliseconds of time zone offset.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.getLocalTime(); // PST local time
    * gs.info(gdt.getTZOffset());
    */
  def getTZOffset(): Double = js.native
  
  /**
    * Returns a GlideTime object that represents the time portion of the GlideDateTime object.
    *
    * @returns The Unix duration stamp in system format based on GMT time.
    * @example
    *
    * var gdt = new GlideDateTime('2014-08-31 08:00:00');
    * gt = gdt.getTime();
    * gs.info(gt.getByFormat('hh:mm:ss'));
    */
  def getTime(): GlideTime = js.native
  
  /**
    * Returns the object's time in the local time zone and in the user's format.
    *
    * @returns The object's time in the local time zone and in the user's format.
    */
  def getUserFormattedLocalTime(): String = js.native
  
  /**
    * Gets the date and time value stored by the GlideDateTime object in the internal format,
    * yyyy-MM-dd HH:mm:ss, and the system time zone, UTC by default.
    *
    * @returns The date and time value in the internal format and system time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2014-08-31 08:00:00');
    * gs.info(gdt.getValue());
    */
  def getValue(): String = js.native
  
  /**
    * Gets the number of the week stored by the GlideDateTime object, expressed in the current user's
    * time zone. All weeks begin on Sunday. The first week of the year is the week that contains at
    * least one day of the new year. The week beginning Sunday 2015-12-27 is considered the first
    * week of 2016 as that week contains January 1 and 2.
    *
    * @returns The number of the current week in local time. The highest week number in a year is
    * either 52 or 53.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-01 12:00:00');//49th week, 1st week in december
    * gs.info(gdt.getWeekOfYearLocalTime());
    */
  def getWeekOfYearLocalTime(): Double = js.native
  
  /**
    * Gets the number of the week stored by the GlideDateTime object, expressed in the UTC time zone.
    * All weeks begin on Sunday. The first week of the year is the week that contains at least one
    * day of the new year. The week beginning Sunday 2015-12-27 is considered the first week of 2016
    * as that week contains January 1 and 2.
    *
    * @returns The number of the current week in UTC time. The highest week number in a year is
    * either 52 or 53.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-01 12:00:00');//49th week, 1st week in december
    * gs.info(gdt.getWeekOfYearUTC());
    */
  def getWeekOfYearUTC(): Double = js.native
  
  /**
    * Gets the year stored by the GlideDateTime object, expressed in the current user's time zone.
    *
    * @returns Four-digit year value in the user's time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2011-11-02 12:00:00');
    * gs.info(gdt.getYearLocalTime());
    */
  def getYearLocalTime(): Double = js.native
  
  /**
    * Gets the year stored by the GlideDateTime object, expressed in the UTC time zone.
    *
    * @returns 4-digit year value in the UTC time zone.
    * @example
    *
    * var gdt = new GlideDateTime('2011-11-02 12:00:00');
    * gs.info(gdt.getYearUTC());
    */
  def getYearUTC(): Double = js.native
  
  /**
    * Determines if an object's date is set.
    *
    * @returns True if the object date is set; otherwise, returns false.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * gs.info(gdt.hasDate());
    */
  def hasDate(): Boolean = js.native
  
  /**
    * Determines if an object's time uses a daylight saving offset.
    *
    * @returns True if the time is daylight saving; otherwise, returns false.
    * @example
    *
    * var gdt = new GlideDateTime('2014-08-31 00:00:00');
    * gs.info(gdt.isDST()); //true
    */
  def isDST(): Boolean = js.native
  
  /**
    * Determines if a value is a valid date and time.
    *
    * @returns True if value is valid; otherwise, returns false.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.setDisplayValue('2011-aa-01 00:00:00');
    * gs.info(gdt.isValid());
    */
  def isValid(): Boolean = js.native
  
  /**
    * Determines if the GlideDateTime object occurs on or after the specified GlideDateTime.
    *
    * @param gdt The time to check against.
    * @returns Returns true if the GlideDateTime object's time is on or after the time specified by
    * the parameter.
    * @example
    *
    * var gdt1 = new GlideDateTime('2016-05-09 10:11:12');
    * var gdt2 = new GlideDateTime('2017-06-12 15:11:12');
    * gs.info(gdt1.onOrAfter(gdt2));
    */
  def onOrAfter(gdt: GlideDateTime): Boolean = js.native
  
  /**
    * Determines if the GlideDateTime object occurs on or before the specified GlideDateTime.
    *
    * @param gdt The time to check against.
    * @returns Returns true if the GlideDateTime object's time is on or before the time specified by
    * the parameter.
    * @example
    *
    * var gdt1 = new GlideDateTime('2016-05-09 10:11:12');
    * var gdt2 = new GlideDateTime('2017-06-12 15:11:12');
    * gs.info(gdt1.onOrBefore(gdt2));
    */
  def onOrBefore(gdt: GlideDateTime): Boolean = js.native
  
  /**
    * Sets the day of the month to a specified value in the current user's time zone.
    *
    * @param day The day of month to change to, from 1 to 31. If this value is greater than the
    * maximum number of days in the month, the value is set to the last day of the month.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.setDayOfMonthLocalTime(9);
    * gs.info(gdt.getDayOfMonthLocalTime());
    */
  def setDayOfMonthLocalTime(day: Double): Unit = js.native
  
  /**
    * Sets the day of the month to a specified value in the UTC time zone.
    *
    * @param day The day of month to change to, from 1 to 31. If this value is greater than the
    * maximum number of days in the month, the value is set to the last day of the month.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.setDayOfMonthUTC(9);
    * gs.info(gdt.getDayOfMonthUTC());
    */
  def setDayOfMonthUTC(day: Double): Unit = js.native
  
  /**
    * Sets a date and time value using the current user's display format and time zone.
    *
    * @param asDisplayed The date and time in the current user's display format and time zone. The
    * parameter must be formatted using the current user's preferred display format, such as
    * MM-dd-yyyy HH:mm:ss. To assign the current date and time to a variable in a workflow script,
    * use variable.setDisplayValue(gs.nowDateTime);.
    * @example
    *
    * var gdt = new GlideDateTime('2014-02-02 12:00:00');
    * gdt.setDisplayValue('2014-01-01 12:00:00');//uses current user session time zone (US/Pacific)
    * gs.info(gdt.getValue());
    */
  /**
    * Sets a date and time value using the current user's time zone and the specified date and time
    * format. This method throws a runtime exception if the date and time format used in the value
    * parameter does not match the format parameter.
    *
    * You can retrieve the error message by calling getErrorMsg() on the GlideDateTime object after
    * the exception is caught.
    *
    * @param value The date and time in the current user's time zone.
    * @param format The date and time format to use to parse the value
    * parameter.
    * @example
    *
    * var gdt = new GlideDateTime('2011-02-02 12:00:00');
    * gdt.setDisplayValue('20-5-2011 12:00:00', 'dd-MM-yyyy HH:mm:ss'); //uses current user session time zone (US/Pacific)
    * gs.info(gdt.getValue());
    */
  def setDisplayValue(asDisplayed: String): Unit = js.native
  def setDisplayValue(value: String, format: String): Unit = js.native
  
  /**
    * Sets a date and time value using the internal format (yyyy-MM-dd HH:mm:ss) and the current
    * user's time zone.
    *
    * @param value The date and time in internal format.
    * @example
    *
    * var gdt = new GlideDateTime('2014-02-02 12:00:00');
    * //uses current user session time zone (US/Pacific)
    * gdt.setDisplayValueInternal('2014-01-01 12:00:00');
    * gs.info(gdt.getValue());
    */
  def setDisplayValueInternal(value: String): Unit = js.native
  
  /**
    * Sets the date and time of the current object using an existing GlideDateTime object. This
    * method is equivalent to instantiating a new object with a GlideDateTime parameter.
    *
    * @param g The object to use for setting the datetime value.
    * @example
    *
    * var dt1 = new GlideDateTime('2011-01-01 12:00:00');
    * var dt2 = new GlideDateTime('2011-02-02 08:00:00');
    * dt1.setGlideDateTime(dt2);
    * gs.info(dt1.getValue());
    */
  def setGlideDateTime(g: GlideDateTime): Unit = js.native
  
  /**
    * Sets the month stored by the GlideDateTime object to the specified value using the current
    * user's time zone.
    *
    * @param month The month to change to.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.setMonthLocalTime(1);
    * gs.info(gdt.getMonthLocalTime());
    */
  def setMonthLocalTime(month: Double): Unit = js.native
  
  /**
    * Sets the month stored by the GlideDateTime object to the specified value using the UTC time
    * zone.
    *
    * @param month The month to change to.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.setMonthUTC(1);
    * gs.info(gdt.getMonthUTC());
    */
  def setMonthUTC(month: Double): Unit = js.native
  
  /**
    * Sets the date and time of the GlideDateTime object.
    *
    * @param o The date and time to use. This parameter may be one of several types:
    *
    * - A string in the UTC time zone and the internal format of yyyy-MM-dd HH:mm:ss. Sets the value
    * of the object to the specified date and time. Using the method this way is equivalent to
    * instantiating a new GlideDateTime object using the GlideDateTime(String value) constructor. If
    * the date and time format used does not match the internal format, the method attempts to set
    * the date and time using other available formats. Resolving the date and time this way can lead
    * to inaccurate data due to ambiguity in the day and month values. When using a non-standard date
    * and time format, use setValueUTC(String dt, String format) instead.
    * - A GlideDateTime object. Sets the value of the object to the date and time stored by the
    * GlideDateTime passed in the parameter. Using the method this way is equivalent to instantiating
    * a new GlideDateTime object using the GlideDateTime(GlideDateTime g) constructor.
    * - A JavaScript Number. Sets the value of the object using the Number value as milliseconds past
    * January 1, 1970 00:00:00 GMT.
    * @example
    *
    * var gdt = new GlideDateTime('2011-01-01 12:00:00');
    * gdt.setValue('2011-02-02 08:00:00');  // value set =  2011-02-02 08:00:00
    * gs.info(gdt.getValue());
    */
  def setValue(o: String): Unit = js.native
  def setValue(o: Double): Unit = js.native
  def setValue(o: GlideDateTime): Unit = js.native
  
  /**
    * Sets a date and time value using the UTC time zone and the specified date and time format. This
    * method throws a runtime exception if the date and time format used in the `dt` parameter does
    * not match the `format` parameter. You can retrieve the error message by calling `getErrorMsg()`
    * on the GlideDateTime object after the exception is caught.
    *
    * @param dt The date and time to use.
    * @param format The date and time format to use.
    * @example
    *
    * var gdt = new GlideDateTime('2011-01-01 12:00:00');
    * gdt.setValueUTC('15-02-2011 08:00:00', 'dd-MM-yyyy HH:mm:ss');
    * gs.info(gdt.getValue());
    */
  def setValueUTC(dt: String, format: String): Unit = js.native
  
  /**
    * Sets the year stored by the GlideDateTime object to the specified value using the current
    * user's time zone.
    *
    * @param year The year to change to.
    * @example var gdt = new GlideDateTime();
    * gdt.setYearLocalTime(2013);
    * gs.info(gdt.getYearLocalTime());
    */
  def setYearLocalTime(year: Double): Unit = js.native
  
  /**
    * Sets the year stored by the GlideDateTime object to the specified value using the UTC time
    * zone.
    *
    * @param year The year to change to.
    * @example
    *
    * var gdt = new GlideDateTime();
    * gdt.setYearUTC(2013);
    * gs.info(gdt.getYearUTC());
    */
  def setYearUTC(year: Double): Unit = js.native
  
  /**
    * Subtracts the specified number of milliseconds from the GlideDateTime object.
    *
    * @param milliseconds The number of milliseconds to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-12-07 08:00:00');
    * gdt.subtract(1000);
    * gs.info(gdt.getValue());
    */
  def subtract(milliseconds: Double): Unit = js.native
  /**
    * Subtracts a specified amount of time from the current GlideDateTime object.
    *
    * @param time The time value to subtract.
    * @example
    *
    * var gdt = new GlideDateTime('2011-08-31 08:00:00');
    * var gtime1 = new GlideTime();
    * gtime1.setValue('00:00:20');
    * gdt.subtract(gtime1);
    * var gtime2 = gdt.getTime();
    * gs.info(gtime2.getByFormat('hh:mm:ss'));
    */
  def subtract(time: GlideTime): Unit = js.native
}
