package typingsJapgolly.shelljs.mod

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.shelljs.anon.ExecOptionsasyncfalseunde
import typingsJapgolly.shelljs.anon.ExecOptionsasynctrue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecFunction extends StObject {
  
  /**
    * Executes the given command synchronously.
    *
    * @param command The command to execute.
    * @return        Returns an object containing the return code and output as string.
    */
  def apply(command: String): ShellString = js.native
  /**
    * Executes the given command synchronously.
    *
    * @param command The command to execute.
    * @param callback Receives code and output asynchronously.
    */
  def apply(command: String, callback: ExecCallback): ChildProcess = js.native
  /**
    * Executes the given command synchronously.
    *
    * @param command The command to execute.
    * @param options Silence and synchronous options.
    * @return        Returns an object containing the return code and output as string,
    *                or if `{async: true}` was passed, a `ChildProcess`.
    */
  def apply(command: String, options: ExecOptionsasyncfalseunde): ShellString = js.native
  /**
    * Executes the given command asynchronously.
    *
    * @param command The command to execute.
    * @param options Silence and synchronous options.
    * @return        Returns an object containing the return code and output as string,
    *                or if `{async: true}` was passed, a `ChildProcess`.
    */
  def apply(command: String, options: ExecOptionsasynctrue): ChildProcess = js.native
  /**
    * Executes the given command.
    *
    * @param command The command to execute.
    * @param options Silence and synchronous options.
    * @return        Returns an object containing the return code and output as string,
    *                or if `{async: true}` was passed, a `ChildProcess`.
    */
  def apply(command: String, options: ExecOptions): ShellString | ChildProcess = js.native
  /**
    * Executes the given command synchronously.
    *
    * @param command The command to execute.
    * @param options Silence and synchronous options.
    * @param callback Receives code and output asynchronously.
    */
  def apply(command: String, options: ExecOptions, callback: ExecCallback): ChildProcess = js.native
}
