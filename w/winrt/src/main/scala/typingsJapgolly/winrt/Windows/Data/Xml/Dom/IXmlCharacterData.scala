package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlCharacterData
  extends StObject
     with IXmlNode {
  
  def appendData(data: String): Unit
  
  var data: String
  
  def deleteData(offset: Double, count: Double): Unit
  
  def insertData(offset: Double, data: String): Unit
  
  var length: Double
  
  def replaceData(offset: Double, count: Double, data: String): Unit
  
  def substringData(offset: Double, count: Double): String
}
object IXmlCharacterData {
  
  inline def apply(
    appendChild: IXmlNode => IXmlNode,
    appendData: String => Callback,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    data: String,
    deleteData: (Double, Double) => Callback,
    firstChild: IXmlNode,
    getXml: CallbackTo[String],
    hasChildNodes: CallbackTo[Boolean],
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    insertData: (Double, String) => Callback,
    lastChild: IXmlNode,
    length: Double,
    localName: Any,
    namespaceUri: Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: Any,
    normalize: Callback,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: Any,
    previousSibling: IXmlNode,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    replaceData: (Double, Double, String) => Callback,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, Any) => IXmlNode,
    substringData: (Double, Double) => String
  ): IXmlCharacterData = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1((t0: String) => appendData(t0).runNow()), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), data = data.asInstanceOf[js.Any], deleteData = js.Any.fromFunction2((t0: Double, t1: Double) => (deleteData(t0, t1)).runNow()), firstChild = firstChild.asInstanceOf[js.Any], getXml = getXml.toJsFn, hasChildNodes = hasChildNodes.toJsFn, innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2((t0: Double, t1: String) => (insertData(t0, t1)).runNow()), lastChild = lastChild.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = normalize.toJsFn, ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (replaceData(t0, t1, t2)).runNow()), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), substringData = js.Any.fromFunction2(substringData))
    __obj.asInstanceOf[IXmlCharacterData]
  }
  
  extension [Self <: IXmlCharacterData](x: Self) {
    
    inline def setAppendData(value: String => Callback): Self = StObject.set(x, "appendData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeleteData(value: (Double, Double) => Callback): Self = StObject.set(x, "deleteData", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setInsertData(value: (Double, String) => Callback): Self = StObject.set(x, "insertData", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setReplaceData(value: (Double, Double, String) => Callback): Self = StObject.set(x, "replaceData", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSubstringData(value: (Double, Double) => String): Self = StObject.set(x, "substringData", js.Any.fromFunction2(value))
  }
}
