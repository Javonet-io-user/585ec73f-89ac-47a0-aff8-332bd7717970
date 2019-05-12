package Aspose.Tasks.Visualization;

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
import Aspose.Tasks.Visualization.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Drawing.*;

public class ProgressLines {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDisplayAtCurrentDate(java.lang.Boolean value) {
    try {
      javonetHandle.set("DisplayAtCurrentDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDisplayAtCurrentDate() {
    try {
      java.lang.Boolean res = javonetHandle.get("DisplayAtCurrentDate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDisplayAtRecurringIntervals(java.lang.Boolean value) {
    try {
      javonetHandle.set("DisplayAtRecurringIntervals", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDisplayAtRecurringIntervals() {
    try {
      java.lang.Boolean res = javonetHandle.get("DisplayAtRecurringIntervals");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRecurringInterval(RecurringInterval value) {
    try {
      javonetHandle.set("RecurringInterval", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RecurringInterval getRecurringInterval() {
    try {
      Object res = javonetHandle.<NObject>get("RecurringInterval");
      if (res == null) return null;
      return new RecurringInterval((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBeginAtProjectStart(java.lang.Boolean value) {
    try {
      javonetHandle.set("BeginAtProjectStart", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getBeginAtProjectStart() {
    try {
      java.lang.Boolean res = javonetHandle.get("BeginAtProjectStart");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBeginAtDate(DateTime value) {
    try {
      javonetHandle.set("BeginAtDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getBeginAtDate() {
    try {
      Object res = javonetHandle.<NObject>get("BeginAtDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDisplaySelected(java.lang.Boolean value) {
    try {
      javonetHandle.set("DisplaySelected", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDisplaySelected() {
    try {
      java.lang.Boolean res = javonetHandle.get("DisplaySelected");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<DateTime> getSelectedDates() {
    try {
      Object res = javonetHandle.<NObject>get("SelectedDates");
      if (res == null) return null;
      return new List<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsBaselinePlan(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsBaselinePlan", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsBaselinePlan() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsBaselinePlan");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowDate(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowDate() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowDate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormat(DateLabel value) {
    try {
      javonetHandle.set("DateFormat", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateLabel getDateFormat() {
    try {
      Object res = javonetHandle.<NEnum>get("DateFormat");
      if (res == null) return null;
      return DateLabel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFont(Font value) {
    try {
      javonetHandle.set("Font", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Font getFont() {
    try {
      Object res = javonetHandle.<NObject>get("Font");
      if (res == null) return null;
      return new Font((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLinePattern(LinePattern value) {
    try {
      javonetHandle.set("LinePattern", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinePattern getLinePattern() {
    try {
      Object res = javonetHandle.<NEnum>get("LinePattern");
      if (res == null) return null;
      return LinePattern.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLineColor(Color value) {
    try {
      javonetHandle.set("LineColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getLineColor() {
    try {
      Object res = javonetHandle.<NObject>get("LineColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProgressPointShape(GanttBarEndShape value) {
    try {
      javonetHandle.set("ProgressPointShape", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public GanttBarEndShape getProgressPointShape() {
    try {
      Object res = javonetHandle.<NEnum>get("ProgressPointShape");
      if (res == null) return null;
      return GanttBarEndShape.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProgressPointColor(Color value) {
    try {
      javonetHandle.set("ProgressPointColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getProgressPointColor() {
    try {
      Object res = javonetHandle.<NObject>get("ProgressPointColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOtherLinePattern(LinePattern value) {
    try {
      javonetHandle.set("OtherLinePattern", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinePattern getOtherLinePattern() {
    try {
      Object res = javonetHandle.<NEnum>get("OtherLinePattern");
      if (res == null) return null;
      return LinePattern.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOtherLineColor(Color value) {
    try {
      javonetHandle.set("OtherLineColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getOtherLineColor() {
    try {
      Object res = javonetHandle.<NObject>get("OtherLineColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOtherProgressPointShape(GanttBarEndShape value) {
    try {
      javonetHandle.set("OtherProgressPointShape", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public GanttBarEndShape getOtherProgressPointShape() {
    try {
      Object res = javonetHandle.<NEnum>get("OtherProgressPointShape");
      if (res == null) return null;
      return GanttBarEndShape.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOtherProgressPointColor(Color value) {
    try {
      javonetHandle.set("OtherProgressPointColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Color getOtherProgressPointColor() {
    try {
      Object res = javonetHandle.<NObject>get("OtherProgressPointColor");
      if (res == null) return null;
      return new Color((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ProgressLines() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Visualization.ProgressLines");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ProgressLines(NObject handle) {
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
