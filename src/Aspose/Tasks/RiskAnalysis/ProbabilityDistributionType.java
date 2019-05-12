package Aspose.Tasks.RiskAnalysis;

public enum ProbabilityDistributionType {
  Uniform(0L),
  Normal(1L),
  ;
  private long numVal;

  ProbabilityDistributionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
