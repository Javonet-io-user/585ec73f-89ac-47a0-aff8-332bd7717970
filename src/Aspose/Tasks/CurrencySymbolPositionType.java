package Aspose.Tasks;

public enum CurrencySymbolPositionType {
  Before(0L),
  After(1L),
  BeforeWithSpace(2L),
  AfterWithSpace(3L),
  Undefined(-1L),
  ;
  private long numVal;

  CurrencySymbolPositionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
