package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.CompareWith
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-select`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSelect")
@js.native
open class IonSelect protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonSelect {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted when the select loses focus.
    */
  var ionBlur: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the selection is cancelled.
    */
  var ionCancel: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the value has changed.
    */
  var ionChange: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the overlay is dismissed.
    */
  var ionDismiss: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the select has focus.
    */
  var ionFocus: EventEmitter[CustomEvent] = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonSelect {
  
  @JSImport("@ionic/angular/directives/proxies", "IonSelect")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonSelect.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonSelect, 
    `ion-select`, 
    scala.Nothing, 
    CompareWith, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonSelect, 
      `ion-select`, 
      scala.Nothing, 
      CompareWith, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonSelect.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonSelect, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonSelect, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
