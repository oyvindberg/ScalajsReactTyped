package typingsJapgolly.listr2.anon

import typingsJapgolly.listr2.listr2Strings.truncate
import typingsJapgolly.listr2.listr2Strings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearOutput extends StObject {
  
  /**
    * clear all the output generated by the renderer when the task finishes its execution
    *
    * @default false
    * @global global option that can not be temperated with subtasks
    */
  var clearOutput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * collapse subtasks after current task completes its execution
    *
    * @default true
    */
  var collapse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * collapse error messages into a single message and overwrite the task title
    *
    * @default true
    */
  var collapseErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * collapse skip messages into a single message and overwrite the task title
    *
    * @default true
    */
  var collapseSkips: js.UndefOr[Boolean] = js.undefined
  
  /**
    * formats data output depending on your requirements.
    *
    * @default 'truncate'
    * @global global option that can not be temperated with subtasks
    */
  var formatOutput: js.UndefOr[truncate | wrap] = js.undefined
  
  /**
    * indentation per level of subtask
    *
    * @default 2
    */
  var indentation: js.UndefOr[Double] = js.undefined
  
  /**
    * only update through triggers from renderhook
    *
    * useful for tests and stuff. this will disable showing spinner and only update the screen if something else has
    * happened in the task worthy to show
    *
    * @default false
    * @global global option that can not be temperated with subtasks
    */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * removes empty lines from the data output
    *
    * @default true
    */
  var removeEmptyLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * shows the thrown error message or show the original title of the task, this will also disable collapseErrors mode
    * You can disable showing the error messages, even though you passed in a message by settings this option,
    * if you want to keep the original task title intact.
    *
    * @default true
    */
  var showErrorMessage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * show skip messages or show the original title of the task, this will also disable collapseSkips mode
    *
    * You can disable showing the skip messages, even though you passed in a message by settings this option,
    * if you want to keep the original task title intact.
    *
    * @default true
    */
  var showSkipMessage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * show the subtasks of the current task
    *
    * @default true
    */
  var showSubtasks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * show duration for all tasks
    *
    * @default false
    * @global global option that can not be temperated with subtasks
    */
  var showTimer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * suffix retry messages with [RETRY-${COUNT}] when retry is enabled for a task
    *
    * @default true
    */
  var suffixRetries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * suffix skip messages with [SKIPPED] when in collapseSkips mode
    *
    * @default true
    */
  var suffixSkips: js.UndefOr[Boolean] = js.undefined
}
object ClearOutput {
  
  inline def apply(): ClearOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearOutput]
  }
  
  extension [Self <: ClearOutput](x: Self) {
    
    inline def setClearOutput(value: Boolean): Self = StObject.set(x, "clearOutput", value.asInstanceOf[js.Any])
    
    inline def setClearOutputUndefined: Self = StObject.set(x, "clearOutput", js.undefined)
    
    inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseErrors(value: Boolean): Self = StObject.set(x, "collapseErrors", value.asInstanceOf[js.Any])
    
    inline def setCollapseErrorsUndefined: Self = StObject.set(x, "collapseErrors", js.undefined)
    
    inline def setCollapseSkips(value: Boolean): Self = StObject.set(x, "collapseSkips", value.asInstanceOf[js.Any])
    
    inline def setCollapseSkipsUndefined: Self = StObject.set(x, "collapseSkips", js.undefined)
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setFormatOutput(value: truncate | wrap): Self = StObject.set(x, "formatOutput", value.asInstanceOf[js.Any])
    
    inline def setFormatOutputUndefined: Self = StObject.set(x, "formatOutput", js.undefined)
    
    inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setRemoveEmptyLines(value: Boolean): Self = StObject.set(x, "removeEmptyLines", value.asInstanceOf[js.Any])
    
    inline def setRemoveEmptyLinesUndefined: Self = StObject.set(x, "removeEmptyLines", js.undefined)
    
    inline def setShowErrorMessage(value: Boolean): Self = StObject.set(x, "showErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setShowErrorMessageUndefined: Self = StObject.set(x, "showErrorMessage", js.undefined)
    
    inline def setShowSkipMessage(value: Boolean): Self = StObject.set(x, "showSkipMessage", value.asInstanceOf[js.Any])
    
    inline def setShowSkipMessageUndefined: Self = StObject.set(x, "showSkipMessage", js.undefined)
    
    inline def setShowSubtasks(value: Boolean): Self = StObject.set(x, "showSubtasks", value.asInstanceOf[js.Any])
    
    inline def setShowSubtasksUndefined: Self = StObject.set(x, "showSubtasks", js.undefined)
    
    inline def setShowTimer(value: Boolean): Self = StObject.set(x, "showTimer", value.asInstanceOf[js.Any])
    
    inline def setShowTimerUndefined: Self = StObject.set(x, "showTimer", js.undefined)
    
    inline def setSuffixRetries(value: Boolean): Self = StObject.set(x, "suffixRetries", value.asInstanceOf[js.Any])
    
    inline def setSuffixRetriesUndefined: Self = StObject.set(x, "suffixRetries", js.undefined)
    
    inline def setSuffixSkips(value: Boolean): Self = StObject.set(x, "suffixSkips", value.asInstanceOf[js.Any])
    
    inline def setSuffixSkipsUndefined: Self = StObject.set(x, "suffixSkips", js.undefined)
  }
}
