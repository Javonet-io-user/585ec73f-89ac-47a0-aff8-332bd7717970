package Aspose.Tasks.Visualization;

public enum ReportType {
  ProjectOverview(0L),
  CostOverview(1L),
  WorkOverview(2L),
  ResourceOverview(3L),
  ResourceCostOverview(4L),
  CriticalTasks(5L),
  LateTasks(6L),
  Milestones(7L),
  UpcomingTask(8L),
  CostOverruns(9L),
  TaskCostOverview(10L),
  OverallocatedResources(11L),
  SlippingTasks(12L),
  BestPracticeAnalyzer(13L),
  Burndown(14L),
  CashFlow(15L),
  ;
  private long numVal;

  ReportType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
