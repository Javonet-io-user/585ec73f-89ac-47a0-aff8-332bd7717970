package Aspose.Tasks;

public enum RateScaleType {
  Undefined(0L),
  Minute(1L),
  Hour(2L),
  Day(3L),
  Week(4L),
  Month(5L),
  Quarter(6L),
  Year(7L),
  ;
  private long numVal;

  RateScaleType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
