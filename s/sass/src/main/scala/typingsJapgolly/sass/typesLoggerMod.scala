package typingsJapgolly.sass

import japgolly.scalajs.react.Callback
import typingsJapgolly.sass.anon.Deprecation
import typingsJapgolly.sass.anon.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoggerMod {
  
  trait Logger extends StObject {
    
    /**
      * This method is called when Sass emits a debug message due to a [`@debug`
      * rule](https://sass-lang.com/documentation/at-rules/debug).
      *
      * If this is `undefined`, Sass will print debug messages to standard error.
      *
      * @param message - The debug message.
      * @param options.span - The location in the Sass source code that generated this
      * debug message.
      */
    var debug: js.UndefOr[js.Function2[/* message */ String, /* options */ Span, Unit]] = js.undefined
    
    /**
      * This method is called when Sass emits a warning, whether due to a [`@warn`
      * rule](https://sass-lang.com/documentation/at-rules/warn) or a warning
      * generated by the Sass compiler.
      *
      * If this is `undefined`, Sass will print warnings to standard error.
      *
      * @param message - The warning message.
      * @param options.deprecation - Whether this is a deprecation warning.
      * @param options.span - The location in the Sass source code that generated this
      * warning.
      * @param options.stack - The Sass stack trace at the point the warning was issued.
      */
    var warn: js.UndefOr[js.Function2[/* message */ String, /* options */ Deprecation, Unit]] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    @JSImport("sass/types/logger", "Logger.silent")
    @js.native
    val silent: Logger = js.native
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: (/* message */ String, /* options */ Span) => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction2((t0: /* message */ String, t1: /* options */ Span) => (value(t0, t1)).runNow()))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setWarn(value: (/* message */ String, /* options */ Deprecation) => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction2((t0: /* message */ String, t1: /* options */ Deprecation) => (value(t0, t1)).runNow()))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
