package typingsJapgolly.marko

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.marko.srcCompilerTaglibLoaderAttributeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompilerTaglibLoaderTagMod {
  
  @JSImport("marko/src/compiler/taglib-loader/Tag", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Tag {
    def this(filePath: String) = this()
  }
  
  @js.native
  trait Tag extends StObject {
    
    def addAttribute(attr: default): Unit = js.native
    
    def addImportedVariable(importedVariable: Any): Unit = js.native
    
    def addNestedTag(nestedTag: Tag): Unit = js.native
    
    def addNestedVariable(nestedVariable: Any): Unit = js.native
    
    def addTransformer(transformer: typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default): Unit = js.native
    
    var attributeGroups: js.Array[String] = js.native
    
    var attributes: StringDictionary[default] = js.native
    
    var body: Any = js.native
    
    var bodyFunction: Any = js.native
    
    var codeGeneratorModulePath: String | Null = js.native
    
    var dir: String = js.native
    
    def forEachAttribute(callback: js.Function1[/* attr */ default, Unit]): Unit = js.native
    def forEachAttribute(callback: js.Function1[/* attr */ default, Unit], thisObj: Any): Unit = js.native
    
    def forEachImportedVariable(callback: js.Function1[/* importedVariable */ Any, Unit]): Unit = js.native
    def forEachImportedVariable(callback: js.Function1[/* importedVariable */ Any, Unit], thisObj: Any): Unit = js.native
    
    def forEachNestedTag(callback: js.Function1[/* nestedTag */ this.type, Unit]): Unit = js.native
    def forEachNestedTag(callback: js.Function1[/* nestedTag */ this.type, Unit], thisObj: Any): Unit = js.native
    
    def forEachTransformer(
      callback: js.Function1[
          /* transformer */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Unit
        ]
    ): Unit = js.native
    def forEachTransformer(
      callback: js.Function1[
          /* transformer */ typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default, 
          Unit
        ],
      thisObj: Any
    ): Unit = js.native
    
    def forEachVariable(callback: js.Function1[/* nestedVariable */ Any, Unit]): Unit = js.native
    def forEachVariable(callback: js.Function1[/* nestedVariable */ Any, Unit], thisObj: Any): Unit = js.native
    
    def getAttribute(attrName: String): js.UndefOr[default] = js.native
    
    def getNodeFactory(): Any = js.native
    
    def hasAttribute(attrName: String): Boolean = js.native
    
    def hasNestedTags(): Boolean = js.native
    
    def hasTransformers(): Boolean = js.native
    
    var importedVariables: Any = js.native
    
    var isNestedTag: Boolean = js.native
    
    var isRepeated: Boolean | Null = js.native
    
    var name: String = js.native
    
    var nestedTags: StringDictionary[Tag] | Null = js.native
    
    var nestedVariables: Any = js.native
    
    var nodeFactoryPath: String | Null = js.native
    
    var openTagOnly: Any = js.native
    
    var parentTagName: String | Null = js.native
    
    var patternAttributes: js.Array[default] = js.native
    
    var renderer: Any = js.native
    
    def setBodyFunction(name: String, params: Any): Unit = js.native
    
    def setBodyProperty(propertyName: String): Unit = js.native
    
    def setTaglib(taglib: typingsJapgolly.marko.srcCompilerTaglibLoaderTaglibMod.default): Unit = js.native
    
    var taglibId: String | Null = js.native
    
    var taglibPath: String | Null = js.native
    
    var targetProperty: js.UndefOr[String] = js.native
    
    var template: Any = js.native
    
    var transformers: StringDictionary[typingsJapgolly.marko.srcCompilerTaglibLoaderTransformerMod.default] = js.native
    
    var `type`: Any = js.native
  }
}
