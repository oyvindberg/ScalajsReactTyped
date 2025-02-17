package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to watch for changes being made to the DOM tree. It is designed as a replacement for the older Mutation Events feature which was part of the DOM3 Events specification. */
@js.native
trait MutationObserver extends StObject {
  
  /** Stops observer from observing any mutations. Until the observe() method is used again, observer's callback will not be invoked. */
  /* standard dom */
  def disconnect(): Unit = js.native
  
  /**
    * Instructs the user agent to observe a given target (a node) and report any mutations based on the criteria given by options (an object).
    *
    * The options argument allows for setting mutation observation options via object members.
    */
  /* standard dom */
  def observe(target: org.scalajs.dom.Node): Unit = js.native
  def observe(target: org.scalajs.dom.Node, options: org.scalajs.dom.MutationObserverInit): Unit = js.native
  
  /** Empties the record queue and returns what was in there. */
  /* standard dom */
  def takeRecords(): js.Array[org.scalajs.dom.MutationRecord] = js.native
}
