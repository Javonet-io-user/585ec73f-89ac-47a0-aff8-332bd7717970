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

public class ResourceAssignment implements IEquatable<ResourceAssignment> {
  protected NObject javonetHandle;
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
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public AssignmentBaselineCollection getBaselines() {
    try {
      Object res = javonetHandle.<NObject>get("Baselines");
      if (res == null) return null;
      return new AssignmentBaselineCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExtendedAttributes(ExtendedAttributeCollection value) {
    try {
      javonetHandle.set("ExtendedAttributes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  public ResourceAssignment(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(ResourceAssignment other) {
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
  public <T> T Get(Key<T, AsnKey> key, Class<?> returnType) {
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
  public <T> void Set(Key<T, AsnKey> key, T val) {
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
  public void TimephasedDataFromTaskDuration(Calendar calendar) {
    try {
      javonetHandle.invoke("TimephasedDataFromTaskDuration", calendar);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime MakeTPs(
      DateTime start,
      TimeSpan time,
      Calendar calendar,
      List<TimephasedData> outTP,
      java.lang.Boolean isWorking,
      java.lang.Integer type) {
    try {
      Object res = javonetHandle.invoke("MakeTPs", start, time, calendar, outTP, isWorking, type);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SplitTask(DateTime start, DateTime finish, Calendar calendar) {
    try {
      javonetHandle.invoke("SplitTask", start, finish, calendar);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
