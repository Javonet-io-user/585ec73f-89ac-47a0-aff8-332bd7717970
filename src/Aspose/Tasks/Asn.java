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

public class Asn {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, AsnKey> getUid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Uid");
      if (res == null) return null;
      return new Key<java.lang.Integer, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUid(Key<java.lang.Integer, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Uid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Task, AsnKey> getTask() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Task");
      if (res == null) return null;
      return new Key<Task, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTask(Key<Task, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Task", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Resource, AsnKey> getResource() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Resource");
      if (res == null) return null;
      return new Key<Resource, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setResource(Key<Resource, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Resource", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, AsnKey> getPercentWorkComplete() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("PercentWorkComplete");
      if (res == null) return null;
      return new Key<java.lang.Integer, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPercentWorkComplete(Key<java.lang.Integer, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("PercentWorkComplete", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, AsnKey> getActualCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualCost(Key<java.math.BigDecimal, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, AsnKey> getActualFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualFinish");
      if (res == null) return null;
      return new Key<DateTime, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualFinish(Key<DateTime, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, AsnKey> getActualOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualOvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeCost(Key<java.math.BigDecimal, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualOvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, AsnKey> getActualStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualStart");
      if (res == null) return null;
      return new Key<DateTime, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualStart(Key<DateTime, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getActualWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualWork");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getACWP() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ACWP");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setACWP(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ACWP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getConfirmed() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Confirmed");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setConfirmed(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Confirmed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, AsnKey> getCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Cost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCost(Key<java.math.BigDecimal, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Cost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<RateType, AsnKey> getCostRateTableType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("CostRateTableType");
      if (res == null) return null;
      return new Key<RateType, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCostRateTableType(Key<RateType, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("CostRateTableType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getCostVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("CostVariance");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCostVariance(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("CostVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getCV() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("CV");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCV(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("CV", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getDelay() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Delay");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDelay(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Delay", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, AsnKey> getFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Finish");
      if (res == null) return null;
      return new Key<DateTime, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinish(Key<DateTime, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Finish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getFinishVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("FinishVariance");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinishVariance(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("FinishVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, AsnKey> getHyperlink() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Hyperlink");
      if (res == null) return null;
      return new Key<java.lang.String, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlink(Key<java.lang.String, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Hyperlink", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, AsnKey> getHyperlinkAddress() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("HyperlinkAddress");
      if (res == null) return null;
      return new Key<java.lang.String, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlinkAddress(Key<java.lang.String, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("HyperlinkAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, AsnKey> getHyperlinkSubAddress() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("HyperlinkSubAddress");
      if (res == null) return null;
      return new Key<java.lang.String, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlinkSubAddress(Key<java.lang.String, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("HyperlinkSubAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getWorkVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("WorkVariance");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWorkVariance(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("WorkVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getHasFixedRateUnits() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("HasFixedRateUnits");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHasFixedRateUnits(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("HasFixedRateUnits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getFixedMaterial() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("FixedMaterial");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFixedMaterial(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("FixedMaterial", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getLevelingDelay() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("LevelingDelay");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLevelingDelay(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("LevelingDelay", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TimeUnitType, AsnKey> getLevelingDelayFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("LevelingDelayFormat");
      if (res == null) return null;
      return new Key<TimeUnitType, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLevelingDelayFormat(Key<TimeUnitType, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("LevelingDelayFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getLinkedFields() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("LinkedFields");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLinkedFields(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("LinkedFields", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getMilestone() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Milestone");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMilestone(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Milestone", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, AsnKey> getNotes() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Notes");
      if (res == null) return null;
      return new Key<java.lang.String, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNotes(Key<java.lang.String, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Notes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getOverallocated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Overallocated");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOverallocated(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Overallocated", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, AsnKey> getOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("OvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeCost(Key<java.math.BigDecimal, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("OvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("OvertimeWork");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("OvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getPeakUnits() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("PeakUnits");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPeakUnits(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("PeakUnits", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getRegularWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("RegularWork");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRegularWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("RegularWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, AsnKey> getRemainingCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("RemainingCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingCost(Key<java.math.BigDecimal, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("RemainingCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, AsnKey> getRemainingOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("RemainingOvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingOvertimeCost(Key<java.math.BigDecimal, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("RemainingOvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getRemainingOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("RemainingOvertimeWork");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingOvertimeWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("RemainingOvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getRemainingWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("RemainingWork");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("RemainingWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getResponsePending() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ResponsePending");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setResponsePending(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ResponsePending", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, AsnKey> getStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Start");
      if (res == null) return null;
      return new Key<DateTime, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStart(Key<DateTime, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Start", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, AsnKey> getStop() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Stop");
      if (res == null) return null;
      return new Key<DateTime, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStop(Key<DateTime, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Stop", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, AsnKey> getResume() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Resume");
      if (res == null) return null;
      return new Key<DateTime, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setResume(Key<DateTime, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Resume", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getStartVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("StartVariance");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStartVariance(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("StartVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getSummary() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Summary");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSummary(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Summary", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getSV() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("SV");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSV(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("SV", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getUnits() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Units");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUnits(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Units", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, AsnKey> getUpdateNeeded() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("UpdateNeeded");
      if (res == null) return null;
      return new Key<java.lang.Boolean, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUpdateNeeded(Key<java.lang.Boolean, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("UpdateNeeded", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getVAC() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("VAC");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setVAC(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("VAC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Work");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Work", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<WorkContourType, AsnKey> getWorkContour() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("WorkContour");
      if (res == null) return null;
      return new Key<WorkContourType, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWorkContour(Key<WorkContourType, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("WorkContour", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getBCWS() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("BCWS");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBCWS(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("BCWS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, AsnKey> getBCWP() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("BCWP");
      if (res == null) return null;
      return new Key<java.lang.Double, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBCWP(Key<java.lang.Double, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("BCWP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<BookingType, AsnKey> getBookingType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("BookingType");
      if (res == null) return null;
      return new Key<BookingType, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBookingType(Key<BookingType, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("BookingType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getActualWorkProtected() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualWorkProtected");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualWorkProtected(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualWorkProtected", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getActualOvertimeWorkProtected() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualOvertimeWorkProtected");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeWorkProtected(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualOvertimeWorkProtected", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getActualOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("ActualOvertimeWork");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("ActualOvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, AsnKey> getCreated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("Created");
      if (res == null) return null;
      return new Key<DateTime, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreated(Key<DateTime, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("Created", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, AsnKey> getAssignmentOwner() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("AssignmentOwner");
      if (res == null) return null;
      return new Key<java.lang.String, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAssignmentOwner(Key<java.lang.String, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("AssignmentOwner", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, AsnKey> getAssignmentOwnerGuid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("AssignmentOwnerGuid");
      if (res == null) return null;
      return new Key<java.lang.String, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAssignmentOwnerGuid(Key<java.lang.String, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("AssignmentOwnerGuid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, AsnKey> getBudgetCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("BudgetCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBudgetCost(Key<java.math.BigDecimal, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("BudgetCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, AsnKey> getBudgetWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("BudgetWork");
      if (res == null) return null;
      return new Key<Duration, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBudgetWork(Key<Duration, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("BudgetWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<RateScaleType, AsnKey> getRateScale() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Asn").<NObject>get("RateScale");
      if (res == null) return null;
      return new Key<RateScaleType, AsnKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRateScale(Key<RateScaleType, AsnKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Asn").set("RateScale", param);
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
