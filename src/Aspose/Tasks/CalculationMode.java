package Aspose.Tasks;

public enum CalculationMode {
  None(0L),
  Automatic(1L),
  Manual(2L),
  ;
  private long numVal;

  CalculationMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
