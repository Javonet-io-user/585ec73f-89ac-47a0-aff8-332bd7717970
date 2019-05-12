package Aspose.Tasks;

public enum TaskStartDateType {
  ProjectStartDate(0L),
  CurrentDate(1L),
  Undefined(-1L),
  ;
  private long numVal;

  TaskStartDateType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
