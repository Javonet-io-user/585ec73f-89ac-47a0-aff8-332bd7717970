package Aspose.Tasks;

public enum WBSSequence {
  OrderedNumbers(0L),
  OrderedUppercaseLetters(1L),
  OrderedLowercaseLetters(2L),
  UnorderedCharacters(3L),
  ;
  private long numVal;

  WBSSequence(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
