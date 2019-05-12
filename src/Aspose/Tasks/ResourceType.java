package Aspose.Tasks;

public enum ResourceType {
  Material(0L),
  Work(1L),
  Cost(2L),
  ;
  private long numVal;

  ResourceType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
