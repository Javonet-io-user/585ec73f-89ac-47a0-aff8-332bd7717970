package Aspose.Tasks;

public enum YearLabelDisplay {
  Y(0L),
  Yr(1L),
  Year(2L),
  ;
  private long numVal;

  YearLabelDisplay(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
