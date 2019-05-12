package Aspose.Tasks;

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
import Aspose.Tasks.*;
import Aspose.Tasks.Visualization.*;
import Aspose.Tasks.Saving.*;
import jio.System.Drawing.Printing.*;
import jio.System.Collections.Generic.*;
import jio.System.*;
import jio.System.IO.*;
import Aspose.Tasks.Connectivity.*;

public class Project {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public VbaProject getVbaProject() {
    try {
      Object res = javonetHandle.<NObject>get("VbaProject");
      if (res == null) return null;
      return new VbaProject((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ProjectDisplayOptions getDisplayOptions() {
    try {
      Object res = javonetHandle.<NObject>get("DisplayOptions");
      if (res == null) return null;
      return new ProjectDisplayOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCalculationMode(CalculationMode value) {
    try {
      javonetHandle.set("CalculationMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CalculationMode getCalculationMode() {
    try {
      Object res = javonetHandle.<NEnum>get("CalculationMode");
      if (res == null) return null;
      return CalculationMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Task getRootTask() {
    try {
      Object res = javonetHandle.<NObject>get("RootTask");
      if (res == null) return null;
      return new Task((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TaskLinkCollection getTaskLinks() {
    try {
      Object res = javonetHandle.<NObject>get("TaskLinks");
      if (res == null) return null;
      return new TaskLinkCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CalendarCollection getCalendars() {
    try {
      Object res = javonetHandle.<NObject>get("Calendars");
      if (res == null) return null;
      return new CalendarCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ResourceCollection getResources() {
    try {
      Object res = javonetHandle.<NObject>get("Resources");
      if (res == null) return null;
      return new ResourceCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OutlineCodeDefinitionCollection getOutlineCodes() {
    try {
      Object res = javonetHandle.<NObject>get("OutlineCodes");
      if (res == null) return null;
      return new OutlineCodeDefinitionCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ResourceAssignmentCollection getResourceAssignments() {
    try {
      Object res = javonetHandle.<NObject>get("ResourceAssignments");
      if (res == null) return null;
      return new ResourceAssignmentCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WeekDayCollection getDefaultWeekWorkingDays() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultWeekWorkingDays");
      if (res == null) return null;
      return new WeekDayCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCustomProperties(IDictionary<java.lang.String, Object> value) {
    try {
      javonetHandle.set("CustomProperties", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDictionary<java.lang.String, Object> getCustomProperties() {
    try {
      Object res = javonetHandle.<NObject>get("CustomProperties");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExtendedAttributeDefinitionCollection getExtendedAttributes() {
    try {
      Object res = javonetHandle.<NObject>get("ExtendedAttributes");
      if (res == null) return null;
      return new ExtendedAttributeDefinitionCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TaskCollection getCriticalPath() {
    try {
      Object res = javonetHandle.<NObject>get("CriticalPath");
      if (res == null) return null;
      return new TaskCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FilterCollection getTaskFilters() {
    try {
      Object res = javonetHandle.<NObject>get("TaskFilters");
      if (res == null) return null;
      return new FilterCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FilterCollection getResourceFilters() {
    try {
      Object res = javonetHandle.<NObject>get("ResourceFilters");
      if (res == null) return null;
      return new FilterCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public View getDefaultView() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultView");
      if (res == null) return null;
      return new View((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ViewCollection getViews() {
    try {
      Object res = javonetHandle.<NObject>get("Views");
      if (res == null) return null;
      return new ViewCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TableCollection getTables() {
    try {
      Object res = javonetHandle.<NObject>get("Tables");
      if (res == null) return null;
      return new TableCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public GroupCollection getTaskGroups() {
    try {
      Object res = javonetHandle.<NObject>get("TaskGroups");
      if (res == null) return null;
      return new GroupCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public GroupCollection getResourceGroups() {
    try {
      Object res = javonetHandle.<NObject>get("ResourceGroups");
      if (res == null) return null;
      return new GroupCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setWBSCodeDefinition(WBSCodeDefinition value) {
    try {
      javonetHandle.set("WBSCodeDefinition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WBSCodeDefinition getWBSCodeDefinition() {
    try {
      Object res = javonetHandle.<NObject>get("WBSCodeDefinition");
      if (res == null) return null;
      return new WBSCodeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OleObjectCollection getOleObjects() {
    try {
      Object res = javonetHandle.<NObject>get("OleObjects");
      if (res == null) return null;
      return new OleObjectCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Project() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(java.lang.String projectTemplate, java.lang.String protectionPassword) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", projectTemplate, protectionPassword);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(java.lang.String projectTemplate) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", projectTemplate);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(Stream stream, PrimaveraXmlReadingOptions options) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", stream, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(
      Stream stream, ParseErrorCallback parseErrorHandler, PrimaveraXmlReadingOptions options) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", stream, parseErrorHandler, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(java.lang.String projectTemplate, ParseErrorCallback parseErrorHandler) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", projectTemplate, parseErrorHandler);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(Stream stream) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", stream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(java.lang.String projectTemplate, PrimaveraXmlReadingOptions options) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", projectTemplate, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(
      java.lang.String projectTemplate,
      ParseErrorCallback parseErrorHandler,
      PrimaveraXmlReadingOptions options) {
    try {
      javonetHandle =
          Javonet.New("Aspose.Tasks.Project", projectTemplate, parseErrorHandler, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(DbSettings settings) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", settings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(Stream stream, ParseErrorCallback parseErrorHandler) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", stream, parseErrorHandler);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(Stream stream, java.lang.String protectionPassword) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", stream, protectionPassword);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(java.lang.String projectTemplate, LoadOptions options) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", projectTemplate, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(Stream stream, LoadOptions options) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Project", stream, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Project(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetPageCount(PresentationFormat format, Timescale scale) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetPageCount", NEnum.fromJavaEnum(format), NEnum.fromJavaEnum(scale));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetPageCount(PageSize pageSize, Timescale scale) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetPageCount", NEnum.fromJavaEnum(pageSize), NEnum.fromJavaEnum(scale));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyTo(Project another) {
    try {
      javonetHandle.invoke("CopyTo", another);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print() {
    try {
      javonetHandle.invoke("Print");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(PrintOptions options) {
    try {
      javonetHandle.invoke("Print", options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(java.lang.String printerName) {
    try {
      javonetHandle.invoke("Print", printerName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(PrinterSettings printerSettings) {
    try {
      javonetHandle.invoke("Print", printerSettings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(PrinterSettings printerSettings, java.lang.String documentName) {
    try {
      javonetHandle.invoke("Print", printerSettings, documentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Print(PrinterSettings printerSettings, PrintOptions options) {
    try {
      javonetHandle.invoke("Print", printerSettings, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetBaseline(BaselineType baselineType) {
    try {
      javonetHandle.invoke("SetBaseline", NEnum.fromJavaEnum(baselineType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetBaseline(BaselineType baselineType, IEnumerable<Task> tasks) {
    try {
      javonetHandle.invoke("SetBaseline", NEnum.fromJavaEnum(baselineType), tasks);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UpdateProjectWorkAsComplete(
      DateTime completeThrough, java.lang.Boolean setZeroOrHundredPercentCompleteOnly) {
    try {
      javonetHandle.invoke(
          "UpdateProjectWorkAsComplete", completeThrough, setZeroOrHundredPercentCompleteOnly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void UpdateProjectWorkAsComplete(
      DateTime completeThrough,
      java.lang.Boolean setZeroOrHundredPercentCompleteOnly,
      List<Task> tasks) {
    try {
      javonetHandle.invoke(
          "UpdateProjectWorkAsComplete",
          completeThrough,
          setZeroOrHundredPercentCompleteOnly,
          tasks);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RescheduleUncompletedWorkToStartAfter(DateTime after) {
    try {
      javonetHandle.invoke("RescheduleUncompletedWorkToStartAfter", after);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RescheduleUncompletedWorkToStartAfter(DateTime after, List<Task> tasks) {
    try {
      javonetHandle.invoke("RescheduleUncompletedWorkToStartAfter", after, tasks);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Duration GetDuration(java.lang.Double val) {
    try {
      Object res = javonetHandle.invoke("GetDuration", val);
      if (res == null) return null;
      return new Duration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Duration GetDuration(java.lang.Double val, TimeUnitType timeUnit) {
    try {
      Object res = javonetHandle.invoke("GetDuration", val, NEnum.fromJavaEnum(timeUnit));
      if (res == null) return null;
      return new Duration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Duration GetWork(java.lang.Double val) {
    try {
      Object res = javonetHandle.invoke("GetWork", val);
      if (res == null) return null;
      return new Duration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerable<Task> SelectAllChildTasks() {
    try {
      Object res = javonetHandle.invoke("SelectAllChildTasks");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ProjectFileInfo GetProjectFileInfo(java.lang.String filename) {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Project").invoke("GetProjectFileInfo", filename);
      if (res == null) return null;
      return new ProjectFileInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ProjectFileInfo GetProjectFileInfo(Stream stream) {
    try {
      Object res = Javonet.getType("Aspose.Tasks.Project").invoke("GetProjectFileInfo", stream);
      if (res == null) return null;
      return new ProjectFileInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TaskLinkCollection GetPredecessors(Task task) {
    try {
      Object res = javonetHandle.invoke("GetPredecessors", task);
      if (res == null) return null;
      return new TaskLinkCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> T Get(Key<T, PrjKey> key, Class<?> returnType) {
    try {
      Object res = javonetHandle.generic(getReturnObjectName(returnType)).invoke("Get", key);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public <T> void Set(Key<T, PrjKey> key, T val) {
    try {
      javonetHandle.generic(getGetObjectName(val)).invoke("Set", key, val);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CalcResourceStartFinish() {
    try {
      javonetHandle.invoke("CalcResourceStartFinish");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CalcResourceFields() {
    try {
      javonetHandle.invoke("CalcResourceFields");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveInvalidResourceAssignments() {
    try {
      javonetHandle.invoke("RemoveInvalidResourceAssignments");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime GetBaselineSaveTime(BaselineType baselineNumber) {
    try {
      Object res = javonetHandle.invoke("GetBaselineSaveTime", NEnum.fromJavaEnum(baselineNumber));
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Recalculate() {
    try {
      javonetHandle.invoke("Recalculate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Recalculate(java.lang.Boolean validate) {
    try {
      javonetHandle.invoke("Recalculate", validate);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String filename, MPPSaveOptions options) {
    try {
      javonetHandle.invoke("Save", filename, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String filename, SaveOptions options) {
    try {
      javonetHandle.invoke("Save", filename, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String filename, ImageSaveOptions options) {
    try {
      javonetHandle.invoke("Save", filename, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String filename, PdfSaveOptions options) {
    try {
      javonetHandle.invoke("Save", filename, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(java.lang.String filename, SaveFileFormat format) {
    try {
      javonetHandle.invoke("Save", filename, NEnum.fromJavaEnum(format));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(Stream stream, SaveOptions options) {
    try {
      javonetHandle.invoke("Save", stream, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(Stream stream, MPPSaveOptions options) {
    try {
      javonetHandle.invoke("Save", stream, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Save(Stream stream, SaveFileFormat format) {
    try {
      javonetHandle.invoke("Save", stream, NEnum.fromJavaEnum(format));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveReport(Stream stream) {
    try {
      javonetHandle.invoke("SaveReport", stream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveReport(java.lang.String fileName) {
    try {
      javonetHandle.invoke("SaveReport", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveReport(Stream stream, ReportType reportType) {
    try {
      javonetHandle.invoke("SaveReport", stream, NEnum.fromJavaEnum(reportType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveReport(java.lang.String fileName, ReportType reportType) {
    try {
      javonetHandle.invoke("SaveReport", fileName, NEnum.fromJavaEnum(reportType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAsTemplate(java.lang.String fileName, SaveTemplateOptions options) {
    try {
      javonetHandle.invoke("SaveAsTemplate", fileName, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAsTemplate(java.lang.String fileName) {
    try {
      javonetHandle.invoke("SaveAsTemplate", fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAsTemplate(Stream stream) {
    try {
      javonetHandle.invoke("SaveAsTemplate", stream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SaveAsTemplate(Stream stream, SaveTemplateOptions options) {
    try {
      javonetHandle.invoke("SaveAsTemplate", stream, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetPageCount() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetPageCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetPageCount(Timescale scale) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetPageCount", NEnum.fromJavaEnum(scale));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetPageCount(PresentationFormat format) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetPageCount", NEnum.fromJavaEnum(format));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
