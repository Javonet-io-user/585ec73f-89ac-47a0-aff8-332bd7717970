package Aspose.Tasks;

public enum OutlineValueType {
  Null(0L),
  Date(1L),
  Duration(2L),
  Cost(3L),
  Number(4L),
  Flag(5L),
  Text(6L),
  FinishDate(7L),
  ;
  private long numVal;

  OutlineValueType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
