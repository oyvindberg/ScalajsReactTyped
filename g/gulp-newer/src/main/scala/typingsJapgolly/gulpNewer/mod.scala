package typingsJapgolly.gulpNewer

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-newer", JSImport.Namespace)
  @js.native
  val ^ : IGulpNewer = js.native
  
  @js.native
  trait IGulpNewer extends StObject {
    
    /**
      * Create a transform stream that passes through files whose modification time
      * is more recent than the corresponding destination file's modification time.
      * @param dest Path to destination directory or file.
      */
    def apply(dest: String): ReadWriteStream = js.native
    /**
      * Create a transform stream that passes through files whose modification time
      * is more recent than the corresponding destination file's modification time.
      */
    def apply(options: IOptions): ReadWriteStream = js.native
  }
  
  trait IOptions extends StObject {
    
    /**
      * Path to destination directory or file.
      */
    var dest: String
    
    /**
      * Source files will be matched to destination files with the provided extension.
      */
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * Map relative source paths to relative destination paths.
      */
    var map: js.UndefOr[js.Function1[/* relativePath */ String, String]] = js.undefined
  }
  object IOptions {
    
    inline def apply(dest: String): IOptions = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setMap(value: /* relativePath */ String => String): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  type _To = IGulpNewer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpNewer = ^
}
