package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfig extends BaseConfig[ConfigFile] {
  
  def getAPIUrl(): String = js.native
  
  def getDashUrl(): String = js.native
  
  def getGitHost(): String = js.native
  
  def getGitPort(): Double = js.native
  
  def getHTTPConfig(): CreateRequestOptions = js.native
}
