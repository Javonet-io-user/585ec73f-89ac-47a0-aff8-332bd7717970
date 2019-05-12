package Aspose.Tasks.Visualization;

public enum PresentationFormat {
  GanttChart(0L),
  TaskUsage(1L),
  ResourceUsage(2L),
  ResourceSheet(3L),
  TaskSheet(4L),
  ;
  private long numVal;

  PresentationFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
