package typingsJapgolly.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionResponse extends StObject {
  
  /**
    * The ARN of the connection that was deleted.
    */
  var ConnectionArn: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.ConnectionArn] = js.undefined
  
  /**
    * The state of the connection before it was deleted.
    */
  var ConnectionState: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.ConnectionState] = js.undefined
  
  /**
    * A time stamp for the time that the connection was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A time stamp for the time that the connection was last authorized before it wa deleted.
    */
  var LastAuthorizedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A time stamp for the time that the connection was last modified before it was deleted.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object DeleteConnectionResponse {
  
  inline def apply(): DeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConnectionResponse]
  }
  
  extension [Self <: DeleteConnectionResponse](x: Self) {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setConnectionState(value: ConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastAuthorizedTime(value: js.Date): Self = StObject.set(x, "LastAuthorizedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAuthorizedTimeUndefined: Self = StObject.set(x, "LastAuthorizedTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
