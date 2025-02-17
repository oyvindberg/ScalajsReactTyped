package typingsJapgolly.winjs.global.WinJS.UI

import org.scalajs.dom.HTMLElement
import typingsJapgolly.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions to load HTML content programmatically.
**/
object Fragments {
  
  @JSGlobal("WinJS.UI.Fragments")
  @js.native
  val ^ : js.Any = js.native
  
  //#region Functions
  /**
    * Starts loading the fragment at the specified location. The returned promise completes when the fragment is ready to be copied.
    * @param href The URI that contains the fragment to be copied.
    * @returns A promise that is fulfilled when the fragment has been prepared for copying.
    **/
  inline def cache(href: String): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(href.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Removes any cached information about the specified fragment. This method does not unload any scripts or styles that are referenced by the fragment.
    * @param href The URI that contains the fragment to be cleared. If no URI is provided, the entire contents of the cache are cleared.
    **/
  inline def clearCache(href: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(href.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCache(href: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(href.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Loads the contents of the specified URI into the specified element without copying it.
    * @param href The URI that contains the fragment to copy.
    * @param element Optional. The element to which the fragment is appended.
    * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The element is not added to the cache. See also rendercopy, where the element is added to the cache.
    **/
  inline def render(href: String): Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(href.asInstanceOf[js.Any]).asInstanceOf[Promise[HTMLElement]]
  inline def render(href: String, element: HTMLElement): Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(href.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Promise[HTMLElement]]
  
  /**
    * Loads and copies the contents of the specified URI into the specified element.
    * @param href The URI that contains the fragment to copy.
    * @param target The element to which the fragment is appended.
    * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The fragment is added to the cache. See also render, where the element is not added to the cache.
    **/
  inline def renderCopy(href: String): Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderCopy")(href.asInstanceOf[js.Any]).asInstanceOf[Promise[HTMLElement]]
  inline def renderCopy(href: String, target: HTMLElement): Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCopy")(href.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[HTMLElement]]
  inline def renderCopy(href: HTMLElement): Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderCopy")(href.asInstanceOf[js.Any]).asInstanceOf[Promise[HTMLElement]]
  inline def renderCopy(href: HTMLElement, target: HTMLElement): Promise[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCopy")(href.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[HTMLElement]]
}
