package Aspose.Tasks;

public enum WeekLabelDisplay {
  W(0L),
  Wk(1L),
  Week(2L),
  ;
  private long numVal;

  WeekLabelDisplay(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
