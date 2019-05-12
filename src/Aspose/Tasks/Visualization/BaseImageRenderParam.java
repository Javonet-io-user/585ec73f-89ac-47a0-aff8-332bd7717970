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
import jio.System.Drawing.Imaging.*;
import jio.System.*;

public class BaseImageRenderParam extends BaseRenderParam implements IRenderParam {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setGfx(Graphics value) {
    try {
      javonetHandle.set("Gfx", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Graphics getGfx() {
    try {
      Object res = javonetHandle.<NObject>get("Gfx");
      if (res == null) return null;
      return new Graphics((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFormat(ImageFormat value) {
    try {
      javonetHandle.set("Format", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ImageFormat getFormat() {
    try {
      Object res = javonetHandle.<NObject>get("Format");
      if (res == null) return null;
      return new ImageFormat((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BaseImageRenderParam(
      Graphics gfx,
      Point location,
      Size size,
      java.lang.Integer zoom,
      java.lang.Integer page,
      java.lang.Boolean legendOnEachPage) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.BaseImageRenderParam",
              gfx,
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

  public BaseImageRenderParam(
      Graphics gfx,
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
              "Aspose.Tasks.Visualization.BaseImageRenderParam",
              gfx,
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

  public BaseImageRenderParam(
      Graphics gfx,
      Point location,
      Size size,
      java.lang.Integer zoom,
      java.lang.Integer page,
      java.lang.Boolean legendOnEachPage,
      DateTime startDate,
      DateTime endDate,
      RenderScale scale) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.BaseImageRenderParam",
              gfx,
              location,
              size,
              zoom,
              page,
              legendOnEachPage,
              startDate,
              endDate,
              NEnum.fromJavaEnum(scale));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseImageRenderParam(
      Graphics gfx,
      Point location,
      Size size,
      java.lang.Integer zoom,
      java.lang.Integer page,
      java.lang.Boolean legendOnEachPage,
      DateTime startDate,
      DateTime endDate,
      RenderScale scale,
      ImageFormat format) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.BaseImageRenderParam",
              gfx,
              location,
              size,
              zoom,
              page,
              legendOnEachPage,
              startDate,
              endDate,
              NEnum.fromJavaEnum(scale),
              format);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseImageRenderParam(NObject handle) {
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
