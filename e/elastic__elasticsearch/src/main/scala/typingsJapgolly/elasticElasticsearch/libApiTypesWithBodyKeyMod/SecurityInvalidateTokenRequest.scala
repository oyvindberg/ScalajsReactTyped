package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Realmname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityInvalidateTokenRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Realmname] = js.undefined
}
object SecurityInvalidateTokenRequest {
  
  inline def apply(): SecurityInvalidateTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityInvalidateTokenRequest]
  }
  
  extension [Self <: SecurityInvalidateTokenRequest](x: Self) {
    
    inline def setBody(value: Realmname): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
