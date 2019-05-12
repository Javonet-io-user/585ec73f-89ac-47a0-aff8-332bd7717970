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

public class RecurringTaskInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRecurrencePattern(RecurrencePattern value) {
    try {
      javonetHandle.set("RecurrencePattern", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RecurrencePattern getRecurrencePattern() {
    try {
      Object res = javonetHandle.<NEnum>get("RecurrencePattern");
      if (res == null) return null;
      return RecurrencePattern.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  public void setDuration(Duration value) {
    try {
      javonetHandle.set("Duration", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Duration getDuration() {
    try {
      Object res = javonetHandle.<NObject>get("Duration");
      if (res == null) return null;
      return new Duration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOccurrences(java.lang.Integer value) {
    try {
      javonetHandle.set("Occurrences", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getOccurrences() {
    try {
      java.lang.Integer res = javonetHandle.get("Occurrences");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseEndDate(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseEndDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseEndDate() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseEndDate");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDailyRepetitions(java.lang.Integer value) {
    try {
      javonetHandle.set("DailyRepetitions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDailyRepetitions() {
    try {
      java.lang.Integer res = javonetHandle.get("DailyRepetitions");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDailyUseWorkdays(java.lang.Boolean value) {
    try {
      javonetHandle.set("DailyUseWorkdays", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDailyUseWorkdays() {
    try {
      java.lang.Boolean res = javonetHandle.get("DailyUseWorkdays");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWeeklyRepetitions(java.lang.Integer value) {
    try {
      javonetHandle.set("WeeklyRepetitions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getWeeklyRepetitions() {
    try {
      java.lang.Integer res = javonetHandle.get("WeeklyRepetitions");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWeeklyDays(WeekdayType value) {
    try {
      javonetHandle.set("WeeklyDays", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WeekdayType getWeeklyDays() {
    try {
      Object res = javonetHandle.<NEnum>get("WeeklyDays");
      if (res == null) return null;
      return WeekdayType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyUseOrdinalDay(java.lang.Boolean value) {
    try {
      javonetHandle.set("MonthlyUseOrdinalDay", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getMonthlyUseOrdinalDay() {
    try {
      java.lang.Boolean res = javonetHandle.get("MonthlyUseOrdinalDay");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyOrdinalNumber(OrdinalNumber value) {
    try {
      javonetHandle.set("MonthlyOrdinalNumber", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OrdinalNumber getMonthlyOrdinalNumber() {
    try {
      Object res = javonetHandle.<NEnum>get("MonthlyOrdinalNumber");
      if (res == null) return null;
      return OrdinalNumber.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyOrdinalDay(DayOfWeek value) {
    try {
      javonetHandle.set("MonthlyOrdinalDay", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DayOfWeek getMonthlyOrdinalDay() {
    try {
      Object res = javonetHandle.<NEnum>get("MonthlyOrdinalDay");
      if (res == null) return null;
      return DayOfWeek.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyOrdinalRepetitions(java.lang.Integer value) {
    try {
      javonetHandle.set("MonthlyOrdinalRepetitions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMonthlyOrdinalRepetitions() {
    try {
      java.lang.Integer res = javonetHandle.get("MonthlyOrdinalRepetitions");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyDay(java.lang.Integer value) {
    try {
      javonetHandle.set("MonthlyDay", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMonthlyDay() {
    try {
      java.lang.Integer res = javonetHandle.get("MonthlyDay");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMonthlyRepetitions(java.lang.Integer value) {
    try {
      javonetHandle.set("MonthlyRepetitions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMonthlyRepetitions() {
    try {
      java.lang.Integer res = javonetHandle.get("MonthlyRepetitions");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setYearlyUseOrdinalDay(java.lang.Boolean value) {
    try {
      javonetHandle.set("YearlyUseOrdinalDay", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getYearlyUseOrdinalDay() {
    try {
      java.lang.Boolean res = javonetHandle.get("YearlyUseOrdinalDay");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setYearlyDate(DateTime value) {
    try {
      javonetHandle.set("YearlyDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getYearlyDate() {
    try {
      Object res = javonetHandle.<NObject>get("YearlyDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setYearlyOrdinalNumber(OrdinalNumber value) {
    try {
      javonetHandle.set("YearlyOrdinalNumber", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OrdinalNumber getYearlyOrdinalNumber() {
    try {
      Object res = javonetHandle.<NEnum>get("YearlyOrdinalNumber");
      if (res == null) return null;
      return OrdinalNumber.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setYearlyOrdinalDay(DayOfWeek value) {
    try {
      javonetHandle.set("YearlyOrdinalDay", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DayOfWeek getYearlyOrdinalDay() {
    try {
      Object res = javonetHandle.<NEnum>get("YearlyOrdinalDay");
      if (res == null) return null;
      return DayOfWeek.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setYearlyOrdinalMonth(Month value) {
    try {
      javonetHandle.set("YearlyOrdinalMonth", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Month getYearlyOrdinalMonth() {
    try {
      Object res = javonetHandle.<NEnum>get("YearlyOrdinalMonth");
      if (res == null) return null;
      return Month.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Task getTask() {
    try {
      Object res = javonetHandle.<NObject>get("Task");
      if (res == null) return null;
      return new Task((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RecurringTaskInfo(NObject handle) {
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
