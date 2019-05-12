package Aspose.Tasks;

public enum TaskUsageViewField {
  Work(0L),
  OvertimeWork(1L),
  ActualWork(2L),
  ActualOvertimeWork(3L),
  CumulativeWork(4L),
  BaselineWork(5L),
  Overallocation(6L),
  PercentAllocation(7L),
  PeakUnits(8L),
  Cost(9L),
  FixedCost(10L),
  ActualCost(11L),
  BaselineCost(12L),
  CumulativeCost(13L),
  BCWS(14L),
  BCWP(15L),
  ACWP(16L),
  SV(17L),
  CV(18L),
  RegularWork(19L),
  PercentComplete(20L),
  CumulativePercentComplete(21L),
  Baseline1Work(22L),
  Baseline1Cost(23L),
  Baseline2Work(24L),
  Baseline2Cost(25L),
  Baseline3Work(26L),
  Baseline3Cost(27L),
  Baseline4Work(28L),
  Baseline4Cost(29L),
  Baseline5Work(30L),
  Baseline5Cost(31L),
  Baseline6Work(32L),
  Baseline6Cost(33L),
  Baseline7Work(34L),
  Baseline7Cost(35L),
  Baseline8Work(36L),
  Baseline8Cost(37L),
  Baseline9Work(38L),
  Baseline9Cost(39L),
  Baseline10Work(40L),
  Baseline10Cost(41L),
  ActualFixedCost(42L),
  CPI(43L),
  SPI(44L),
  CVPercent(45L),
  SVPercent(46L),
  BudgetWork(47L),
  BudgetCost(48L),
  BaselineBudgetWork(49L),
  BaselineBudgetCost(50L),
  Baseline1BudgetWork(51L),
  Baseline1BudgetCost(52L),
  Baseline2BudgetWork(53L),
  Baseline2BudgetCost(54L),
  Baseline3BudgetWork(55L),
  Baseline3BudgetCost(56L),
  Baseline4BudgetWork(57L),
  Baseline4BudgetCost(58L),
  Baseline5BudgetWork(59L),
  Baseline5BudgetCost(60L),
  Baseline6BudgetWork(61L),
  Baseline6BudgetCost(62L),
  Baseline7BudgetWork(63L),
  Baseline7BudgetCost(64L),
  Baseline8BudgetWork(65L),
  Baseline8BudgetCost(66L),
  Baseline9BudgetWork(67L),
  Baseline9BudgetCost(68L),
  Baseline10BudgetWork(69L),
  Baseline10BudgetCost(70L),
  AllTaskRows(71L),
  AllAssignmentRows(72L),
  Undefined(-1L),
  ;
  private long numVal;

  TaskUsageViewField(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
