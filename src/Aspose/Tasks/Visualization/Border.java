package Aspose.Tasks.Visualization;

public enum Border {
  NoBorder(0L),
  AroundEveryPage(1L),
  OutsidePages(2L),
  ;
  private long numVal;

  Border(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
