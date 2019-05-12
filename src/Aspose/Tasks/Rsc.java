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

public class Rsc {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static Key<CostAccrualType, RscKey> getAccrueAt() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("AccrueAt");
      if (res == null) return null;
      return new Key<CostAccrualType, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAccrueAt(Key<CostAccrualType, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("AccrueAt", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getActiveDirectoryGuid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ActiveDirectoryGuid");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActiveDirectoryGuid(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ActiveDirectoryGuid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getActualCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ActualCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualCost(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ActualCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getActualOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ActualOvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeCost(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ActualOvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getActualOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ActualOvertimeWork");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ActualOvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getActualOvertimeWorkProtected() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ActualOvertimeWorkProtected");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeWorkProtected(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ActualOvertimeWorkProtected", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getActualWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ActualWork");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ActualWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getActualWorkProtected() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ActualWorkProtected");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualWorkProtected(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ActualWorkProtected", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getACWP() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("ACWP");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setACWP(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("ACWP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getAssignmentOwner() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("AssignmentOwner");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAssignmentOwner(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("AssignmentOwner", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getAssignmentOwnerGuid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("AssignmentOwnerGuid");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAssignmentOwnerGuid(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("AssignmentOwnerGuid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, RscKey> getAvailableFrom() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("AvailableFrom");
      if (res == null) return null;
      return new Key<DateTime, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAvailableFrom(Key<DateTime, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("AvailableFrom", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, RscKey> getAvailableTo() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("AvailableTo");
      if (res == null) return null;
      return new Key<DateTime, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAvailableTo(Key<DateTime, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("AvailableTo", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getBCWP() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("BCWP");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBCWP(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("BCWP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getBCWS() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("BCWS");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBCWS(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("BCWS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<BookingType, RscKey> getBookingType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("BookingType");
      if (res == null) return null;
      return new Key<BookingType, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBookingType(Key<BookingType, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("BookingType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getBudgetCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("BudgetCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBudgetCost(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("BudgetCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getBudgetWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("BudgetWork");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBudgetWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("BudgetWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Calendar, RscKey> getCalendar() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Calendar");
      if (res == null) return null;
      return new Key<Calendar, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCalendar(Key<Calendar, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Calendar", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getCanLevel() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("CanLevel");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCanLevel(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("CanLevel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getCode() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Code");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCode(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Code", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Cost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCost(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Cost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getCostCenter() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("CostCenter");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCostCenter(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("CostCenter", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getCostPerUse() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("CostPerUse");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCostPerUse(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("CostPerUse", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getCostVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("CostVariance");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCostVariance(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("CostVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, RscKey> getCreated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Created");
      if (res == null) return null;
      return new Key<DateTime, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreated(Key<DateTime, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Created", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getCV() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("CV");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCV(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("CV", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getEMailAddress() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("EMailAddress");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEMailAddress(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("EMailAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, RscKey> getFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Finish");
      if (res == null) return null;
      return new Key<DateTime, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinish(Key<DateTime, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Finish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getGroup() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Group");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGroup(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Group", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getGuid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Guid");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGuid(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Guid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getHyperlink() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Hyperlink");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlink(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Hyperlink", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getHyperlinkAddress() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("HyperlinkAddress");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlinkAddress(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("HyperlinkAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getHyperlinkSubAddress() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("HyperlinkSubAddress");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlinkSubAddress(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("HyperlinkSubAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, RscKey> getId() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Id");
      if (res == null) return null;
      return new Key<java.lang.Integer, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setId(Key<java.lang.Integer, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Id", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getInactive() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Inactive");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setInactive(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Inactive", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getInitials() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Initials");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setInitials(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Initials", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getIsBudget() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("IsBudget");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsBudget(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("IsBudget", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getIsCostResource() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("IsCostResource");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsCostResource(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("IsCostResource", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getIsEnterprise() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("IsEnterprise");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsEnterprise(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("IsEnterprise", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getIsGeneric() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("IsGeneric");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsGeneric(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("IsGeneric", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getIsNull() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("IsNull");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsNull(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("IsNull", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, RscKey> getIsTeamAssignmentPool() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("IsTeamAssignmentPool");
      if (res == null) return null;
      return new Key<java.lang.Boolean, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsTeamAssignmentPool(Key<java.lang.Boolean, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("IsTeamAssignmentPool", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getMaterialLabel() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("MaterialLabel");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMaterialLabel(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("MaterialLabel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getMaxUnits() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("MaxUnits");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMaxUnits(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("MaxUnits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getName() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Name");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setName(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Name", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getNotes() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Notes");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNotes(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Notes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getNotesRTF() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("NotesRTF");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNotesRTF(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("NotesRTF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getNotesText() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("NotesText");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNotesText(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("NotesText", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, RscKey> getOverallocated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Overallocated");
      if (res == null) return null;
      return new Key<NullableBool, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOverallocated(Key<NullableBool, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Overallocated", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("OvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeCost(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("OvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getOvertimeRate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("OvertimeRate");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeRate(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("OvertimeRate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<RateFormatType, RscKey> getOvertimeRateFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("OvertimeRateFormat");
      if (res == null) return null;
      return new Key<RateFormatType, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeRateFormat(Key<RateFormatType, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("OvertimeRateFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("OvertimeWork");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("OvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getPeakUnits() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("PeakUnits");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPeakUnits(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("PeakUnits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, RscKey> getPercentWorkComplete() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("PercentWorkComplete");
      if (res == null) return null;
      return new Key<java.lang.Integer, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPercentWorkComplete(Key<java.lang.Integer, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("PercentWorkComplete", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getPhonetics() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Phonetics");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPhonetics(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Phonetics", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getRegularWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("RegularWork");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRegularWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("RegularWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getRemainingCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("RemainingCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingCost(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("RemainingCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getRemainingOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("RemainingOvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingOvertimeCost(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("RemainingOvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getRemainingOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("RemainingOvertimeWork");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingOvertimeWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("RemainingOvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getRemainingWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("RemainingWork");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("RemainingWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, RscKey> getStandardRate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("StandardRate");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStandardRate(Key<java.math.BigDecimal, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("StandardRate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<RateFormatType, RscKey> getStandardRateFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("StandardRateFormat");
      if (res == null) return null;
      return new Key<RateFormatType, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStandardRateFormat(Key<RateFormatType, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("StandardRateFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, RscKey> getStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Start");
      if (res == null) return null;
      return new Key<DateTime, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStart(Key<DateTime, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Start", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getSV() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("SV");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSV(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("SV", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<ResourceType, RscKey> getType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Type");
      if (res == null) return null;
      return new Key<ResourceType, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setType(Key<ResourceType, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Type", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, RscKey> getUid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Uid");
      if (res == null) return null;
      return new Key<java.lang.Integer, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUid(Key<java.lang.Integer, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Uid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, RscKey> getWindowsUserAccount() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("WindowsUserAccount");
      if (res == null) return null;
      return new Key<java.lang.String, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWindowsUserAccount(Key<java.lang.String, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("WindowsUserAccount", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, RscKey> getWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Work");
      if (res == null) return null;
      return new Key<Duration, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWork(Key<Duration, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Work", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<WorkGroupType, RscKey> getWorkgroup() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("Workgroup");
      if (res == null) return null;
      return new Key<WorkGroupType, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWorkgroup(Key<WorkGroupType, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("Workgroup", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, RscKey> getWorkVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Rsc").<NObject>get("WorkVariance");
      if (res == null) return null;
      return new Key<java.lang.Double, RscKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWorkVariance(Key<java.lang.Double, RscKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Rsc").set("WorkVariance", param);
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
