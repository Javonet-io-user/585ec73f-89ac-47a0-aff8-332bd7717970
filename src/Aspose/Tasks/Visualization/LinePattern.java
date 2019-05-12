package Aspose.Tasks.Visualization;

public enum LinePattern {
  None(0L),
  Solid(1L),
  Dashed(2L),
  CloseDot(3L),
  Dotted(4L),
  ;
  private long numVal;

  LinePattern(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
