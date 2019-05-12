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

public class CheckCircuit implements ITreeAlgorithm<Task> {
  protected NObject javonetHandle;

  public CheckCircuit() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Util.CheckCircuit");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CheckCircuit(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Alg(Task el, java.lang.Integer level) {
    try {
      javonetHandle.invoke("Alg", el, level);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PostAlg(Task el, java.lang.Integer level) {
    try {
      javonetHandle.invoke("PostAlg", el, level);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void PreAlg(Task el, java.lang.Integer level) {
    try {
      javonetHandle.invoke("PreAlg", el, level);
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
