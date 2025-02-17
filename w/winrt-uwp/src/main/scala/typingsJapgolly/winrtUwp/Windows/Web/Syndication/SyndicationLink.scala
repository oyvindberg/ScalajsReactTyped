package typingsJapgolly.winrtUwp.Windows.Web.Syndication

import typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a link within a syndication feed or item. This class encapsulates information in the /rss/channel/link or / rss/channel/item/link element in RSS 2.0 or the atom:link element in Atom 1.0. */
trait SyndicationLink extends StObject {
  
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute]
  
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri
  
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode]
  
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument
  
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String
  
  /** Gets or sets the length of the linked resource, in bytes. */
  var length: Double
  
  /** Gets or sets the media type of the linked resource. The string must have the pattern ".+/.+". */
  var mediaType: String
  
  /** Gets or sets the local name of the element. */
  var nodeName: String
  
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String
  
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String
  
  /** Gets or sets the relationship type of the link. */
  var relationship: String
  
  /** Gets or sets the language of the resource pointed to by the Uri property. This property represents the hreflang attribute on atom:link. It must adhere to the pattern defined by RFC 3066. */
  var resourceLanguage: String
  
  /** Gets or sets the title of the syndication link. */
  var title: String
  
  /** Gets or sets the URI of the linked resource. */
  var uri: Uri
}
object SyndicationLink {
  
  inline def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    length: Double,
    mediaType: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    relationship: String,
    resourceLanguage: String,
    title: String,
    uri: Uri
  ): SyndicationLink = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceLanguage = resourceLanguage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationLink]
  }
  
  extension [Self <: SyndicationLink](x: Self) {
    
    inline def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = StObject.set(x, "attributeExtensions", value.asInstanceOf[js.Any])
    
    inline def setBaseUri(value: Uri): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setElementExtensions(value: IVector[ISyndicationNode]): Self = StObject.set(x, "elementExtensions", value.asInstanceOf[js.Any])
    
    inline def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = StObject.set(x, "getXmlDocument", js.Any.fromFunction1(value))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNamespace(value: String): Self = StObject.set(x, "nodeNamespace", value.asInstanceOf[js.Any])
    
    inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    inline def setRelationship(value: String): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setResourceLanguage(value: String): Self = StObject.set(x, "resourceLanguage", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
