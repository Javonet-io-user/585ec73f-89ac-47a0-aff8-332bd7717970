package Aspose.Tasks.Util;

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
import Aspose.Tasks.Util.*;

public class Not<T> implements ICondition<T> {
  protected NObject javonetHandle;
  /** GenericConstructor */
  @MethodTypeAnnotation(type = "GetField")
  public Not(ICondition<T> condition, Class<?> T) {
    try {
      javonetHandle = Javonet.getType("Aspose.Tasks.Util.Not`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Not(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Check(T el) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Check", el);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
