package Aspose.Tasks.RiskAnalysis;

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
import Aspose.Tasks.RiskAnalysis.*;
import Aspose.Tasks.*;

public class RiskPattern {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Task getTask() {
    try {
      Object res = javonetHandle.<NObject>get("Task");
      if (res == null) return null;
      return new Task((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDistribution(ProbabilityDistributionType value) {
    try {
      javonetHandle.set("Distribution", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProbabilityDistributionType getDistribution() {
    try {
      Object res = javonetHandle.<NEnum>get("Distribution");
      if (res == null) return null;
      return ProbabilityDistributionType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConfidenceLevel(ConfidenceLevel value) {
    try {
      javonetHandle.set("ConfidenceLevel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ConfidenceLevel getConfidenceLevel() {
    try {
      Object res = javonetHandle.<NEnum>get("ConfidenceLevel");
      if (res == null) return null;
      return ConfidenceLevel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOptimistic(java.lang.Integer value) {
    try {
      javonetHandle.set("Optimistic", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getOptimistic() {
    try {
      java.lang.Integer res = javonetHandle.get("Optimistic");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPessimistic(java.lang.Integer value) {
    try {
      javonetHandle.set("Pessimistic", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPessimistic() {
    try {
      java.lang.Integer res = javonetHandle.get("Pessimistic");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public RiskPattern(Task task) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.RiskAnalysis.RiskPattern", task);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RiskPattern(NObject handle) {
    this.javonetHandle = handle;
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
