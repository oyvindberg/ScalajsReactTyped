package typingsJapgolly.concurrently

import typingsJapgolly.concurrently.distSrcCommandMod.CommandInfo
import typingsJapgolly.concurrently.distSrcCommandParserCommandParserMod.CommandParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandParserExpandNpmShortcutMod {
  
  @JSImport("concurrently/dist/src/command-parser/expand-npm-shortcut", "ExpandNpmShortcut")
  @js.native
  open class ExpandNpmShortcut ()
    extends StObject
       with CommandParser {
    
    /**
      * Parses `commandInfo` and returns one or more `CommandInfo`s.
      *
      * Returning multiple `CommandInfo` is used when there are multiple possibilities of commands to
      * run given the original input.
      * An example of this is when the command contains a wildcard and it must be expanded into all
      * viable options so that the consumer can decide which ones to run.
      */
    /* CompleteClass */
    override def parse(commandInfo: CommandInfo): CommandInfo | js.Array[CommandInfo] = js.native
  }
}
