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
import jio.System.Collections.Generic.*;

public class RecurringInterval {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setInterval(Interval value) {
    try {
      javonetHandle.set("Interval", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Interval getInterval() {
    try {
      Object res = javonetHandle.<NEnum>get("Interval");
      if (res == null) return null;
      return Interval.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDailyDayNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("DailyDayNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDailyDayNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("DailyDayNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDailyWorkday(java.lang.Boolean value) {
    try {
      javonetHandle.set("DailyWorkday", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDailyWorkday() {
    try {
      java.lang.Boolean res = javonetHandle.get("DailyWorkday");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<RecurringInterval.DayType> getWeeklyDays() {
    try {
      Object res = javonetHandle.<NObject>get("WeeklyDays");
      if (res == null) return null;
      return new List<RecurringInterval.DayType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWeeklyWeekNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("WeeklyWeekNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getWeeklyWeekNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("WeeklyWeekNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyDay(java.lang.Boolean value) {
    try {
      javonetHandle.set("MonthlyDay", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getMonthlyDay() {
    try {
      java.lang.Boolean res = javonetHandle.get("MonthlyDay");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyDayDayNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("MonthlyDayDayNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMonthlyDayDayNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("MonthlyDayDayNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyDayMonthNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("MonthlyDayMonthNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMonthlyDayMonthNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("MonthlyDayMonthNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyFirstLast(java.lang.Boolean value) {
    try {
      javonetHandle.set("MonthlyFirstLast", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getMonthlyFirstLast() {
    try {
      java.lang.Boolean res = javonetHandle.get("MonthlyFirstLast");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyFirstLastMonthNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("MonthlyFirstLastMonthNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMonthlyFirstLastMonthNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("MonthlyFirstLastMonthNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyFirstLastDay(RecurringInterval.DayType value) {
    try {
      javonetHandle.set("MonthlyFirstLastDay", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RecurringInterval.DayType getMonthlyFirstLastDay() {
    try {
      Object res = javonetHandle.<NEnum>get("MonthlyFirstLastDay");
      if (res == null) return null;
      return RecurringInterval.DayType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RecurringInterval() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Visualization.RecurringInterval");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecurringInterval(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  public enum DayType {
    Sunday(1L),
    Monday(2L),
    Tuesday(3L),
    Wednesday(4L),
    Thursday(5L),
    Friday(6L),
    Saturday(7L),
    Day(8L),
    Workday(9L),
    NonworkingDay(10L),
    ;
    private long numVal;

    DayType(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
