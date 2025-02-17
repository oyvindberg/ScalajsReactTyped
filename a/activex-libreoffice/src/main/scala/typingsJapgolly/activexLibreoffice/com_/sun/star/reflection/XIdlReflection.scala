package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to reflect types.
  * @see CoreReflection
  * @see XIdlClass
  */
@js.native
trait XIdlReflection
  extends StObject
     with XInterface {
  
  /**
    * Obtaining a reflection interface for a type. You specify the type by its name. If the given type name can not be reflected, then a null-reference is
    * returned.
    * @param aTypeName the type's name
    * @returns reflection interface for the demanded type (or null)
    */
  def forName(aTypeName: String): XIdlClass[Any] = js.native
  def forName[K /* <: /* keyof activex-libreoffice.LibreOffice.InstantiableNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1752, starting with typingsJapgolly.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotAccessible, typingsJapgolly.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotAccessibleContext, typingsJapgolly.activexLibreoffice.activexLibreofficeStrings.comDotsunDotstarDotaccessibilityDotMSAAService */ Any */](aTypeName: K): XIdlClass[
    /* import warning: importer.ImportType#apply Failed type conversion: activex-libreoffice.LibreOffice.InstantiableNameMap[K] */ js.Any
  ] = js.native
  
  /**
    * Obtaining a reflection interface for an object. This method takes the type of the object the any contains into account. If the any contains no object,
    * then a null-reference is returned.
    * @param aObj an object
    * @returns reflection interface of the type of the demanded object (or null)
    */
  def getType(aObj: Any): XIdlClass[Any] = js.native
}
