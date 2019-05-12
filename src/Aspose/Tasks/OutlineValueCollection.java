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

public class OutlineValueCollection
    implements jio.System.Collections.Generic.IList<OutlineValue>,
        jio.System.Collections.Generic.ICollection<OutlineValue>,
        jio.System.Collections.Generic.IEnumerable<OutlineValue>,
        jio.System.Collections.IEnumerable,
        Iterable<OutlineValue> {
  protected NObject javonetHandle;

  @Override
  public Iterator<OutlineValue> iterator() {
    return (Iterator<OutlineValue>) this.GetEnumerator();
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
  /** SetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setItem(java.lang.Integer index, OutlineValue value) {
    try {
      javonetHandle.invoke("set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public OutlineValue getItem(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new OutlineValue((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public OutlineValueCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<OutlineValue> GetEnumerator() {
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
  public void Add(OutlineValue item) {
    try {
      javonetHandle.invoke("Add", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(OutlineValue item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyTo(OutlineValue[] array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Remove(OutlineValue item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IndexOf(OutlineValue item) {
    try {
      java.lang.Integer res = javonetHandle.invoke("IndexOf", item);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Insert(java.lang.Integer index, OutlineValue item) {
    try {
      javonetHandle.invoke("Insert", index, item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.invoke("RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
