package Aspose.Tasks;

public enum BackgroundPattern {
  Hollow(0L),
  SolidFill(1L),
  LightFill(2L),
  MediumFill(3L),
  DarkFill(4L),
  DiagonalLeft(5L),
  DiagonalRight(6L),
  DarkDiagonalLeft(7L),
  DarkDiagonalRight(8L),
  ThinVerticalStripe(9L),
  MediumVerticalStripe(10L),
  LightDither(11L),
  MediumDither(12L),
  DarkDither(13L),
  ;
  private long numVal;

  BackgroundPattern(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
