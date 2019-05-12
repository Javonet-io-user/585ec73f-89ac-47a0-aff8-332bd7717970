package Aspose.Tasks.Saving;

public enum SaveFileFormat {
  MPP(0L),
  XML(1L),
  HTML(2L),
  BMP(3L),
  PNG(4L),
  JPEG(5L),
  PDF(6L),
  TIFF(7L),
  XPS(8L),
  XAML(9L),
  SVG(10L),
  CSV(11L),
  TXT(12L),
  Spreadsheet2003(13L),
  XLSX(14L),
  PrimaveraP6XML(15L),
  PrimaveraXER(16L),
  MPX(17L),
  GdHtml(18L),
  ;
  private long numVal;

  SaveFileFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
