package Aspose.Tasks;

public enum MinuteLabelDisplay {
  M(0L),
  Min(1L),
  Minute(2L),
  ;
  private long numVal;

  MinuteLabelDisplay(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
