package Aspose.Tasks;

public enum RateFormatType {
  Minute(0L),
  Hour(1L),
  Day(2L),
  Week(3L),
  Month(4L),
  Year(5L),
  MaterialResourceRate(6L),
  Undefined(-1L),
  ;
  private long numVal;

  RateFormatType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
