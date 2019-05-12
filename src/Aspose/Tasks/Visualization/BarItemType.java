package Aspose.Tasks.Visualization;

public enum BarItemType {
  Task(0L),
  Summary(1L),
  ProjectSummary(2L),
  ManualTask(3L),
  InactiveTask(4L),
  CriticalTask(5L),
  Milestone(6L),
  ManualSummary(7L),
  Split(8L),
  ExternalTasks(9L),
  ExternalMilestone(10L),
  Deadline(11L),
  Progress(12L),
  StartOnly(13L),
  FinishOnly(14L),
  DurationOnly(15L),
  InactiveMilestone(16L),
  InactiveSummary(17L),
  SummaryRollup(18L),
  ;
  private long numVal;

  BarItemType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
