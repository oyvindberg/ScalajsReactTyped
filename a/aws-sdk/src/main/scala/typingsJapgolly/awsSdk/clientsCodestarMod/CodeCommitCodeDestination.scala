package typingsJapgolly.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCommitCodeDestination extends StObject {
  
  /**
    * The name of the AWS CodeCommit repository to be created in AWS CodeStar.
    */
  var name: RepositoryName
}
object CodeCommitCodeDestination {
  
  inline def apply(name: RepositoryName): CodeCommitCodeDestination = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCommitCodeDestination]
  }
  
  extension [Self <: CodeCommitCodeDestination](x: Self) {
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
