package typingsJapgolly.firebaseFirestore

import org.scalajs.dom.ReadableStreamReader
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilBundleReaderMod.BundleSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcPlatformRnByteStreamReaderMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/rn/byte_stream_reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toByteStreamReader(source: BundleSource, bytesPerRead: Double): ReadableStreamReader[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("toByteStreamReader")(source.asInstanceOf[js.Any], bytesPerRead.asInstanceOf[js.Any])).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
}
