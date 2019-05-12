package Aspose.Tasks.Saving;

public enum PdfEncryptionAlgorithm {
  RC4_40(0L),
  RC4_128(1L),
  ;
  private long numVal;

  PdfEncryptionAlgorithm(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
