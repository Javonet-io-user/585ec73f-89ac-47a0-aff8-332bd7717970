package Aspose.Tasks;

public enum FilterOperation {
  Undefined(0L),
  And(1L),
  Or(2L),
  ;
  private long numVal;

  FilterOperation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
