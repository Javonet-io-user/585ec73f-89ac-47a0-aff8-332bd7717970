package Aspose.Tasks.Saving;

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
import Aspose.Tasks.Saving.*;
import jio.System.Collections.Generic.*;

public class PdfSaveOptions extends SaveOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCompliance(PdfCompliance value) {
    try {
      javonetHandle.set("Compliance", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PdfCompliance getCompliance() {
    try {
      Object res = javonetHandle.<NEnum>get("Compliance");
      if (res == null) return null;
      return PdfCompliance.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEncryptionDetails(PdfEncryptionDetails value) {
    try {
      javonetHandle.set("EncryptionDetails", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PdfEncryptionDetails getEncryptionDetails() {
    try {
      Object res = javonetHandle.<NObject>get("EncryptionDetails");
      if (res == null) return null;
      return new PdfEncryptionDetails((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextCompression(PdfTextCompression value) {
    try {
      javonetHandle.set("TextCompression", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PdfTextCompression getTextCompression() {
    try {
      Object res = javonetHandle.<NEnum>get("TextCompression");
      if (res == null) return null;
      return PdfTextCompression.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDigitalSignatureDetails(PdfDigitalSignatureDetails value) {
    try {
      javonetHandle.set("DigitalSignatureDetails", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PdfDigitalSignatureDetails getDigitalSignatureDetails() {
    try {
      Object res = javonetHandle.<NObject>get("DigitalSignatureDetails");
      if (res == null) return null;
      return new PdfDigitalSignatureDetails((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSaveToSeparateFiles(java.lang.Boolean value) {
    try {
      javonetHandle.set("SaveToSeparateFiles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getSaveToSeparateFiles() {
    try {
      java.lang.Boolean res = javonetHandle.get("SaveToSeparateFiles");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPages(List<java.lang.Integer> value) {
    try {
      javonetHandle.set("Pages", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<java.lang.Integer> getPages() {
    try {
      Object res = javonetHandle.<NObject>get("Pages");
      if (res == null) return null;
      return new List<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultFontName(java.lang.String value) {
    try {
      javonetHandle.set("DefaultFontName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultFontName() {
    try {
      java.lang.String res = javonetHandle.get("DefaultFontName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUseProjectDefaultFont(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseProjectDefaultFont", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUseProjectDefaultFont() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseProjectDefaultFont");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public PdfSaveOptions() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.Saving.PdfSaveOptions");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PdfSaveOptions(NObject handle) {
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
