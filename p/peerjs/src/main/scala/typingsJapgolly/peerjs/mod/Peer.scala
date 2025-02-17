package typingsJapgolly.peerjs.mod

import org.scalajs.dom.MediaStream
import typingsJapgolly.eventemitter3.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peerjs", "Peer")
@js.native
/**
  * A peer can connect to other peers and listen for connections.
  */
open class Peer ()
  extends StObject
     with EventEmitter[PeerEvents, Any] {
  /**
    * A peer can connect to other peers and listen for connections.
    * @param id Other peers can connect to this peer using the provided ID.
    *     If no ID is given, one will be generated by the brokering server.
    * @param options for specifying details about PeerServer
    */
  def this(id: String) = this()
  /**
    * A peer can connect to other peers and listen for connections.
    * @param options for specifying details about PeerServer
    */
  def this(options: PeerOptions) = this()
  def this(id: String, options: PeerOptions) = this()
  
  /** Retrieve messages from lost message store */
  def _getMessages(connectionId: String): js.Array[ServerMessage] = js.native
  
  def _removeConnection(connection: DataConnection): Unit = js.native
  def _removeConnection(connection: MediaConnection): Unit = js.native
  
  /**
    * Calls the remote peer specified by id and returns a media connection.
    * @param peer The brokering ID of the remote peer (their peer.id).
    * @param stream The caller's media stream
    * @param options Metadata associated with the connection, passed in by whoever initiated the connection.
    */
  def call(peer: String, stream: MediaStream): MediaConnection = js.native
  def call(peer: String, stream: MediaStream, options: CallOption): MediaConnection = js.native
  
  /**
    * Connects to the remote peer specified by id and returns a data connection.
    * @param peer The brokering ID of the remote peer (their peer.id).
    * @param options for specifying details about Peer Connection
    */
  def connect(peer: String): DataConnection = js.native
  def connect(peer: String, options: PeerConnectOption): DataConnection = js.native
  
  /**
    * A hash of all connections associated with this peer, keyed by the remote peer's ID.
    * @deprecated
    * Return type will change from Object to Map<string,[]>
    */
  def connections: js.Object = js.native
  
  /**
    * Destroys the Peer: closes all active connections as well as the connection
    *  to the server.
    * Warning: The peer can no longer create or accept connections after being
    *  destroyed.
    */
  def destroy(): Unit = js.native
  
  /**
    * true if this peer and all of its connections can no longer be used.
    */
  def destroyed: Boolean = js.native
  
  /**
    * Disconnects the Peer's connection to the PeerServer. Does not close any
    *  active connections.
    * Warning: The peer can no longer create or accept connections after being
    *  disconnected. It also cannot reconnect to the server.
    */
  def disconnect(): Unit = js.native
  
  /**
    * false if there is an active connection to the PeerServer.
    */
  def disconnected: Boolean = js.native
  
  /** Emits a typed error message. */
  def emitError(`type`: PeerErrorType, err: String): Unit = js.native
  def emitError(`type`: PeerErrorType, err: js.Error): Unit = js.native
  
  /** Retrieve a data/media connection for this peer. */
  def getConnection(peerId: String, connectionId: String): Null | DataConnection | MediaConnection = js.native
  
  /**
    * The brokering ID of this peer
    */
  def id: String = js.native
  
  /**
    * Get a list of available peer IDs. If you're running your own server, you'll
    * want to set allow_discovery: true in the PeerServer options. If you're using
    * the cloud server, email team@peerjs.com to get the functionality enabled for
    * your key.
    */
  def listAllPeers(): Unit = js.native
  def listAllPeers(cb: js.Function1[/* _ */ js.Array[Any], Unit]): Unit = js.native
  
  def open: Boolean = js.native
  
  def options: PeerOptions = js.native
  
  /** Attempts to reconnect with the same ID. */
  def reconnect(): Unit = js.native
  
  def socket: Socket = js.native
}
