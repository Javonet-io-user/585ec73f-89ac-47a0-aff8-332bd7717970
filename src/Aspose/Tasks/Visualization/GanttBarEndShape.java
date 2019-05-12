package Aspose.Tasks.Visualization;

public enum GanttBarEndShape {
  NoBarEndShape(0L),
  HouseUp(1L),
  HouseDown(2L),
  Diamond(3L),
  TriangleUp(4L),
  TriangleDown(5L),
  TriangleRight(6L),
  TriangleLeft(7L),
  ArrowUp(8L),
  CaretDownTop(9L),
  CaretUpBottom(10L),
  LineShape(11L),
  Square(12L),
  CircleDiamond(13L),
  ArrowDown(14L),
  CircleTriangleUp(15L),
  CircleTriangleDown(16L),
  CircleArrowUp(17L),
  CircleArrowDown(18L),
  Circle(19L),
  Star(20L),
  LeftBracket(21L),
  RightBracket(22L),
  LeftFade(23L),
  RightFade(24L),
  ;
  private long numVal;

  GanttBarEndShape(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
