package typingsJapgolly.maximMazurokGapiClientAdexperiencereport

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAdexperiencereport.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientAdexperiencereport.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object adexperiencereport {
      
      trait PlatformSummary extends StObject {
        
        /** The site's Ad Experience Report status on this platform. */
        var betterAdsStatus: js.UndefOr[String] = js.undefined
        
        /** The time at which [enforcement](https://support.google.com/webtools/answer/7308033) against the site began or will begin on this platform. Not set when the filter_status is OFF. */
        var enforcementTime: js.UndefOr[String] = js.undefined
        
        /** The site's [enforcement status](https://support.google.com/webtools/answer/7308033) on this platform. */
        var filterStatus: js.UndefOr[String] = js.undefined
        
        /** The time at which the site's status last changed on this platform. */
        var lastChangeTime: js.UndefOr[String] = js.undefined
        
        /** The site's regions on this platform. No longer populated, because there is no longer any semantic difference between sites in different regions. */
        var region: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * A link to the full Ad Experience Report for the site on this platform.. Not set in ViolatingSitesResponse. Note that you must complete the [Search Console verification
          * process](https://support.google.com/webmasters/answer/9008080) for the site before you can access the full report.
          */
        var reportUrl: js.UndefOr[String] = js.undefined
        
        /** Whether the site is currently under review on this platform. */
        var underReview: js.UndefOr[Boolean] = js.undefined
      }
      object PlatformSummary {
        
        inline def apply(): PlatformSummary = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[PlatformSummary]
        }
        
        extension [Self <: PlatformSummary](x: Self) {
          
          inline def setBetterAdsStatus(value: String): Self = StObject.set(x, "betterAdsStatus", value.asInstanceOf[js.Any])
          
          inline def setBetterAdsStatusUndefined: Self = StObject.set(x, "betterAdsStatus", js.undefined)
          
          inline def setEnforcementTime(value: String): Self = StObject.set(x, "enforcementTime", value.asInstanceOf[js.Any])
          
          inline def setEnforcementTimeUndefined: Self = StObject.set(x, "enforcementTime", js.undefined)
          
          inline def setFilterStatus(value: String): Self = StObject.set(x, "filterStatus", value.asInstanceOf[js.Any])
          
          inline def setFilterStatusUndefined: Self = StObject.set(x, "filterStatus", js.undefined)
          
          inline def setLastChangeTime(value: String): Self = StObject.set(x, "lastChangeTime", value.asInstanceOf[js.Any])
          
          inline def setLastChangeTimeUndefined: Self = StObject.set(x, "lastChangeTime", js.undefined)
          
          inline def setRegion(value: js.Array[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
          
          inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
          
          inline def setRegionVarargs(value: String*): Self = StObject.set(x, "region", js.Array(value*))
          
          inline def setReportUrl(value: String): Self = StObject.set(x, "reportUrl", value.asInstanceOf[js.Any])
          
          inline def setReportUrlUndefined: Self = StObject.set(x, "reportUrl", js.undefined)
          
          inline def setUnderReview(value: Boolean): Self = StObject.set(x, "underReview", value.asInstanceOf[js.Any])
          
          inline def setUnderReviewUndefined: Self = StObject.set(x, "underReview", js.undefined)
        }
      }
      
      trait SiteSummaryResponse extends StObject {
        
        /** The site's Ad Experience Report summary on desktop. */
        var desktopSummary: js.UndefOr[PlatformSummary] = js.undefined
        
        /** The site's Ad Experience Report summary on mobile. */
        var mobileSummary: js.UndefOr[PlatformSummary] = js.undefined
        
        /** The name of the reviewed site, e.g. `google.com`. */
        var reviewedSite: js.UndefOr[String] = js.undefined
      }
      object SiteSummaryResponse {
        
        inline def apply(): SiteSummaryResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SiteSummaryResponse]
        }
        
        extension [Self <: SiteSummaryResponse](x: Self) {
          
          inline def setDesktopSummary(value: PlatformSummary): Self = StObject.set(x, "desktopSummary", value.asInstanceOf[js.Any])
          
          inline def setDesktopSummaryUndefined: Self = StObject.set(x, "desktopSummary", js.undefined)
          
          inline def setMobileSummary(value: PlatformSummary): Self = StObject.set(x, "mobileSummary", value.asInstanceOf[js.Any])
          
          inline def setMobileSummaryUndefined: Self = StObject.set(x, "mobileSummary", js.undefined)
          
          inline def setReviewedSite(value: String): Self = StObject.set(x, "reviewedSite", value.asInstanceOf[js.Any])
          
          inline def setReviewedSiteUndefined: Self = StObject.set(x, "reviewedSite", js.undefined)
        }
      }
      
      @js.native
      trait SitesResource extends StObject {
        
        /** Gets a site's Ad Experience Report summary. */
        def get(): Request[SiteSummaryResponse] = js.native
        def get(request: Accesstoken): Request[SiteSummaryResponse] = js.native
      }
      
      @js.native
      trait ViolatingSitesResource extends StObject {
        
        /** Lists sites that are failing in the Ad Experience Report on at least one platform. */
        def list(): Request[ViolatingSitesResponse] = js.native
        def list(request: Alt): Request[ViolatingSitesResponse] = js.native
      }
      
      trait ViolatingSitesResponse extends StObject {
        
        /** The list of violating sites. */
        var violatingSites: js.UndefOr[js.Array[SiteSummaryResponse]] = js.undefined
      }
      object ViolatingSitesResponse {
        
        inline def apply(): ViolatingSitesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ViolatingSitesResponse]
        }
        
        extension [Self <: ViolatingSitesResponse](x: Self) {
          
          inline def setViolatingSites(value: js.Array[SiteSummaryResponse]): Self = StObject.set(x, "violatingSites", value.asInstanceOf[js.Any])
          
          inline def setViolatingSitesUndefined: Self = StObject.set(x, "violatingSites", js.undefined)
          
          inline def setViolatingSitesVarargs(value: SiteSummaryResponse*): Self = StObject.set(x, "violatingSites", js.Array(value*))
        }
      }
    }
  }
}
