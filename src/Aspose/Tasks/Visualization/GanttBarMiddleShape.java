package Aspose.Tasks.Visualization;

public enum GanttBarMiddleShape {
  None(0L),
  RectangleBar(1L),
  RectangleTop(2L),
  RectangleMiddle(3L),
  RectangleBottom(4L),
  LineTop(5L),
  LineMiddle(6L),
  LineBottom(7L),
  ;
  private long numVal;

  GanttBarMiddleShape(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
