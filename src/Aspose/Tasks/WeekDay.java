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
import jio.System.Collections.Generic.*;

public class WeekDay {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDayType(DayType value) {
    try {
      javonetHandle.set("DayType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DayType getDayType() {
    try {
      Object res = javonetHandle.<NEnum>get("DayType");
      if (res == null) return null;
      return DayType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDayWorking(java.lang.Boolean value) {
    try {
      javonetHandle.set("DayWorking", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDayWorking() {
    try {
      java.lang.Boolean res = javonetHandle.get("DayWorking");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFromDate(DateTime value) {
    try {
      javonetHandle.set("FromDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getFromDate() {
    try {
      Object res = javonetHandle.<NObject>get("FromDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setToDate(DateTime value) {
    try {
      javonetHandle.set("ToDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getToDate() {
    try {
      Object res = javonetHandle.<NObject>get("ToDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WorkingTimeCollection getWorkingTimes() {
    try {
      Object res = javonetHandle.<NObject>get("WorkingTimes");
      if (res == null) return null;
      return new WorkingTimeCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public WeekDay(DayType dayType) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.WeekDay", NEnum.fromJavaEnum(dayType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WeekDay(DayType dayType, IList<WorkingTime> workingTimes) {
    try {
      javonetHandle =
          Javonet.New("Aspose.Tasks.WeekDay", NEnum.fromJavaEnum(dayType), workingTimes);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WeekDay() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.WeekDay");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WeekDay(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static WeekDay CreateDefaultWorkingDay(DayType dayType) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.WeekDay")
              .invoke("CreateDefaultWorkingDay", NEnum.fromJavaEnum(dayType));
      if (res == null) return null;
      return new WeekDay((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DayType CastToDayType(DayOfWeek dw) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.WeekDay").invoke("CastToDayType", NEnum.fromJavaEnum(dw));
      if (res == null) return null;
      return DayType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void SetDefaulWorkingTime(WeekDay day) {
    try {
      Javonet.getType("Aspose.Tasks.WeekDay").invoke("SetDefaulWorkingTime", day);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TimeSpan GetWorkingTime() {
    try {
      Object res = javonetHandle.invoke("GetWorkingTime");
      if (res == null) return null;
      return new TimeSpan((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public WeekDay Clone() {
    try {
      Object res = javonetHandle.invoke("Clone");
      if (res == null) return null;
      return new WeekDay((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Object obj) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
