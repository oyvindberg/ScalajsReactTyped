package typingsJapgolly.winrtUwp.global.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates the PlayReady ITA-specific serialized initialization data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyITADataGenerator")
@js.native
/** Initializes a new instance of the PlayReadyITADataGenerator class. */
open class PlayReadyITADataGenerator ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyITADataGenerator {
  
  /**
    * Returns a serialized blob of the specified IPropertySet data that the PlayReady ITA can consume if wrapped in a content protection instantiation format.
    * @param guidCPSystemId The content protection system GUID.
    * @param countOfStreams The stream count.
    * @param configuration The data to be returned as a serialized blob.
    * @param format The format for the ITA serialized data.
    * @return The serialized blob. See Remarks.
    */
  /* CompleteClass */
  override def generateData(
    guidCPSystemId: String,
    countOfStreams: Double,
    configuration: IPropertySet,
    format: typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyITADataFormat
  ): js.Array[Double] = js.native
}
