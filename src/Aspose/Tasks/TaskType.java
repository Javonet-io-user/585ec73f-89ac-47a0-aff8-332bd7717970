package Aspose.Tasks;

public enum TaskType {
  FixedUnits(0L),
  FixedDuration(1L),
  FixedWork(2L),
  Undefined(-1L),
  ;
  private long numVal;

  TaskType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
