package Aspose.Tasks.Saving;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Aspose.Tasks.Saving.*;
import Aspose.Tasks.Visualization.*;
import jio.System.Collections.Generic.*;
import jio.System.*;
import jio.System.Drawing.*;
import Aspose.Tasks.*;

public abstract class SaveOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setBarStyles(List<BarStyle> value) {
    try {
      javonetHandle.set("BarStyles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<BarStyle> getBarStyles() {
    try {
      Object res = javonetHandle.<NObject>get("BarStyles");
      if (res == null) return null;
      return new List<BarStyle>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDrawNonWorkingTime(java.lang.Boolean value) {
    try {
      javonetHandle.set("DrawNonWorkingTime", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDrawNonWorkingTime() {
    try {
      java.lang.Boolean res = javonetHandle.get("DrawNonWorkingTime");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEndDate(DateTime value) {
    try {
      javonetHandle.set("EndDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getEndDate() {
    try {
      Object res = javonetHandle.<NObject>get("EndDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFitContent(java.lang.Boolean value) {
    try {
      javonetHandle.set("FitContent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getFitContent() {
    try {
      java.lang.Boolean res = javonetHandle.get("FitContent");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGridlines(List<Gridline> value) {
    try {
      javonetHandle.set("Gridlines", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<Gridline> getGridlines() {
    try {
      Object res = javonetHandle.<NObject>get("Gridlines");
      if (res == null) return null;
      return new List<Gridline>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLegendOnEachPage(java.lang.Boolean value) {
    try {
      javonetHandle.set("LegendOnEachPage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLegendOnEachPage() {
    try {
      java.lang.Boolean res = javonetHandle.get("LegendOnEachPage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMarkCriticalTasks(java.lang.Boolean value) {
    try {
      javonetHandle.set("MarkCriticalTasks", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getMarkCriticalTasks() {
    try {
      java.lang.Boolean res = javonetHandle.get("MarkCriticalTasks");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNonWorkingTimeColor(Color value) {
    try {
      javonetHandle.set("NonWorkingTimeColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getNonWorkingTimeColor() {
    try {
      Object res = javonetHandle.<NObject>get("NonWorkingTimeColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPageCount() {
    try {
      java.lang.Integer res = javonetHandle.get("PageCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPageSize(PageSize value) {
    try {
      javonetHandle.set("PageSize", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PageSize getPageSize() {
    try {
      Object res = javonetHandle.<NEnum>get("PageSize");
      if (res == null) return null;
      return PageSize.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPresentationFormat(PresentationFormat value) {
    try {
      javonetHandle.set("PresentationFormat", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PresentationFormat getPresentationFormat() {
    try {
      Object res = javonetHandle.<NEnum>get("PresentationFormat");
      if (res == null) return null;
      return PresentationFormat.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRollUpGanttBars(java.lang.Boolean value) {
    try {
      javonetHandle.set("RollUpGanttBars", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getRollUpGanttBars() {
    try {
      java.lang.Boolean res = javonetHandle.get("RollUpGanttBars");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SaveFileFormat getSaveFormat() {
    try {
      Object res = javonetHandle.<NEnum>get("SaveFormat");
      if (res == null) return null;
      return SaveFileFormat.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowProjectSummaryTask(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowProjectSummaryTask", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowProjectSummaryTask() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowProjectSummaryTask");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStartDate(DateTime value) {
    try {
      javonetHandle.set("StartDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getStartDate() {
    try {
      Object res = javonetHandle.<NObject>get("StartDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTasksComparer(IComparer<Task> value) {
    try {
      javonetHandle.set("TasksComparer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IComparer<Task> getTasksComparer() {
    try {
      Object res = javonetHandle.<NObject>get("TasksComparer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextStyles(List<TextStyle> value) {
    try {
      javonetHandle.set("TextStyles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<TextStyle> getTextStyles() {
    try {
      Object res = javonetHandle.<NObject>get("TextStyles");
      if (res == null) return null;
      return new List<TextStyle>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTimescale(Timescale value) {
    try {
      javonetHandle.set("Timescale", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Timescale getTimescale() {
    try {
      Object res = javonetHandle.<NEnum>get("Timescale");
      if (res == null) return null;
      return Timescale.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTimescaleTier(TimescaleTier value) {
    try {
      javonetHandle.set("TimescaleTier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimescaleTier getTimescaleTier() {
    try {
      Object res = javonetHandle.<NObject>get("TimescaleTier");
      if (res == null) return null;
      return new TimescaleTier((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseGradientBrush(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseGradientBrush", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseGradientBrush() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseGradientBrush");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setView(ProjectView value) {
    try {
      javonetHandle.set("View", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProjectView getView() {
    try {
      Object res = javonetHandle.<NObject>get("View");
      if (res == null) return null;
      return new ProjectView((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SaveOptions(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
