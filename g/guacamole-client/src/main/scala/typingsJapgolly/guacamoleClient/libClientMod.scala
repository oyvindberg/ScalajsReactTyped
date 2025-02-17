package typingsJapgolly.guacamoleClient

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`1`
import typingsJapgolly.guacamoleClient.libAudioPlayerMod.AudioPlayer
import typingsJapgolly.guacamoleClient.libClientMod.Client.ExportedState
import typingsJapgolly.guacamoleClient.libClientMod.Client.State
import typingsJapgolly.guacamoleClient.libDisplayMod.Display
import typingsJapgolly.guacamoleClient.libGuacCommonMod.Mimetype
import typingsJapgolly.guacamoleClient.libInputStreamMod.InputStream
import typingsJapgolly.guacamoleClient.libObjectMod.Object
import typingsJapgolly.guacamoleClient.libOutputStreamMod.OutputStream
import typingsJapgolly.guacamoleClient.libStatusMod.Status
import typingsJapgolly.guacamoleClient.libTunnelMod.Tunnel
import typingsJapgolly.guacamoleClient.libVideoPlayerMod.VideoPlayer
import typingsJapgolly.guacamoleClient.libVisibleLayerMod.VisibleLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @JSImport("guacamole-client/lib/Client", "Client")
  @js.native
  open class Client protected () extends StObject {
    /**
      * @param tunnel The tunnel to use to send and receive Guacamole instructions.
      */
    def this(tunnel: Tunnel) = this()
    
    /**
      * @description
      * Connects the underlying tunnel of this Guacamole.Client, passing the
      * given arbitrary data to the tunnel during the connection process.
      *
      * @param data Arbitrary connection data to be sent to the underlying
      *             tunnel during the connection process.
      * @throws {Guacamole.Status} If an error occurs during connection.
      */
    def connect(): Unit = js.native
    def connect(data: Any): Unit = js.native
    
    /**
      * Opens a new argument value stream for writing, having the given
      * parameter name and mimetype, requesting that the connection parameter
      * with the given name be updated to the value described by the contents
      * of the following stream. The instruction necessary to create this stream
      * will automatically be sent.
      *
      * @param mimetype The mimetype of the data being sent.
      * @param name The name of the connection parameter to attempt to update.
      */
    def createArgumentValueStream(mimetype: Mimetype, name: String): OutputStream = js.native
    
    /**
      * Opens a new audio stream for writing, where audio data having the give
      * mimetype will be sent along the returned stream. The instruction
      * necessary to create this stream will automatically be sent.
      *
      * @param mimetype The mimetype of the audio data that will be sent along the returned stream.
      */
    def createAudioStream(mimetype: Mimetype): OutputStream = js.native
    
    /**
      * Opens a new clipboard object for writing, having the given mimetype. The
      * instruction necessary to create this stream will automatically be sent.
      *
      * @param mimetype The mimetype of the data being sent.
      * @param name The name of the pipe.
      */
    def createClipboardStream(mimetype: Mimetype, name: String): OutputStream = js.native
    
    /**
      * Opens a new file for writing, having the given index, mimetype and
      * filename. The instruction necessary to create this stream will
      * automatically be sent.
      *
      * @param mimetype The mimetype of the file being sent.
      * @param filename The filename of the file being sent.
      */
    def createFileStream(mimetype: Mimetype, filename: String): OutputStream = js.native
    
    /**
      * Creates a new output stream associated with the given object and having
      * the given mimetype and name. The legality of a mimetype and name is
      * dictated by the object itself. The instruction necessary to create this
      * stream will automatically be sent.
      *
      * @param index The index of the object for which the output stream is being created.
      * @param mimetype The mimetype of the data which will be sent to the output stream.
      * @param name The defined name of an output stream within the given object.
      * @returns An output stream which will write blobs to the named output stream of the given object.
      */
    def createObjectOutputStream(index: Double, mimetype: Mimetype, name: String): OutputStream = js.native
    
    /**
      * Allocates an available stream index and creates a new
      * Guacamole.OutputStream using that index, associating the resulting
      * stream with this Guacamole.Client. Note that this stream will not yet
      * exist as far as the other end of the Guacamole connection is concerned.
      * Streams exist within the Guacamole protocol only when referenced by an
      * instruction which creates the stream, such as a "clipboard", "file", or
      * "pipe" instruction.
      *
      * @returns A new Guacamole.OutputStream with a newly-allocated index and associated with this Guacamole.Client.
      */
    def createOutputStream(): OutputStream = js.native
    
    /**
      * Opens a new pipe for writing, having the given name and mimetype. The
      * instruction necessary to create this stream will automatically be sent.
      *
      * @param mimetype The mimetype of the data being sent.
      * @param name The name of the pipe.
      */
    def createPipeStream(mimetype: Mimetype, name: String): OutputStream = js.native
    
    /**
      * Sends a disconnect instruction to the server and closes the tunnel.
      */
    def disconnect(): Unit = js.native
    
    /**
      * Marks a currently-open stream as complete. The other end of the
      * Guacamole connection will be notified via an "end" instruction that the
      * stream is closed, and the index will be made available for reuse in
      * future streams.
      *
      * @param index The index of the stream to end.
      */
    def endStream(index: Double): Unit = js.native
    
    /**
      * Produces an opaque representation of Guacamole.Client state which can be
      * later imported through a call to importState(). This object is
      * effectively an independent, compressed snapshot of protocol and display
      * state. Invoking this function implicitly flushes the display.
      *
      * @param callback
      *     Callback which should be invoked once the state object is ready. The
      *     state object will be passed to the callback as the sole parameter.
      *     This callback may be invoked immediately, or later as the display
      */
    def exportState(callback: js.Function1[/* state */ ExportedState, Unit]): Unit = js.native
    
    /**
      * Returns the underlying display of this Guacamole.Client. The display
      * contains an Element which can be added to the DOM, causing the
      * display to become visible.
      *
      * @return The underlying display of this Guacamole.Client.
      */
    def getDisplay(): Display = js.native
    
    /**
      * Restores Guacamole.Client protocol and display state based on an opaque
      * object from a prior call to exportState(). The Guacamole.Client instance
      * used to export that state need not be the same as this instance.
      *
      * @param state An opaque representation of Guacamole.Client state from a prior call to exportState().
      *
      * @param callback The function to invoke when state has finished being imported. This
      * may happen immediately, or later as images within the provided state object are loaded.
      */
    def importState(state: ExportedState): Unit = js.native
    def importState(state: ExportedState, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Fired when the current value of a connection parameter is being exposed
      * by the server.
      *
      * @event
      * @param stream The stream that will receive connection parameter data from the server.
      * @param mimetype The mimetype of the data which will be received.
      * @param name The name of the connection parameter whose value is being exposed.
      */
    var onargv: Null | (js.Function3[/* parameterStream */ InputStream, /* mimetype */ Mimetype, /* name */ String, Unit]) = js.native
    
    /**
      * Fired when a audio stream is created. The stream provided to this event
      * handler will contain its own event handlers for received data.
      *
      * @event
      * @param audioStream The stream that will receive audio data from the server.
      * @param mimetype The mimetype of the audio data which will be received.
      * @return
      * An object which implements the Guacamole.AudioPlayer interface and
      * has been initialied to play the data in the provided stream, or null
      * if the built-in audio players of the Guacamole client should be used.
      */
    var onaudio: Null | (js.Function2[/* audioStream */ InputStream, /* mimetype */ Mimetype, AudioPlayer | Null]) = js.native
    
    /**
      * Fired when the clipboard of the remote client is changing.
      *
      * @event
      * @param stream The stream that will receive clipboard data from the server.
      * @param mimetype The mimetype of the data which will be received.
      */
    var onclipboard: Null | (js.Function2[/* clipboardStream */ InputStream, /* mimetype */ Mimetype, Unit]) = js.native
    
    /**
      * Fired when an error is reported by the remote client, and the connection
      * is being closed.
      *
      * @event
      * @param status A status object which describes the error.
      */
    var onerror: Null | (js.Function1[/* status */ Status, Unit]) = js.native
    
    /**
      * Fired when a file stream is created. The stream provided to this event
      * handler will contain its own event handlers for received data.
      *
      * @event
      * @param stream The stream that will receive data from the server.
      * @param mimetype The mimetype of the file received.
      * @param filename The name of the file received.
      */
    var onfile: Null | (js.Function3[/* fileStream */ InputStream, /* mimetype */ Mimetype, /* name */ String, Unit]) = js.native
    
    /**
      * Fired when a filesystem object is created. The object provided to this
      * event handler will contain its own event handlers and functions for
      * requesting and handling data.
      *
      * @event
      * @param object The created filesystem object.
      * @param name The name of the filesystem.
      */
    var onfilesystem: Null | (js.Function2[/* object */ Object, /* name */ String, Unit]) = js.native
    
    /**
      * Fired when the remote client sends a name update.
      *
      * @event
      * @param name The new name of this client.
      */
    var onname: Null | (js.Function1[/* name */ String, Unit]) = js.native
    
    /**
      * Fired when a pipe stream is created. The stream provided to this event
      * handler will contain its own event handlers for received data;
      *
      * @event
      * @param stream The stream that will receive data from the server.
      * @param mimetype The mimetype of the data which will be received.
      * @param name The name of the pipe.
      */
    var onpipe: Null | (js.Function3[/* pipeStream */ InputStream, /* mimetype */ Mimetype, /* name */ String, Unit]) = js.native
    
    /**
      * Fired whenever the state of this Guacamole.Client changes.
      *
      * @event
      * @param state The new state of the client.
      */
    var onstatechange: Null | (js.Function1[/* state */ State, Unit]) = js.native
    
    /**
      * Fired whenever a sync instruction is received from the server, indicating
      * that the server is finished processing any input from the client and
      * has sent any results.
      *
      * @event
      * @param timestamp The timestamp associated with the sync instruction.
      */
    var onsync: Null | (js.Function1[/* timestramp */ Double, Unit]) = js.native
    
    /**
      * Fired when a video stream is created. The stream provided to this event
      * handler will contain its own event handlers for received data.
      *
      * @event
      * @param videoStream The stream that will receive video data from the server.
      * @param layer
      * The destination layer on which the received video data should be
      * played. It is the responsibility of the Guacamole.VideoPlayer
      * implementation to play the received data within this layer.
      * @param mimetype
      * The mimetype of the video data which will be received.
      * @return
      * An object which implements the Guacamole.VideoPlayer interface and
      * has been initialied to play the data in the provided stream, or null
      * if the built-in video players of the Guacamole client should be used.
      */
    var onvideo: Null | (js.Function3[
        /* videoStream */ InputStream, 
        /* layer */ VisibleLayer, 
        /* mimetype */ Mimetype, 
        VideoPlayer | Null
      ]) = js.native
    
    /**
      * Requests read access to the input stream having the given name. If
      * successful, a new input stream will be created.
      *
      * @param index The index of the object from which the input stream is being requested.
      * @param name The name of the input stream to request.
      */
    def requestObjectInputStream(index: Double, name: String): OutputStream = js.native
    
    /**
      * Acknowledge receipt of a blob on the stream with the given index.
      *
      * @param index The index of the stream associated with the received blob.
      * @param message A human-readable message describing the error or status.
      * @param code The error code, if any, or 0 for success.
      */
    def sendAck(index: Double, message: String, code: Double): Unit = js.native
    
    /**
      * Given the index of a file, writes a blob of data to that file.
      *
      * @param index The index of the file to write to.
      * @param data Base64-encoded data to write to the file.
      */
    def sendBlob(index: Double, data64: String): Unit = js.native
    
    /**
      * Sends a key event having the given properties as if the user
      * pressed or released a key.
      *
      * @param pressed Whether the key is pressed (1) or released (0).
      * @param keysym The keysym of the key being pressed or released.
      */
    def sendKeyEvent(pressed: `0` | `1`, keysym: Double): Unit = js.native
    
    /**
      * Sends a mouse event having the properties provided by the given mouse state.
      *
      * @param mouseState The state of the mouse to send in the mouse event.
      */
    def sendMouseState(state: typingsJapgolly.guacamoleClient.libMouseMod.Mouse.State): Unit = js.native
    
    /**
      * Sends the current size of the screen.
      *
      * @param width The width of the screen.
      * @param height The height of the screen.
      */
    def sendSize(width: Double, height: Double): Unit = js.native
  }
  object Client {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.guacamoleClient.libClientMod.Client.ExportLayerBase
      - typingsJapgolly.guacamoleClient.anon.ExportLayerBasexnumberynu
    */
    trait ExportLayer extends StObject
    object ExportLayer {
      
      inline def ExportLayerBase(height: Double, width: Double): typingsJapgolly.guacamoleClient.libClientMod.Client.ExportLayerBase = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.guacamoleClient.libClientMod.Client.ExportLayerBase]
      }
      
      inline def ExportLayerBasexnumberynu(
        alpha: Double,
        height: Double,
        matrix: Any,
        parent: Any,
        width: Double,
        x: Double,
        y: Double,
        z: Double
      ): typingsJapgolly.guacamoleClient.anon.ExportLayerBasexnumberynu = {
        val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.guacamoleClient.anon.ExportLayerBasexnumberynu]
      }
    }
    
    // DISCONNECTED
    trait ExportLayerBase
      extends StObject
         with ExportLayer {
      
      var height: Double
      
      var url: js.UndefOr[String] = js.undefined
      
      var width: Double
    }
    object ExportLayerBase {
      
      inline def apply(height: Double, width: Double): ExportLayerBase = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExportLayerBase]
      }
      
      extension [Self <: ExportLayerBase](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    trait ExportedState extends StObject {
      
      var currentState: State
      
      var currentTimestamp: Double
      
      var layers: NumberDictionary[ExportLayer]
    }
    object ExportedState {
      
      inline def apply(currentState: State, currentTimestamp: Double, layers: NumberDictionary[ExportLayer]): ExportedState = {
        val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], currentTimestamp = currentTimestamp.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExportedState]
      }
      
      extension [Self <: ExportedState](x: Self) {
        
        inline def setCurrentState(value: State): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
        
        inline def setCurrentTimestamp(value: Double): Self = StObject.set(x, "currentTimestamp", value.asInstanceOf[js.Any])
        
        inline def setLayers(value: NumberDictionary[ExportLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`1`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`2`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`3`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`4`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`5`
    */
    trait State extends StObject
    object State {
      
      inline def `0`: typingsJapgolly.guacamoleClient.guacamoleClientInts.`0` = 0.asInstanceOf[typingsJapgolly.guacamoleClient.guacamoleClientInts.`0`]
      
      inline def `1`: typingsJapgolly.guacamoleClient.guacamoleClientInts.`1` = 1.asInstanceOf[typingsJapgolly.guacamoleClient.guacamoleClientInts.`1`]
      
      inline def `2`: typingsJapgolly.guacamoleClient.guacamoleClientInts.`2` = 2.asInstanceOf[typingsJapgolly.guacamoleClient.guacamoleClientInts.`2`]
      
      inline def `3`: typingsJapgolly.guacamoleClient.guacamoleClientInts.`3` = 3.asInstanceOf[typingsJapgolly.guacamoleClient.guacamoleClientInts.`3`]
      
      inline def `4`: typingsJapgolly.guacamoleClient.guacamoleClientInts.`4` = 4.asInstanceOf[typingsJapgolly.guacamoleClient.guacamoleClientInts.`4`]
      
      inline def `5`: typingsJapgolly.guacamoleClient.guacamoleClientInts.`5` = 5.asInstanceOf[typingsJapgolly.guacamoleClient.guacamoleClientInts.`5`]
    }
  }
}
