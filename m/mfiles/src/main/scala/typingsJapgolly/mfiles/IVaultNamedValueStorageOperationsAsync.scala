package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.MFNamedValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultNamedValueStorageOperationsAsync extends StObject {
  
  def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: js.Function1[/* result */ INamedValues, Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: js.Function1[/* result */ INamedValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: js.Function1[/* result */ INamedValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: js.Function1[/* result */ INamedValues, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValueNames: IStrings,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetNamedValues(
    NamedValueType: MFNamedValueType,
    Namespace: String,
    NamedValues: INamedValues,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
