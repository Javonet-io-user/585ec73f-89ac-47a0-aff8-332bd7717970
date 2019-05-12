package Aspose.Tasks.Visualization;

public enum GridlineType {
  GanttRow(0L),
  TopTierColumn(1L),
  BottomTierColumn(2L),
  SheetRow(3L),
  SheetColumn(4L),
  UsageRow(5L),
  UsageColumn(6L),
  GanttTitleVertical(7L),
  GanttTitleHorizontal(8L),
  BarRows(9L),
  GanttProjectStart(10L),
  GanttProjectFinish(11L),
  GanttStatusDate(12L),
  GanttCurrentDate(13L),
  GanttPageBreaks(14L),
  ;
  private long numVal;

  GridlineType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
