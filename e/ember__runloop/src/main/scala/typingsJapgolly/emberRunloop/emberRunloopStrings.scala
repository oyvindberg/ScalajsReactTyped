package typingsJapgolly.emberRunloop

import typingsJapgolly.emberRunloop.privateTypesMod.EmberRunQueues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberRunloopStrings {
  
  @js.native
  sealed trait actions
    extends StObject
       with EmberRunQueues
  inline def actions: actions = "actions".asInstanceOf[actions]
  
  @js.native
  sealed trait afterRender
    extends StObject
       with EmberRunQueues
  inline def afterRender: afterRender = "afterRender".asInstanceOf[afterRender]
  
  @js.native
  sealed trait destroy
    extends StObject
       with EmberRunQueues
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait render
    extends StObject
       with EmberRunQueues
  inline def render: render = "render".asInstanceOf[render]
  
  @js.native
  sealed trait routerTransitions
    extends StObject
       with EmberRunQueues
  inline def routerTransitions: routerTransitions = "routerTransitions".asInstanceOf[routerTransitions]
  
  @js.native
  sealed trait sync
    extends StObject
       with EmberRunQueues
  inline def sync: sync = "sync".asInstanceOf[sync]
}
