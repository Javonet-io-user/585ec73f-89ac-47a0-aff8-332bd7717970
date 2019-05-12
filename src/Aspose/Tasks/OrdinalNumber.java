package Aspose.Tasks;

public enum OrdinalNumber {
  First(1L),
  Second(2L),
  Third(3L),
  Fourth(4L),
  Last(5L),
  ;
  private long numVal;

  OrdinalNumber(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
