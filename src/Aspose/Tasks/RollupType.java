package Aspose.Tasks;

public enum RollupType {
  Null(0L),
  Maximum(1L),
  Minimum(2L),
  Count(3L),
  Sum(4L),
  Average(5L),
  AverageFirstSublevel(6L),
  CountFirstSublevel(7L),
  CountNonsummaries(8L),
  ;
  private long numVal;

  RollupType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
