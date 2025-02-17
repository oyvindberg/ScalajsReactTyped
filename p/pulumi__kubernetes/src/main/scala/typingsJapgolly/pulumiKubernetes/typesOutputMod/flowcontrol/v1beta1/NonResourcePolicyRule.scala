package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
  */
trait NonResourcePolicyRule extends StObject {
  
  /**
    * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
    *   - "/healthz" is legal
    *   - "/hea*" is illegal
    *   - "/hea" is legal but matches nothing
    *   - "/hea/ *" also matches nothing
    *   - "/healthz/ *" matches all per-component health checks.
    * "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
    */
  var nonResourceURLs: js.Array[String]
  
  /**
    * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is present, it must be the only entry. Required.
    */
  var verbs: js.Array[String]
}
object NonResourcePolicyRule {
  
  inline def apply(nonResourceURLs: js.Array[String], verbs: js.Array[String]): NonResourcePolicyRule = {
    val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourcePolicyRule]
  }
  
  extension [Self <: NonResourcePolicyRule](x: Self) {
    
    inline def setNonResourceURLs(value: js.Array[String]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
    
    inline def setNonResourceURLsVarargs(value: String*): Self = StObject.set(x, "nonResourceURLs", js.Array(value*))
    
    inline def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
    
    inline def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value*))
  }
}
