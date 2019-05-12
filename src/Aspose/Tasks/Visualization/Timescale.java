package Aspose.Tasks.Visualization;

public enum Timescale {
  Days(1L),
  ThirdsOfMonths(10L),
  Months(30L),
  ;
  private long numVal;

  Timescale(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
