package Aspose.Tasks.Visualization;

public enum PageSize {
  Letter(0L),
  Ledger(1L),
  A0(2L),
  A1(3L),
  A2(4L),
  A3(5L),
  A4(6L),
  ;
  private long numVal;

  PageSize(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
