package Aspose.Tasks;

public enum BookingType {
  Committed(0L),
  Proposed(1L),
  Undefined(-1L),
  ;
  private long numVal;

  BookingType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
