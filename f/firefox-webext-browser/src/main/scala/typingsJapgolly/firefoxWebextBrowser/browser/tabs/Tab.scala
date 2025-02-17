package typingsJapgolly.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  /** Whether the tab is active in its window. (Does not necessarily mean the window is focused.) */
  var active: Boolean
  
  /** Whether the tab is drawing attention. */
  var attention: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also muted). Equivalent to whether the speaker audio indicator is showing.
    */
  var audible: js.UndefOr[Boolean] = js.undefined
  
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the `"tabs"` permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[String] = js.undefined
  
  /** The height of the tab in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** True if the tab is hidden. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the tab is highlighted. Works as an alias of active */
  var highlighted: Boolean
  
  /**
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be assigned an ID, for example when querying foreign tabs using the `sessions` API, in which case a session ID may be present. Tab ID can also be set to `tabs.TAB_ID_NONE` for apps and devtools windows.
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /** Whether the tab is in an incognito window. */
  var incognito: Boolean
  
  /** The zero-based index of the tab within its window. */
  var index: Double
  
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the document in the tab is being rendered in reader mode. */
  var isInReaderMode: js.UndefOr[Boolean] = js.undefined
  
  /** The last time the tab was accessed as the number of milliseconds since epoch. */
  var lastAccessed: js.UndefOr[Double] = js.undefined
  
  /** Current tab muted state and the reason for the last state change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.undefined
  
  /**
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  
  /** Whether the tab is pinned. */
  var pinned: Boolean
  
  /**
    * Whether the tab is selected.
    * @deprecated Please use `tabs.Tab.highlighted`.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /** The session ID used to uniquely identify a Tab obtained from the `sessions` API. */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /** Current tab sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.undefined
  
  /** Either _loading_ or _complete_. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The ID of this tab's successor, if any; `tabs.TAB_ID_NONE` otherwise. */
  var successorTabId: js.UndefOr[Double] = js.undefined
  
  /**
    * The title of the tab. This property is only present if the extension's manifest includes the `"tabs"` permission.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the `"tabs"` permission.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /** The width of the tab in pixels. */
  var width: js.UndefOr[Double] = js.undefined
  
  /** The ID of the window the tab is contained within. */
  var windowId: js.UndefOr[Double] = js.undefined
}
object Tab {
  
  inline def apply(active: Boolean, highlighted: Boolean, incognito: Boolean, index: Double, pinned: Boolean): Tab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  extension [Self <: Tab](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
    
    inline def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
    
    inline def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    inline def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
    
    inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
    
    inline def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    inline def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    inline def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
    
    inline def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsArticle(value: Boolean): Self = StObject.set(x, "isArticle", value.asInstanceOf[js.Any])
    
    inline def setIsArticleUndefined: Self = StObject.set(x, "isArticle", js.undefined)
    
    inline def setIsInReaderMode(value: Boolean): Self = StObject.set(x, "isInReaderMode", value.asInstanceOf[js.Any])
    
    inline def setIsInReaderModeUndefined: Self = StObject.set(x, "isInReaderMode", js.undefined)
    
    inline def setLastAccessed(value: Double): Self = StObject.set(x, "lastAccessed", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedUndefined: Self = StObject.set(x, "lastAccessed", js.undefined)
    
    inline def setMutedInfo(value: MutedInfo): Self = StObject.set(x, "mutedInfo", value.asInstanceOf[js.Any])
    
    inline def setMutedInfoUndefined: Self = StObject.set(x, "mutedInfo", js.undefined)
    
    inline def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    inline def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSharingState(value: SharingState): Self = StObject.set(x, "sharingState", value.asInstanceOf[js.Any])
    
    inline def setSharingStateUndefined: Self = StObject.set(x, "sharingState", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuccessorTabId(value: Double): Self = StObject.set(x, "successorTabId", value.asInstanceOf[js.Any])
    
    inline def setSuccessorTabIdUndefined: Self = StObject.set(x, "successorTabId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
