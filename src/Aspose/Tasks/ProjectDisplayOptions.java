package Aspose.Tasks;

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
import Aspose.Tasks.*;

public class ProjectDisplayOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setAddSpaceBeforeLabel(java.lang.Boolean value) {
    try {
      javonetHandle.set("AddSpaceBeforeLabel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAddSpaceBeforeLabel() {
    try {
      java.lang.Boolean res = javonetHandle.get("AddSpaceBeforeLabel");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnderlineHyperlinks(java.lang.Boolean value) {
    try {
      javonetHandle.set("UnderlineHyperlinks", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUnderlineHyperlinks() {
    try {
      java.lang.Boolean res = javonetHandle.get("UnderlineHyperlinks");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowTaskScheduleWarnings(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowTaskScheduleWarnings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowTaskScheduleWarnings() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowTaskScheduleWarnings");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowTaskScheduleSuggestions(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowTaskScheduleSuggestions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowTaskScheduleSuggestions() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowTaskScheduleSuggestions");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  public void setMinuteLabel(MinuteLabelDisplay value) {
    try {
      javonetHandle.set("MinuteLabel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MinuteLabelDisplay getMinuteLabel() {
    try {
      Object res = javonetHandle.<NEnum>get("MinuteLabel");
      if (res == null) return null;
      return MinuteLabelDisplay.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHourLabel(HourLabelDisplay value) {
    try {
      javonetHandle.set("HourLabel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public HourLabelDisplay getHourLabel() {
    try {
      Object res = javonetHandle.<NEnum>get("HourLabel");
      if (res == null) return null;
      return HourLabelDisplay.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDayLabel(DayLabelDisplay value) {
    try {
      javonetHandle.set("DayLabel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DayLabelDisplay getDayLabel() {
    try {
      Object res = javonetHandle.<NEnum>get("DayLabel");
      if (res == null) return null;
      return DayLabelDisplay.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWeekLabel(WeekLabelDisplay value) {
    try {
      javonetHandle.set("WeekLabel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WeekLabelDisplay getWeekLabel() {
    try {
      Object res = javonetHandle.<NEnum>get("WeekLabel");
      if (res == null) return null;
      return WeekLabelDisplay.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthLabel(MonthLabelDisplay value) {
    try {
      javonetHandle.set("MonthLabel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MonthLabelDisplay getMonthLabel() {
    try {
      Object res = javonetHandle.<NEnum>get("MonthLabel");
      if (res == null) return null;
      return MonthLabelDisplay.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setYearLabel(YearLabelDisplay value) {
    try {
      javonetHandle.set("YearLabel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public YearLabelDisplay getYearLabel() {
    try {
      Object res = javonetHandle.<NEnum>get("YearLabel");
      if (res == null) return null;
      return YearLabelDisplay.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ProjectDisplayOptions() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.ProjectDisplayOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ProjectDisplayOptions(NObject handle) {
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
