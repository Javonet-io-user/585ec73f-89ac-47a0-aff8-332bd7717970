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

public class Prj {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getActualsInSync() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("ActualsInSync");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualsInSync(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("ActualsInSync", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getAdminProject() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("AdminProject");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAdminProject(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("AdminProject", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getAreEditableActualCosts() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("AreEditableActualCosts");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAreEditableActualCosts(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("AreEditableActualCosts", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getAuthor() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Author");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAuthor(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Author", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getAutoAddNewResourcesAndTasks() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("AutoAddNewResourcesAndTasks");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAutoAddNewResourcesAndTasks(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("AutoAddNewResourcesAndTasks", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getAutolink() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Autolink");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAutolink(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Autolink", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<BaselineType, PrjKey> getBaselineForEarnedValue() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("BaselineForEarnedValue");
      if (res == null) return null;
      return new Key<BaselineType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBaselineForEarnedValue(Key<BaselineType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("BaselineForEarnedValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Calendar, PrjKey> getCalendar() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Calendar");
      if (res == null) return null;
      return new Key<Calendar, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCalendar(Key<Calendar, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Calendar", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getCategory() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Category");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCategory(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Category", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getComments() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Comments");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setComments(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Comments", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getCompany() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Company");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCompany(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Company", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getCreationDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("CreationDate");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreationDate(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("CreationDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, PrjKey> getCriticalSlackLimit() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("CriticalSlackLimit");
      if (res == null) return null;
      return new Key<java.lang.Integer, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCriticalSlackLimit(Key<java.lang.Integer, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("CriticalSlackLimit", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getCurrencyCode() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("CurrencyCode");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrencyCode(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("CurrencyCode", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, PrjKey> getCurrencyDigits() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("CurrencyDigits");
      if (res == null) return null;
      return new Key<java.lang.Integer, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrencyDigits(Key<java.lang.Integer, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("CurrencyDigits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getCurrencySymbol() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("CurrencySymbol");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrencySymbol(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("CurrencySymbol", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<CurrencySymbolPositionType, PrjKey> getCurrencySymbolPosition() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("CurrencySymbolPosition");
      if (res == null) return null;
      return new Key<CurrencySymbolPositionType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrencySymbolPosition(Key<CurrencySymbolPositionType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("CurrencySymbolPosition", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getCurrentDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("CurrentDate");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrentDate(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("CurrentDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateFormat, PrjKey> getDateFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DateFormat");
      if (res == null) return null;
      return new Key<DateFormat, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDateFormat(Key<DateFormat, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DateFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, PrjKey> getDaysPerMonth() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DaysPerMonth");
      if (res == null) return null;
      return new Key<java.lang.Integer, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDaysPerMonth(Key<java.lang.Integer, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DaysPerMonth", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getDefaultFinishTime() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DefaultFinishTime");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultFinishTime(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DefaultFinishTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<CostAccrualType, PrjKey> getDefaultFixedCostAccrual() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DefaultFixedCostAccrual");
      if (res == null) return null;
      return new Key<CostAccrualType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultFixedCostAccrual(Key<CostAccrualType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DefaultFixedCostAccrual", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, PrjKey> getDefaultOvertimeRate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DefaultOvertimeRate");
      if (res == null) return null;
      return new Key<java.lang.Double, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultOvertimeRate(Key<java.lang.Double, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DefaultOvertimeRate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, PrjKey> getDefaultStandardRate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DefaultStandardRate");
      if (res == null) return null;
      return new Key<java.lang.Double, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultStandardRate(Key<java.lang.Double, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DefaultStandardRate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getDefaultStartTime() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DefaultStartTime");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultStartTime(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DefaultStartTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<EarnedValueMethodType, PrjKey> getDefaultTaskEVMethod() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DefaultTaskEVMethod");
      if (res == null) return null;
      return new Key<EarnedValueMethodType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultTaskEVMethod(Key<EarnedValueMethodType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DefaultTaskEVMethod", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TaskType, PrjKey> getDefaultTaskType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DefaultTaskType");
      if (res == null) return null;
      return new Key<TaskType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDefaultTaskType(Key<TaskType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DefaultTaskType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TimeUnitType, PrjKey> getDurationFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("DurationFormat");
      if (res == null) return null;
      return new Key<TimeUnitType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDurationFormat(Key<TimeUnitType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("DurationFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<EarnedValueMethodType, PrjKey> getEarnedValueMethod() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("EarnedValueMethod");
      if (res == null) return null;
      return new Key<EarnedValueMethodType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEarnedValueMethod(Key<EarnedValueMethodType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("EarnedValueMethod", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getExtendedCreationDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("ExtendedCreationDate");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setExtendedCreationDate(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("ExtendedCreationDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getFinishDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("FinishDate");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinishDate(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("FinishDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getFiscalYearStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("FiscalYearStart");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFiscalYearStart(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("FiscalYearStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Month, PrjKey> getFyStartDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("FyStartDate");
      if (res == null) return null;
      return new Key<Month, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFyStartDate(Key<Month, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("FyStartDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getHonorConstraints() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("HonorConstraints");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHonorConstraints(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("HonorConstraints", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getHyperlinkBase() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("HyperlinkBase");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlinkBase(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("HyperlinkBase", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getInsertedProjectsLikeSummary() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("InsertedProjectsLikeSummary");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setInsertedProjectsLikeSummary(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("InsertedProjectsLikeSummary", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getKeepTaskOnNearestWorkingTimeWhenMadeAutoScheduled() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Prj")
              .<NObject>get("KeepTaskOnNearestWorkingTimeWhenMadeAutoScheduled");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setKeepTaskOnNearestWorkingTimeWhenMadeAutoScheduled(
      Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj")
          .set("KeepTaskOnNearestWorkingTimeWhenMadeAutoScheduled", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getKeywords() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Keywords");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setKeywords(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Keywords", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getLastAuthor() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("LastAuthor");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLastAuthor(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("LastAuthor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getLastPrinted() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("LastPrinted");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLastPrinted(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("LastPrinted", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getLastSaved() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("LastSaved");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLastSaved(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("LastSaved", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getManager() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Manager");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setManager(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Manager", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getMicrosoftProjectServerURL() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MicrosoftProjectServerURL");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMicrosoftProjectServerURL(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MicrosoftProjectServerURL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, PrjKey> getMinutesPerDay() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MinutesPerDay");
      if (res == null) return null;
      return new Key<java.lang.Integer, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinutesPerDay(Key<java.lang.Integer, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MinutesPerDay", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, PrjKey> getMinutesPerWeek() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MinutesPerWeek");
      if (res == null) return null;
      return new Key<java.lang.Integer, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinutesPerWeek(Key<java.lang.Integer, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MinutesPerWeek", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getMoveCompletedEndsBack() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MoveCompletedEndsBack");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMoveCompletedEndsBack(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MoveCompletedEndsBack", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getMoveCompletedEndsForward() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MoveCompletedEndsForward");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMoveCompletedEndsForward(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MoveCompletedEndsForward", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getMoveRemainingStartsBack() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MoveRemainingStartsBack");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMoveRemainingStartsBack(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MoveRemainingStartsBack", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getMoveRemainingStartsForward() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MoveRemainingStartsForward");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMoveRemainingStartsForward(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MoveRemainingStartsForward", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getMultipleCriticalPaths() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("MultipleCriticalPaths");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMultipleCriticalPaths(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("MultipleCriticalPaths", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getName() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Name");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setName(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Name", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getNewTasksAreManual() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("NewTasksAreManual");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNewTasksAreManual(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("NewTasksAreManual", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getNewTasksEffortDriven() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("NewTasksEffortDriven");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNewTasksEffortDriven(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("NewTasksEffortDriven", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getNewTasksEstimated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("NewTasksEstimated");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNewTasksEstimated(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("NewTasksEstimated", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TaskStartDateType, PrjKey> getNewTaskStartDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("NewTaskStartDate");
      if (res == null) return null;
      return new Key<TaskStartDateType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNewTaskStartDate(Key<TaskStartDateType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("NewTaskStartDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getProjectExternallyEdited() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("ProjectExternallyEdited");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setProjectExternallyEdited(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("ProjectExternallyEdited", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getRemoveFileProperties() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("RemoveFileProperties");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemoveFileProperties(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("RemoveFileProperties", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, PrjKey> getRevision() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Revision");
      if (res == null) return null;
      return new Key<java.lang.Integer, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRevision(Key<java.lang.Integer, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Revision", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, PrjKey> getSaveVersion() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("SaveVersion");
      if (res == null) return null;
      return new Key<java.lang.Integer, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSaveVersion(Key<java.lang.Integer, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("SaveVersion", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getScheduleFromStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("ScheduleFromStart");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setScheduleFromStart(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("ScheduleFromStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, PrjKey> getShowProjectSummaryTask() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("ShowProjectSummaryTask");
      if (res == null) return null;
      return new Key<java.lang.Boolean, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setShowProjectSummaryTask(Key<java.lang.Boolean, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("ShowProjectSummaryTask", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getSplitsInProgressTasks() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("SplitsInProgressTasks");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSplitsInProgressTasks(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("SplitsInProgressTasks", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getSpreadActualCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("SpreadActualCost");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSpreadActualCost(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("SpreadActualCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getSpreadPercentComplete() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("SpreadPercentComplete");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSpreadPercentComplete(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("SpreadPercentComplete", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getStartDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("StartDate");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStartDate(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("StartDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getStatusDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("StatusDate");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStatusDate(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("StatusDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getSubject() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Subject");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSubject(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Subject", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getTaskUpdatesResource() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("TaskUpdatesResource");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTaskUpdatesResource(Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("TaskUpdatesResource", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getTemplate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Template");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTemplate(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Template", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getTimescaleFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("TimescaleFinish");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTimescaleFinish(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("TimescaleFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, PrjKey> getTimescaleStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("TimescaleStart");
      if (res == null) return null;
      return new Key<DateTime, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTimescaleStart(Key<DateTime, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("TimescaleStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getTitle() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Title");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTitle(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Title", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, PrjKey> getUid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("Uid");
      if (res == null) return null;
      return new Key<java.lang.String, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUid(Key<java.lang.String, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("Uid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, PrjKey> getUpdateManuallyScheduledTasksWhenEditingLinks() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Prj")
              .<NObject>get("UpdateManuallyScheduledTasksWhenEditingLinks");
      if (res == null) return null;
      return new Key<NullableBool, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUpdateManuallyScheduledTasksWhenEditingLinks(
      Key<NullableBool, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj")
          .set("UpdateManuallyScheduledTasksWhenEditingLinks", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DayType, PrjKey> getWeekStartDay() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("WeekStartDay");
      if (res == null) return null;
      return new Key<DayType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWeekStartDay(Key<DayType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("WeekStartDay", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TimeUnitType, PrjKey> getWorkFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Prj").<NObject>get("WorkFormat");
      if (res == null) return null;
      return new Key<TimeUnitType, PrjKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWorkFormat(Key<TimeUnitType, PrjKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Prj").set("WorkFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
