package typingsJapgolly.maximMazurokGapiClientDatacatalog

import typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.CatalogResource
import typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.EntriesResource
import typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.datacatalog
import typingsJapgolly.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.v1
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
      
      object datacatalog {
        
        @JSGlobal("gapi.client.datacatalog.catalog")
        @js.native
        val catalog: CatalogResource = js.native
        
        @JSGlobal("gapi.client.datacatalog.entries")
        @js.native
        val entries: EntriesResource = js.native
        
        @JSGlobal("gapi.client.datacatalog.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Google Cloud Data Catalog API v1 */
      inline def load(name: datacatalog, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: datacatalog, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
