package Aspose.Tasks;

public enum RecurrencePattern {
  Daily(1L),
  Weekly(4L),
  Monthly(8L),
  Yearly(16L),
  ;
  private long numVal;

  RecurrencePattern(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
