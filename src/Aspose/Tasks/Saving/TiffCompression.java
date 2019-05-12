package Aspose.Tasks.Saving;

public enum TiffCompression {
  None(1L),
  Rle(2L),
  Ccitt3(3L),
  Ccitt4(4L),
  Lzw(5L),
  ;
  private long numVal;

  TiffCompression(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
