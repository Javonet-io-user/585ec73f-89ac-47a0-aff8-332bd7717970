package Aspose.Tasks;

public enum Month {
  January(0L),
  February(1L),
  March(2L),
  April(3L),
  May(4L),
  June(5L),
  July(6L),
  August(7L),
  September(8L),
  October(9L),
  November(10L),
  December(11L),
  Undefined(-1L),
  ;
  private long numVal;

  Month(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
