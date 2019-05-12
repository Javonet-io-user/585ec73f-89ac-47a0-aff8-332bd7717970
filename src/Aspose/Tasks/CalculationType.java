package Aspose.Tasks;

public enum CalculationType {
  None(0L),
  Lookup(1L),
  Rollup(2L),
  Calculation(3L),
  ;
  private long numVal;

  CalculationType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
