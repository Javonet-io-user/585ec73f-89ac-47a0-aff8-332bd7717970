package Aspose.Tasks.Visualization;

public enum Shape {
  None(0L),
  VerticalLine(1L),
  Pentagon(2L),
  Triangle(3L),
  LeftBracket(4L),
  RightBracket(5L),
  ArrowDown(6L),
  LeftFade(7L),
  RightFade(8L),
  ;
  private long numVal;

  Shape(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
