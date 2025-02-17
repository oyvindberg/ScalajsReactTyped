package typingsJapgolly.parse.mod

import typingsJapgolly.parse.mod.global.Parse.Attributes
import typingsJapgolly.parse.mod.global.Parse.FullOptions
import typingsJapgolly.parse.mod.global.Parse.SuccessFailureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
object FacebookUtils {
  
  @JSImport("parse", "FacebookUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isLinked(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def link(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes], permissions: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def link(
    user: typingsJapgolly.parse.mod.global.Parse.User[Attributes],
    permissions: Any,
    options: SuccessFailureOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logIn(permissions: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logIn(permissions: Any, options: FullOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlink(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unlink(user: typingsJapgolly.parse.mod.global.Parse.User[Attributes], options: SuccessFailureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
