package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSkillGroupRequest extends StObject {
  
  /**
    * The ARN of the skill group to delete. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}
object DeleteSkillGroupRequest {
  
  inline def apply(): DeleteSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSkillGroupRequest]
  }
  
  extension [Self <: DeleteSkillGroupRequest](x: Self) {
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
  }
}
