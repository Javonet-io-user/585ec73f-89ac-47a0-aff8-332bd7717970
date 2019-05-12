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

public class Tsk {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getUid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Uid");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUid(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Uid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getId() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Id");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setId(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Id", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TaskType, TaskKey> getType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Type");
      if (res == null) return null;
      return new Key<TaskType, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setType(Key<TaskType, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Type", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsNull() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsNull");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsNull(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsNull", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getCreated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Created");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreated(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Created", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getContact() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Contact");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setContact(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Contact", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getWBS() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("WBS");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWBS(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("WBS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getWBSLevel() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("WBSLevel");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWBSLevel(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("WBSLevel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getOutlineNumber() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("OutlineNumber");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOutlineNumber(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("OutlineNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getName() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Name");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setName(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Name", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getOutlineLevel() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("OutlineLevel");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOutlineLevel(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("OutlineLevel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getPriority() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Priority");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPriority(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Priority", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Start");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStart(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Start", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Finish");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinish(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Finish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getDuration() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Duration");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDuration(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Duration", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getDurationVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("DurationVariance");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDurationVariance(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("DurationVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TimeUnitType, TaskKey> getDurationFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("DurationFormat");
      if (res == null) return null;
      return new Key<TimeUnitType, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDurationFormat(Key<TimeUnitType, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("DurationFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Work");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Work", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getStop() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Stop");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStop(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Stop", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getResume() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Resume");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setResume(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Resume", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsResumeValid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsResumeValid");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsResumeValid(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsResumeValid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsEffortDriven() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsEffortDriven");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsEffortDriven(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsEffortDriven", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsRecurring() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsRecurring");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsRecurring(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsRecurring", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, TaskKey> getIsSummary() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsSummary");
      if (res == null) return null;
      return new Key<java.lang.Boolean, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsSummary(Key<java.lang.Boolean, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsSummary", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsOverallocated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsOverallocated");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsOverallocated(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsOverallocated", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsEstimated() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsEstimated");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsEstimated(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsEstimated", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsMilestone() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsMilestone");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsMilestone(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsMilestone", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsCritical() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsCritical");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsCritical(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsCritical", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, TaskKey> getIsSubproject() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsSubproject");
      if (res == null) return null;
      return new Key<java.lang.Boolean, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsSubproject(Key<java.lang.Boolean, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsSubproject", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsSubprojectReadOnly() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsSubprojectReadOnly");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsSubprojectReadOnly(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsSubprojectReadOnly", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, TaskKey> getIsMarked() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsMarked");
      if (res == null) return null;
      return new Key<java.lang.Boolean, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsMarked(Key<java.lang.Boolean, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsMarked", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, TaskKey> getIgnoreWarnings() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IgnoreWarnings");
      if (res == null) return null;
      return new Key<java.lang.Boolean, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIgnoreWarnings(Key<java.lang.Boolean, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IgnoreWarnings", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, TaskKey> getIsExternalTask() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsExternalTask");
      if (res == null) return null;
      return new Key<java.lang.Boolean, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsExternalTask(Key<java.lang.Boolean, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsExternalTask", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getSubprojectName() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("SubprojectName");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSubprojectName(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("SubprojectName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getExternalTaskProject() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ExternalTaskProject");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setExternalTaskProject(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ExternalTaskProject", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getExternalId() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ExternalId");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setExternalId(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ExternalId", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getEarlyStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("EarlyStart");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEarlyStart(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("EarlyStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getEarlyFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("EarlyFinish");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEarlyFinish(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("EarlyFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getLateStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("LateStart");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLateStart(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("LateStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getLateFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("LateFinish");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLateFinish(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("LateFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getStartVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("StartVariance");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStartVariance(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("StartVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getFinishVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("FinishVariance");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinishVariance(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("FinishVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getWorkVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("WorkVariance");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWorkVariance(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("WorkVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, TaskKey> getCostVariance() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("CostVariance");
      if (res == null) return null;
      return new Key<java.lang.Double, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCostVariance(Key<java.lang.Double, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("CostVariance", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getStartSlack() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("StartSlack");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStartSlack(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("StartSlack", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getFinishSlack() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("FinishSlack");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinishSlack(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("FinishSlack", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getFreeSlack() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("FreeSlack");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFreeSlack(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("FreeSlack", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getTotalSlack() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("TotalSlack");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTotalSlack(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("TotalSlack", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, TaskKey> getFixedCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("FixedCost");
      if (res == null) return null;
      return new Key<java.lang.Double, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFixedCost(Key<java.lang.Double, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("FixedCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<CostAccrualType, TaskKey> getFixedCostAccrual() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("FixedCostAccrual");
      if (res == null) return null;
      return new Key<CostAccrualType, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFixedCostAccrual(Key<CostAccrualType, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("FixedCostAccrual", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getPercentComplete() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("PercentComplete");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPercentComplete(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("PercentComplete", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getPercentWorkComplete() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("PercentWorkComplete");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPercentWorkComplete(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("PercentWorkComplete", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, TaskKey> getCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Cost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCost(Key<java.math.BigDecimal, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Cost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, TaskKey> getOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("OvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeCost(Key<java.math.BigDecimal, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("OvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getActualStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualStart");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualStart(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getActualFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualFinish");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualFinish(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getActualDuration() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualDuration");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualDuration(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualDuration", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, TaskKey> getActualCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualCost(Key<java.math.BigDecimal, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, TaskKey> getActualOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualOvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeCost(Key<java.math.BigDecimal, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualOvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getActualWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualWork");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getActualOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualOvertimeWork");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualOvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getRegularWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("RegularWork");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRegularWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("RegularWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("OvertimeWork");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOvertimeWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("OvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getRemainingDuration() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("RemainingDuration");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingDuration(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("RemainingDuration", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, TaskKey> getRemainingCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("RemainingCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingCost(Key<java.math.BigDecimal, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("RemainingCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getRemainingWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("RemainingWork");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("RemainingWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getRemainingOvertimeWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("RemainingOvertimeWork");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingOvertimeWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("RemainingOvertimeWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, TaskKey> getRemainingOvertimeCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("RemainingOvertimeCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRemainingOvertimeCost(Key<java.math.BigDecimal, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("RemainingOvertimeCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, TaskKey> getACWP() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ACWP");
      if (res == null) return null;
      return new Key<java.lang.Double, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setACWP(Key<java.lang.Double, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ACWP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, TaskKey> getCV() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("CV");
      if (res == null) return null;
      return new Key<java.lang.Double, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCV(Key<java.lang.Double, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("CV", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<ConstraintType, TaskKey> getConstraintType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ConstraintType");
      if (res == null) return null;
      return new Key<ConstraintType, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setConstraintType(Key<ConstraintType, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ConstraintType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Calendar, TaskKey> getCalendar() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Calendar");
      if (res == null) return null;
      return new Key<Calendar, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCalendar(Key<Calendar, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Calendar", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getConstraintDate() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ConstraintDate");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setConstraintDate(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ConstraintDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getDeadline() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Deadline");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDeadline(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Deadline", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getLevelAssignments() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("LevelAssignments");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLevelAssignments(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("LevelAssignments", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getLevelingCanSplit() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("LevelingCanSplit");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLevelingCanSplit(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("LevelingCanSplit", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getLevelingDelay() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("LevelingDelay");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLevelingDelay(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("LevelingDelay", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<TimeUnitType, TaskKey> getLevelingDelayFormat() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("LevelingDelayFormat");
      if (res == null) return null;
      return new Key<TimeUnitType, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLevelingDelayFormat(Key<TimeUnitType, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("LevelingDelayFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getPreleveledStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("PreleveledStart");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPreleveledStart(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("PreleveledStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getPreleveledFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("PreleveledFinish");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPreleveledFinish(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("PreleveledFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getHyperlink() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Hyperlink");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlink(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Hyperlink", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getHyperlinkAddress() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("HyperlinkAddress");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlinkAddress(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("HyperlinkAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getHyperlinkSubAddress() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("HyperlinkSubAddress");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHyperlinkSubAddress(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("HyperlinkSubAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIgnoreResourceCalendar() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IgnoreResourceCalendar");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIgnoreResourceCalendar(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IgnoreResourceCalendar", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getHideBar() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("HideBar");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHideBar(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("HideBar", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsRollup() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsRollup");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsRollup(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsRollup", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, TaskKey> getBCWS() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("BCWS");
      if (res == null) return null;
      return new Key<java.lang.Double, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBCWS(Key<java.lang.Double, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("BCWS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Double, TaskKey> getBCWP() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("BCWP");
      if (res == null) return null;
      return new Key<java.lang.Double, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBCWP(Key<java.lang.Double, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("BCWP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getPhysicalPercentComplete() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("PhysicalPercentComplete");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPhysicalPercentComplete(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("PhysicalPercentComplete", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<EarnedValueMethodType, TaskKey> getEarnedValueMethod() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("EarnedValueMethod");
      if (res == null) return null;
      return new Key<EarnedValueMethodType, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEarnedValueMethod(Key<EarnedValueMethodType, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("EarnedValueMethod", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getActualWorkProtected() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualWorkProtected");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualWorkProtected(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualWorkProtected", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getActualOvertimeWorkProtected() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ActualOvertimeWorkProtected");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActualOvertimeWorkProtected(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ActualOvertimeWorkProtected", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsPublished() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsPublished");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsPublished(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsPublished", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getStatusManager() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("StatusManager");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStatusManager(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("StatusManager", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getCommitmentStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("CommitmentStart");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCommitmentStart(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("CommitmentStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getCommitmentFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("CommitmentFinish");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCommitmentFinish(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("CommitmentFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Integer, TaskKey> getCommitmentType() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("CommitmentType");
      if (res == null) return null;
      return new Key<java.lang.Integer, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCommitmentType(Key<java.lang.Integer, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("CommitmentType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsManual() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsManual");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsManual(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsManual", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsExpanded() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsExpanded");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsExpanded(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsExpanded", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getGuid() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("Guid");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGuid(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("Guid", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getNotesText() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("NotesText");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNotesText(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("NotesText", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getNotesRTF() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("NotesRTF");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNotesRTF(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("NotesRTF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getManualStart() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ManualStart");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setManualStart(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ManualStart", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<DateTime, TaskKey> getManualFinish() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ManualFinish");
      if (res == null) return null;
      return new Key<DateTime, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setManualFinish(Key<DateTime, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ManualFinish", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getManualDuration() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("ManualDuration");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setManualDuration(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("ManualDuration", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<Duration, TaskKey> getBudgetWork() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("BudgetWork");
      if (res == null) return null;
      return new Key<Duration, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBudgetWork(Key<Duration, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("BudgetWork", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.math.BigDecimal, TaskKey> getBudgetCost() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("BudgetCost");
      if (res == null) return null;
      return new Key<java.math.BigDecimal, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBudgetCost(Key<java.math.BigDecimal, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("BudgetCost", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getDisplayAsSummary() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("DisplayAsSummary");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDisplayAsSummary(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("DisplayAsSummary", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<NullableBool, TaskKey> getIsActive() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("IsActive");
      if (res == null) return null;
      return new Key<NullableBool, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsActive(Key<NullableBool, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("IsActive", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getStartText() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("StartText");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setStartText(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("StartText", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getDurationText() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("DurationText");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDurationText(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("DurationText", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.String, TaskKey> getFinishText() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("FinishText");
      if (res == null) return null;
      return new Key<java.lang.String, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinishText(Key<java.lang.String, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("FinishText", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static Key<java.lang.Boolean, TaskKey> getDisplayOnTimeline() {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Tsk").<NObject>get("DisplayOnTimeline");
      if (res == null) return null;
      return new Key<java.lang.Boolean, TaskKey>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDisplayOnTimeline(Key<java.lang.Boolean, TaskKey> param) {
    try {
      Javonet.getType("Aspose.Tasks.Tsk").set("DisplayOnTimeline", param);
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
