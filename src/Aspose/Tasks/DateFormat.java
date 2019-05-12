package Aspose.Tasks;

public enum DateFormat {
  DateMmDdYyHhMmAM(0L),
  DateMmDdYy(1L),
  DateMmmmDdYyyyHhMmAM(2L),
  DateMmmmDdYyyy(3L),
  DateMmmDdHhMmAM(4L),
  DateMmmDdYyy(5L),
  DateMmmmDd(6L),
  DateMmmDd(7L),
  DateDddMmDdYyHhMmAM(8L),
  DateDddMmDdYy(9L),
  DateDddMmmDdYyy(10L),
  DateDddHhMmAM(11L),
  DateMmDd(12L),
  DateDd(13L),
  DateHhMmAm(14L),
  DateDddMmmDd(15L),
  DateDddMmDd(16L),
  DateDddDd(17L),
  DateWwwDd(18L),
  DateWwwDdYyHhMmAm(19L),
  DateMmDdYyyy(20L),
  Default(255L),
  DateDdMmYyyy(256L),
  ;
  private long numVal;

  DateFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
