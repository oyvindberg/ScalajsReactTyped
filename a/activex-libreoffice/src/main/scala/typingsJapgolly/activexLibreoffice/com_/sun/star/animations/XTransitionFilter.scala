package typingsJapgolly.activexLibreoffice.com_.sun.star.animations

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base members {@link XAnimate.Values} , {@link XAnimate.From} , {@link XAnimate.To} and {@link XAnimate.By} can be used with `double` values that set
  * the transition progress the specific amount of time.
  * @see http://www.w3.org/TR/smil20/smil-transitions.html#edef-transitionFilter
  */
trait XTransitionFilter
  extends StObject
     with XAnimate {
  
  /**
    * This specifies the direction the transition will run. ;  The legal values are `TRUE` for forward and `FALSE` for reverse. The default value is `TRUE`
    * . Note that this does not impact the media being transitioned to, but only affects the geometry of the transition. Transitions which do not have a
    * reverse interpretation should ignore the direction attribute and assume the default value of `TRUE` .
    */
  var Direction: Boolean
  
  /**
    * If the value of the {@link Type} attribute is {@link TransitionType.FADE} and the value of the {@link Subtype} attribute is {@link
    * TransitionSubType.FADETOCOLOR} or {@link TransitionSubType.FADEFROMCOLOR} , then this attribute specifies the starting or ending color of the fade.
    * The default value is 0 (black).
    */
  var FadeColor: Double
  
  /**
    * Indicates whether the transitionFilter's parent element will transition in or out. Legal values are `TRUE` indicating that the parent media will
    * become more visible as the transition progress increases and `FALSE` indicating that the parent media will become less visible as the transition
    * progress increases.
    *
    * The default value is `TRUE` .
    */
  var Mode: Boolean
  
  /**
    * This is the subtype of the transition. ;  This must be one of the transition subtypes appropriate for the specified {@link Type} as listed in {@link
    * TransitionSubType} . {@link TransitionSubType.DEFAULT} is the default.
    */
  var Subtype: Double
  
  /** This is the type or family of transition. ;  This attribute is required and must be one of the transition families listed in {@link TransitionType} . */
  var Transition: Double
}
object XTransitionFilter {
  
  inline def apply(
    Acceleration: Double,
    Accumulate: Boolean,
    Additive: Double,
    AttributeName: String,
    AutoReverse: Boolean,
    Begin: Any,
    By: Any,
    CalcMode: Double,
    Decelerate: Double,
    Direction: Boolean,
    Duration: Any,
    End: Any,
    EndSync: Any,
    FadeColor: Double,
    Fill: Double,
    FillDefault: Double,
    Formula: String,
    From: Any,
    KeyTimes: SafeArray[Double],
    Mode: Boolean,
    Parent: XInterface,
    RepeatCount: Any,
    RepeatDuration: Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Subtype: Double,
    Target: Any,
    TimeFilter: SafeArray[TimeFilterPair],
    To: Any,
    Transition: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    ValueType: Double,
    Values: SafeArray[Any],
    acquire: Callback,
    getParent: CallbackTo[XInterface],
    queryInterface: `type` => Any,
    release: Callback,
    setParent: XInterface => Callback
  ): XTransitionFilter = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], FadeColor = FadeColor.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Subtype = Subtype.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Transition = Transition.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = acquire.toJsFn, getParent = getParent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XTransitionFilter]
  }
  
  extension [Self <: XTransitionFilter](x: Self) {
    
    inline def setDirection(value: Boolean): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setFadeColor(value: Double): Self = StObject.set(x, "FadeColor", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Boolean): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: Double): Self = StObject.set(x, "Subtype", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Double): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
  }
}
