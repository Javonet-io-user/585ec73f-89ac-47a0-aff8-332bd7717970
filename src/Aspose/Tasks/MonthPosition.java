package Aspose.Tasks;

public enum MonthPosition {
  First(0L),
  Second(1L),
  Third(2L),
  Fourth(3L),
  Last(4L),
  Undefined(-1L),
  ;
  private long numVal;

  MonthPosition(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
