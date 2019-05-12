package Aspose.Tasks;

public enum ElementType {
  Null(0L),
  Task(1L),
  Resource(2L),
  Calendar(3L),
  Assignment(4L),
  ;
  private long numVal;

  ElementType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
