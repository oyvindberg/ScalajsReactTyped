package typingsJapgolly.ngtoolsWebpack

import typingsJapgolly.std.Set
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersMod {
  
  @JSImport("@ngtools/webpack/src/transformers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ngtools/webpack/src/transformers", "NG_COMPONENT_RESOURCE_QUERY")
  @js.native
  val NG_COMPONENT_RESOURCE_QUERY: /* "ngResource" */ String = js.native
  
  inline def elideImports(
    sourceFile: SourceFile,
    removedNodes: js.Array[Node],
    getTypeChecker: js.Function0[TypeChecker],
    compilerOptions: CompilerOptions
  ): Set[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("elideImports")(sourceFile.asInstanceOf[js.Any], removedNodes.asInstanceOf[js.Any], getTypeChecker.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any])).asInstanceOf[Set[Node]]
  
  inline def getResourceUrl(node: Node): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceUrl")(node.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def replaceResources(
    shouldTransform: js.Function1[/* fileName */ String, Boolean],
    getTypeChecker: js.Function0[TypeChecker]
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResources")(shouldTransform.asInstanceOf[js.Any], getTypeChecker.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  inline def replaceResources(
    shouldTransform: js.Function1[/* fileName */ String, Boolean],
    getTypeChecker: js.Function0[TypeChecker],
    inlineStyleFileExtension: String
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResources")(shouldTransform.asInstanceOf[js.Any], getTypeChecker.asInstanceOf[js.Any], inlineStyleFileExtension.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
