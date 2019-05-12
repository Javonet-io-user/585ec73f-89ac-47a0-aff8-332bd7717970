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
import jio.System.Collections.Generic.*;

public class ExtendedAttributeDefinition {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setFieldId(java.lang.String value) {
    try {
      javonetHandle.set("FieldId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFieldId() {
    try {
      java.lang.String res = javonetHandle.get("FieldId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFieldName(java.lang.String value) {
    try {
      javonetHandle.set("FieldName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFieldName() {
    try {
      java.lang.String res = javonetHandle.get("FieldName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCfType(CustomFieldType value) {
    try {
      javonetHandle.set("CfType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CustomFieldType getCfType() {
    try {
      Object res = javonetHandle.<NEnum>get("CfType");
      if (res == null) return null;
      return CustomFieldType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setGuid(java.lang.String value) {
    try {
      javonetHandle.set("Guid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getGuid() {
    try {
      java.lang.String res = javonetHandle.get("Guid");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setElementType(ElementType value) {
    try {
      javonetHandle.set("ElementType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ElementType getElementType() {
    try {
      Object res = javonetHandle.<NEnum>get("ElementType");
      if (res == null) return null;
      return ElementType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaxMultiValues(java.lang.Integer value) {
    try {
      javonetHandle.set("MaxMultiValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getMaxMultiValues() {
    try {
      java.lang.Integer res = javonetHandle.get("MaxMultiValues");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserDef(java.lang.Boolean value) {
    try {
      javonetHandle.set("UserDef", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getUserDef() {
    try {
      java.lang.Boolean res = javonetHandle.get("UserDef");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAlias(java.lang.String value) {
    try {
      javonetHandle.set("Alias", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getAlias() {
    try {
      java.lang.String res = javonetHandle.get("Alias");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSecondaryPid(java.lang.String value) {
    try {
      javonetHandle.set("SecondaryPid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSecondaryPid() {
    try {
      java.lang.String res = javonetHandle.get("SecondaryPid");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoRollDown(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoRollDown", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoRollDown() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoRollDown");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultGuid(java.lang.String value) {
    try {
      javonetHandle.set("DefaultGuid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefaultGuid() {
    try {
      java.lang.String res = javonetHandle.get("DefaultGuid");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLookupUid(java.lang.String value) {
    try {
      javonetHandle.set("LookupUid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLookupUid() {
    try {
      java.lang.String res = javonetHandle.get("LookupUid");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPhoneticsAlias(java.lang.String value) {
    try {
      javonetHandle.set("PhoneticsAlias", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPhoneticsAlias() {
    try {
      java.lang.String res = javonetHandle.get("PhoneticsAlias");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRollupType(RollupType value) {
    try {
      javonetHandle.set("RollupType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RollupType getRollupType() {
    try {
      Object res = javonetHandle.<NEnum>get("RollupType");
      if (res == null) return null;
      return RollupType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCalculationType(CalculationType value) {
    try {
      javonetHandle.set("CalculationType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CalculationType getCalculationType() {
    try {
      Object res = javonetHandle.<NEnum>get("CalculationType");
      if (res == null) return null;
      return CalculationType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFormula(java.lang.String value) {
    try {
      javonetHandle.set("Formula", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFormula() {
    try {
      java.lang.String res = javonetHandle.get("Formula");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRestrictValues(java.lang.Boolean value) {
    try {
      javonetHandle.set("RestrictValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getRestrictValues() {
    try {
      java.lang.Boolean res = javonetHandle.get("RestrictValues");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValuelistSortOrder(java.lang.Integer value) {
    try {
      javonetHandle.set("ValuelistSortOrder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getValuelistSortOrder() {
    try {
      java.lang.Integer res = javonetHandle.get("ValuelistSortOrder");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAppendNewValues(java.lang.Boolean value) {
    try {
      javonetHandle.set("AppendNewValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAppendNewValues() {
    try {
      java.lang.Boolean res = javonetHandle.get("AppendNewValues");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefault(java.lang.String value) {
    try {
      javonetHandle.set("Default", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDefault() {
    try {
      java.lang.String res = javonetHandle.get("Default");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValueList(List<Value> value) {
    try {
      javonetHandle.set("ValueList", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<Value> getValueList() {
    try {
      Object res = javonetHandle.<NObject>get("ValueList");
      if (res == null) return null;
      return new List<Value>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSecondaryGuid(java.lang.String value) {
    try {
      javonetHandle.set("SecondaryGuid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSecondaryGuid() {
    try {
      java.lang.String res = javonetHandle.get("SecondaryGuid");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Project getParentProject() {
    try {
      Object res = javonetHandle.<NObject>get("ParentProject");
      if (res == null) return null;
      return new Project((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ExtendedAttributeDefinition() {
    try {
      javonetHandle = Javonet.New("Aspose.Tasks.ExtendedAttributeDefinition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExtendedAttributeDefinition(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddLookupValue(Value value) {
    try {
      javonetHandle.invoke("AddLookupValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void RemoveLookupValue(Value value) {
    try {
      javonetHandle.invoke("RemoveLookupValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ExtendedAttribute CreateExtendedAttribute() {
    try {
      Object res = javonetHandle.invoke("CreateExtendedAttribute");
      if (res == null) return null;
      return new ExtendedAttribute((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ExtendedAttribute CreateExtendedAttribute(OutlineValue outlineValue) {
    try {
      Object res = javonetHandle.invoke("CreateExtendedAttribute", outlineValue);
      if (res == null) return null;
      return new ExtendedAttribute((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ExtendedAttribute CreateExtendedAttribute(Value lookupValue) {
    try {
      Object res = javonetHandle.invoke("CreateExtendedAttribute", lookupValue);
      if (res == null) return null;
      return new ExtendedAttribute((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ExtendedAttributeDefinition CreateTaskDefinition(
      CustomFieldType customFieldType, ExtendedAttributeTask fieldId, java.lang.String alias) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.ExtendedAttributeDefinition")
              .invoke(
                  "CreateTaskDefinition",
                  NEnum.fromJavaEnum(customFieldType),
                  NEnum.fromJavaEnum(fieldId),
                  alias);
      if (res == null) return null;
      return new ExtendedAttributeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ExtendedAttributeDefinition CreateResourceDefinition(
      CustomFieldType customFieldType, ExtendedAttributeResource fieldId, java.lang.String alias) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.ExtendedAttributeDefinition")
              .invoke(
                  "CreateResourceDefinition",
                  NEnum.fromJavaEnum(customFieldType),
                  NEnum.fromJavaEnum(fieldId),
                  alias);
      if (res == null) return null;
      return new ExtendedAttributeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ExtendedAttributeDefinition CreateLookupDefinition() {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.ExtendedAttributeDefinition")
              .invoke("CreateLookupDefinition");
      if (res == null) return null;
      return new ExtendedAttributeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ExtendedAttributeDefinition CreateLookupTaskDefinition(
      CustomFieldType customFieldType, ExtendedAttributeTask fieldId, java.lang.String alias) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.ExtendedAttributeDefinition")
              .invoke(
                  "CreateLookupTaskDefinition",
                  NEnum.fromJavaEnum(customFieldType),
                  NEnum.fromJavaEnum(fieldId),
                  alias);
      if (res == null) return null;
      return new ExtendedAttributeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static ExtendedAttributeDefinition CreateLookupResourceDefinition(
      CustomFieldType customFieldType, ExtendedAttributeResource fieldId, java.lang.String alias) {
    try {
      Object res =
          Javonet.getType("Aspose.Tasks.ExtendedAttributeDefinition")
              .invoke(
                  "CreateLookupResourceDefinition",
                  NEnum.fromJavaEnum(customFieldType),
                  NEnum.fromJavaEnum(fieldId),
                  alias);
      if (res == null) return null;
      return new ExtendedAttributeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Object obj) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
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
