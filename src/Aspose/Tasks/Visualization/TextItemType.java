package Aspose.Tasks.Visualization;

public enum TextItemType {
  RowColumnTitles(0L),
  CriticalTasks(1L),
  NoncriticalTasks(2L),
  MilestoneTasks(3L),
  InactiveTasks(4L),
  SummaryTasks(5L),
  AssignmentRow(6L),
  TopTimescaleTier(7L),
  BottomTimescaleTier(8L),
  MiddleTimescaleTier(9L),
  Resources(10L),
  OverallocatedResources(11L),
  TaskFilterHighlight(12L),
  BarTextBottom(13L),
  BarTextInside(14L),
  BarTextLeft(15L),
  BarTextRight(16L),
  BarTextTop(17L),
  MarkedTasks(18L),
  ProjectSummary(19L),
  ExternalTasks(20L),
  Allocated(21L),
  ;
  private long numVal;

  TextItemType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
