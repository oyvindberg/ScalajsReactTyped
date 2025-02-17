package typingsJapgolly.progress

import typingsJapgolly.progress.mod.ProgressBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ProgressBar {
    
    /**
      * Flexible ascii progress bar.
      */
    @JSGlobal("ProgressBar")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.progress.mod.^ {
      def this(format: String, options: ProgressBarOptions) = this()
      /**
        * Initialize a `ProgressBar` with the given `fmt` string and `options` or
        * `total`.
        *
        * Options:
        *   - `total` total number of ticks to complete
        *   - `width` the displayed width of the progress bar defaulting to total
        *   - `stream` the output stream defaulting to stderr
        *   - `complete` completion character defaulting to "="
        *   - `incomplete` incomplete character defaulting to "-"
        *   - `renderThrottle` minimum time between updates in milliseconds defaulting to 16
        *   - `callback` optional function to call when the progress bar completes
        *   - `clear` will clear the progress bar upon termination
        *
        * Tokens:
        *   - `:bar` the progress bar itself
        *   - `:current` current tick number
        *   - `:total` total ticks
        *   - `:elapsed` time elapsed in seconds
        *   - `:percent` completion percentage
        *   - `:eta` eta in seconds
        */
      def this(format: String, total: Double) = this()
    }
  }
}
