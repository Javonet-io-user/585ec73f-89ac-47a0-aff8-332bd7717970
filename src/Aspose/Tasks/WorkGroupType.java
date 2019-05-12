package Aspose.Tasks;

public enum WorkGroupType {
  Default(0L),
  None(1L),
  Email(2L),
  Web(3L),
  ;
  private long numVal;

  WorkGroupType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
