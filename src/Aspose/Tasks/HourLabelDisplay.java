package Aspose.Tasks;

public enum HourLabelDisplay {
  H(0L),
  Hr(1L),
  Hour(2L),
  ;
  private long numVal;

  HourLabelDisplay(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
