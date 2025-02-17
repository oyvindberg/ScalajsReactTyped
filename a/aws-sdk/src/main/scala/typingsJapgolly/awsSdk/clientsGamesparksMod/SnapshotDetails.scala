package typingsJapgolly.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotDetails extends StObject {
  
  /**
    * The timestamp of when the snapshot was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[SnapshotDescription] = js.undefined
  
  /**
    * The identifier of the snapshot.
    */
  var Id: js.UndefOr[SnapshotId] = js.undefined
  
  /**
    * The timestamp of when the snapshot was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The sections in the snapshot.
    */
  var Sections: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.Sections] = js.undefined
}
object SnapshotDetails {
  
  inline def apply(): SnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDetails]
  }
  
  extension [Self <: SnapshotDetails](x: Self) {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDescription(value: SnapshotDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: SnapshotId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setSections(value: Sections): Self = StObject.set(x, "Sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "Sections", js.undefined)
  }
}
