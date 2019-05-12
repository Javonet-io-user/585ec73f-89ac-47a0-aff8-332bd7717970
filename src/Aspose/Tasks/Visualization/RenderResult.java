package Aspose.Tasks.Visualization;

public enum RenderResult {
  OK(0L),
  Failure(1L),
  ;
  private long numVal;

  RenderResult(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
