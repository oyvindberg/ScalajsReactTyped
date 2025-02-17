package typingsJapgolly.angularLocalize

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typingsJapgolly.angularLocalize.mod.ɵParsedMessage
import typingsJapgolly.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractSourceFilesEs5ExtractPluginMod {
  
  @JSImport("@angular/localize/tools/src/extract/source_files/es5_extract_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeEs5ExtractPlugin(fs: PathManipulation, messages: js.Array[ɵParsedMessage]): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5ExtractPlugin")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs5ExtractPlugin(fs: PathManipulation, messages: js.Array[ɵParsedMessage], localizeName: String): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5ExtractPlugin")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], localizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
}
