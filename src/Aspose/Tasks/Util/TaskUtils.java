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
import Aspose.Tasks.*;

public class TaskUtils {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Apply(Task root, ITreeAlgorithm<Task> alg, java.lang.Integer level) {
    try {
      Javonet.getType("Aspose.Tasks.Util.TaskUtils").invoke("Apply", root, alg, level);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Task Filter(Task root, ICondition<Task> cond) {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Util.TaskUtils").invoke("Filter", root, cond);
      if (res == null) return null;
      return new Task((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Task Find(Task root, ICondition<Task> cond) {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Util.TaskUtils").invoke("Find", root, cond);
      if (res == null) return null;
      return new Task((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer TaskChildrenCount(Task task) {
    try {
      java.lang.Integer res =
          Javonet.getType("Aspose.Tasks.Util.TaskUtils").invoke("TaskChildrenCount", task);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
