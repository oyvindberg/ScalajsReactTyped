package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** HTMLOptionsCollection is an interface representing a collection of HTML option elements (in document order) and offers methods and properties for traversing the list as well as optionally altering its items. This type is returned solely by the "options" property of select. */
@js.native
trait HTMLOptionsCollection
  extends StObject
     with HTMLCollectionOf[org.scalajs.dom.HTMLOptionElement] {
  
  def add(element: org.scalajs.dom.HTMLOptGroupElement): Unit = js.native
  def add(element: org.scalajs.dom.HTMLOptGroupElement, before: org.scalajs.dom.HTMLElement): Unit = js.native
  def add(element: org.scalajs.dom.HTMLOptGroupElement, before: Double): Unit = js.native
  /**
    * Inserts element before the node given by before.
    *
    * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the collection, in which case element is inserted before that element.
    *
    * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
    *
    * This method will throw a "HierarchyRequestError" DOMException if element is an ancestor of the element into which it is to be inserted.
    */
  /* standard dom */
  def add(element: org.scalajs.dom.HTMLOptionElement): Unit = js.native
  def add(element: org.scalajs.dom.HTMLOptionElement, before: org.scalajs.dom.HTMLElement): Unit = js.native
  def add(element: org.scalajs.dom.HTMLOptionElement, before: Double): Unit = js.native
  
  /**
    * Returns the number of elements in the collection.
    *
    * When set to a smaller number, truncates the number of option elements in the corresponding container.
    *
    * When set to a greater number, adds new blank option elements to that container.
    */
  /* standard dom */
  var length: Double = js.native
  
  /** Removes the item with index index from the collection. */
  /* standard dom */
  def remove(index: Double): Unit = js.native
  
  /**
    * Returns the index of the first selected item, if any, or −1 if there is no selected item.
    *
    * Can be set, to change the selection.
    */
  /* standard dom */
  var selectedIndex: Double = js.native
}
