package typingsJapgolly.materialDesignLite

import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialDesignLite {
  
  trait ComponentConfigPublic extends StObject {
    
    var classAsString: String
    
    var cssClass: String
    
    var widget: js.UndefOr[String | Boolean] = js.undefined
  }
  object ComponentConfigPublic {
    
    inline def apply(classAsString: String, cssClass: String): ComponentConfigPublic = {
      val __obj = js.Dynamic.literal(classAsString = classAsString.asInstanceOf[js.Any], cssClass = cssClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentConfigPublic]
    }
    
    extension [Self <: ComponentConfigPublic](x: Self) {
      
      inline def setClassAsString(value: String): Self = StObject.set(x, "classAsString", value.asInstanceOf[js.Any])
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setWidget(value: String | Boolean): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      
      inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    }
  }
  
  @js.native
  trait ComponentHandler extends StObject {
    
    /**
      * Downgrade either a given node, an array of nodes, or a NodeList.
      *
      * @param {!Array<!Node>} nodes The list of nodes.
      */
    def downgradeElements(nodes: js.Array[Node]): Unit = js.native
    /**
      * Downgrade either a given node, an array of nodes, or a NodeList.
      *
      * @param {!Node} nodes The list of nodes.
      */
    def downgradeElements(nodes: Node): Unit = js.native
    /**
      * Downgrade either a given node, an array of nodes, or a NodeList.
      *
      * @param {!NodeList} nodes The list of nodes.
      */
    def downgradeElements(nodes: NodeList[Node]): Unit = js.native
    
    /**
      * Registers a class for future use and attempts to upgrade existing DOM.
      *
      * @param {componentHandler.ComponentConfigPublic} config the registration configuration
      */
    def register(config: ComponentConfigPublic): Unit = js.native
    
    /**
      * Allows user to be alerted to any upgrades that are performed for a given
      * component type
      *
      * @param {string} jsClass The class name of the MDL component we wish
      * to hook into for any upgrades performed.
      * @param {function(!HTMLElement)} callback The function to call upon an
      * upgrade. This function should expect 1 parameter - the HTMLElement which
      * got upgraded.
      */
    def registerUpgradedCallback(jsClass: String, callback: js.Function1[/* element */ HTMLElement, Any]): Unit = js.native
    
    /**
      * Upgrades all registered components found in the current DOM. This is
      * automatically called on window load.
      */
    def upgradeAllRegistered(): Unit = js.native
    
    /**
      * Searches existing DOM for elements of our component type and upgrades them
      * if they have not already been upgraded.
      */
    def upgradeDom(): Unit = js.native
    /**
      * Searches existing DOM for elements of our component type and upgrades them
      * if they have not already been upgraded.
      *
      * @param {string} jsClass the programatic name of the element class we
      * need to create a new instance of.
      */
    def upgradeDom(jsClass: String): Unit = js.native
    /**
      * Searches existing DOM for elements of our component type and upgrades them
      * if they have not already been upgraded.
      *
      * @param {string} jsClass the programatic name of the element class we
      * need to create a new instance of.
      * @param {string} cssClass the name of the CSS class elements of this
      * type will have.
      */
    def upgradeDom(jsClass: String, cssClass: String): Unit = js.native
    
    /**
      * Upgrades a specific element rather than all in the DOM.
      *
      * @param {!Element} element The element we wish to upgrade.
      */
    def upgradeElement(element: HTMLElement): Unit = js.native
    /**
      * Upgrades a specific element rather than all in the DOM.
      *
      * @param {!Element} element The element we wish to upgrade.
      * @param {string} jsClass Optional name of the class we want to upgrade
      * the element to.
      */
    def upgradeElement(element: HTMLElement, jsClass: String): Unit = js.native
    
    /**
      * Upgrades a specific list of elements rather than all in the DOM.
      *
      * @param {!Array<!Element>} elements
      * The elements we wish to upgrade.
      */
    def upgradeElements(elements: js.Array[HTMLElement]): Unit = js.native
    /**
      * Upgrades a specific list of elements rather than all in the DOM.
      *
      * @param {!HTMLCollection} elements
      * The elements we wish to upgrade.
      */
    def upgradeElements(elements: HTMLCollection[Any]): Unit = js.native
    /**
      * Upgrades a specific list of elements rather than all in the DOM.
      *
      * @param {!Element} elements
      * The elements we wish to upgrade.
      */
    def upgradeElements(elements: HTMLElement): Unit = js.native
    /**
      * Upgrades a specific list of elements rather than all in the DOM.
      *
      * @param {!NodeList} elements
      * The elements we wish to upgrade.
      */
    def upgradeElements(elements: NodeList[Node]): Unit = js.native
  }
}
