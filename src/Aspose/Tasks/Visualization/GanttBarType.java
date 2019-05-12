package Aspose.Tasks.Visualization;

public enum GanttBarType {
  Solid(0L),
  Framed(1L),
  Dashed(2L),
  ;
  private long numVal;

  GanttBarType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
