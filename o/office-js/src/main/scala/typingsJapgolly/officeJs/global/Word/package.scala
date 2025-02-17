package typingsJapgolly.officeJs.global.Word

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.global.Word.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Executes a batch script that performs actions on the Word object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Word application. Since the Office add-in and the Word application run in two different processes, the RequestContext is required to get access to the Word object model from the add-in.
  */
inline def run[T](batch: js.Function1[/* context */ typingsJapgolly.officeJs.Word.RequestContext, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
/**
  * Executes a batch script that performs actions on the Word object model, using the RequestContext of previously created API objects.
  * @param objects - An array of previously created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Word application. Since the Office add-in and the Word application run in two different processes, the RequestContext is required to get access to the Word object model from the add-in.
  */
inline def run[T](
  objects: js.Array[ClientObject],
  batch: js.Function1[/* context */ typingsJapgolly.officeJs.Word.RequestContext, js.Promise[T]]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
/**
  * Executes a batch script that performs actions on the Word object model, using the RequestContext of a previously created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
  * @param object - A previously created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Word application. Since the Office add-in and the Word application run in two different processes, the RequestContext is required to get access to the Word object model from the add-in.
  */
inline def run[T](
  `object`: ClientObject,
  batch: js.Function1[/* context */ typingsJapgolly.officeJs.Word.RequestContext, js.Promise[T]]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
