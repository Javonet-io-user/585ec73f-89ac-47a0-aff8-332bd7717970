package Aspose.Tasks.RiskAnalysis;

public enum RiskItemType {
  Start(0L),
  Finish(1L),
  EarlyStart(2L),
  EarlyFinish(3L),
  LateStart(4L),
  LateFinish(5L),
  ;
  private long numVal;

  RiskItemType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
