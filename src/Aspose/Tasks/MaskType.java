package Aspose.Tasks;

public enum MaskType {
  Null(0L),
  Numbers(1L),
  UpperCaseLetters(2L),
  LowerCaseLetters(3L),
  Characters(4L),
  Val4(5L),
  Val5(6L),
  Val6(7L),
  Val7(8L),
  Val8(9L),
  Val9(10L),
  ;
  private long numVal;

  MaskType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
