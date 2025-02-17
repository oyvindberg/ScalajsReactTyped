package typingsJapgolly.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasMaxPasswordFailedAttemptsResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult")
@js.native
object EasMaxPasswordFailedAttemptsResult extends StObject {
  
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait compliant
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait invalidParameter
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends StObject
       with EasMaxPasswordFailedAttemptsResult
}
