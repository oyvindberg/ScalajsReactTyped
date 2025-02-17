package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordSourceSelectorProxy[T]
  extends StObject
     with RecordSourceProxy {
  
  def getPluralRootField(fieldName: String): (js.Array[RecordProxy[T] | Null]) | Null = js.native
  
  def getRootField(fieldName: String): RecordProxy[js.Object] | Null = js.native
  def getRootField[K /* <: /* keyof T */ String */](fieldName: K): RecordProxy[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  
  def invalidateStore(): Unit = js.native
}
