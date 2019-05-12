package Aspose.Tasks;

public enum DayType {
  Exception(0L),
  Sunday(1L),
  Monday(2L),
  Tuesday(3L),
  Wednesday(4L),
  Thursday(5L),
  Friday(6L),
  Saturday(7L),
  ;
  private long numVal;

  DayType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
