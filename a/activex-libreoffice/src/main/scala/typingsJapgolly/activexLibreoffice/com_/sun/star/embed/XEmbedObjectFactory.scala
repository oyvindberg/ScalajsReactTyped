package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to create and initialize a new embedded object of specified type.
  *
  * This interface provides user with full control over object creation.
  */
trait XEmbedObjectFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a new object and transport parameters for persistent initialization.
    *
    * This method can be used to have a full control over persistence initialization of a object.
    *
    * If the service implementation does not support {@link XEmbedObjectCreator} interface, it must accept the empty aClassID parameter in case of loading
    * from existing entry.
    * @param aClassID the class id of the new object
    * @param sClassName the class name of the new object
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntName a name for the entry
    * @param nEntryConnectionMode a mode in which the object should be initialized from entry can take values from {@link EntryInitModes} constant set
    * @param aArgs optional parameters for the embedded document persistence initialization, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object persistence initialization, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceUserInit(
    aClassID: SeqEquiv[Double],
    sClassName: String,
    xStorage: XStorage,
    sEntName: String,
    nEntryConnectionMode: Double,
    aArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): XInterface
}
object XEmbedObjectFactory {
  
  inline def apply(
    acquire: Callback,
    createInstanceUserInit: (SeqEquiv[Double], String, XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XEmbedObjectFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInstanceUserInit = js.Any.fromFunction7(createInstanceUserInit), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEmbedObjectFactory]
  }
  
  extension [Self <: XEmbedObjectFactory](x: Self) {
    
    inline def setCreateInstanceUserInit(
      value: (SeqEquiv[Double], String, XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface
    ): Self = StObject.set(x, "createInstanceUserInit", js.Any.fromFunction7(value))
  }
}
