package Aspose.Tasks.Visualization;

public enum Legend {
  NoLegend(0L),
  AfterLastPage(1L),
  OnEveryPage(2L),
  ;
  private long numVal;

  Legend(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
