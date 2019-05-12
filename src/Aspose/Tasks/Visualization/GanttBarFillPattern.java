package Aspose.Tasks.Visualization;

public enum GanttBarFillPattern {
  Hollow(0L),
  SolidFill(1L),
  LightFill(2L),
  MediumFill(3L),
  DarkFill(4L),
  DiagonalLeft(5L),
  DiagonalRight(6L),
  DiagonalCross(7L),
  LineVertical(8L),
  LineHorizontal(9L),
  LineCross(10L),
  SolidFillWithDashedBorder(11L),
  ;
  private long numVal;

  GanttBarFillPattern(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
