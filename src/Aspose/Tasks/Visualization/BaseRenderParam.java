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
import jio.System.Drawing.*;
import jio.System.*;

public abstract class BaseRenderParam implements IRenderParam {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setLocation(Point value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_Location", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Point getLocation() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_Location");
      if (res == null) return null;
      return new Point((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSize(Size value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_Size", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Size getSize() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_Size");
      if (res == null) return null;
      return new Size((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setZoom(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_Zoom", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getZoom() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_Zoom");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPage(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_Page", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPage() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_Page");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLegendOnEachPage(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_LegendOnEachPage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLegendOnEachPage() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_LegendOnEachPage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStartDate(DateTime value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_StartDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getStartDate() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_StartDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEndDate(DateTime value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_EndDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getEndDate() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_EndDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setScale(RenderScale value) {
    try {
      javonetHandle
          .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
          .invoke("set_Scale", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RenderScale getScale() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Aspose.Tasks.Visualization.IRenderParam")
              .invoke("get_Scale");
      if (res == null) return null;
      return RenderScale.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BaseRenderParam(NObject handle) {
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
