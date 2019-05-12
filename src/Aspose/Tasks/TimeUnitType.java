package Aspose.Tasks;

public enum TimeUnitType {
  Minute(0L),
  ElapsedMinute(1L),
  Hour(2L),
  ElapsedHour(3L),
  Day(4L),
  ElapsedDay(5L),
  Week(6L),
  ElapsedWeek(7L),
  Month(8L),
  ElapsedMonth(9L),
  Percent(10L),
  ElapsedPercent(11L),
  Null(12L),
  MinuteEstimated(13L),
  ElapsedMinuteEstimated(14L),
  HourEstimated(15L),
  ElapsedHourEstimated(16L),
  DayEstimated(17L),
  ElapsedDayEstimated(18L),
  WeekEstimated(19L),
  ElapsedWeekEstimated(20L),
  MonthEstimated(21L),
  ElapsedMonthEstimated(22L),
  PercentEstimated(23L),
  ElapsedPercentEstimated(24L),
  Year(25L),
  Undefined(-1L),
  ;
  private long numVal;

  TimeUnitType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
