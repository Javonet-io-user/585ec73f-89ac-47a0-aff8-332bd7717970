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
import jio.System.Text.*;
import jio.System.Drawing.*;
import jio.System.*;

public class BaseHtmlRenderParam extends BaseRenderParam implements IRenderParam {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSBuilder(jio.System.Text.StringBuilder value) {
    try {
      javonetHandle.set("SBuilder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Text.StringBuilder getSBuilder() {
    try {
      Object res = javonetHandle.<NObject>get("SBuilder");
      if (res == null) return null;
      return new jio.System.Text.StringBuilder((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStyles(HtmlRenderStyles value) {
    try {
      javonetHandle.set("Styles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public HtmlRenderStyles getStyles() {
    try {
      Object res = javonetHandle.<NObject>get("Styles");
      if (res == null) return null;
      return new HtmlRenderStyles((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BaseHtmlRenderParam(
      jio.System.Text.StringBuilder sBuilder,
      Point location,
      Size size,
      java.lang.Integer zoom,
      java.lang.Integer page,
      java.lang.Boolean legendOnEachPage) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.BaseHtmlRenderParam",
              sBuilder,
              location,
              size,
              zoom,
              page,
              legendOnEachPage);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseHtmlRenderParam(
      jio.System.Text.StringBuilder sBuilder,
      Point location,
      Size size,
      java.lang.Integer zoom,
      java.lang.Integer page,
      java.lang.Boolean legendOnEachPage,
      DateTime startDate,
      DateTime endDate) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.BaseHtmlRenderParam",
              sBuilder,
              location,
              size,
              zoom,
              page,
              legendOnEachPage,
              startDate,
              endDate);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseHtmlRenderParam(
      jio.System.Text.StringBuilder sBuilder,
      Point location,
      Size size,
      java.lang.Integer zoom,
      java.lang.Integer page,
      java.lang.Boolean legendOnEachPage,
      DateTime startDate,
      DateTime endDate,
      HtmlRenderStyles styles) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.BaseHtmlRenderParam",
              sBuilder,
              location,
              size,
              zoom,
              page,
              legendOnEachPage,
              startDate,
              endDate,
              styles);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseHtmlRenderParam(
      jio.System.Text.StringBuilder sBuilder,
      Point location,
      Size size,
      java.lang.Integer zoom,
      java.lang.Integer page,
      java.lang.Boolean legendOnEachPage,
      DateTime startDate,
      DateTime endDate,
      HtmlRenderStyles styles,
      RenderScale scale) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.BaseHtmlRenderParam",
              sBuilder,
              location,
              size,
              zoom,
              page,
              legendOnEachPage,
              startDate,
              endDate,
              styles,
              NEnum.fromJavaEnum(scale));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseHtmlRenderParam(NObject handle) {
    super(handle);
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
