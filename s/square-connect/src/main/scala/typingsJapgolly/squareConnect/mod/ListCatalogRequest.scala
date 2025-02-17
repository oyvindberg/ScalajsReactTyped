package typingsJapgolly.squareConnect.mod

import typingsJapgolly.squareConnect.squareConnectStrings.CATEGORY
import typingsJapgolly.squareConnect.squareConnectStrings.DISCOUNT
import typingsJapgolly.squareConnect.squareConnectStrings.IMAGE
import typingsJapgolly.squareConnect.squareConnectStrings.ITEM
import typingsJapgolly.squareConnect.squareConnectStrings.ITEM_VARIATION
import typingsJapgolly.squareConnect.squareConnectStrings.MODIFIER
import typingsJapgolly.squareConnect.squareConnectStrings.MODIFIER_LIST
import typingsJapgolly.squareConnect.squareConnectStrings.TAX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCatalogRequest")
@js.native
open class ListCatalogRequest () extends StObject {
  
  /**
    * TThe pagination cursor returned in the previous response. Leave unset for an initial request.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * An optional case-insensitive, comma-separated list of object types to retrieve, for example `ITEM,ITEM_VARIATION,CATEGORY,IMAGE`.
    */
  var types: js.UndefOr[
    ITEM | ITEM_VARIATION | CATEGORY | DISCOUNT | TAX | MODIFIER | MODIFIER_LIST | IMAGE
  ] = js.native
}
