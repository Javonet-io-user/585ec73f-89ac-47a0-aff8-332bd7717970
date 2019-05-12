package Aspose.Tasks.RiskAnalysis;

public enum ConfidenceLevel {
  CL75(75L),
  CL85(85L),
  CL90(90L),
  CL95(95L),
  CL99(99L),
  ;
  private long numVal;

  ConfidenceLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
