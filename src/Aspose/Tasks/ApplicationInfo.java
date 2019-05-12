package Aspose.Tasks;

public enum ApplicationInfo {
  Undefined(0L),
  MSP2000(1L),
  MSP2003(2L),
  MSP2007(3L),
  MSP2010(4L),
  MSP2013(5L),
  MSP2016(6L),
  ;
  private long numVal;

  ApplicationInfo(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
