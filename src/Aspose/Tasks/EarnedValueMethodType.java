package Aspose.Tasks;

public enum EarnedValueMethodType {
  PercentComplete(0L),
  PhysicalPercentComplete(1L),
  Undefined(-1L),
  ;
  private long numVal;

  EarnedValueMethodType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
