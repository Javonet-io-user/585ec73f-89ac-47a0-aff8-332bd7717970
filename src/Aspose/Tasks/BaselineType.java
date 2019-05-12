package Aspose.Tasks;

public enum BaselineType {
  Baseline(0L),
  Baseline1(1L),
  Baseline2(2L),
  Baseline3(3L),
  Baseline4(4L),
  Baseline5(5L),
  Baseline6(6L),
  Baseline7(7L),
  Baseline8(8L),
  Baseline9(9L),
  Baseline10(10L),
  Undefined(-1L),
  ;
  private long numVal;

  BaselineType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
