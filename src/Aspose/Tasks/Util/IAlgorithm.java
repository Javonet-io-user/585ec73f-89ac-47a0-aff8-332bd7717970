package Aspose.Tasks.Util;

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
import Aspose.Tasks.Util.*;

public interface IAlgorithm<T> {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Alg(T el, java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void PostAlg(T el, java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void PreAlg(T el, java.lang.Integer index);
}
