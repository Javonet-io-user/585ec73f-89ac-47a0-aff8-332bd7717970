package Aspose.Tasks.Visualization;

public enum BarShape {
  Full(0L),
  HalfHeight(1L),
  Thin(2L),
  None(3L),
  Middle(4L),
  LineBottom(5L),
  ;
  private long numVal;

  BarShape(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
