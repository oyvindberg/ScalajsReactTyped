package typingsJapgolly.ionicReact.anon

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.ionicReact.distTypesComponentsNavigationIonBackButtonMod.Props
import typingsJapgolly.ionicReact.distTypesContextsNavContextMod.NavContextState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.react.mod.ErrorInfo
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickButton extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Props, /* nextContext */ Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Props, /* nextState */ js.Object, /* nextContext */ Any, Unit]
  ] = js.native
  
  def clickButton(e: ReactMouseEventFrom[Element]): Unit = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ Props, /* prevState */ js.Object, /* snapshot */ js.UndefOr[Any], Unit]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Props, /* nextContext */ Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Props, /* nextState */ js.Object, /* nextContext */ Any, Unit]
  ] = js.native
  
  var context: ContextType[Context[NavContextState]] = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ Props, /* prevState */ js.Object, Any]] = js.native
  
  val props: Props & ReadonlychildrenReactNode = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): typingsJapgolly.react.mod.global.JSX.Element = js.native
  
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K])): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K]), callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ Props, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ Props, 
      js.Object | (Pick[js.Object, K]) | Null
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Props, /* nextState */ js.Object, /* nextContext */ Any, Boolean]
  ] = js.native
}
