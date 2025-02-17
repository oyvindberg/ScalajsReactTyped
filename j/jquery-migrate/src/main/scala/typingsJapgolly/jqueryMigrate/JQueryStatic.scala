package typingsJapgolly.jqueryMigrate

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * If you want to upgrade to jQuery 3.5.0 or newer and don't have time to deal with breaking changes at the moment
    * and you use jQuery Migrate 3.2.0 or newer, you can revert to the previous behavior.
    * @see {@link https://jquery.com/upgrade-guide/3.5/}
    */
  def UNSAFE_restoreLegacyHtmlPrefilter(): Unit
  
  /**
    * By default, Migrate only gives a specific warning once.
    * If you set this property to false it will give a warning for every occurrence each time it happens.
    * Note that this can generate a lot of output, for example when a warning occurs in a loop.
    * @default true
    */
  var migrateDeduplicateWarnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this property to `true` to prevent console warnings from being generated in the development version.\
    * The `jQuery.migrateWarnings` array is still maintained when this property is set,
    * which allows programmatic inspection without console output
    * @default false
    */
  var migrateMute: Boolean
  
  /**
    * This method clears the `jQuery.migrateWarnings` array and "forgets" the list of messages
    * that have been seen already.
    */
  def migrateReset(): Unit
  
  /**
    * Set this property to `false` if you want warnings
    * but do not want stack traces to appear on the console.
    * @default true
    */
  var migrateTrace: Boolean
  
  /**
    * Indicates the version of Migrate in use
    */
  val migrateVersion: String
  
  /**
    * An array of string warning messages that have been generated by the code on the page,
    * in the order they were generated. Messages appear in the array only once,
    * even if the condition has occurred multiple times, unless jQuery.migrateReset() is called
    * @default []
    */
  var migrateWarnings: js.Array[String]
}
object JQueryStatic {
  
  inline def apply(
    UNSAFE_restoreLegacyHtmlPrefilter: Callback,
    migrateMute: Boolean,
    migrateReset: Callback,
    migrateTrace: Boolean,
    migrateVersion: String,
    migrateWarnings: js.Array[String]
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal(UNSAFE_restoreLegacyHtmlPrefilter = UNSAFE_restoreLegacyHtmlPrefilter.toJsFn, migrateMute = migrateMute.asInstanceOf[js.Any], migrateReset = migrateReset.toJsFn, migrateTrace = migrateTrace.asInstanceOf[js.Any], migrateVersion = migrateVersion.asInstanceOf[js.Any], migrateWarnings = migrateWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setMigrateDeduplicateWarnings(value: Boolean): Self = StObject.set(x, "migrateDeduplicateWarnings", value.asInstanceOf[js.Any])
    
    inline def setMigrateDeduplicateWarningsUndefined: Self = StObject.set(x, "migrateDeduplicateWarnings", js.undefined)
    
    inline def setMigrateMute(value: Boolean): Self = StObject.set(x, "migrateMute", value.asInstanceOf[js.Any])
    
    inline def setMigrateReset(value: Callback): Self = StObject.set(x, "migrateReset", value.toJsFn)
    
    inline def setMigrateTrace(value: Boolean): Self = StObject.set(x, "migrateTrace", value.asInstanceOf[js.Any])
    
    inline def setMigrateVersion(value: String): Self = StObject.set(x, "migrateVersion", value.asInstanceOf[js.Any])
    
    inline def setMigrateWarnings(value: js.Array[String]): Self = StObject.set(x, "migrateWarnings", value.asInstanceOf[js.Any])
    
    inline def setMigrateWarningsVarargs(value: String*): Self = StObject.set(x, "migrateWarnings", js.Array(value*))
    
    inline def setUNSAFE_restoreLegacyHtmlPrefilter(value: Callback): Self = StObject.set(x, "UNSAFE_restoreLegacyHtmlPrefilter", value.toJsFn)
  }
}
