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

public interface IRenderParam {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Point getLocation();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Size getSize();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getZoom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPage();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLegendOnEachPage();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getStartDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getEndDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public RenderScale getScale();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLocation(Point value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSize(Size value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setZoom(java.lang.Integer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setPage(java.lang.Integer value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setLegendOnEachPage(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setStartDate(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setEndDate(DateTime value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setScale(RenderScale value);
}
