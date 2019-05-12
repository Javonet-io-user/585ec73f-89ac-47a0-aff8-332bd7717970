package Aspose.Tasks;

public enum ViewScreen {
  Gantt(1L),
  NetworkDiagram(2L),
  RelationshipDiagram(3L),
  TaskForm(4L),
  TaskSheet(5L),
  ResourceForm(6L),
  ResourceSheet(7L),
  ResourceGraph(8L),
  TaskDetailsForm(10L),
  TaskNameForm(11L),
  ResourceNameForm(12L),
  Calendar(13L),
  TaskUsage(14L),
  ResourceUsage(15L),
  ;
  private long numVal;

  ViewScreen(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
