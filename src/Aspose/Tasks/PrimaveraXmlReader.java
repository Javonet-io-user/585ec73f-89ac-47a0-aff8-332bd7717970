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
import jio.System.Collections.Generic.*;
import jio.System.IO.*;

public class PrimaveraXmlReader {
  protected NObject javonetHandle;

  public PrimaveraXmlReader(java.lang.String templatePath) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.PrimaveraXmlReader", templatePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrimaveraXmlReader(Stream stream) {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.PrimaveraXmlReader", stream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PrimaveraXmlReader(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public List<java.lang.Integer> GetProjectUids() {
    try {
      Object res = javonetHandle.invoke("GetProjectUids");
      if (res == null) return null;
      return new List<java.lang.Integer>((NObject) res);
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
