package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationOptionsDescription extends StObject {
  
  /**
    *  A list of ConfigurationOptionDescription. 
    */
  var Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.undefined
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  
  /**
    * The name of the solution stack these configuration options belong to.
    */
  var SolutionStackName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
}
object ConfigurationOptionsDescription {
  
  inline def apply(): ConfigurationOptionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionsDescription]
  }
  
  extension [Self <: ConfigurationOptionsDescription](x: Self) {
    
    inline def setOptions(value: ConfigurationOptionDescriptionsList): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setOptionsVarargs(value: ConfigurationOptionDescription*): Self = StObject.set(x, "Options", js.Array(value*))
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    inline def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    inline def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
  }
}
