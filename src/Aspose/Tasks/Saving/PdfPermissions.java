package Aspose.Tasks.Saving;

public enum PdfPermissions {
  DisallowAll(0L),
  Printing(4L),
  ModifyContents(8L),
  ContentCopy(16L),
  ModifyAnnotations(32L),
  FillIn(256L),
  ContentCopyForAccessibility(512L),
  DocumentAssembly(1024L),
  HighResolutionPrinting(2052L),
  AllowAll(65535L),
  ;
  private long numVal;

  PdfPermissions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
