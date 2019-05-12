package Aspose.Tasks.Visualization;

public enum TimescaleUnit {
  Minutes(0L),
  Hours(1L),
  Days(2L),
  Weeks(3L),
  ThirdsOfMonths(4L),
  Months(5L),
  Quarters(6L),
  HalfYears(7L),
  Years(8L),
  None(-1L),
  ;
  private long numVal;

  TimescaleUnit(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
