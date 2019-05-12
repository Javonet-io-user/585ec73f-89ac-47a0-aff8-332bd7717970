package Aspose.Tasks.Visualization;

public enum RenderScale {
  Default(0L),
  Week(1L),
  CoupleOfWeeks(2L),
  Month(3L),
  Project(4L),
  ;
  private long numVal;

  RenderScale(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
