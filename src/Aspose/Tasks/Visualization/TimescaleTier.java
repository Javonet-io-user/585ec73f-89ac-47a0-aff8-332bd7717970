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
import jio.System.Drawing.*;

public class TimescaleTier {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDateTimeConverter(DateTimeConverter value) {
    try {
      javonetHandle.set("DateTimeConverter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTimeConverter getDateTimeConverter() {
    try {
      Object res = javonetHandle.<NObject>get("DateTimeConverter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCount(java.lang.Integer value) {
    try {
      javonetHandle.set("Count", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.get("Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLabel(DateLabel value) {
    try {
      javonetHandle.set("Label", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateLabel getLabel() {
    try {
      Object res = javonetHandle.<NEnum>get("Label");
      if (res == null) return null;
      return DateLabel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAlignment(StringAlignment value) {
    try {
      javonetHandle.set("Alignment", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StringAlignment getAlignment() {
    try {
      Object res = javonetHandle.<NEnum>get("Alignment");
      if (res == null) return null;
      return StringAlignment.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUsesFiscalYear(java.lang.Boolean value) {
    try {
      javonetHandle.set("UsesFiscalYear", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUsesFiscalYear() {
    try {
      java.lang.Boolean res = javonetHandle.get("UsesFiscalYear");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShowTicks(java.lang.Boolean value) {
    try {
      javonetHandle.set("ShowTicks", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getShowTicks() {
    try {
      java.lang.Boolean res = javonetHandle.get("ShowTicks");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnit(TimescaleUnit value) {
    try {
      javonetHandle.set("Unit", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimescaleUnit getUnit() {
    try {
      Object res = javonetHandle.<NEnum>get("Unit");
      if (res == null) return null;
      return TimescaleUnit.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TimescaleTier() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Visualization.TimescaleTier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimescaleTier(TimescaleUnit unit, java.lang.Integer count) {
    try {
      javonetHandle =
          Javonet.New("Aspose.Tasks.Visualization.TimescaleTier", NEnum.fromJavaEnum(unit), count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimescaleTier(NObject handle) {
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
