package typingsJapgolly.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SearchOptions object, for use in `searchOptions.set({ ... })`. */
trait SearchOptionsUpdateData extends StObject {
  
  /**
    * Gets or sets a value that indicates whether to ignore all punctuation characters between words. Corresponds to the Ignore punctuation check box in the Find and Replace dialog box.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var ignorePunct: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether to ignore all whitespace between words. Corresponds to the Ignore whitespace characters check box in the Find and Replace dialog box.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var ignoreSpace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether to perform a case sensitive search. Corresponds to the Match case check box in the Find and Replace dialog box.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether to match words that begin with the search string. Corresponds to the Match prefix check box in the Find and Replace dialog box.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var matchPrefix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether to match words that end with the search string. Corresponds to the Match suffix check box in the Find and Replace dialog box.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var matchSuffix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether to find operation only entire words, not text that is part of a larger word. Corresponds to the Find whole words only check box in the Find and Replace dialog box.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var matchWholeWord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the search will be performed using special search operators. Corresponds to the Use wildcards check box in the Find and Replace dialog box.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var matchWildcards: js.UndefOr[Boolean] = js.undefined
}
object SearchOptionsUpdateData {
  
  inline def apply(): SearchOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptionsUpdateData]
  }
  
  extension [Self <: SearchOptionsUpdateData](x: Self) {
    
    inline def setIgnorePunct(value: Boolean): Self = StObject.set(x, "ignorePunct", value.asInstanceOf[js.Any])
    
    inline def setIgnorePunctUndefined: Self = StObject.set(x, "ignorePunct", js.undefined)
    
    inline def setIgnoreSpace(value: Boolean): Self = StObject.set(x, "ignoreSpace", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSpaceUndefined: Self = StObject.set(x, "ignoreSpace", js.undefined)
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setMatchPrefix(value: Boolean): Self = StObject.set(x, "matchPrefix", value.asInstanceOf[js.Any])
    
    inline def setMatchPrefixUndefined: Self = StObject.set(x, "matchPrefix", js.undefined)
    
    inline def setMatchSuffix(value: Boolean): Self = StObject.set(x, "matchSuffix", value.asInstanceOf[js.Any])
    
    inline def setMatchSuffixUndefined: Self = StObject.set(x, "matchSuffix", js.undefined)
    
    inline def setMatchWholeWord(value: Boolean): Self = StObject.set(x, "matchWholeWord", value.asInstanceOf[js.Any])
    
    inline def setMatchWholeWordUndefined: Self = StObject.set(x, "matchWholeWord", js.undefined)
    
    inline def setMatchWildcards(value: Boolean): Self = StObject.set(x, "matchWildcards", value.asInstanceOf[js.Any])
    
    inline def setMatchWildcardsUndefined: Self = StObject.set(x, "matchWildcards", js.undefined)
  }
}
