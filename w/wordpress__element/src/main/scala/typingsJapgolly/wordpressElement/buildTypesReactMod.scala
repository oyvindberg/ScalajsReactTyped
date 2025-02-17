package typingsJapgolly.wordpressElement

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.DomElement
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.anon.Children
import typingsJapgolly.react.anon.Default
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.DispatchWithoutAction
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.ForwardRefRenderFunction
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.LazyExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.ReactHTMLElement
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.Reducer
import typingsJapgolly.react.mod.ReducerAction
import typingsJapgolly.react.mod.ReducerState
import typingsJapgolly.react.mod.ReducerStateWithoutAction
import typingsJapgolly.react.mod.ReducerWithoutAction
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.react.mod.SuspenseProps
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Partial
import typingsJapgolly.wordpressElement.wordpressElementStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReactMod {
  
  @JSImport("@wordpress/element/build-types/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Sync with `ReactChildren` until `ReactChildren` is removed.
  object Children {
    
    @JSImport("@wordpress/element/build-types/react", "Children")
    @js.native
    val ^ : js.Any = js.native
    
    inline def count(children: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(children.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
    inline def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
    
    inline def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(children.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any]
    
    inline def toArray(children: Node): js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]]]
    inline def toArray(children: js.Array[Node]): js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]]]
  }
  
  // Base component for plain JS classes
  @JSImport("@wordpress/element/build-types/react", "Component")
  @js.native
  open class Component[P, S, SS] protected ()
    extends typingsJapgolly.react.mod.Component[P, S, SS] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
  }
  object Component {
    
    @JSImport("@wordpress/element/build-types/react", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    /* static member */
    @JSImport("@wordpress/element/build-types/react", "Component.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/element/build-types/react", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  @JSImport("@wordpress/element/build-types/react", "StrictMode")
  @js.native
  val StrictMode: ExoticComponent[Children] = js.native
  
  @JSImport("@wordpress/element/build-types/react", "Suspense")
  @js.native
  val Suspense: ExoticComponent[SuspenseProps] = js.native
  
  inline def cloneElement[P](element: Element, props: Partial[P] & Attributes, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def cloneElement[P](element: Element, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  // Custom components
  inline def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: DOMAttributes[T] & P, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: Unit, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  inline def cloneElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def cloneElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Unit, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  // DOM Elements
  // ReactHTMLElement
  inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: Node*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: Node*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  // SVGElement
  inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: Node*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: Node*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  
  // ReactHTMLElement, less specific
  inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: Node*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
  inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: Node*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
  
  inline def concatChildren(childrenArguments: (Any | Null)*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatChildren")(childrenArguments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
  
  inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, js.Object]]) & P,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
  inline def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: Null,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
  inline def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: Unit,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
  inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.wordpressElement.wordpressElementStrings.a, typingsJapgolly.wordpressElement.wordpressElementStrings.abbr, typingsJapgolly.wordpressElement.wordpressElementStrings.address */ Any,
    props: ClassAttributes[T] & P,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.wordpressElement.wordpressElementStrings.a, typingsJapgolly.wordpressElement.wordpressElementStrings.abbr, typingsJapgolly.wordpressElement.wordpressElementStrings.address */ Any,
    props: Null,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.wordpressElement.wordpressElementStrings.a, typingsJapgolly.wordpressElement.wordpressElementStrings.abbr, typingsJapgolly.wordpressElement.wordpressElementStrings.address */ Any,
    props: Unit,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Null, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Unit, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  
  inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: ClassAttributes[T] & P, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Null, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Unit, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  
  inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.wordpressElement.wordpressElementStrings.animate, typingsJapgolly.wordpressElement.wordpressElementStrings.circle, typingsJapgolly.wordpressElement.wordpressElementStrings.clipPath */ Any,
    props: ClassAttributes[T] & P,
    children: Node*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.wordpressElement.wordpressElementStrings.animate, typingsJapgolly.wordpressElement.wordpressElementStrings.circle, typingsJapgolly.wordpressElement.wordpressElementStrings.clipPath */ Any,
    props: Null,
    children: Node*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.wordpressElement.wordpressElementStrings.animate, typingsJapgolly.wordpressElement.wordpressElementStrings.circle, typingsJapgolly.wordpressElement.wordpressElementStrings.clipPath */ Any,
    props: Unit,
    children: Node*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  
  // Custom components
  inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  inline def createElement_input(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: Node*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def createElement_input(`type`: input, props: Null, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def createElement_input(`type`: input, props: Unit, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  
  inline def createRef[T](): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefHandle[T]]
  
  inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]
  
  inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
  inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]
  
  inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
  inline def memo[T /* <: ComponentType[Any] */](
    Component: T,
    propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
  ): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
  inline def memo[P /* <: js.Object */](Component: FunctionComponent[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
  inline def memo[P /* <: js.Object */](
    Component: FunctionComponent[P],
    propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
  ): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]
  
  inline def switchChildrenNodeName(children: Any, nodeName: String): Any | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchChildrenNodeName")(children.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Any | Null]
  inline def switchChildrenNodeName(children: Null, nodeName: String): Any | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchChildrenNodeName")(children.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Any | Null]
  
  // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
  // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
  /**
    * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
    * has changed.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecallback
    */
  // A specific function type would not trigger implicit any.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/issues/52873#issuecomment-845806435 for a comparison between `Function` and more specific types.
  // tslint:disable-next-line ban-types
  inline def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
    *
    * NOTE: We don’t recommend adding debug values to every custom hook.
    * It’s most valuable for custom hooks that are part of shared libraries.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
    */
  // the name of the custom hook is itself derived from the function name at runtime:
  // it's just the function name without the "use" prefix.
  inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
  /**
    * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
    * `ref`. As always, imperative code using refs should be avoided in most cases.
    *
    * `useImperativeHandle` should be used with `React.forwardRef`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
    */
  inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
    * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
    * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
    *
    * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
    *
    * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
    * `componentDidMount` and `componentDidUpdate`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
    */
  inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usememo
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
  // The Flow types do have an overload for 3-ary invocation with undefined initializer.
  // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
  // supertype between the reducer's return type and the initialState (or the initializer's return type),
  // which would prevent autocompletion from ever working.
  // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
  // in older versions, or a regression in newer versions of the typescript completion service.
  inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload where dispatch could accept 0 arguments.
  inline def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  // overload where dispatch could accept 0 arguments.
  inline def useReducer[R /* <: Reducer[Any, Any] */, I](
    reducer: R,
    initializerArg: (I & ReducerState[R]) | I,
    initializer: js.Function1[
      (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
      ReducerState[R] | ReducerStateWithoutAction[R]
    ]
  ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
  
  // convenience overload for refs given as a ref prop as they typically start with a null value
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
    * of the generic argument.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  inline def useRef[T](): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefHandle[T]]
  inline def useRef[T](initialValue: T): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefHandle[T]]
  
  // convenience overload for potentially undefined initialValue / call with 0 arguments
  // has a default to stop it from defaulting to {} instead
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  inline def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  inline def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  // convenience overload when first argument is omitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  type WPComponent = ComponentType[js.Object]
  
  type WPElement = Element
  
  type WPSyntheticEvent = ReactEventFrom[org.scalajs.dom.Element]
}
