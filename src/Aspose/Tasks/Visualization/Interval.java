package Aspose.Tasks.Visualization;

public enum Interval {
  Daily(0L),
  Weekly(1L),
  Monthly(2L),
  ;
  private long numVal;

  Interval(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
