package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.libCoreTransactionsClientTransactionMod.ClientTransaction
import typingsJapgolly.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typingsJapgolly.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTransactionsNonInviteClientTransactionMod {
  
  @JSImport("sip.js/lib/core/transactions/non-invite-client-transaction", "NonInviteClientTransaction")
  @js.native
  open class NonInviteClientTransaction protected () extends ClientTransaction {
    /**
      * Constructor
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2
      * @param request - The outgoing Non-INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: OutgoingRequestMessage, transport: Transport, user: ClientTransactionUser) = this()
    
    /* private */ var F: Any = js.native
    
    /* private */ var K: Any = js.native
    
    /**
      * The client transaction SHOULD inform the TU that a transport failure has occurred,
      * and the client transaction SHOULD transition directly to the "Terminated" state.
      * The TU will handle the fail over mechanisms described in [4].
      * https://tools.ietf.org/html/rfc3261#section-17.1.4
      * @param error - Transport error
      */
    /* protected */ def onTransportError(error: js.Error): Unit = js.native
    
    /**
      * Execute a state transition.
      * @param newState - New state.
      */
    /* private */ var stateTransition: Any = js.native
    
    /**
      * If Timer F fires while the client transaction is still in the
      * "Trying" state, the client transaction SHOULD inform the TU about the
      * timeout, and then it SHOULD enter the "Terminated" state.
      * If timer F fires while in the "Proceeding" state, the TU MUST be informed of
      * a timeout, and the client transaction MUST transition to the terminated state.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2.2
      */
    /* private */ var timerF: Any = js.native
    
    /**
      * If Timer K fires while in this (COMPLETED) state, the client transaction
      * MUST transition to the "Terminated" state.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2.2
      */
    /* private */ var timerK: Any = js.native
  }
}
