package Aspose.Tasks;

public enum RateType {
  A(0L),
  B(1L),
  C(2L),
  D(3L),
  E(4L),
  Undefined(-1L),
  ;
  private long numVal;

  RateType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
