package Aspose.Tasks;

public enum DayLabelDisplay {
  D(0L),
  Dy(1L),
  Day(2L),
  ;
  private long numVal;

  DayLabelDisplay(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
