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

public class PdfEncryptionDetails {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {
    try {
      javonetHandle.set("EncryptionAlgorithm", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PdfEncryptionAlgorithm getEncryptionAlgorithm() {
    try {
      Object res = javonetHandle.<NEnum>get("EncryptionAlgorithm");
      if (res == null) return null;
      return PdfEncryptionAlgorithm.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOwnerPassword(java.lang.String value) {
    try {
      javonetHandle.set("OwnerPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getOwnerPassword() {
    try {
      java.lang.String res = javonetHandle.get("OwnerPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPermissions(PdfPermissions value) {
    try {
      javonetHandle.set("Permissions", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PdfPermissions getPermissions() {
    try {
      Object res = javonetHandle.<NEnum>get("Permissions");
      if (res == null) return null;
      return PdfPermissions.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserPassword(java.lang.String value) {
    try {
      javonetHandle.set("UserPassword", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserPassword() {
    try {
      java.lang.String res = javonetHandle.get("UserPassword");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PdfEncryptionDetails(
      java.lang.String userPassword,
      java.lang.String ownerPassword,
      PdfEncryptionAlgorithm encryptionAlgorithm) {
    try {
      javonetHandle =
          Javonet.New(
              "Aspose.Tasks.Saving.PdfEncryptionDetails",
              userPassword,
              ownerPassword,
              NEnum.fromJavaEnum(encryptionAlgorithm));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PdfEncryptionDetails(NObject handle) {
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
