package typingsJapgolly.angularUiRouter.mod.core

import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.HookFn
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.HookRegOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "core.RegisteredHook")
@js.native
open class RegisteredHook protected ()
  extends typingsJapgolly.uirouterCore.mod.RegisteredHook {
  def this(
    tranSvc: typingsJapgolly.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typingsJapgolly.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[
        /* hook */ typingsJapgolly.uirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
        Unit
      ]
  ) = this()
  def this(
    tranSvc: typingsJapgolly.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typingsJapgolly.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[
        /* hook */ typingsJapgolly.uirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
        Unit
      ],
    options: HookRegOptions
  ) = this()
}
