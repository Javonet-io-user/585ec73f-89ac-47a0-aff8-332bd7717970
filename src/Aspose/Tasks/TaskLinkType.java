package Aspose.Tasks;

public enum TaskLinkType {
  FinishToFinish(0L),
  FinishToStart(1L),
  StartToFinish(2L),
  StartToStart(3L),
  ;
  private long numVal;

  TaskLinkType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
