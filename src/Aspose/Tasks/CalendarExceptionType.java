package Aspose.Tasks;

public enum CalendarExceptionType {
  Daily(0L),
  YearlyByDay(1L),
  YearlyByPosition(2L),
  MonthlyByDay(3L),
  MonthlyByPosition(4L),
  Weekly(5L),
  ByDayCount(6L),
  ByWeekDayCount(7L),
  NoExceptionType(8L),
  ;
  private long numVal;

  CalendarExceptionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
