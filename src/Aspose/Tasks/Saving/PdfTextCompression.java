package Aspose.Tasks.Saving;

public enum PdfTextCompression {
  None(0L),
  Flate(1L),
  ;
  private long numVal;

  PdfTextCompression(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
