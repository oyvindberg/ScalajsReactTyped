package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commit extends StObject {
  
  var commit: Sha
  
  var name: String
  
  var `protected`: Boolean
  
  var protection: js.UndefOr[Allowforcepushes] = js.undefined
  
  /** Format: uri */
  var protection_url: js.UndefOr[String] = js.undefined
}
object Commit {
  
  inline def apply(commit: Sha, name: String, `protected`: Boolean): Commit = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  
  extension [Self <: Commit](x: Self) {
    
    inline def setCommit(value: Sha): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: Allowforcepushes): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
    
    inline def setProtection_urlUndefined: Self = StObject.set(x, "protection_url", js.undefined)
  }
}
