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
import jio.System.Collections.*;

public class ResourceAssignmentCollection
    implements jio.System.Collections.Generic.IEnumerable<ResourceAssignment>,
        jio.System.Collections.IEnumerable,
        Iterable<ResourceAssignment> {
  protected NObject javonetHandle;

  @Override
  public Iterator<ResourceAssignment> iterator() {
    return (Iterator<ResourceAssignment>) this.GetEnumerator();
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
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsReadOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.get("Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public ResourceAssignmentCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<ResourceAssignment> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public List<ResourceAssignment> ToList() {
    try {
      Object res = javonetHandle.invoke("ToList");
      if (res == null) return null;
      return new List<ResourceAssignment>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ResourceAssignment Add(Task task, Resource resource, java.lang.Double units) {
    try {
      Object res = javonetHandle.invoke("Add", task, resource, units);
      if (res == null) return null;
      return new ResourceAssignment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ResourceAssignment Add(Task task, Resource resource) {
    try {
      Object res = javonetHandle.invoke("Add", task, resource);
      if (res == null) return null;
      return new ResourceAssignment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ResourceAssignment GetByUid(java.lang.Integer uid) {
    try {
      Object res = javonetHandle.invoke("GetByUid", uid);
      if (res == null) return null;
      return new ResourceAssignment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
