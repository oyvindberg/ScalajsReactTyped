package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-thumbnail`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonThumbnail")
@js.native
open class IonThumbnail protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonThumbnail {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonThumbnail {
  
  @JSImport("@ionic/angular/directives/proxies", "IonThumbnail")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonThumbnail.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonThumbnail, 
    `ion-thumbnail`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonThumbnail, 
      `ion-thumbnail`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonThumbnail.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonThumbnail, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonThumbnail, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
