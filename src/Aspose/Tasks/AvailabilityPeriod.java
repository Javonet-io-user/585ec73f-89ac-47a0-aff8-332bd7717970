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
import jio.System.*;

public class AvailabilityPeriod {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setAvailableFrom(DateTime value) {
    try {
      javonetHandle.set("AvailableFrom", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getAvailableFrom() {
    try {
      Object res = javonetHandle.<NObject>get("AvailableFrom");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAvailableTo(DateTime value) {
    try {
      javonetHandle.set("AvailableTo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getAvailableTo() {
    try {
      Object res = javonetHandle.<NObject>get("AvailableTo");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAvailableUnits(java.lang.Double value) {
    try {
      javonetHandle.set("AvailableUnits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getAvailableUnits() {
    try {
      java.lang.Double res = javonetHandle.get("AvailableUnits");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Resource getParentResource() {
    try {
      Object res = javonetHandle.<NObject>get("ParentResource");
      if (res == null) return null;
      return new Resource((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public AvailabilityPeriod() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.AvailabilityPeriod");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AvailabilityPeriod(NObject handle) {
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
