package typingsJapgolly.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the document file associated with an Office Add-in.
  *
  * @remarks
  *
  * Access the File object with the AsyncResult.value property in the callback function passed to the Document.getFileAsync method.
  *
  */
@js.native
trait File extends StObject {
  
  /**
    * Closes the document file.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#file | File}
    *
    * No more than two documents are allowed to be in memory; otherwise the Document.getFileAsync operation will fail. Use the File.closeAsync
    * method to close the file when you are finished working with it.
    *
    * In the callback function passed to the closeAsync method, you can use the properties of the AsyncResult object to return the following
    * information.
    *
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use</th>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.value</code></td>
    *     <td>Always returns <code>undefined</code> because there is no object or data to retrieve</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.status</code></td>
    *     <td>Determine the success or failure of the operation</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.error</code></td>
    *     <td>Access an Error object that provides error information if the operation failed</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.asyncContext</code></td>
    *     <td>Define an item of any type that is returned in the AsyncResult object without being altered</td>
    *   </tr>
    * </table>
    *
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def closeAsync(): Unit = js.native
  def closeAsync(callback: js.Function1[/* result */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Returns the specified slice.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#file | File}
    *
    * In the callback function passed to the getSliceAsync method, you can use the properties of the AsyncResult object to return the following
    * information.
    *
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use</th>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.value</code></td>
    *     <td>Access the Slice object</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.status</code></td>
    *     <td>Determine the success or failure of the operation</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.error</code></td>
    *     <td>Access an Error object that provides error information if the operation failed</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.asyncContext</code></td>
    *     <td>Define an item of any type that is returned in the AsyncResult object without being altered</td>
    *   </tr>
    * </table>
    *
    * @param sliceIndex Specifies the zero-based index of the slice to be retrieved. Required.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the {@link Office.Slice} object.
    */
  def getSliceAsync(sliceIndex: Double): Unit = js.native
  def getSliceAsync(sliceIndex: Double, callback: js.Function1[/* result */ AsyncResult[Slice], Unit]): Unit = js.native
  
  /**
    * Gets the document file size in bytes.
    */
  var size: Double = js.native
  
  /**
    * Gets the number of slices into which the file is divided.
    */
  var sliceCount: Double = js.native
}
