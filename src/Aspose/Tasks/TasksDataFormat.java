package Aspose.Tasks;

public enum TasksDataFormat {
  XML(0L),
  MPP(1L),
  ;
  private long numVal;

  TasksDataFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
