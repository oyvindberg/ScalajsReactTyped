package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XVeto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is notified to approve changes which happen to the content of a generic container
  * @see XContainerApproveBroadcaster
  */
trait XContainerApproveListener extends StObject {
  
  /**
    * is called for the listener to approve an insertion into the container
    * @returns an instance implementing the {@link com.sun.star.util.XVeto} interface, if the insertion is vetoed, `NULL` otherwise.
    */
  def approveInsertElement(Event: ContainerEvent): XVeto
  
  /**
    * is called for the listener to approve a removal of an element from the container
    * @returns an instance implementing the {@link com.sun.star.util.XVeto} interface, if the removal is vetoed, `NULL` otherwise.
    */
  def approveRemoveElement(Event: ContainerEvent): XVeto
  
  /**
    * is called for the listener to approve a replacement inside the container
    * @returns an instance implementing the {@link com.sun.star.util.XVeto} interface, if the replacement is vetoed, `NULL` otherwise.
    */
  def approveReplaceElement(Event: ContainerEvent): XVeto
}
object XContainerApproveListener {
  
  inline def apply(
    approveInsertElement: ContainerEvent => XVeto,
    approveRemoveElement: ContainerEvent => XVeto,
    approveReplaceElement: ContainerEvent => XVeto
  ): XContainerApproveListener = {
    val __obj = js.Dynamic.literal(approveInsertElement = js.Any.fromFunction1(approveInsertElement), approveRemoveElement = js.Any.fromFunction1(approveRemoveElement), approveReplaceElement = js.Any.fromFunction1(approveReplaceElement))
    __obj.asInstanceOf[XContainerApproveListener]
  }
  
  extension [Self <: XContainerApproveListener](x: Self) {
    
    inline def setApproveInsertElement(value: ContainerEvent => XVeto): Self = StObject.set(x, "approveInsertElement", js.Any.fromFunction1(value))
    
    inline def setApproveRemoveElement(value: ContainerEvent => XVeto): Self = StObject.set(x, "approveRemoveElement", js.Any.fromFunction1(value))
    
    inline def setApproveReplaceElement(value: ContainerEvent => XVeto): Self = StObject.set(x, "approveReplaceElement", js.Any.fromFunction1(value))
  }
}
