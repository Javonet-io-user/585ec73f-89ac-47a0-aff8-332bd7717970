package Aspose.Tasks;

public enum MonthItemType {
  Day(0L),
  Weekday(1L),
  WeekendDay(2L),
  Sunday(3L),
  Monday(4L),
  Tuesday(5L),
  Wednesday(6L),
  Thursday(7L),
  Friday(8L),
  Saturday(9L),
  Undefined(-1L),
  ;
  private long numVal;

  MonthItemType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
