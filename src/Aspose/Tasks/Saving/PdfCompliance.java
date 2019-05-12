package Aspose.Tasks.Saving;

public enum PdfCompliance {
  Pdf15(0L),
  PdfA1a(1L),
  PdfA1b(2L),
  ;
  private long numVal;

  PdfCompliance(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
