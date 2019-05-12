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
import Aspose.Tasks.Visualization.*;
import jio.System.Collections.Generic.*;
import jio.System.Drawing.*;
import jio.System.*;

public class GanttChartView extends View implements IComparableT<View> {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setBarSize(GanttBarSize value) {
    try {
      javonetHandle.set("BarSize", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public GanttBarSize getBarSize() {
    try {
      Object res = javonetHandle.<NEnum>get("BarSize");
      if (res == null) return null;
      return GanttBarSize.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGridlines(List<Gridlines> value) {
    try {
      javonetHandle.set("Gridlines", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<Gridlines> getGridlines() {
    try {
      Object res = javonetHandle.<NObject>get("Gridlines");
      if (res == null) return null;
      return new List<Gridlines>((NObject) res);
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
  public void setShowDrawings(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowDrawings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowDrawings() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowDrawings");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowBarSplits(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowBarSplits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowBarSplits() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowBarSplits");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBarRounding(java.lang.Boolean value) {
    try {
      javonetHandle.set("BarRounding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getBarRounding() {
    try {
      java.lang.Boolean res = javonetHandle.get("BarRounding");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBottomTimescaleTier(TimescaleTier value) {
    try {
      javonetHandle.set("BottomTimescaleTier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimescaleTier getBottomTimescaleTier() {
    try {
      Object res = javonetHandle.<NObject>get("BottomTimescaleTier");
      if (res == null) return null;
      return new TimescaleTier((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMiddleTimescaleTier(TimescaleTier value) {
    try {
      javonetHandle.set("MiddleTimescaleTier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimescaleTier getMiddleTimescaleTier() {
    try {
      Object res = javonetHandle.<NObject>get("MiddleTimescaleTier");
      if (res == null) return null;
      return new TimescaleTier((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTopTimescaleTier(TimescaleTier value) {
    try {
      javonetHandle.set("TopTimescaleTier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimescaleTier getTopTimescaleTier() {
    try {
      Object res = javonetHandle.<NObject>get("TopTimescaleTier");
      if (res == null) return null;
      return new TimescaleTier((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHideRollupBarsWhenSummaryExpanded(java.lang.Boolean value) {
    try {
      javonetHandle.set("HideRollupBarsWhenSummaryExpanded", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHideRollupBarsWhenSummaryExpanded() {
    try {
      java.lang.Boolean res = javonetHandle.get("HideRollupBarsWhenSummaryExpanded");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setProgressLines(ProgressLines value) {
    try {
      javonetHandle.set("ProgressLines", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProgressLines getProgressLines() {
    try {
      Object res = javonetHandle.<NObject>get("ProgressLines");
      if (res == null) return null;
      return new ProgressLines((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FilterCollection getAutoFilters() {
    try {
      Object res = javonetHandle.<NObject>get("AutoFilters");
      if (res == null) return null;
      return new FilterCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<TableTextStyle> getTableTextStyles() {
    try {
      Object res = javonetHandle.<NObject>get("TableTextStyles");
      if (res == null) return null;
      return new List<TableTextStyle>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<GanttBarStyle> getBarStyles() {
    try {
      Object res = javonetHandle.<NObject>get("BarStyles");
      if (res == null) return null;
      return new List<GanttBarStyle>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<GanttBarStyle> getCustomBarStyles() {
    try {
      Object res = javonetHandle.<NObject>get("CustomBarStyles");
      if (res == null) return null;
      return new List<GanttBarStyle>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public GanttChartView() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.GanttChartView");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GanttChartView(NObject handle) {
    super(handle);
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
