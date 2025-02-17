package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.audioListenerCreated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.audioListenerWillBeDestroyed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.audioNodeCreated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.audioNodeWillBeDestroyed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.audioParamCreated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.audioParamWillBeDestroyed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.contextChanged
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.contextCreated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.contextWillBeDestroyed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.nodeParamConnected
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.nodeParamDisconnected
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.nodesConnected
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.nodesDisconnected
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.AudioListenerCreatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.AudioListenerWillBeDestroyedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.AudioNodeCreatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.AudioNodeWillBeDestroyedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.AudioParamCreatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.AudioParamWillBeDestroyedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.ContextChangedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.ContextCreatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.ContextWillBeDestroyedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.GetRealtimeDataResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.NodeParamConnectedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.NodeParamDisconnectedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.NodesConnectedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio.NodesDisconnectedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAudioApi extends StObject {
  
  /**
    * Disables the WebAudio domain.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables the WebAudio domain and starts sending context lifetime events.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Fetch the realtime data from the registered contexts.
    */
  def getRealtimeData(params: GetRealtimeDataRequest): js.Promise[GetRealtimeDataResponse] = js.native
  
  /**
    * Notifies that the construction of an AudioListener has finished.
    */
  @JSName("on")
  def on_audioListenerCreated(event: audioListenerCreated, listener: js.Function1[/* params */ AudioListenerCreatedEvent, Unit]): Unit = js.native
  /**
    * Notifies that a new AudioListener has been created.
    */
  @JSName("on")
  def on_audioListenerWillBeDestroyed(
    event: audioListenerWillBeDestroyed,
    listener: js.Function1[/* params */ AudioListenerWillBeDestroyedEvent, Unit]
  ): Unit = js.native
  /**
    * Notifies that a new AudioNode has been created.
    */
  @JSName("on")
  def on_audioNodeCreated(event: audioNodeCreated, listener: js.Function1[/* params */ AudioNodeCreatedEvent, Unit]): Unit = js.native
  /**
    * Notifies that an existing AudioNode has been destroyed.
    */
  @JSName("on")
  def on_audioNodeWillBeDestroyed(
    event: audioNodeWillBeDestroyed,
    listener: js.Function1[/* params */ AudioNodeWillBeDestroyedEvent, Unit]
  ): Unit = js.native
  /**
    * Notifies that a new AudioParam has been created.
    */
  @JSName("on")
  def on_audioParamCreated(event: audioParamCreated, listener: js.Function1[/* params */ AudioParamCreatedEvent, Unit]): Unit = js.native
  /**
    * Notifies that an existing AudioParam has been destroyed.
    */
  @JSName("on")
  def on_audioParamWillBeDestroyed(
    event: audioParamWillBeDestroyed,
    listener: js.Function1[/* params */ AudioParamWillBeDestroyedEvent, Unit]
  ): Unit = js.native
  /**
    * Notifies that existing BaseAudioContext has changed some properties (id stays the same)..
    */
  @JSName("on")
  def on_contextChanged(event: contextChanged, listener: js.Function1[/* params */ ContextChangedEvent, Unit]): Unit = js.native
  /**
    * Notifies that a new BaseAudioContext has been created.
    */
  @JSName("on")
  def on_contextCreated(event: contextCreated, listener: js.Function1[/* params */ ContextCreatedEvent, Unit]): Unit = js.native
  /**
    * Notifies that an existing BaseAudioContext will be destroyed.
    */
  @JSName("on")
  def on_contextWillBeDestroyed(
    event: contextWillBeDestroyed,
    listener: js.Function1[/* params */ ContextWillBeDestroyedEvent, Unit]
  ): Unit = js.native
  /**
    * Notifies that an AudioNode is connected to an AudioParam.
    */
  @JSName("on")
  def on_nodeParamConnected(event: nodeParamConnected, listener: js.Function1[/* params */ NodeParamConnectedEvent, Unit]): Unit = js.native
  /**
    * Notifies that an AudioNode is disconnected to an AudioParam.
    */
  @JSName("on")
  def on_nodeParamDisconnected(
    event: nodeParamDisconnected,
    listener: js.Function1[/* params */ NodeParamDisconnectedEvent, Unit]
  ): Unit = js.native
  /**
    * Notifies that two AudioNodes are connected.
    */
  @JSName("on")
  def on_nodesConnected(event: nodesConnected, listener: js.Function1[/* params */ NodesConnectedEvent, Unit]): Unit = js.native
  /**
    * Notifies that AudioNodes are disconnected. The destination can be null, and it means all the outgoing connections from the source are disconnected.
    */
  @JSName("on")
  def on_nodesDisconnected(event: nodesDisconnected, listener: js.Function1[/* params */ NodesDisconnectedEvent, Unit]): Unit = js.native
}
