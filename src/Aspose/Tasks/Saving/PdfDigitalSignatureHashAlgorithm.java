package Aspose.Tasks.Saving;

public enum PdfDigitalSignatureHashAlgorithm {
  Sha1(0L),
  Sha256(1L),
  Sha384(2L),
  Sha512(3L),
  Md5(4L),
  ;
  private long numVal;

  PdfDigitalSignatureHashAlgorithm(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
