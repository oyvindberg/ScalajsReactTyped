package typingsJapgolly.playable.anon

import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMap extends StObject {
  
  var eventEmitter: IEventEmitter
  
  var textMap: ITextMap
  
  var theme: IThemeService
  
  var tooltipService: ITooltipService
}
object TextMap {
  
  inline def apply(
    eventEmitter: IEventEmitter,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): TextMap = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMap]
  }
  
  extension [Self <: TextMap](x: Self) {
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
