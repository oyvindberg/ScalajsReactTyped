package typingsJapgolly.durandal

import typingsJapgolly.jquery.JQueryDeferred
import typingsJapgolly.jquery.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DurandalDeferred[T] = JQueryDeferred[T]

// By default, Durandal uses JQuery's Defer/Promise implementation, but durandal supports injecting/configuring
// usage of different JavaScript Defer/Promise libraries (f.ex. Q or ES6 Promise polyfills).
// You might therefore want to use a different interface from a community typings file or your custom unified interface.
// When using f.ex. Q as Defer/Promise library replace the lines below with:
// <reference types="q" />
// interface DurandalPromise<T> extends Q.Promise<T>
// interface DurandalDeferred<T> extends Q.Deferred<T>
type DurandalPromise[T] = JQueryPromise[T]
