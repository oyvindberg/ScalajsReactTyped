package typingsJapgolly.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataReaderFactory extends StObject {
  
  def createDataReader(inputStream: IInputStream): DataReader
}
object IDataReaderFactory {
  
  inline def apply(createDataReader: IInputStream => DataReader): IDataReaderFactory = {
    val __obj = js.Dynamic.literal(createDataReader = js.Any.fromFunction1(createDataReader))
    __obj.asInstanceOf[IDataReaderFactory]
  }
  
  extension [Self <: IDataReaderFactory](x: Self) {
    
    inline def setCreateDataReader(value: IInputStream => DataReader): Self = StObject.set(x, "createDataReader", js.Any.fromFunction1(value))
  }
}
