package Aspose.Tasks;

public enum WeekdayType {
  None(0L),
  Sunday(1L),
  Monday(2L),
  Tuesday(4L),
  Wednesday(8L),
  Thursday(16L),
  Friday(32L),
  Saturday(64L),
  ;
  private long numVal;

  WeekdayType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
