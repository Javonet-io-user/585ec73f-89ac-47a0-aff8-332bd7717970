package Aspose.Tasks;

public enum GroupOn {
  EachValue(0L),
  Interval(1L),
  DateEachValue(10L),
  DateMinute(11L),
  DateHour(12L),
  DateDay(13L),
  DateWeek(14L),
  DateThirdOfMonth(15L),
  DateMonth(16L),
  DateQtr(17L),
  DateYear(18L),
  DurationEachValue(20L),
  DurationMinutes(21L),
  DurationHours(22L),
  DurationDays(23L),
  DurationWeeks(24L),
  DurationMonths(25L),
  OutlineEachValue(30L),
  OutlineLevel(31L),
  PctEachValue(40L),
  PctInterval(41L),
  Pct199(42L),
  Pct150(43L),
  Pct125(44L),
  Pct110(45L),
  TextEachValue(50L),
  TextPrefix(51L),
  ;
  private long numVal;

  GroupOn(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
