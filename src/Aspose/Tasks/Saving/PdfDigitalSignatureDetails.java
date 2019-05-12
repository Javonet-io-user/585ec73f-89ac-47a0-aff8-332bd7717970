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
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.*;

public class PdfDigitalSignatureDetails {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setCertificate(X509Certificate2 value) {
    try {
      javonetHandle.set("Certificate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public X509Certificate2 getCertificate() {
    try {
      Object res = javonetHandle.<NObject>get("Certificate");
      if (res == null) return null;
      return new X509Certificate2((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReason(java.lang.String value) {
    try {
      javonetHandle.set("Reason", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getReason() {
    try {
      java.lang.String res = javonetHandle.get("Reason");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLocation(java.lang.String value) {
    try {
      javonetHandle.set("Location", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLocation() {
    try {
      java.lang.String res = javonetHandle.get("Location");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSignatureDate(DateTime value) {
    try {
      javonetHandle.set("SignatureDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getSignatureDate() {
    try {
      Object res = javonetHandle.<NObject>get("SignatureDate");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setHashAlgorithm(PdfDigitalSignatureHashAlgorithm value) {
    try {
      javonetHandle.set("HashAlgorithm", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PdfDigitalSignatureHashAlgorithm getHashAlgorithm() {
    try {
      Object res = javonetHandle.<NEnum>get("HashAlgorithm");
      if (res == null) return null;
      return PdfDigitalSignatureHashAlgorithm.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PdfDigitalSignatureDetails(
      X509Certificate2 certificate,
      java.lang.String reason,
      java.lang.String location,
      DateTime signatureDate,
      PdfDigitalSignatureHashAlgorithm hashAlgorithm) {
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Saving.PdfDigitalSignatureDetails",
              certificate,
              reason,
              location,
              signatureDate,
              NEnum.fromJavaEnum(hashAlgorithm));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PdfDigitalSignatureDetails(NObject handle) {
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
