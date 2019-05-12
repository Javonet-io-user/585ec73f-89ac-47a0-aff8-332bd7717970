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
import jio.System.Collections.Generic.*;

public class ListUtils {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void Apply(
      IList<T> list, IAlgorithm<T> algorithm, java.lang.Integer startIndex) {
    try {
      Javonet.getType("Aspose.Tasks.Util.ListUtils").invoke("Apply", list, algorithm, startIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IList<T> Filter(IList<T> list, ICondition<T> cond) {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Util.ListUtils").invoke("Filter", list, cond);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> T Find(IList<T> list, ICondition<T> cond, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Util.ListUtils")
              .generic(getReturnObjectName(returnType))
              .invoke("Find", list, cond);
      if (res == null) return null;
      return (T) Convert(res, returnType);
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
