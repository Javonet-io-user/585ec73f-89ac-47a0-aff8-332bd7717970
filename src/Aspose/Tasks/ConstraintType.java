package Aspose.Tasks;

public enum ConstraintType {
  AsSoonAsPossible(0L),
  AsLateAsPossible(1L),
  MustStartOn(2L),
  MustFinishOn(3L),
  StartNoEarlierThan(4L),
  StartNoLaterThan(5L),
  FinishNoEarlierThan(6L),
  FinishNoLaterThan(7L),
  Undefined(-1L),
  ;
  private long numVal;

  ConstraintType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
