package Aspose.Tasks.Visualization;

public enum PrinterPaperSize {
  PaperLetter(1L),
  PaperTabloid(3L),
  PaperLegal(5L),
  PaperExecutive(7L),
  PaperA3(8L),
  PaperA4(9L),
  PaperB4(12L),
  PaperB5(13L),
  PaperEnvelope10(20L),
  PaperEnvelopeMonarch(37L),
  ;
  private long numVal;

  PrinterPaperSize(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
