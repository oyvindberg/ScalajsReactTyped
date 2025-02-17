package typingsJapgolly.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerOutput extends StObject {
  
  /**
    * ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following format: arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;. For example: arn:aws:mediastore:us-west-2:111122223333:container/movies  ContainerName: The container name as specified in the request. CreationTime: Unix time stamp. Status: The status of container creation or deletion. The status is one of the following: CREATING, ACTIVE, or DELETING. While the service is creating the container, the status is CREATING. When an endpoint is available, the status changes to ACTIVE. The return value does not include the container's endpoint. To make downstream requests, you must obtain this value by using DescribeContainer or ListContainers.
    */
  var Container: typingsJapgolly.awsSdk.clientsMediastoreMod.Container
}
object CreateContainerOutput {
  
  inline def apply(Container: Container): CreateContainerOutput = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerOutput]
  }
  
  extension [Self <: CreateContainerOutput](x: Self) {
    
    inline def setContainer(value: Container): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
  }
}
