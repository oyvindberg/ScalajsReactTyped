package typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typingsJapgolly.wechatMiniprogram.anon.PartialPageLifetimes
import typingsJapgolly.wechatMiniprogram.anon.Partialcreatedvoidattache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.WechatMiniprogram.Component.Options<wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, false> */
trait TrivialOption extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var behaviors: js.UndefOr[js.Array[BehaviorIdentifier]] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: js.UndefOr[IAnyObject] = js.undefined
  
  var definitionFilter: js.UndefOr[DefinitionFilter] = js.undefined
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  
  var `export`: js.UndefOr[js.Function0[IAnyObject]] = js.undefined
  
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var lifetimes: js.UndefOr[Partialcreatedvoidattache] = js.undefined
  
  var methods: js.UndefOr[
    IAnyObject & (/* import warning: importer.ImportType#apply Failed type conversion: false extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
  {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
  ] = js.undefined
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var observers: js.UndefOr[Record[String, js.Function1[/* repeated */ Any, Any]]] = js.undefined
  
  var options: js.UndefOr[ComponentOptions] = js.undefined
  
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
  
  var properties: js.UndefOr[IAnyObject] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var relations: js.UndefOr[StringDictionary[RelationOption]] = js.undefined
}
object TrivialOption {
  
  inline def apply(): TrivialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrivialOption]
  }
  
  extension [Self <: TrivialOption](x: Self) {
    
    inline def setAttached(value: Callback): Self = StObject.set(x, "attached", value.toJsFn)
    
    inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    inline def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def setCreated(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefinitionFilter(value: DefinitionFilter): Self = StObject.set(x, "definitionFilter", value.asInstanceOf[js.Any])
    
    inline def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
    
    inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setError(value: /* err */ js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExport(value: CallbackTo[IAnyObject]): Self = StObject.set(x, "export", value.toJsFn)
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
    
    inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
    
    inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value*))
    
    inline def setLifetimes(value: Partialcreatedvoidattache): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
    
    inline def setLifetimesUndefined: Self = StObject.set(x, "lifetimes", js.undefined)
    
    inline def setMethods(
      value: IAnyObject & (/* import warning: importer.ImportType#apply Failed type conversion: false extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
    {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
    ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMoved(value: Callback): Self = StObject.set(x, "moved", value.toJsFn)
    
    inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    inline def setObservers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
    
    inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
    
    inline def setOptions(value: ComponentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
    
    inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
    
    inline def setProperties(value: IAnyObject): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
  }
}
