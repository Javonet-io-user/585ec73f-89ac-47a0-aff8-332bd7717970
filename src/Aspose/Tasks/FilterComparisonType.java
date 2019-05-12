package Aspose.Tasks;

public enum FilterComparisonType {
  Undefined(0L),
  IsWithin(1L),
  IsGreaterThan(2L),
  IsLessThan(3L),
  IsGreaterThanOrEqualTo(4L),
  IsLessThanOrEqualTo(5L),
  Equals(6L),
  DoesNotEqual(7L),
  Contains(8L),
  IsNotWithin(9L),
  DoesNotContain(10L),
  ContainsExactly(11L),
  ;
  private long numVal;

  FilterComparisonType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
