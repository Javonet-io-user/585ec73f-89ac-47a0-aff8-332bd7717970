package Aspose.Tasks;

public enum WorkContourType {
  Flat(0L),
  BackLoaded(1L),
  FrontLoaded(2L),
  DoublePeak(3L),
  EarlyPeak(4L),
  LatePeak(5L),
  Bell(6L),
  Turtle(7L),
  Contoured(8L),
  Undefined(-1L),
  ;
  private long numVal;

  WorkContourType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
