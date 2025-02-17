package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCopyJobsInput extends StObject {
  
  /**
    * The account ID to list the jobs from. Returns only copy jobs associated with the specified account ID.
    */
  var ByAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Returns only copy jobs completed after a date expressed in Unix format and Coordinated Universal Time (UTC).
    */
  var ByCompleteAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only copy jobs completed before a date expressed in Unix format and Coordinated Universal Time (UTC).
    */
  var ByCompleteBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only copy jobs that were created after the specified date.
    */
  var ByCreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns only copy jobs that were created before the specified date.
    */
  var ByCreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault. 
    */
  var ByDestinationVaultArn: js.UndefOr[String] = js.undefined
  
  /**
    * Returns only copy jobs that match the specified resource Amazon Resource Name (ARN). 
    */
  var ByResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Returns only backup jobs for the specified resources:    Aurora for Amazon Aurora    DocumentDB for Amazon DocumentDB (with MongoDB compatibility)    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    FSx for Amazon FSx    Neptune for Amazon Neptune    RDS for Amazon Relational Database Service    Storage Gateway for Storage Gateway    S3 for Amazon S3    VirtualMachine for virtual machines  
    */
  var ByResourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * Returns only copy jobs that are in the specified state.
    */
  var ByState: js.UndefOr[CopyJobState] = js.undefined
  
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupMod.MaxResults] = js.undefined
  
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListCopyJobsInput {
  
  inline def apply(): ListCopyJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCopyJobsInput]
  }
  
  extension [Self <: ListCopyJobsInput](x: Self) {
    
    inline def setByAccountId(value: AccountId): Self = StObject.set(x, "ByAccountId", value.asInstanceOf[js.Any])
    
    inline def setByAccountIdUndefined: Self = StObject.set(x, "ByAccountId", js.undefined)
    
    inline def setByCompleteAfter(value: js.Date): Self = StObject.set(x, "ByCompleteAfter", value.asInstanceOf[js.Any])
    
    inline def setByCompleteAfterUndefined: Self = StObject.set(x, "ByCompleteAfter", js.undefined)
    
    inline def setByCompleteBefore(value: js.Date): Self = StObject.set(x, "ByCompleteBefore", value.asInstanceOf[js.Any])
    
    inline def setByCompleteBeforeUndefined: Self = StObject.set(x, "ByCompleteBefore", js.undefined)
    
    inline def setByCreatedAfter(value: js.Date): Self = StObject.set(x, "ByCreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setByCreatedAfterUndefined: Self = StObject.set(x, "ByCreatedAfter", js.undefined)
    
    inline def setByCreatedBefore(value: js.Date): Self = StObject.set(x, "ByCreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setByCreatedBeforeUndefined: Self = StObject.set(x, "ByCreatedBefore", js.undefined)
    
    inline def setByDestinationVaultArn(value: String): Self = StObject.set(x, "ByDestinationVaultArn", value.asInstanceOf[js.Any])
    
    inline def setByDestinationVaultArnUndefined: Self = StObject.set(x, "ByDestinationVaultArn", js.undefined)
    
    inline def setByResourceArn(value: ARN): Self = StObject.set(x, "ByResourceArn", value.asInstanceOf[js.Any])
    
    inline def setByResourceArnUndefined: Self = StObject.set(x, "ByResourceArn", js.undefined)
    
    inline def setByResourceType(value: ResourceType): Self = StObject.set(x, "ByResourceType", value.asInstanceOf[js.Any])
    
    inline def setByResourceTypeUndefined: Self = StObject.set(x, "ByResourceType", js.undefined)
    
    inline def setByState(value: CopyJobState): Self = StObject.set(x, "ByState", value.asInstanceOf[js.Any])
    
    inline def setByStateUndefined: Self = StObject.set(x, "ByState", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
