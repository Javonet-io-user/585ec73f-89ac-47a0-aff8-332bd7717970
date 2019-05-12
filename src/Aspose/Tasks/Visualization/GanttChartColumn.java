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
import Aspose.Tasks.*;

public class GanttChartColumn extends ViewColumn {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setFieldAsGanttChartColumn(Field value) {
    try {
      javonetHandle.set("Field", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Field getFieldAsGanttChartColumn() {
    try {
      Object res = javonetHandle.<NEnum>get("Field");
      if (res == null) return null;
      return Field.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public GanttChartColumn(
      java.lang.String name,
      java.lang.Integer width,
      TaskToColumnTextConverter converter,
      Field field) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.GanttChartColumn",
              name,
              width,
              converter,
              NEnum.fromJavaEnum(field));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GanttChartColumn(
      java.lang.String name, java.lang.Integer width, TaskToColumnTextConverter converter) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Aspose.Tasks.Visualization.GanttChartColumn", name, width, converter);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GanttChartColumn(java.lang.Integer width, Field field) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.GanttChartColumn", width, NEnum.fromJavaEnum(field));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GanttChartColumn(java.lang.String name, java.lang.Integer width, Field field) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Visualization.GanttChartColumn",
              name,
              width,
              NEnum.fromJavaEnum(field));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GanttChartColumn(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetColumnText(Task task) {
    try {
      java.lang.String res = javonetHandle.invoke("GetColumnText", task);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
