package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /** Account permissions assigned to this account. */
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Profile for this account. This is a read-only field that can be left blank. */
  var accountProfile: js.UndefOr[String] = js.undefined
  
  /** Whether this account is active. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Maximum number of active ads allowed for this account. */
  var activeAdsLimitTier: js.UndefOr[String] = js.undefined
  
  /** Whether to serve creatives with Active View tags. If disabled, viewability data will not be available for any impressions. */
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  
  /** User role permissions available to the user roles of this account. */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** ID of the country associated with this account. */
  var countryId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of currency associated with this account. This is a required field. Acceptable values are: - "1" for USD - "2" for GBP - "3" for ESP - "4" for SEK - "5" for CAD - "6" for JPY -
    * "7" for DEM - "8" for AUD - "9" for FRF - "10" for ITL - "11" for DKK - "12" for NOK - "13" for FIM - "14" for ZAR - "15" for IEP - "16" for NLG - "17" for EUR - "18" for KRW - "19"
    * for TWD - "20" for SGD - "21" for CNY - "22" for HKD - "23" for NZD - "24" for MYR - "25" for BRL - "26" for PTE - "28" for CLP - "29" for TRY - "30" for ARS - "31" for PEN - "32"
    * for ILS - "33" for CHF - "34" for VEF - "35" for COP - "36" for GTQ - "37" for PLN - "39" for INR - "40" for THB - "41" for IDR - "42" for CZK - "43" for RON - "44" for HUF - "45"
    * for RUB - "46" for AED - "47" for BGN - "48" for HRK - "49" for MXN - "50" for NGN - "51" for EGP
    */
  var currencyId: js.UndefOr[String] = js.undefined
  
  /** Default placement dimensions for this account. */
  var defaultCreativeSizeId: js.UndefOr[String] = js.undefined
  
  /** Description of this account. */
  var description: js.UndefOr[String] = js.undefined
  
  /** ID of this account. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#account". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Locale of this account. Acceptable values are: - "cs" (Czech) - "de" (German) - "en" (English) - "en-GB" (English United Kingdom) - "es" (Spanish) - "fr" (French) - "it" (Italian) -
    * "ja" (Japanese) - "ko" (Korean) - "pl" (Polish) - "pt-BR" (Portuguese Brazil) - "ru" (Russian) - "sv" (Swedish) - "tr" (Turkish) - "zh-CN" (Chinese Simplified) - "zh-TW" (Chinese
    * Traditional)
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /** Maximum image size allowed for this account, in kilobytes. Value must be greater than or equal to 1. */
  var maximumImageSize: js.UndefOr[String] = js.undefined
  
  /** Name of this account. This is a required field, and must be less than 128 characters long and be globally unique. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Whether campaigns created in this account will be enabled for Nielsen OCR reach ratings by default. */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Reporting configuration of this account. */
  var reportsConfiguration: js.UndefOr[ReportsConfiguration] = js.undefined
  
  /** Share Path to Conversion reports with Twitter. */
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.undefined
  
  /** File size limit in kilobytes of Rich Media teaser creatives. Acceptable values are 1 to 10240, inclusive. */
  var teaserSizeLimit: js.UndefOr[String] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccountPermissionIds(value: js.Array[String]): Self = StObject.set(x, "accountPermissionIds", value.asInstanceOf[js.Any])
    
    inline def setAccountPermissionIdsUndefined: Self = StObject.set(x, "accountPermissionIds", js.undefined)
    
    inline def setAccountPermissionIdsVarargs(value: String*): Self = StObject.set(x, "accountPermissionIds", js.Array(value*))
    
    inline def setAccountProfile(value: String): Self = StObject.set(x, "accountProfile", value.asInstanceOf[js.Any])
    
    inline def setAccountProfileUndefined: Self = StObject.set(x, "accountProfile", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveAdsLimitTier(value: String): Self = StObject.set(x, "activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    inline def setActiveAdsLimitTierUndefined: Self = StObject.set(x, "activeAdsLimitTier", js.undefined)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActiveViewOptOut(value: Boolean): Self = StObject.set(x, "activeViewOptOut", value.asInstanceOf[js.Any])
    
    inline def setActiveViewOptOutUndefined: Self = StObject.set(x, "activeViewOptOut", js.undefined)
    
    inline def setAvailablePermissionIds(value: js.Array[String]): Self = StObject.set(x, "availablePermissionIds", value.asInstanceOf[js.Any])
    
    inline def setAvailablePermissionIdsUndefined: Self = StObject.set(x, "availablePermissionIds", js.undefined)
    
    inline def setAvailablePermissionIdsVarargs(value: String*): Self = StObject.set(x, "availablePermissionIds", js.Array(value*))
    
    inline def setCountryId(value: String): Self = StObject.set(x, "countryId", value.asInstanceOf[js.Any])
    
    inline def setCountryIdUndefined: Self = StObject.set(x, "countryId", js.undefined)
    
    inline def setCurrencyId(value: String): Self = StObject.set(x, "currencyId", value.asInstanceOf[js.Any])
    
    inline def setCurrencyIdUndefined: Self = StObject.set(x, "currencyId", js.undefined)
    
    inline def setDefaultCreativeSizeId(value: String): Self = StObject.set(x, "defaultCreativeSizeId", value.asInstanceOf[js.Any])
    
    inline def setDefaultCreativeSizeIdUndefined: Self = StObject.set(x, "defaultCreativeSizeId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaximumImageSize(value: String): Self = StObject.set(x, "maximumImageSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumImageSizeUndefined: Self = StObject.set(x, "maximumImageSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNielsenOcrEnabled(value: Boolean): Self = StObject.set(x, "nielsenOcrEnabled", value.asInstanceOf[js.Any])
    
    inline def setNielsenOcrEnabledUndefined: Self = StObject.set(x, "nielsenOcrEnabled", js.undefined)
    
    inline def setReportsConfiguration(value: ReportsConfiguration): Self = StObject.set(x, "reportsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReportsConfigurationUndefined: Self = StObject.set(x, "reportsConfiguration", js.undefined)
    
    inline def setShareReportsWithTwitter(value: Boolean): Self = StObject.set(x, "shareReportsWithTwitter", value.asInstanceOf[js.Any])
    
    inline def setShareReportsWithTwitterUndefined: Self = StObject.set(x, "shareReportsWithTwitter", js.undefined)
    
    inline def setTeaserSizeLimit(value: String): Self = StObject.set(x, "teaserSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setTeaserSizeLimitUndefined: Self = StObject.set(x, "teaserSizeLimit", js.undefined)
  }
}
