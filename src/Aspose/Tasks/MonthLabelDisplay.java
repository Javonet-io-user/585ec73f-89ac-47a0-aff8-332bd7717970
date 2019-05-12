package Aspose.Tasks;

public enum MonthLabelDisplay {
  Mo(0L),
  Mon(1L),
  Month(2L),
  ;
  private long numVal;

  MonthLabelDisplay(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
