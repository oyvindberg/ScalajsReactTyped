package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.revoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a mechanism for applications to execute when they are not in the foreground. */
object ExtendedExecution {
  
  @js.native
  sealed trait ExtendedExecutionReason extends StObject
  /** Describes the reason for the background execution request. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason")
  @js.native
  object ExtendedExecutionReason extends StObject {
    
    /** To support location tracking. */
    @js.native
    sealed trait locationTracking
      extends StObject
         with ExtendedExecutionReason
    
    /** To save data. */
    @js.native
    sealed trait savingData
      extends StObject
         with ExtendedExecutionReason
    
    /** No reason specified. */
    @js.native
    sealed trait unspecified
      extends StObject
         with ExtendedExecutionReason
  }
  
  @js.native
  sealed trait ExtendedExecutionResult extends StObject
  /** Specifies the possible background execution request result values. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult")
  @js.native
  object ExtendedExecutionResult extends StObject {
    
    /** App execution is allowed. */
    @js.native
    sealed trait allowed
      extends StObject
         with ExtendedExecutionResult
    
    /** App execution is denied. */
    @js.native
    sealed trait denied
      extends StObject
         with ExtendedExecutionResult
  }
  
  @js.native
  sealed trait ExtendedExecutionRevokedReason extends StObject
  /** Describes the reason background execution was revoked. */
  @JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason")
  @js.native
  object ExtendedExecutionRevokedReason extends StObject {
    
    /** The app was resumed while it was executing in the background. */
    @js.native
    sealed trait resumed
      extends StObject
         with ExtendedExecutionRevokedReason
    
    /** Background execution is revoked due to system resources. */
    @js.native
    sealed trait systemPolicy
      extends StObject
         with ExtendedExecutionRevokedReason
  }
  
  /** Provides a mechanism for applications to perform extended execution while they are in the foreground. */
  object Foreground {
    
    @js.native
    sealed trait ExtendedExecutionForegroundReason extends StObject
    /** Describes the reason for the extended execution request. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason")
    @js.native
    object ExtendedExecutionForegroundReason extends StObject {
      
      /** To play audio. */
      @js.native
      sealed trait backgroundAudio
        extends StObject
           with ExtendedExecutionForegroundReason
      
      /** To save data. */
      @js.native
      sealed trait savingData
        extends StObject
           with ExtendedExecutionForegroundReason
      
      /** To perform any task that requires extended execution time. */
      @js.native
      sealed trait unconstrained
        extends StObject
           with ExtendedExecutionForegroundReason
      
      /** No reason specified. */
      @js.native
      sealed trait unspecified
        extends StObject
           with ExtendedExecutionForegroundReason
    }
    
    @js.native
    sealed trait ExtendedExecutionForegroundResult extends StObject
    /** Specifies the possible extended execution request result values. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult")
    @js.native
    object ExtendedExecutionForegroundResult extends StObject {
      
      /** Extended execution is allowed. */
      @js.native
      sealed trait allowed
        extends StObject
           with ExtendedExecutionForegroundResult
      
      /** App execution is not allowed. */
      @js.native
      sealed trait denied
        extends StObject
           with ExtendedExecutionForegroundResult
    }
    
    @js.native
    sealed trait ExtendedExecutionForegroundRevokedReason extends StObject
    /** Describes the reason extended execution was revoked. */
    @JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason")
    @js.native
    object ExtendedExecutionForegroundRevokedReason extends StObject {
      
      /** The app was resumed during its extended execution. */
      @js.native
      sealed trait resumed
        extends StObject
           with ExtendedExecutionForegroundRevokedReason
      
      /** Extended execution is revoked due to system resources. */
      @js.native
      sealed trait systemPolicy
        extends StObject
           with ExtendedExecutionForegroundRevokedReason
    }
    
    /** Passed to the event handler that is invoked when the system revokes extended execution. */
    trait ExtendedExecutionForegroundRevokedEventArgs extends StObject {
      
      /** Gets the reason extended execution was revoked. */
      var reason: ExtendedExecutionForegroundRevokedReason
    }
    object ExtendedExecutionForegroundRevokedEventArgs {
      
      inline def apply(reason: ExtendedExecutionForegroundRevokedReason): ExtendedExecutionForegroundRevokedEventArgs = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtendedExecutionForegroundRevokedEventArgs]
      }
      
      extension [Self <: ExtendedExecutionForegroundRevokedEventArgs](x: Self) {
        
        inline def setReason(value: ExtendedExecutionForegroundRevokedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      }
    }
    
    /** Supports managing a request for extended foreground execution. */
    @js.native
    trait ExtendedExecutionForegroundSession extends StObject {
      
      def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_revoked(`type`: revoked, listener: TypedEventHandler[Any, ExtendedExecutionForegroundRevokedEventArgs]): Unit = js.native
      
      /** Closes the session and removes the application's extended execution capability. */
      def close(): Unit = js.native
      
      /** Gets or sets a string to display in the shell. */
      var description: String = js.native
      
      /** This event occurs when the system revokes extended execution. */
      def onrevoked(ev: ExtendedExecutionForegroundRevokedEventArgs & WinRTEvent[Any]): Unit = js.native
      /** This event occurs when the system revokes extended execution. */
      @JSName("onrevoked")
      var onrevoked_Original: TypedEventHandler[Any, ExtendedExecutionForegroundRevokedEventArgs] = js.native
      
      /** Gets or sets the reason for the extended execution request. */
      var reason: ExtendedExecutionForegroundReason = js.native
      
      def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_revoked(`type`: revoked, listener: TypedEventHandler[Any, ExtendedExecutionForegroundRevokedEventArgs]): Unit = js.native
      
      /**
        * Requests extended execution
        * @return The result of the request.
        */
      def requestExtensionAsync(): IPromiseWithIAsyncOperation[ExtendedExecutionForegroundResult] = js.native
    }
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when the system revokes background execution. */
  trait ExtendedExecutionRevokedEventArgs extends StObject {
    
    /** Gets the reason background execution was revoked. */
    var reason: ExtendedExecutionRevokedReason
  }
  object ExtendedExecutionRevokedEventArgs {
    
    inline def apply(reason: ExtendedExecutionRevokedReason): ExtendedExecutionRevokedEventArgs = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedExecutionRevokedEventArgs]
    }
    
    extension [Self <: ExtendedExecutionRevokedEventArgs](x: Self) {
      
      inline def setReason(value: ExtendedExecutionRevokedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /** Supports managing a request for background execution. */
  @js.native
  trait ExtendedExecutionSession extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_revoked(`type`: revoked, listener: TypedEventHandler[Any, ExtendedExecutionRevokedEventArgs]): Unit = js.native
    
    /** Closes the session and removes the application's capability to run in the background. */
    def close(): Unit = js.native
    
    /** Gets or sets a string to display in the shell. */
    var description: String = js.native
    
    /** The Revoked event occurs when the system revokes background execution. */
    def onrevoked(ev: ExtendedExecutionRevokedEventArgs & WinRTEvent[Any]): Unit = js.native
    /** The Revoked event occurs when the system revokes background execution. */
    @JSName("onrevoked")
    var onrevoked_Original: TypedEventHandler[Any, ExtendedExecutionRevokedEventArgs] = js.native
    
    /** Gets or sets a value to show progress in the shell. */
    var percentProgress: Double = js.native
    
    /** Gets or sets the reason for the for the background execution request. */
    var reason: ExtendedExecutionReason = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_revoked(`type`: revoked, listener: TypedEventHandler[Any, ExtendedExecutionRevokedEventArgs]): Unit = js.native
    
    /**
      * Requests background execution.
      * @return The result of the request.
      */
    def requestExtensionAsync(): IPromiseWithIAsyncOperation[ExtendedExecutionResult] = js.native
  }
}
