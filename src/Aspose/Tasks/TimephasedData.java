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
import jio.System.*;

public class TimephasedData {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUid(java.lang.Integer value) {
    try {
      javonetHandle.set("Uid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getUid() {
    try {
      java.lang.Integer res = javonetHandle.get("Uid");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStart(DateTime value) {
    try {
      javonetHandle.set("Start", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getStart() {
    try {
      Object res = javonetHandle.<NObject>get("Start");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFinish(DateTime value) {
    try {
      javonetHandle.set("Finish", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getFinish() {
    try {
      Object res = javonetHandle.<NObject>get("Finish");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnit(TimeUnitType value) {
    try {
      javonetHandle.set("Unit", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimeUnitType getUnit() {
    try {
      Object res = javonetHandle.<NEnum>get("Unit");
      if (res == null) return null;
      return TimeUnitType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTimephasedDataType(TimephasedDataType value) {
    try {
      javonetHandle.set("TimephasedDataType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimephasedDataType getTimephasedDataType() {
    try {
      Object res = javonetHandle.<NEnum>get("TimephasedDataType");
      if (res == null) return null;
      return TimephasedDataType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValue(java.lang.String value) {
    try {
      javonetHandle.set("Value", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getValue() {
    try {
      java.lang.String res = javonetHandle.get("Value");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimeSpan getValueToDuration() {
    try {
      Object res = javonetHandle.<NObject>get("ValueToDuration");
      if (res == null) return null;
      return new TimeSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getValueToCost() {
    try {
      java.lang.Double res = javonetHandle.get("ValueToCost");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }

  public TimephasedData() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.TimephasedData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimephasedData(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static TimephasedData CreateWorkTimephased(
      java.lang.Integer uid,
      DateTime start,
      DateTime finish,
      TimeSpan value,
      TimeUnitType timeUnit,
      TimephasedDataType type) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.TimephasedData")
              .invoke(
                  "CreateWorkTimephased",
                  uid,
                  start,
                  finish,
                  value,
                  NEnum.fromJavaEnum(timeUnit),
                  NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return new TimephasedData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static TimephasedData CreateCostTimephased(
      java.lang.Integer uid,
      DateTime start,
      DateTime finish,
      java.lang.Double value,
      TimeUnitType timeUnit,
      TimephasedDataType type) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.TimephasedData")
              .invoke(
                  "CreateCostTimephased",
                  uid,
                  start,
                  finish,
                  value,
                  NEnum.fromJavaEnum(timeUnit),
                  NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return new TimephasedData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
