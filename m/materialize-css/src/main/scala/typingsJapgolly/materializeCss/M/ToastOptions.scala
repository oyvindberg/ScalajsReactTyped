package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastOptions extends StObject {
  
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a Toast.
    * @default 0.8
    */
  var activationPercent: Double
  
  /**
    * Classes to be added to the toast element.
    */
  var classes: String
  
  /**
    * Callback function called when toast is dismissed.
    */
  def completeCallback(): Unit
  
  /**
    * Length in ms the Toast stays before dismissal.
    * @default 4000
    */
  var displayLength: Double
  
  /**
    * The HTML content of the Toast.
    */
  var html: String
  
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double
  
  /**
    * Transition out duration in milliseconds.
    * @default 375
    */
  var outDuration: Double
}
object ToastOptions {
  
  inline def apply(
    activationPercent: Double,
    classes: String,
    completeCallback: Callback,
    displayLength: Double,
    html: String,
    inDuration: Double,
    outDuration: Double
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(activationPercent = activationPercent.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], completeCallback = completeCallback.toJsFn, displayLength = displayLength.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  
  extension [Self <: ToastOptions](x: Self) {
    
    inline def setActivationPercent(value: Double): Self = StObject.set(x, "activationPercent", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setCompleteCallback(value: Callback): Self = StObject.set(x, "completeCallback", value.toJsFn)
    
    inline def setDisplayLength(value: Double): Self = StObject.set(x, "displayLength", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
