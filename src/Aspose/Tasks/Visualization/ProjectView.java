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
import jio.System.Collections.Generic.*;

public class ProjectView {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public List<ViewColumn> getColumns() {
    try {
      Object res = javonetHandle.<NObject>get("Columns");
      if (res == null) return null;
      return new List<ViewColumn>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ProjectView(IEnumerable<ViewColumn> columns) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Visualization.ProjectView", columns);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ProjectView(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ProjectView GetDefaultGanttChartView() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Visualization.ProjectView")
              .invoke("GetDefaultGanttChartView");
      if (res == null) return null;
      return new ProjectView((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ProjectView GetDefaultTaskSheetView() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Visualization.ProjectView")
              .invoke("GetDefaultTaskSheetView");
      if (res == null) return null;
      return new ProjectView((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ProjectView GetDefaultResourceUsageView() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Visualization.ProjectView")
              .invoke("GetDefaultResourceUsageView");
      if (res == null) return null;
      return new ProjectView((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ProjectView GetDefaultAssignmentView() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Visualization.ProjectView")
              .invoke("GetDefaultAssignmentView");
      if (res == null) return null;
      return new ProjectView((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ProjectView GetDefaultResourceSheetView() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.Visualization.ProjectView")
              .invoke("GetDefaultResourceSheetView");
      if (res == null) return null;
      return new ProjectView((NObject) res);
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
