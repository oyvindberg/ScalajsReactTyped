package typingsJapgolly.reactNative

import org.scalajs.dom.EventTarget
import typingsJapgolly.reactNative.reactNativeStrings.abort
import typingsJapgolly.reactNative.reactNativeStrings.error
import typingsJapgolly.reactNative.reactNativeStrings.load
import typingsJapgolly.reactNative.reactNativeStrings.loadend
import typingsJapgolly.reactNative.reactNativeStrings.loadstart
import typingsJapgolly.reactNative.reactNativeStrings.progress
import typingsJapgolly.reactNative.reactNativeStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventTarget extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  
  var onabort: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  var onerror: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  var onload: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  var onloadend: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  var onloadstart: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  var onprogress: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  var ontimeout: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], Any]
  ): Unit = js.native
}
