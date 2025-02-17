package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * encapsulates access to the current office installation directory and office user data directory, provides functionality to create URLs containing
  * relocatable (not absolute) references to the current office installation directory and user data directory and vice versa.
  *
  * This functionality is useful when data containing references to the current office installation directory must be made persistent and re-read later.
  * In many cases, storing the reference directly would destroy the relocatability of an office installation.
  * @since OOo 2.0
  */
trait XOfficeInstallationDirectories
  extends StObject
     with XInterface {
  
  /**
    * returns the absolute {@link URL} containing the directory of the current office installation (for example "file:///opt/LibreOffice")
    * @returns the absolute {@link URL} containing the directory of the current office installation.
    */
  val OfficeInstallationDirectoryURL: String
  
  /**
    * returns the absolute {@link URL} containing the directory where the current office installation expects its user data (for example
    * "file:///home/kso/.config/libreoffice/4")
    * @returns the absolute {@link URL} containing the directory of the current office user data.
    */
  val OfficeUserDataDirectoryURL: String
  
  /**
    * returns the absolute {@link URL} containing the directory of the current office installation (for example "file:///opt/LibreOffice")
    * @returns the absolute {@link URL} containing the directory of the current office installation.
    */
  def getOfficeInstallationDirectoryURL(): String
  
  /**
    * returns the absolute {@link URL} containing the directory where the current office installation expects its user data (for example
    * "file:///home/kso/.config/libreoffice/4")
    * @returns the absolute {@link URL} containing the directory of the current office user data.
    */
  def getOfficeUserDataDirectoryURL(): String
  
  /**
    * the counterpart of `makeRelocatableURL` .
    *
    * If the given {@link URL} contains a placeholder for an absolute reference to the current office installation directory or for the office user data
    * directory, that was created using `makeRelocatableURL` , the respective placeholder will be replaced by an absolute reference to the current office
    * installation directory or office user data directory.
    * @param URL The {@link URL} for that an absolute {@link URL} is requested. In case the {@link URL} does not contain the opaque relocation placeholder use
    * @returns The absolute {@link URL} .
    */
  def makeAbsoluteURL(URL: String): String
  
  /**
    * calculates a relocatable {@link URL} from the given {@link URL} .
    *
    * If the given {@link URL} contains an absolute reference to the current office installation directory or office user data directory, this method will
    * replace the absolute reference by an opaque placeholder string. `makeRelocatableURL` must be used in order to re-replace the placeholder by an
    * absolute reference.
    * @param URL The {@link URL} for that a relocatable {@link URL} is requested. In case the {@link URL} does not contain a reference to the current office i
    * @returns The relocatable {@link URL} .
    */
  def makeRelocatableURL(URL: String): String
}
object XOfficeInstallationDirectories {
  
  inline def apply(
    OfficeInstallationDirectoryURL: String,
    OfficeUserDataDirectoryURL: String,
    acquire: Callback,
    getOfficeInstallationDirectoryURL: CallbackTo[String],
    getOfficeUserDataDirectoryURL: CallbackTo[String],
    makeAbsoluteURL: String => String,
    makeRelocatableURL: String => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XOfficeInstallationDirectories = {
    val __obj = js.Dynamic.literal(OfficeInstallationDirectoryURL = OfficeInstallationDirectoryURL.asInstanceOf[js.Any], OfficeUserDataDirectoryURL = OfficeUserDataDirectoryURL.asInstanceOf[js.Any], acquire = acquire.toJsFn, getOfficeInstallationDirectoryURL = getOfficeInstallationDirectoryURL.toJsFn, getOfficeUserDataDirectoryURL = getOfficeUserDataDirectoryURL.toJsFn, makeAbsoluteURL = js.Any.fromFunction1(makeAbsoluteURL), makeRelocatableURL = js.Any.fromFunction1(makeRelocatableURL), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XOfficeInstallationDirectories]
  }
  
  extension [Self <: XOfficeInstallationDirectories](x: Self) {
    
    inline def setGetOfficeInstallationDirectoryURL(value: CallbackTo[String]): Self = StObject.set(x, "getOfficeInstallationDirectoryURL", value.toJsFn)
    
    inline def setGetOfficeUserDataDirectoryURL(value: CallbackTo[String]): Self = StObject.set(x, "getOfficeUserDataDirectoryURL", value.toJsFn)
    
    inline def setMakeAbsoluteURL(value: String => String): Self = StObject.set(x, "makeAbsoluteURL", js.Any.fromFunction1(value))
    
    inline def setMakeRelocatableURL(value: String => String): Self = StObject.set(x, "makeRelocatableURL", js.Any.fromFunction1(value))
    
    inline def setOfficeInstallationDirectoryURL(value: String): Self = StObject.set(x, "OfficeInstallationDirectoryURL", value.asInstanceOf[js.Any])
    
    inline def setOfficeUserDataDirectoryURL(value: String): Self = StObject.set(x, "OfficeUserDataDirectoryURL", value.asInstanceOf[js.Any])
  }
}
