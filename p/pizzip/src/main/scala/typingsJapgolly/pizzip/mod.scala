package typingsJapgolly.pizzip

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.processMod.global.NodeJS.Platform
import typingsJapgolly.pizzip.anon.Base64
import typingsJapgolly.pizzip.anon.GenerateOptionstypearrayb
import typingsJapgolly.pizzip.anon.GenerateOptionstypeblob
import typingsJapgolly.pizzip.anon.GenerateOptionstypenodebu
import typingsJapgolly.pizzip.anon.GenerateOptionstypestring
import typingsJapgolly.pizzip.anon.GenerateOptionstypeuint8a
import typingsJapgolly.pizzip.anon.Level
import typingsJapgolly.pizzip.pizzipStrings.DOS
import typingsJapgolly.pizzip.pizzipStrings.UNIX
import typingsJapgolly.pizzip.pizzipStrings.arraybuffer
import typingsJapgolly.pizzip.pizzipStrings.base64
import typingsJapgolly.pizzip.pizzipStrings.blob
import typingsJapgolly.pizzip.pizzipStrings.nodebuffer
import typingsJapgolly.pizzip.pizzipStrings.string
import typingsJapgolly.pizzip.pizzipStrings.uint8array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pizzip", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PizZip {
    /**
      * Specifying data & options is a shortcut for new PizZip().load(data, options);
      *
      * @param data the zip file
      * @param options the options to load the zip file
      */
    // tslint:disable-next-line unified-signatures new (undefined, {options}) is not an acceptable input
    def this(data: LoadData) = this()
    def this(data: LoadData, options: LoadOptions) = this()
  }
  
  /**
    * If the browser supports them, PizZip can take advantage of some "new" features : ArrayBuffer, Blob, Uint8Array.
    * To know if PizZip can use them, you can check the PizZip.support object.
    */
  /* static member */
  object support {
    
    @JSImport("pizzip", "support")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * true if PizZip can read and generate ArrayBuffer, false otherwise.
      */
    @JSImport("pizzip", "support.arraybuffer")
    @js.native
    def arraybuffer: Boolean = js.native
    inline def arraybuffer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arraybuffer")(x.asInstanceOf[js.Any])
    
    /**
      * true if PizZip can read and generate Blob, false otherwise.
      */
    @JSImport("pizzip", "support.blob")
    @js.native
    def blob: Boolean = js.native
    inline def blob_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blob")(x.asInstanceOf[js.Any])
    
    /**
      * true if PizZip can read and generate nodejs Buffer, false otherwise.
      */
    @JSImport("pizzip", "support.nodebuffer")
    @js.native
    def nodebuffer: Boolean = js.native
    inline def nodebuffer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodebuffer")(x.asInstanceOf[js.Any])
    
    /**
      * true if PizZip can read and generate Uint8Array, false otherwise.
      */
    @JSImport("pizzip", "support.uint8array")
    @js.native
    def uint8array: Boolean = js.native
    inline def uint8array_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8array")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pizzip.pizzipStrings.STORE
    - typingsJapgolly.pizzip.pizzipStrings.DEFLATE
  */
  trait Compression extends StObject
  object Compression {
    
    inline def DEFLATE: typingsJapgolly.pizzip.pizzipStrings.DEFLATE = "DEFLATE".asInstanceOf[typingsJapgolly.pizzip.pizzipStrings.DEFLATE]
    
    inline def STORE: typingsJapgolly.pizzip.pizzipStrings.STORE = "STORE".asInstanceOf[typingsJapgolly.pizzip.pizzipStrings.STORE]
  }
  
  type Data = String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | Buffer
  
  trait FileOptions extends StObject {
    
    /**
      * set to `true` if the data is base64 encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * set to `true` if the data should be treated as raw content, `false` if this is a text. If base64 is used, this defaults to `true`,
      * if the data is not a string, this will be set to `true`.
      * @default false
      */
    var binary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment for this file.
      * the zip format has no flag or field to give the encoding of this field and PizZip will use UTF-8.
      * With non ASCII characters you might get encoding issues if the file archiver doesn't use UTF-8 to decode the comment.
      * If not set, PizZip will use the field comment on its options.
      * @default null
      */
    var comment: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If set, specifies compression method to use for this specific file. If not, the default file compression will be used (no compression)
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}` (or any level between 1 (best speed) and 9 (best compression)).
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.undefined
    
    /**
      * Set to true if folders in the file path should be automatically created,
      * otherwise there will only be virtual folders that represent the path to the file.
      * @default false
      */
    var createFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the last modification date. defaults to the current date
      */
    var date: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Set to true if this is a directory and content should be ignored.
      * If true or if a permission says it's a folder, this entry be flagged as a folder and the content will be ignored.
      * @default false
      */
    var dir: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The DOS  permissions of the file, if any.
      * @default null
      */
    var dosPermissions: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Set to true if (and only if) the input is a "binary string" and has already been prepared with a 0xFF mask.
      * @default false
      */
    var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc.
      * On nodejs you can use the `mode` attribute of nodejs' fs.Stats.
      * @default null
      */
    var unixPermissions: js.UndefOr[Double | String | Null] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentNull: Self = StObject.set(x, "comment", null)
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCreateFolders(value: Boolean): Self = StObject.set(x, "createFolders", value.asInstanceOf[js.Any])
      
      inline def setCreateFoldersUndefined: Self = StObject.set(x, "createFolders", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDosPermissions(value: Double): Self = StObject.set(x, "dosPermissions", value.asInstanceOf[js.Any])
      
      inline def setDosPermissionsNull: Self = StObject.set(x, "dosPermissions", null)
      
      inline def setDosPermissionsUndefined: Self = StObject.set(x, "dosPermissions", js.undefined)
      
      inline def setOptimizedBinaryString(value: Boolean): Self = StObject.set(x, "optimizedBinaryString", value.asInstanceOf[js.Any])
      
      inline def setOptimizedBinaryStringUndefined: Self = StObject.set(x, "optimizedBinaryString", js.undefined)
      
      inline def setUnixPermissions(value: Double | String): Self = StObject.set(x, "unixPermissions", value.asInstanceOf[js.Any])
      
      inline def setUnixPermissionsNull: Self = StObject.set(x, "unixPermissions", null)
      
      inline def setUnixPermissionsUndefined: Self = StObject.set(x, "unixPermissions", js.undefined)
    }
  }
  
  trait GenerateOptions extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.undefined
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.undefined
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.undefined
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      inline def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setType(value: base64 | string | uint8array | arraybuffer | blob | nodebuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type LoadData = Data | js.Array[Double]
  
  trait LoadOptions extends StObject {
    
    /**
      * set to true if the data is base64 encoded, false for binary.
      *
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * set to true if the read data should be checked against its CRC32.
      *
      * @default false
      */
    var checkCRC32: js.UndefOr[Boolean] = js.undefined
    
    /**
      * set to true to create folders in the file path automatically. Leaving it false will result in only virtual folders
      * (i.e. folders that merely represent part of the file path) being created.
      *
      * @default false
      */
    var createFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the function to decode the file name / comment. Decodes from UTF-8 by default.
      * A zip file has a flag to say if the filename and comment are encoded with UTF-8.
      * If it's not set, PizZip has no way to know the encoding used. It usually is the default encoding of the operating system.
      * The function takes the bytes array (Uint8Array or Array) and returns the decoded string.
      */
    var decodeFileName: js.UndefOr[js.Function1[/* bytes */ js.typedarray.Uint8Array | js.Array[Double], String]] = js.undefined
    
    /**
      * set to true if (and only if) the input is a string and has already been prepared with a 0xFF mask.
      *
      * @default false
      */
    var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    extension [Self <: LoadOptions](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setCheckCRC32(value: Boolean): Self = StObject.set(x, "checkCRC32", value.asInstanceOf[js.Any])
      
      inline def setCheckCRC32Undefined: Self = StObject.set(x, "checkCRC32", js.undefined)
      
      inline def setCreateFolders(value: Boolean): Self = StObject.set(x, "createFolders", value.asInstanceOf[js.Any])
      
      inline def setCreateFoldersUndefined: Self = StObject.set(x, "createFolders", js.undefined)
      
      inline def setDecodeFileName(value: /* bytes */ js.typedarray.Uint8Array | js.Array[Double] => String): Self = StObject.set(x, "decodeFileName", js.Any.fromFunction1(value))
      
      inline def setDecodeFileNameUndefined: Self = StObject.set(x, "decodeFileName", js.undefined)
      
      inline def setOptimizedBinaryString(value: Boolean): Self = StObject.set(x, "optimizedBinaryString", value.asInstanceOf[js.Any])
      
      inline def setOptimizedBinaryStringUndefined: Self = StObject.set(x, "optimizedBinaryString", js.undefined)
    }
  }
  
  @js.native
  trait PizZip extends StObject {
    
    /**
      * the comment of the zip file.
      */
    var comment: String = js.native
    
    /**
      * Get a file with the specified name. You can specify folders in the name : the folder separator is a forward slash ("/").
      * @param name the name of the file.
      */
    def file(name: String): ZipObject | Null = js.native
    /**
      * Add (or update) a file to the zip file.
      * You shouldn't update the data given to this method : it is kept as it so any update will impact the stored data.
      * Throws an exception if the data is not in a supported format.
      * @param name the name of the file. You can specify folders in the name : the folder separator is a forward slash ("/").
      * @param data the content of the file.
      * @param options the options.
      */
    def file(name: String, data: Data): this.type = js.native
    def file(name: String, data: Data, options: FileOptions): this.type = js.native
    /**
      * Search a file in the current folder and subfolders with a regular expression. The regex is tested against the relative filename.
      * @param regex the regex to use.
      */
    def file(regex: js.RegExp): js.Array[ZipObject] = js.native
    
    /**
      * the ZipObjects inside the zip with the name as key.
      */
    var files: StringDictionary[ZipObject] = js.native
    
    /**
      * Filter nested files/folders with the specified function. The predicate must return true if the file should be included, false otherwise.
      * @param predicate the predicate to use.
      */
    def filter(predicate: js.Function2[/* relativePath */ String, /* file */ ZipObject, Boolean]): js.Array[ZipObject] = js.native
    
    /**
      * Create a directory if it doesn't exist, return a new PizZip object with the new folder as root.
      * @param name the name of the directory.
      */
    def folder(name: String): this.type = js.native
    /**
      * Search a subdirectory in the current directory with a regular expression. The regex is tested against the relative path.
      * @param regex the regex to use.
      */
    def folder(regex: js.RegExp): js.Array[ZipObject] = js.native
    
    /**
      * Generates the complete zip file.
      * Throws an exception if the asked type is not available in the browser,
      * see https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
      * @param options the options to generate the zip file
      */
    def generate(): String = js.native
    def generate(options: GenerateOptionstypearrayb): js.typedarray.ArrayBuffer = js.native
    def generate(options: GenerateOptionstypeblob): Blob = js.native
    def generate(options: GenerateOptionstypenodebu): Buffer = js.native
    def generate(options: GenerateOptionstypestring): String = js.native
    def generate(options: GenerateOptionstypeuint8a): js.typedarray.Uint8Array = js.native
    
    /**
      * Read an existing zip and merge the data in the current PizZip object at the current folder level.
      * This technique has some limitations, see https://github.com/open-xml-templating/pizzip/blob/master/documentation/limitations.md
      * You shouldn't update the data given to this method : it is kept as it so any update will impact the stored data.
      * Throws an exception if the loaded data is not valid zip data or if it uses features (multi volume, password protected, etc).
      * @param data the zip file
      * @param options the options to load the zip file
      */
    def load(data: LoadData): this.type = js.native
    def load(data: LoadData, options: LoadOptions): this.type = js.native
    
    /**
      * Delete a file or folder (recursively).
      * @param name the name of the file/folder to delete.
      */
    def remove(name: String): this.type = js.native
  }
  
  trait ZipObject extends StObject {
    
    /**
      * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
      */
    def asArrayBuffer(): js.typedarray.ArrayBuffer
    
    /**
      * the content as binary string.
      */
    def asBinary(): String
    
    /**
      * need nodejs. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
      */
    def asNodeBuffer(): Buffer
    
    /**
      * the content as an unicode string.
      */
    def asText(): String
    
    /**
      * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
      */
    def asUint8Array(): js.typedarray.Uint8Array
    
    /**
      * the comment for this file
      */
    var comment: String
    
    /**
      * the last modification date
      */
    var date: js.Date
    
    /**
      * true if this is a directory
      */
    var dir: Boolean
    
    /**
      * The DOS permissions of the file, if any.
      */
    var dosPermissions: Double
    
    /**
      * the absolute path of the file
      */
    var name: String
    
    /**
      * the options of the file.
      */
    var options: Base64
    
    /**
      * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc. On nodejs you can use the mode attribute of nodejs' fs.Stats.
      */
    var unixPermissions: Double | String
  }
  object ZipObject {
    
    inline def apply(
      asArrayBuffer: CallbackTo[js.typedarray.ArrayBuffer],
      asBinary: CallbackTo[String],
      asNodeBuffer: CallbackTo[Buffer],
      asText: CallbackTo[String],
      asUint8Array: CallbackTo[js.typedarray.Uint8Array],
      comment: String,
      date: js.Date,
      dir: Boolean,
      dosPermissions: Double,
      name: String,
      options: Base64,
      unixPermissions: Double | String
    ): ZipObject = {
      val __obj = js.Dynamic.literal(asArrayBuffer = asArrayBuffer.toJsFn, asBinary = asBinary.toJsFn, asNodeBuffer = asNodeBuffer.toJsFn, asText = asText.toJsFn, asUint8Array = asUint8Array.toJsFn, comment = comment.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dosPermissions = dosPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], unixPermissions = unixPermissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipObject]
    }
    
    extension [Self <: ZipObject](x: Self) {
      
      inline def setAsArrayBuffer(value: CallbackTo[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "asArrayBuffer", value.toJsFn)
      
      inline def setAsBinary(value: CallbackTo[String]): Self = StObject.set(x, "asBinary", value.toJsFn)
      
      inline def setAsNodeBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "asNodeBuffer", value.toJsFn)
      
      inline def setAsText(value: CallbackTo[String]): Self = StObject.set(x, "asText", value.toJsFn)
      
      inline def setAsUint8Array(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "asUint8Array", value.toJsFn)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDosPermissions(value: Double): Self = StObject.set(x, "dosPermissions", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Base64): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUnixPermissions(value: Double | String): Self = StObject.set(x, "unixPermissions", value.asInstanceOf[js.Any])
    }
  }
}
