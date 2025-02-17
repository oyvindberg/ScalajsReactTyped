package typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getFeedback` operation. */
object GetFeedbackConstants {
  
  @js.native
  sealed trait Model extends StObject
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "GetFeedbackConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model & String] = js.native
    
    @js.native
    sealed trait CONTRACTS
      extends StObject
         with Model
    /* "contracts" */ val CONTRACTS: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model.CONTRACTS & String = js.native
    
    @js.native
    sealed trait TABLES
      extends StObject
         with Model
    /* "tables" */ val TABLES: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model.TABLES & String = js.native
  }
}
