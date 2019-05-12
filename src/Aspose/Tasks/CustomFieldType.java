package Aspose.Tasks;

public enum CustomFieldType {
  Null(0L),
  Cost(1L),
  Date(2L),
  Duration(3L),
  Finish(4L),
  Flag(5L),
  Number(6L),
  Start(7L),
  Text(8L),
  ;
  private long numVal;

  CustomFieldType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
