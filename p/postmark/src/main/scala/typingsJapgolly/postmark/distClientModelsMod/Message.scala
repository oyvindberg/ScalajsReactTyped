package typingsJapgolly.postmark.distClientModelsMod

import typingsJapgolly.postmark.distClientModelsClientSupportingTypesMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "Message")
@js.native
open class Message protected ()
  extends typingsJapgolly.postmark.distClientModelsMessageMessageMod.Message {
  def this(
    From: String,
    Subject: String,
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    To: js.UndefOr[String],
    Cc: js.UndefOr[String],
    Bcc: js.UndefOr[String],
    ReplyTo: js.UndefOr[String],
    Tag: js.UndefOr[String],
    TrackOpens: js.UndefOr[Boolean],
    TrackLinks: js.UndefOr[
        typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
      ],
    Headers: js.UndefOr[
        js.Array[typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.Header]
      ],
    Attachments: js.UndefOr[
        js.Array[typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.Attachment]
      ],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}
