package typingsJapgolly.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreClockMod {
  
  @JSImport("three/src/core/Clock", "Clock")
  @js.native
  /**
    * @param [autoStart=true] Automatically start the clock.
    */
  open class Clock () extends StObject {
    def this(autoStart: Boolean) = this()
    
    /**
      * If set, starts the clock automatically when the first update is called.
      * @default true
      */
    var autoStart: Boolean = js.native
    
    /**
      * When the clock is running, It holds the time elapsed between the start of the clock to the previous update.
      * This parameter is in seconds of three decimal places.
      * @default 0
      */
    var elapsedTime: Double = js.native
    
    /**
      * Get the seconds passed since the last call to this method.
      */
    def getDelta(): Double = js.native
    
    /**
      * Get the seconds passed since the clock started.
      */
    def getElapsedTime(): Double = js.native
    
    /**
      * When the clock is running, It holds the previous time from a update.
      * This counted from the number of milliseconds elapsed since 1 January 1970 00:00:00 UTC.
      * @default 0
      */
    var oldTime: Double = js.native
    
    /**
      * This property keeps track whether the clock is running or not.
      * @default false
      */
    var running: Boolean = js.native
    
    /**
      * Starts clock.
      */
    def start(): Unit = js.native
    
    /**
      * When the clock is running, It holds the starttime of the clock.
      * This counted from the number of milliseconds elapsed since 1 January 1970 00:00:00 UTC.
      * @default 0
      */
    var startTime: Double = js.native
    
    /**
      * Stops clock.
      */
    def stop(): Unit = js.native
  }
}
