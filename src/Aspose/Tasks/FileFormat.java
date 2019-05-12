package Aspose.Tasks;

public enum FileFormat {
  Undefined(0L),
  P6XML(1L),
  XML(2L),
  MPP8(3L),
  MPP9(4L),
  MPP12(5L),
  MPP14(6L),
  MPT9(7L),
  MPT12(8L),
  MPT14(9L),
  MPX(10L),
  XER(11L),
  HTML(12L),
  ;
  private long numVal;

  FileFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
