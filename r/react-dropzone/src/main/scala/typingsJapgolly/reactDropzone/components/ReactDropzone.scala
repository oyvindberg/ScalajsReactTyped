package typingsJapgolly.reactDropzone.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.File
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactDropzone.mod.Accept
import typingsJapgolly.reactDropzone.mod.DropEvent
import typingsJapgolly.reactDropzone.mod.DropzoneProps
import typingsJapgolly.reactDropzone.mod.DropzoneRef
import typingsJapgolly.reactDropzone.mod.DropzoneState
import typingsJapgolly.reactDropzone.mod.FileError
import typingsJapgolly.reactDropzone.mod.FileRejection
import typingsJapgolly.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDropzone {
  
  @JSImport("react-dropzone", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[DropzoneRef] {
    
    inline def accept(value: Accept): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def children(value: /* state */ DropzoneState => Element): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def getFilesFromEvent(value: /* event */ DropEvent => js.Promise[js.Array[File | DataTransferItem]]): this.type = set("getFilesFromEvent", js.Any.fromFunction1(value))
    
    inline def maxFiles(value: Double): this.type = set("maxFiles", value.asInstanceOf[js.Any])
    
    inline def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    inline def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def noClick(value: Boolean): this.type = set("noClick", value.asInstanceOf[js.Any])
    
    inline def noDrag(value: Boolean): this.type = set("noDrag", value.asInstanceOf[js.Any])
    
    inline def noDragEventsBubbling(value: Boolean): this.type = set("noDragEventsBubbling", value.asInstanceOf[js.Any])
    
    inline def noKeyboard(value: Boolean): this.type = set("noKeyboard", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrop(
      value: (/* acceptedFiles */ js.Array[File], /* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Callback
    ): this.type = set("onDrop", js.Any.fromFunction3((t0: /* acceptedFiles */ js.Array[File], t1: /* fileRejections */ js.Array[FileRejection], t2: /* event */ DropEvent) => (value(t0, t1, t2)).runNow()))
    
    inline def onDropAccepted(value: (/* files */ js.Array[File], /* event */ DropEvent) => Callback): this.type = set("onDropAccepted", js.Any.fromFunction2((t0: /* files */ js.Array[File], t1: /* event */ DropEvent) => (value(t0, t1)).runNow()))
    
    inline def onDropRejected(value: (/* fileRejections */ js.Array[FileRejection], /* event */ DropEvent) => Callback): this.type = set("onDropRejected", js.Any.fromFunction2((t0: /* fileRejections */ js.Array[FileRejection], t1: /* event */ DropEvent) => (value(t0, t1)).runNow()))
    
    inline def onError(value: /* err */ js.Error => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
    
    inline def onFileDialogCancel(value: Callback): this.type = set("onFileDialogCancel", value.toJsFn)
    
    inline def onFileDialogOpen(value: Callback): this.type = set("onFileDialogOpen", value.toJsFn)
    
    inline def preventDropOnDocument(value: Boolean): this.type = set("preventDropOnDocument", value.asInstanceOf[js.Any])
    
    inline def useFsAccessApi(value: Boolean): this.type = set("useFsAccessApi", value.asInstanceOf[js.Any])
    
    inline def validator(value: /* file */ File => FileError | js.Array[FileError] | Null): this.type = set("validator", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ReactDropzone.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropzoneProps & RefAttributes[DropzoneRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
