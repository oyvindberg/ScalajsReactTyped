package typingsJapgolly.chromeApps.WebView

import typingsJapgolly.chromeApps.chrome.extensionTypes.RunAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details of the content script to inject. **/
trait ContentScriptDetails extends StObject {
  
  /**
    * If all_frames is true, this implies that the JavaScript or CSS should be injected into all frames of current page.
    * By default, all_frames is false and the JavaScript or CSS is only injected into the top frame.
    * @default false
    */
  var all_frames: js.UndefOr[Boolean] = js.undefined
  
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The CSS code or a list of CSS files to be injected into matching pages.
    * These are injected in the order they appear,
    * before any DOM is constructed or displayed for the page.
    */
  var css: js.UndefOr[InjectionItems] = js.undefined
  
  /**
    * Applied after matches to exclude URLs that match this glob.
    * Intended to emulate the @exclude Greasemonkey keyword.
    */
  var exclude_globs: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Excludes pages that this content script would otherwise be injected into. */
  var exclude_matches: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Applied after matches to include only those URLs that also match this glob.
    * Intended to emulate the @include Greasemonkey keyword.
    */
  var include_globs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The JavaScript code or a list of JavaScript files to be injected into matching pages.
    * These are injected in the order they appear.
    */
  @JSName("js")
  var js_ : js.UndefOr[InjectionItems] = js.undefined
  
  /**
    * Whether to insert the content script on about:blank and about:srcdoc.
    * Content scripts will only be injected on pages when their inherit URL
    * is matched by one of the declared patterns in the matches field.
    * The inherit URL is the URL of the document that created the frame or window.
    * Content scripts cannot be inserted in sandboxed frames.
    */
  var match_about_blank: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies which pages this content script will be injected into. */
  var matches: js.Array[String]
  
  /** The name of the content script to inject. */
  var name: String
  
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab.
    * Defaults to 'document_idle'.
    */
  var run_at: js.UndefOr[RunAt] = js.undefined
}
object ContentScriptDetails {
  
  inline def apply(matches: js.Array[String], name: String): ContentScriptDetails = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentScriptDetails]
  }
  
  extension [Self <: ContentScriptDetails](x: Self) {
    
    inline def setAll_frames(value: Boolean): Self = StObject.set(x, "all_frames", value.asInstanceOf[js.Any])
    
    inline def setAll_framesUndefined: Self = StObject.set(x, "all_frames", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCss(value: InjectionItems): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setExclude_globs(value: js.Array[String]): Self = StObject.set(x, "exclude_globs", value.asInstanceOf[js.Any])
    
    inline def setExclude_globsUndefined: Self = StObject.set(x, "exclude_globs", js.undefined)
    
    inline def setExclude_globsVarargs(value: String*): Self = StObject.set(x, "exclude_globs", js.Array(value*))
    
    inline def setExclude_matches(value: js.Array[String]): Self = StObject.set(x, "exclude_matches", value.asInstanceOf[js.Any])
    
    inline def setExclude_matchesUndefined: Self = StObject.set(x, "exclude_matches", js.undefined)
    
    inline def setExclude_matchesVarargs(value: String*): Self = StObject.set(x, "exclude_matches", js.Array(value*))
    
    inline def setInclude_globs(value: js.Array[String]): Self = StObject.set(x, "include_globs", value.asInstanceOf[js.Any])
    
    inline def setInclude_globsUndefined: Self = StObject.set(x, "include_globs", js.undefined)
    
    inline def setInclude_globsVarargs(value: String*): Self = StObject.set(x, "include_globs", js.Array(value*))
    
    inline def setJs_(value: InjectionItems): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
    
    inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
    
    inline def setMatch_about_blank(value: Boolean): Self = StObject.set(x, "match_about_blank", value.asInstanceOf[js.Any])
    
    inline def setMatch_about_blankUndefined: Self = StObject.set(x, "match_about_blank", js.undefined)
    
    inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRun_at(value: RunAt): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
    
    inline def setRun_atUndefined: Self = StObject.set(x, "run_at", js.undefined)
  }
}
