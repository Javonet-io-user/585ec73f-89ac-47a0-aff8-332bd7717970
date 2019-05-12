package Aspose.Tasks.Visualization;

public enum RenderFormat {
  Image(0L),
  Html(1L),
  ;
  private long numVal;

  RenderFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
