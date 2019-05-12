package Aspose.Tasks.Saving;

public enum DataCategory {
  Tasks(0L),
  Resources(1L),
  Assignments(2L),
  ;
  private long numVal;

  DataCategory(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
