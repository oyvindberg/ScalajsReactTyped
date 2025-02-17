package typingsJapgolly.samchon

import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import typingsJapgolly.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesParallelPrinvokehistoryMod {
  
  @JSImport("samchon/templates/parallel/PRInvokeHistory", "PRInvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class PRInvokeHistory () extends InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel process*.
      */
    def this(invoke: Invoke) = this()
    
    /**
      * Compute number of allocated pieces.
      */
    def computeSize(): Double = js.native
    
    /**
      * @hidden
      */
    /* private */ var first: Any = js.native
    
    /**
      * Get initial piece's index.
      *
      * Returns initial piece's index in the section of requested *parallel process*.
      *
      * @return The initial index.
      */
    def getFirst(): Double = js.native
    
    /**
      * Get final piece's index.
      *
      * Returns initial piece's index in the section of requested *parallel process*. The range used is
      * [*first*, *last*), which contains all the pieces' indices between *first* and *last*, including the piece
      * pointed by index *first*, but not the piece pointed by the index *last*.
      *
      * @return The final index.
      */
    def getLast(): Double = js.native
    
    /**
      * @hidden
      */
    /* private */ var last: Any = js.native
  }
}
