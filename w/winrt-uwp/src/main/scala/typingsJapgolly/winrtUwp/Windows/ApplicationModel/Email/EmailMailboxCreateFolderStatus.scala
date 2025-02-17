package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxCreateFolderStatus extends StObject
/** Indicates the result of a call to TryCreateFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus")
@js.native
object EmailMailboxCreateFolderStatus extends StObject {
  
  /** The folder already exists. */
  @js.native
  sealed trait nameCollision
    extends StObject
       with EmailMailboxCreateFolderStatus
  
  /** There was a network error while trying to create the folder. */
  @js.native
  sealed trait networkError
    extends StObject
       with EmailMailboxCreateFolderStatus
  
  /** There was a permissions error while trying to create the folder. */
  @js.native
  sealed trait permissionsError
    extends StObject
       with EmailMailboxCreateFolderStatus
  
  /** There was a server error while trying to create the folder. */
  @js.native
  sealed trait serverError
    extends StObject
       with EmailMailboxCreateFolderStatus
  
  /** The server rejected the request to create a new folder. */
  @js.native
  sealed trait serverRejected
    extends StObject
       with EmailMailboxCreateFolderStatus
  
  /** The folder was created successfully. */
  @js.native
  sealed trait success
    extends StObject
       with EmailMailboxCreateFolderStatus
  
  /** Folder creation failed for an unknown reason. */
  @js.native
  sealed trait unknownFailure
    extends StObject
       with EmailMailboxCreateFolderStatus
}
