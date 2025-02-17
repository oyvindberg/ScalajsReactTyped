package typingsJapgolly.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringifyOptions extends StObject {
  
  /** Omit comments and extraneous whitespace. */
  var compress: js.UndefOr[Boolean] = js.undefined
  
  /** The string used to indent the output. Defaults to two spaces. */
  var indent: js.UndefOr[String] = js.undefined
  
  /** (enabled by default, specify false to disable)
    *  Reads any source maps referenced by the input files 
    * when generating the output source map. When enabled, 
    * file system access may be required for reading the referenced source maps. 
    */
  var inputSourcemaps: js.UndefOr[Boolean] = js.undefined
  
  /** Return a sourcemap along with the CSS output. 
    * Using the source option of css.parse is strongly recommended 
    * when creating a source map. Specify sourcemap: 'generator' 
    * to return the SourceMapGenerator object instead of serializing the source map. 
    */
  var sourcemap: js.UndefOr[String] = js.undefined
}
object StringifyOptions {
  
  inline def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  
  extension [Self <: StringifyOptions](x: Self) {
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setInputSourcemaps(value: Boolean): Self = StObject.set(x, "inputSourcemaps", value.asInstanceOf[js.Any])
    
    inline def setInputSourcemapsUndefined: Self = StObject.set(x, "inputSourcemaps", js.undefined)
    
    inline def setSourcemap(value: String): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
  }
}
