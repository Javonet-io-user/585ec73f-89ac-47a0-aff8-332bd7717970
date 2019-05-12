package Aspose.Tasks;

public enum ItemType {
  TaskItem(0L),
  ResourceItem(1L),
  OtherItem(2L),
  ;
  private long numVal;

  ItemType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
