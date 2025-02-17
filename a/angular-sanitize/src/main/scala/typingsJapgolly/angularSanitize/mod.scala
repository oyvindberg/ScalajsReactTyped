package typingsJapgolly.angularSanitize

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularSanitize.angularSanitizeStrings.linky
import typingsJapgolly.angularSanitize.anon.HtmlElements
import typingsJapgolly.angularSanitize.mod.angularAugmentingMod.sanitize.filter.ILinky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-sanitize", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    ///////////////////////////////////////////////////////////////////////////////
    // ngSanitize module (angular-sanitize.js)
    // see https://code.angularjs.org/1.7.0/docs/api/ngSanitize
    ///////////////////////////////////////////////////////////////////////////////
    object sanitize {
      
      ///////////////////////////////////////////////////////////////////////////////
      // Extend angular $filter declarations to include filters from angular.sanitize module
      ///////////////////////////////////////////////////////////////////////////////
      type IFilterService = js.Function1[linky, ILinky]
      
      /**
        * Creates and configures $sanitize instance.
        */
      @js.native
      trait ISanitizeProvider extends StObject {
        
        /**
          * Extends the built-in list of valid attributes, i.e. attributes that are considered safe and are not stripped off during sanitization.
          *
          * Note: The new attributes will not be treated as URI attributes, which means their
          * values will not be sanitized as URIs using $compileProvider's
          * aHrefSanitizationTrustedUrlList and imgSrcSanitizationTrustedUrlList.
          * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/provider/$sanitizeProvider#addValidAttrs
          * @param attrs A list of valid attributes.
          */
        def addValidAttrs(attrs: js.Array[String]): ISanitizeProvider = js.native
        
        /**
          * Extends the built-in lists of valid HTML/SVG elements, i.e. elements that are considered safe and are not stripped off during sanitization.
          *
          * You can extend the following lists of elements:
          * htmlElements: A list of elements (tag names) to extend the current list of safe HTML elements. HTML elements considered safe will not be removed during sanitization. All other elements will be stripped off.
          * htmlVoidElements: This is similar to htmlElements, but marks the elements as "void elements" (similar to HTML void elements). These elements have no end tag and cannot have content.
          * svgElements: This is similar to htmlElements, but for SVG elements. This list is only taken into account if SVG is enabled for $sanitize.
          *
          * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/provider/$sanitizeProvider#addValidElements
          * @param elements A list of valid HTML elements or an object with one or more of the following properties: htmlElements, htmlVoidElements, svgElements
          */
        def addValidElements(elements: js.Array[String]): ISanitizeProvider = js.native
        def addValidElements(elements: HtmlElements): ISanitizeProvider = js.native
        
        def enableSvg(): Boolean | ISanitizeProvider = js.native
        def enableSvg(flag: Boolean): Boolean | ISanitizeProvider = js.native
        /**
          * Enables a subset of svg to be supported by the sanitizer.
          *
          * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/provider/$sanitizeProvider#enableSvg
          * @param flag Enable or disable SVG support in the sanitizer.
          */
        @JSName("enableSvg")
        def enableSvg_Boolean(): Boolean = js.native
        @JSName("enableSvg")
        def enableSvg_ISanitizeProvider(flag: Boolean): ISanitizeProvider = js.native
      }
      
      /**
        * Sanitizes an html string by stripping all potentially dangerous tokens.
        *
        * The input is sanitized by parsing the HTML into tokens.
        * All safe tokens (from a trusted list) are then serialized back to a properly
        * escaped HTML string.
        * This means that no unsafe input can make it into the returned string.
        *
        * URLs allowed in attribute values are configured using the methods aHrefSanitizationTrustedUrlList
        * and imgSrcSanitizationTrustedUrlList of $compileProvider.
        * The input may also contain SVG markup if this is enabled via $sanitizeProvider.
        *
        * @param html HTML input.
        */
      type ISanitizeService = js.Function1[/* html */ String, String]
      
      object filter {
        
        /**
          * Finds links in text input and turns them into html links. Supports http/https/ftp/mailto and plain email address links.
          * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/filter/linky
          * @param text Input text.
          * @param target ILinkyTargetType Window (_blank|_self|_parent|_top) or named frame to open links in.
          * @param attributes Add custom attributes to the link element.
          * @return Html-linkified and sanitized text.
          */
        type ILinky = js.Function3[
                /* text */ String, 
                /* target */ js.UndefOr[String], 
                /* attributes */ js.UndefOr[
                  StringDictionary[String] | (js.Function1[/* url */ String, StringDictionary[String]])
                ], 
                String
              ]
      }
    }
  }
}
