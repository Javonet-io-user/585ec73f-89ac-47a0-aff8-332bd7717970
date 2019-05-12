package Aspose.Tasks;

public enum GanttBarSize {
  BarSize6(0L),
  BarSize8(1L),
  BarSize10(2L),
  BarSize12(3L),
  BarSize14(4L),
  BarSize18(5L),
  BarSize24(6L),
  ;
  private long numVal;

  GanttBarSize(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
