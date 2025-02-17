package typingsJapgolly.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationConfigurationTemplatesResponse extends StObject {
  
  /**
    * Request to describe Replication Configuration template by items.
    */
  var items: js.UndefOr[ReplicationConfigurationTemplates] = js.undefined
  
  /**
    * Request to describe Replication Configuration template by next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeReplicationConfigurationTemplatesResponse {
  
  inline def apply(): DescribeReplicationConfigurationTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationConfigurationTemplatesResponse]
  }
  
  extension [Self <: DescribeReplicationConfigurationTemplatesResponse](x: Self) {
    
    inline def setItems(value: ReplicationConfigurationTemplates): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ReplicationConfigurationTemplate*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
