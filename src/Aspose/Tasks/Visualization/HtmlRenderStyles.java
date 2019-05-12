package Aspose.Tasks.Visualization;

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
import Aspose.Tasks.Visualization.*;

public class HtmlRenderStyles {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setTableStyle(java.lang.String value) {
    try {
      javonetHandle.set("TableStyle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTableStyle() {
    try {
      java.lang.String res = javonetHandle.get("TableStyle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTaskStyle(java.lang.String value) {
    try {
      javonetHandle.set("TaskStyle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTaskStyle() {
    try {
      java.lang.String res = javonetHandle.get("TaskStyle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setParentTaskStyle(java.lang.String value) {
    try {
      javonetHandle.set("ParentTaskStyle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getParentTaskStyle() {
    try {
      java.lang.String res = javonetHandle.get("ParentTaskStyle");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public HtmlRenderStyles() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Visualization.HtmlRenderStyles");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HtmlRenderStyles(
      java.lang.String tableStyle, java.lang.String taskStyle, java.lang.String parentTaskStyle) {
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.HtmlRenderStyles",
              tableStyle,
              taskStyle,
              parentTaskStyle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HtmlRenderStyles(NObject handle) {
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
