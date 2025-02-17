package typingsJapgolly.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeFetchBlob.anon.Decode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RNFetchBlobStatic extends StObject {
  
  // this require external module https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/oboe
  var JSONStream: Any = js.native
  
  var android: AndroidApi = js.native
  
  var base64: Decode = js.native
  
  def config(options: RNFetchBlobConfig): RNFetchBlobStatic = js.native
  
  def fetch(method: Methods, url: String): StatefulPromise[FetchBlobResponse] = js.native
  def fetch(method: Methods, url: String, headers: StringDictionary[String]): StatefulPromise[FetchBlobResponse] = js.native
  def fetch(method: Methods, url: String, headers: StringDictionary[String], body: Any): StatefulPromise[FetchBlobResponse] = js.native
  def fetch(method: Methods, url: String, headers: Unit, body: Any): StatefulPromise[FetchBlobResponse] = js.native
  
  var fs: FS = js.native
  
  var ios: IOSApi = js.native
  
  var net: Net = js.native
  
  var polyfill: Polyfill = js.native
  
  def session(name: String): RNFetchBlobSession = js.native
  
  def wrap(path: String): String = js.native
}
