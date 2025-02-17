package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorForDateRange
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches YouTube videos. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var youTubeVideoSelector = AdsApp.display()
  *          .youTubeVideos()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var youTubeVideoIterator = youTubeVideoSelector.get();
  *      while (youTubeVideoIterator.hasNext()) {
  *        var youTubeVideo = youTubeVideoIterator.next();
  *      }
  */
@js.native
trait YouTubeVideoSelector
  extends StObject
     with Selector[YouTubeVideoIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
