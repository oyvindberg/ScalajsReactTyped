package typingsJapgolly.blueprintjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod.HotkeysEvents
import typingsJapgolly.react.mod.ErrorInfo
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidMount extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Object, /* nextContext */ Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ Any, Unit]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  def componentDidMount(): Unit = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ js.Object, 
      /* prevState */ js.Object, 
      /* snapshot */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Object, /* nextContext */ Any, Unit]] = js.native
  
  def componentWillUnmount(): Unit = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ Any, Unit]
  ] = js.native
  
  var context: Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ js.Object, /* prevState */ js.Object, Any]] = js.native
  
  /** @internal */
  var globalHotkeysEvents: HotkeysEvents = js.native
  
  /** @internal */
  var localHotkeysEvents: HotkeysEvents = js.native
  
  val props: ReadonlyReadonlychildrenR = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): Element = js.native
  
  /**
    * Components decorated with the `@HotkeysTarget` decorator must implement
    * this method, and it must return a `Hotkeys` React element.
    */
  def renderHotkeys(): japgolly.scalajs.react.facade.React.Element = js.native
  
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K])): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K]), callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ js.Object, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ js.Object, 
      js.Object | (Pick[js.Object, K]) | Null
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ Any, Boolean]
  ] = js.native
}
