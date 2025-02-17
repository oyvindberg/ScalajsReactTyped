package typingsJapgolly.maximMazurokGapiClientDialogflow

import typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.dialogflow
import typingsJapgolly.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.v3
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object dialogflow {
        
        @JSGlobal("gapi.client.dialogflow.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Dialogflow API v3 */
      inline def load(name: dialogflow, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: dialogflow, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
