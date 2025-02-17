package typingsJapgolly.fridaGum.global

import typingsJapgolly.fridaGum.GetNativeFunctionArgumentValue
import typingsJapgolly.fridaGum.GetNativeFunctionReturnValue
import typingsJapgolly.fridaGum.NativeABI
import typingsJapgolly.fridaGum.NativeFunctionArgumentType
import typingsJapgolly.fridaGum.NativeFunctionOptions
import typingsJapgolly.fridaGum.NativeFunctionReturnType
import typingsJapgolly.fridaGum.NativePointerValue
import typingsJapgolly.fridaGum.ResolveVariadic
import typingsJapgolly.fridaGum.SystemFunctionConstructor
import typingsJapgolly.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SystemFunction")
@js.native
open class SystemFunction[RetType /* <: NativeFunctionReturnType */, ArgTypes /* <: js.Array[Any | NativeFunctionArgumentType] */] protected ()
  extends StObject
     with typingsJapgolly.fridaGum.SystemFunction[
      GetNativeFunctionReturnValue[RetType], 
      ResolveVariadic[Extract[GetNativeFunctionArgumentValue[ArgTypes], js.Array[Any]]]
    ] {
  def this(address: NativePointerValue, retType: RetType, argTypes: ArgTypes) = this()
  def this(address: NativePointerValue, retType: RetType, argTypes: ArgTypes, abiOrOptions: NativeABI) = this()
  def this(
    address: NativePointerValue,
    retType: RetType,
    argTypes: ArgTypes,
    abiOrOptions: NativeFunctionOptions
  ) = this()
}
object SystemFunction {
  
  inline def apply: SystemFunctionConstructor = js.Dynamic.global.selectDynamic("SystemFunction").asInstanceOf[SystemFunctionConstructor]
}
