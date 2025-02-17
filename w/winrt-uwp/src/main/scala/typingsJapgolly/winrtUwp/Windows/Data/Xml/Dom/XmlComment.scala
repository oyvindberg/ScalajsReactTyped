package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an XML comment. */
trait XmlComment extends StObject {
  
  /**
    * Appends a new child node as the last child of the node. This method is not applicable to this class and it will throw an exception.
    * @param newChild The new child node to be appended to the end of the list of children of this node.
    * @return The new child node successfully appended to the list. If null, no object is created.
    */
  def appendChild(newChild: IXmlNode): IXmlNode
  
  /**
    * Appends the supplied string to the existing string data.
    * @param data The data to be appended to the existing string.
    */
  def appendData(data: String): Unit
  
  /** Gets the list of attributes of this node. */
  var attributes: XmlNamedNodeMap
  
  /** Gets a list of children in the current node. This method always returns NULL. */
  var childNodes: XmlNodeList
  
  /**
    * Clones a new node.
    * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
    * @return The newly created clone node.
    */
  def cloneNode(deep: Boolean): IXmlNode
  
  /** Gets or sets the node data depending on the node type. */
  var data: String
  
  /**
    * Deletes the specified data.
    * @param offset The offset, in characters, at which to start deleting the string data.
    * @param count The number of characters to delete.
    */
  def deleteData(offset: Double, count: Double): Unit
  
  /** Gets the first child node. This property always returns NULL. */
  var firstChild: IXmlNode
  
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
  def getXml(): String
  
  /**
    * Determines whether a node has children.
    * @return True if this node has children; otherwise false.
    */
  def hasChildNodes(): Boolean
  
  /** Gets the text from inside the XML. */
  var innerText: String
  
  /**
    * Inserts a child node to the left of the specified node, or at the end of the list. This method is not applicable to this class and will throw an exception.
    * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
    * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
    * @return On success, the child node that was inserted. If null, no object is created.
    */
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  
  /**
    * Inserts a string at the specified offset.
    * @param offset The offset, in characters, at which to insert the supplied string data.
    * @param data The data to be inserted into the existing string.
    */
  def insertData(offset: Double, data: String): Unit
  
  /** Gets the last child node. This property always returns NULL. */
  var lastChild: IXmlNode
  
  /** Gets the length of the data in Unicode characters. */
  var length: Double
  
  /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
  var localName: Any
  
  /** Returns the Uniform Resource Identifier (URI) for the namespace. */
  var namespaceUri: Any
  
  /** Gets the next sibling of the node in the parent's child list. */
  var nextSibling: IXmlNode
  
  /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
  var nodeName: String
  
  /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
  var nodeType: NodeType
  
  /** Gets or sets the text associated with the node. */
  var nodeValue: Any
  
  /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
  def normalize(): Unit
  
  /** Returns the root of the document that contains the node. */
  var ownerDocument: XmlDocument
  
  /** Gets the parent node of the node instance. */
  var parentNode: IXmlNode
  
  /** Gets or sets the namespace prefix. */
  var prefix: Any
  
  /** Gets the previous sibling of the node in the parent's child list. */
  var previousSibling: IXmlNode
  
  /**
    * Removes the specified child node from the list of children and returns it. This method is not applicable to this class and will throw an exception.
    * @param childNode The child node to be removed from the list of children of this node.
    * @return The removed child node. If null, the childNode object is not removed.
    */
  def removeChild(childNode: IXmlNode): IXmlNode
  
  /**
    * Replaces the specified old child node with the supplied new child node. This method is not applicable to this class and will throw an exception.
    * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
    * @param referenceChild The old child that is to be replaced by the new child.
    * @return The old child that is replaced. If null, no object is created.
    */
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  
  /**
    * Replaces the specified number of characters with the supplied string.
    * @param offset The offset, in characters, at which to start replacing string data.
    * @param count The number of characters to replace.
    * @param data The new data that replaces the old string data.
    */
  def replaceData(offset: Double, count: Double, data: String): Unit
  
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expression.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
    */
  def selectNodes(xpath: String): XmlNodeList
  
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expresssion.
    * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
    */
  def selectNodesNS(xpath: String, namespaces: Any): XmlNodeList
  
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expression.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
    */
  def selectSingleNode(xpath: String): IXmlNode
  
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
    * @param xpath Specifies an XPath expression.
    * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
    */
  def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode
  
  /**
    * Retrieves a substring of the full string from the specified range.
    * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
    * @param count Specifies the number of characters to retrieve from the specified offset.
    * @return The returned substring.
    */
  def substringData(offset: Double, count: Double): String
}
object XmlComment {
  
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
  ): XmlComment = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1((t0: String) => appendData(t0).runNow()), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), data = data.asInstanceOf[js.Any], deleteData = js.Any.fromFunction2((t0: Double, t1: Double) => (deleteData(t0, t1)).runNow()), firstChild = firstChild.asInstanceOf[js.Any], getXml = getXml.toJsFn, hasChildNodes = hasChildNodes.toJsFn, innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2((t0: Double, t1: String) => (insertData(t0, t1)).runNow()), lastChild = lastChild.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = normalize.toJsFn, ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (replaceData(t0, t1, t2)).runNow()), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), substringData = js.Any.fromFunction2(substringData))
    __obj.asInstanceOf[XmlComment]
  }
  
  extension [Self <: XmlComment](x: Self) {
    
    inline def setAppendChild(value: IXmlNode => IXmlNode): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setAppendData(value: String => Callback): Self = StObject.set(x, "appendData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAttributes(value: XmlNamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setChildNodes(value: XmlNodeList): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setCloneNode(value: Boolean => IXmlNode): Self = StObject.set(x, "cloneNode", js.Any.fromFunction1(value))
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeleteData(value: (Double, Double) => Callback): Self = StObject.set(x, "deleteData", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setFirstChild(value: IXmlNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setGetXml(value: CallbackTo[String]): Self = StObject.set(x, "getXml", value.toJsFn)
    
    inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
    
    inline def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
    
    inline def setInsertBefore(value: (IXmlNode, IXmlNode) => IXmlNode): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setInsertData(value: (Double, String) => Callback): Self = StObject.set(x, "insertData", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setLastChild(value: IXmlNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLocalName(value: Any): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUri(value: Any): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    inline def setNextSibling(value: IXmlNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: NodeType): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: Any): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: Callback): Self = StObject.set(x, "normalize", value.toJsFn)
    
    inline def setOwnerDocument(value: XmlDocument): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: IXmlNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Any): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPreviousSibling(value: IXmlNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    inline def setRemoveChild(value: IXmlNode => IXmlNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setReplaceChild(value: (IXmlNode, IXmlNode) => IXmlNode): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    inline def setReplaceData(value: (Double, Double, String) => Callback): Self = StObject.set(x, "replaceData", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSelectNodes(value: String => XmlNodeList): Self = StObject.set(x, "selectNodes", js.Any.fromFunction1(value))
    
    inline def setSelectNodesNS(value: (String, Any) => XmlNodeList): Self = StObject.set(x, "selectNodesNS", js.Any.fromFunction2(value))
    
    inline def setSelectSingleNode(value: String => IXmlNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction1(value))
    
    inline def setSelectSingleNodeNS(value: (String, Any) => IXmlNode): Self = StObject.set(x, "selectSingleNodeNS", js.Any.fromFunction2(value))
    
    inline def setSubstringData(value: (Double, Double) => String): Self = StObject.set(x, "substringData", js.Any.fromFunction2(value))
  }
}
