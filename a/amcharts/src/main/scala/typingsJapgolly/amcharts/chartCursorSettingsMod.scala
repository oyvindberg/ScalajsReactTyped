package typingsJapgolly.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartCursorSettingsMod {
  
  @JSImport("amcharts/ChartCursorSettings", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ChartCursorSettings {
    
    /**
      * Size of bullets, following the cursor.
      */
    /* CompleteClass */
    var bulletSize: Double = js.native
    
    /**
      * Specifies if bullet for each graph will follow the cursor.
      */
    /* CompleteClass */
    var bulletsEnabled: Boolean = js.native
    
    /**
      * Opacity of the category balloon.
      */
    /* CompleteClass */
    var categoryBalloonAlpha: Double = js.native
    
    /**
      * Color of the category balloon.
      */
    /* CompleteClass */
    var categoryBalloonColor: String = js.native
    
    /**
      * Array of date format objects. Date format object must have "period" and "format" items.
      * Available periods are:
      * fff - millisecond,
      * ss - second,
      * mm - minute,
      * hh - hour,
      * DD - date,
      * WW - week,
      * MM - month,
      * YYYY - year
      * [
      *     {period:"YYYY", format:"YYYY"},
      *     {period:"MM", format:"MMM, YYYY"},
      *     {period:"WW", format:"MMM DD, YYYY"},
      *     {period:"DD", format:"MMM DD, YYYY"},
      *     {period:"hh", format:"JJ:NN"},
      *     {period:"mm", format:"JJ:NN"},
      *     {period:"ss", format:"JJ:NN:SS"},
      *     {period:"fff", format:"JJ:NN:SS"}
      * ]
      */
    /* CompleteClass */
    var categoryBalloonDateFormats: js.Array[Any] = js.native
    
    /**
      * Specifies whether category balloon is enabled.
      */
    /* CompleteClass */
    var categoryBalloonEnabled: Boolean = js.native
    
    /**
      * Opacity of the cursor line.
      */
    /* CompleteClass */
    var cursorAlpha: Double = js.native
    
    /**
      * Color of the cursor line.
      */
    /* CompleteClass */
    var cursorColor: String = js.native
    
    /**
      * Possible values: "start", "middle" and "mouse".
      */
    /* CompleteClass */
    var cursorPosition: String = js.native
    
    /**
      * Set this to "false" if you don't want chart cursor to appear in your charts.
      * @default true
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * If this is set to true, the user will be able to pan the chart instead of zooming.
      */
    /* CompleteClass */
    var pan: Boolean = js.native
    
    /**
      * Specifies whether value balloons are enabled.
      * In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet.
      */
    /* CompleteClass */
    var valueBalloonsEnabled: Boolean = js.native
    
    /**
      * Specifies if the user can zoom-in the chart.
      * If pan is set to true, zoomable is switched to false automatically.
      */
    /* CompleteClass */
    var zoomable: Boolean = js.native
  }
  
  trait ChartCursorSettings extends StObject {
    
    /**
      * Size of bullets, following the cursor.
      */
    var bulletSize: Double
    
    /**
      * Specifies if bullet for each graph will follow the cursor.
      */
    var bulletsEnabled: Boolean
    
    /**
      * Opacity of the category balloon.
      */
    var categoryBalloonAlpha: Double
    
    /**
      * Color of the category balloon.
      */
    var categoryBalloonColor: String
    
    /**
      * Array of date format objects. Date format object must have "period" and "format" items.
      * Available periods are:
      * fff - millisecond,
      * ss - second,
      * mm - minute,
      * hh - hour,
      * DD - date,
      * WW - week,
      * MM - month,
      * YYYY - year
      * [
      *     {period:"YYYY", format:"YYYY"},
      *     {period:"MM", format:"MMM, YYYY"},
      *     {period:"WW", format:"MMM DD, YYYY"},
      *     {period:"DD", format:"MMM DD, YYYY"},
      *     {period:"hh", format:"JJ:NN"},
      *     {period:"mm", format:"JJ:NN"},
      *     {period:"ss", format:"JJ:NN:SS"},
      *     {period:"fff", format:"JJ:NN:SS"}
      * ]
      */
    var categoryBalloonDateFormats: js.Array[Any]
    
    /**
      * Specifies whether category balloon is enabled.
      */
    var categoryBalloonEnabled: Boolean
    
    /**
      * Opacity of the cursor line.
      */
    var cursorAlpha: Double
    
    /**
      * Color of the cursor line.
      */
    var cursorColor: String
    
    /**
      * Possible values: "start", "middle" and "mouse".
      */
    var cursorPosition: String
    
    /**
      * Set this to "false" if you don't want chart cursor to appear in your charts.
      * @default true
      */
    var enabled: Boolean
    
    /**
      * If this is set to true, the user will be able to pan the chart instead of zooming.
      */
    var pan: Boolean
    
    /**
      * Specifies whether value balloons are enabled.
      * In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet.
      */
    var valueBalloonsEnabled: Boolean
    
    /**
      * Specifies if the user can zoom-in the chart.
      * If pan is set to true, zoomable is switched to false automatically.
      */
    var zoomable: Boolean
  }
  object ChartCursorSettings {
    
    inline def apply(
      bulletSize: Double,
      bulletsEnabled: Boolean,
      categoryBalloonAlpha: Double,
      categoryBalloonColor: String,
      categoryBalloonDateFormats: js.Array[Any],
      categoryBalloonEnabled: Boolean,
      cursorAlpha: Double,
      cursorColor: String,
      cursorPosition: String,
      enabled: Boolean,
      pan: Boolean,
      valueBalloonsEnabled: Boolean,
      zoomable: Boolean
    ): ChartCursorSettings = {
      val __obj = js.Dynamic.literal(bulletSize = bulletSize.asInstanceOf[js.Any], bulletsEnabled = bulletsEnabled.asInstanceOf[js.Any], categoryBalloonAlpha = categoryBalloonAlpha.asInstanceOf[js.Any], categoryBalloonColor = categoryBalloonColor.asInstanceOf[js.Any], categoryBalloonDateFormats = categoryBalloonDateFormats.asInstanceOf[js.Any], categoryBalloonEnabled = categoryBalloonEnabled.asInstanceOf[js.Any], cursorAlpha = cursorAlpha.asInstanceOf[js.Any], cursorColor = cursorColor.asInstanceOf[js.Any], cursorPosition = cursorPosition.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], valueBalloonsEnabled = valueBalloonsEnabled.asInstanceOf[js.Any], zoomable = zoomable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartCursorSettings]
    }
    
    extension [Self <: ChartCursorSettings](x: Self) {
      
      inline def setBulletSize(value: Double): Self = StObject.set(x, "bulletSize", value.asInstanceOf[js.Any])
      
      inline def setBulletsEnabled(value: Boolean): Self = StObject.set(x, "bulletsEnabled", value.asInstanceOf[js.Any])
      
      inline def setCategoryBalloonAlpha(value: Double): Self = StObject.set(x, "categoryBalloonAlpha", value.asInstanceOf[js.Any])
      
      inline def setCategoryBalloonColor(value: String): Self = StObject.set(x, "categoryBalloonColor", value.asInstanceOf[js.Any])
      
      inline def setCategoryBalloonDateFormats(value: js.Array[Any]): Self = StObject.set(x, "categoryBalloonDateFormats", value.asInstanceOf[js.Any])
      
      inline def setCategoryBalloonDateFormatsVarargs(value: Any*): Self = StObject.set(x, "categoryBalloonDateFormats", js.Array(value*))
      
      inline def setCategoryBalloonEnabled(value: Boolean): Self = StObject.set(x, "categoryBalloonEnabled", value.asInstanceOf[js.Any])
      
      inline def setCursorAlpha(value: Double): Self = StObject.set(x, "cursorAlpha", value.asInstanceOf[js.Any])
      
      inline def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
      
      inline def setCursorPosition(value: String): Self = StObject.set(x, "cursorPosition", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setPan(value: Boolean): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setValueBalloonsEnabled(value: Boolean): Self = StObject.set(x, "valueBalloonsEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    }
  }
}
