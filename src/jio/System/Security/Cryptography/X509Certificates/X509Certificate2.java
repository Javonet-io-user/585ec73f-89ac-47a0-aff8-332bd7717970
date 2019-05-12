package jio.System.Security.Cryptography.X509Certificates;

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
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.Security.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class X509Certificate2 extends X509Certificate
    implements IDisposable, IDeserializationCallback, ISerializable {
  protected NObject javonetHandle;

  public X509Certificate2() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Security.Cryptography.X509Certificates.X509Certificate2");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(java.lang.Byte[] rawData) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2",
              new Object[] {rawData});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(java.lang.Byte[] rawData, java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2",
              new Object[] {rawData},
              password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(java.lang.Byte[] rawData, SecureString password) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2",
              new Object[] {rawData},
              password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(
      java.lang.Byte[] rawData, java.lang.String password, X509KeyStorageFlags keyStorageFlags) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2",
              new Object[] {rawData},
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(
      java.lang.Byte[] rawData, SecureString password, X509KeyStorageFlags keyStorageFlags) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2",
              new Object[] {rawData},
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Security.Cryptography.X509Certificates.X509Certificate2", fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(java.lang.String fileName, java.lang.String password) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2", fileName, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(java.lang.String fileName, SecureString password) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2", fileName, password);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(
      java.lang.String fileName, java.lang.String password, X509KeyStorageFlags keyStorageFlags) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2",
              fileName,
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(
      java.lang.String fileName, SecureString password, X509KeyStorageFlags keyStorageFlags) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2",
              fileName,
              password,
              NEnum.fromJavaEnum(keyStorageFlags));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(IntPtr handle) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Security.Cryptography.X509Certificates.X509Certificate2", handle);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(X509Certificate certificate) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Cryptography.X509Certificates.X509Certificate2", certificate);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public X509Certificate2(NObject handle) {
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
