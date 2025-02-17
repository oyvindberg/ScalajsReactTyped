package typingsJapgolly.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCorsruleMod {
  
  trait CORSRule extends StObject {
    
    /**
      * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
      */
    var AllowedHeaders: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
      */
    var AllowedMethods: js.Array[String] | js.Iterable[String]
    
    /**
      * <p>One or more origins you want customers to be able to access the bucket from.</p>
      */
    var AllowedOrigins: js.Array[String] | js.Iterable[String]
    
    /**
      * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
      */
    var ExposeHeaders: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>The time in seconds that your browser is to cache the preflight response for the specified resource.</p>
      */
    var MaxAgeSeconds: js.UndefOr[Double] = js.undefined
  }
  object CORSRule {
    
    inline def apply(
      AllowedMethods: js.Array[String] | js.Iterable[String],
      AllowedOrigins: js.Array[String] | js.Iterable[String]
    ): CORSRule = {
      val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
      __obj.asInstanceOf[CORSRule]
    }
    
    extension [Self <: CORSRule](x: Self) {
      
      inline def setAllowedHeaders(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "AllowedHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowedHeadersUndefined: Self = StObject.set(x, "AllowedHeaders", js.undefined)
      
      inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "AllowedHeaders", js.Array(value*))
      
      inline def setAllowedMethods(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "AllowedMethods", value.asInstanceOf[js.Any])
      
      inline def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "AllowedMethods", js.Array(value*))
      
      inline def setAllowedOrigins(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "AllowedOrigins", value.asInstanceOf[js.Any])
      
      inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "AllowedOrigins", js.Array(value*))
      
      inline def setExposeHeaders(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
      
      inline def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
      
      inline def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "ExposeHeaders", js.Array(value*))
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "MaxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "MaxAgeSeconds", js.undefined)
    }
  }
  
  trait UnmarshalledCORSRule
    extends StObject
       with CORSRule {
    
    /**
      * <p>Specifies which headers are allowed in a pre-flight OPTIONS request.</p>
      */
    @JSName("AllowedHeaders")
    var AllowedHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * <p>Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.</p>
      */
    @JSName("AllowedMethods")
    var AllowedMethods_UnmarshalledCORSRule: js.Array[String]
    
    /**
      * <p>One or more origins you want customers to be able to access the bucket from.</p>
      */
    @JSName("AllowedOrigins")
    var AllowedOrigins_UnmarshalledCORSRule: js.Array[String]
    
    /**
      * <p>One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).</p>
      */
    @JSName("ExposeHeaders")
    var ExposeHeaders_UnmarshalledCORSRule: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledCORSRule {
    
    inline def apply(AllowedMethods: js.Array[String], AllowedOrigins: js.Array[String]): UnmarshalledCORSRule = {
      val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods.asInstanceOf[js.Any], AllowedOrigins = AllowedOrigins.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledCORSRule]
    }
    
    extension [Self <: UnmarshalledCORSRule](x: Self) {
      
      inline def setAllowedHeaders(value: js.Array[String]): Self = StObject.set(x, "AllowedHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowedHeadersUndefined: Self = StObject.set(x, "AllowedHeaders", js.undefined)
      
      inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "AllowedHeaders", js.Array(value*))
      
      inline def setAllowedMethods(value: js.Array[String]): Self = StObject.set(x, "AllowedMethods", value.asInstanceOf[js.Any])
      
      inline def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "AllowedMethods", js.Array(value*))
      
      inline def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "AllowedOrigins", value.asInstanceOf[js.Any])
      
      inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "AllowedOrigins", js.Array(value*))
      
      inline def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
      
      inline def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
      
      inline def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "ExposeHeaders", js.Array(value*))
    }
  }
}
