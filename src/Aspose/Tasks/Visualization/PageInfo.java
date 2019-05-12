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

public class PageInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setHeader(HeaderFooterInfo value) {
    try {
      javonetHandle.set("Header", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public HeaderFooterInfo getHeader() {
    try {
      Object res = javonetHandle.<NObject>get("Header");
      if (res == null) return null;
      return new HeaderFooterInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFooter(HeaderFooterInfo value) {
    try {
      javonetHandle.set("Footer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public HeaderFooterInfo getFooter() {
    try {
      Object res = javonetHandle.<NObject>get("Footer");
      if (res == null) return null;
      return new HeaderFooterInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PageSettings getPageSettings() {
    try {
      Object res = javonetHandle.<NObject>get("PageSettings");
      if (res == null) return null;
      return new PageSettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PageViewSettings getPageViewSettings() {
    try {
      Object res = javonetHandle.<NObject>get("PageViewSettings");
      if (res == null) return null;
      return new PageViewSettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PageMargins getMargins() {
    try {
      Object res = javonetHandle.<NObject>get("Margins");
      if (res == null) return null;
      return new PageMargins((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLegend(PageLegend value) {
    try {
      javonetHandle.set("Legend", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PageLegend getLegend() {
    try {
      Object res = javonetHandle.<NObject>get("Legend");
      if (res == null) return null;
      return new PageLegend((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PageInfo() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Visualization.PageInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PageInfo(NObject handle) {
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
