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
import jio.System.Collections.Generic.*;
import jio.System.*;

public class Task implements IEquatable<Task> {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public TaskCollection getPredecessors() {
    try {
      Object res = javonetHandle.<NObject>get("Predecessors");
      if (res == null) return null;
      return new TaskCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TaskCollection getSuccessors() {
    try {
      Object res = javonetHandle.<NObject>get("Successors");
      if (res == null) return null;
      return new TaskCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ResourceAssignmentCollection getAssignments() {
    try {
      Object res = javonetHandle.<NObject>get("Assignments");
      if (res == null) return null;
      return new ResourceAssignmentCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Project getParentProject() {
    try {
      Object res = javonetHandle.<NObject>get("ParentProject");
      if (res == null) return null;
      return new Project((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOutlineCodes(OutlineCodeCollection value) {
    try {
      javonetHandle.set("OutlineCodes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OutlineCodeCollection getOutlineCodes() {
    try {
      Object res = javonetHandle.<NObject>get("OutlineCodes");
      if (res == null) return null;
      return new OutlineCodeCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Task getParentTask() {
    try {
      Object res = javonetHandle.<NObject>get("ParentTask");
      if (res == null) return null;
      return new Task((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TaskCollection getChildren() {
    try {
      Object res = javonetHandle.<NObject>get("Children");
      if (res == null) return null;
      return new TaskCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SplitPartCollection getSplitParts() {
    try {
      Object res = javonetHandle.<NObject>get("SplitParts");
      if (res == null) return null;
      return new SplitPartCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtendedAttributeCollection getExtendedAttributes() {
    try {
      Object res = javonetHandle.<NObject>get("ExtendedAttributes");
      if (res == null) return null;
      return new ExtendedAttributeCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTimephasedData(TimephasedDataCollection value) {
    try {
      javonetHandle.set("TimephasedData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimephasedDataCollection getTimephasedData() {
    try {
      Object res = javonetHandle.<NObject>get("TimephasedData");
      if (res == null) return null;
      return new TimephasedDataCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBaselines(TaskBaselineCollection value) {
    try {
      javonetHandle.set("Baselines", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TaskBaselineCollection getBaselines() {
    try {
      Object res = javonetHandle.<NObject>get("Baselines");
      if (res == null) return null;
      return new TaskBaselineCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RecurringTaskInfo getRecurringInfo() {
    try {
      Object res = javonetHandle.<NObject>get("RecurringInfo");
      if (res == null) return null;
      return new RecurringTaskInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Task(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Task other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerable<Task> SelectAllChildTasks() {
    try {
      Object res = javonetHandle.invoke("SelectAllChildTasks");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TimephasedDataCollection GetTimephasedData(
      DateTime start, DateTime end, TimephasedDataType timephasedType) {
    try {
      Object res =
          javonetHandle.invoke("GetTimephasedData", start, end, NEnum.fromJavaEnum(timephasedType));
      if (res == null) return null;
      return new TimephasedDataCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TimephasedDataCollection GetTimephasedData(DateTime start, DateTime end) {
    try {
      Object res = javonetHandle.invoke("GetTimephasedData", start, end);
      if (res == null) return null;
      return new TimephasedDataCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object Clone() {
    try {
      Object res = javonetHandle.invoke("Clone");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Object other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> T Get(Key<T, TaskKey> key, Class<?> returnType) {
    try {
      Object res = javonetHandle.generic(getReturnObjectName(returnType)).invoke("Get", key);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> void Set(Key<T, TaskKey> key, T val) {
    try {
      javonetHandle.generic(getGetObjectName(val)).invoke("Set", key, val);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Delete() {
    try {
      javonetHandle.invoke("Delete");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OutlineIndent() {
    try {
      javonetHandle.invoke("OutlineIndent");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OutlineOutdent() {
    try {
      javonetHandle.invoke("OutlineOutdent");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MoveToSibling(java.lang.Integer beforeTaskId) {
    try {
      javonetHandle.invoke("MoveToSibling", beforeTaskId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
