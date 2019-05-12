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

public class RiskAnalyzer {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSettings(RiskAnalysisSettings value) {
    try {
      javonetHandle.set("Settings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RiskAnalysisSettings getSettings() {
    try {
      Object res = javonetHandle.<NObject>get("Settings");
      if (res == null) return null;
      return new RiskAnalysisSettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RiskAnalyzer(RiskAnalysisSettings settings) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.RiskAnalysis.RiskAnalyzer", settings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RiskAnalyzer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RiskAnalysisResult Analyze(Project project) {
    try {
      Object res = javonetHandle.invoke("Analyze", project);
      if (res == null) return null;
      return new RiskAnalysisResult((NObject) res);
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
