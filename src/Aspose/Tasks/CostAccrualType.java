package Aspose.Tasks;

public enum CostAccrualType {
  Start(0L),
  Prorated(1L),
  End(2L),
  Invalid(3L),
  Undefined(-1L),
  ;
  private long numVal;

  CostAccrualType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
