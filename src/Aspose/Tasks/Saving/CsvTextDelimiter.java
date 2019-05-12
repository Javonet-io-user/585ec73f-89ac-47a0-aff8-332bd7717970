package Aspose.Tasks.Saving;

public enum CsvTextDelimiter {
  Comma(0L),
  Semicolon(1L),
  Space(2L),
  Tab(3L),
  ;
  private long numVal;

  CsvTextDelimiter(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
