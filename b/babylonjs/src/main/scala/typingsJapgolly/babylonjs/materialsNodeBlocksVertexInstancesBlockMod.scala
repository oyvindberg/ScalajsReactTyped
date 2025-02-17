package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksVertexInstancesBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Vertex/instancesBlock", "InstancesBlock")
  @js.native
  open class InstancesBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new InstancesBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the instanceID component
      */
    def instanceID: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world input component
      */
    def world: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the first world row input component
      */
    def world0: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the second world row input component
      */
    def world1: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the third world row input component
      */
    def world2: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the forth world row input component
      */
    def world3: NodeMaterialConnectionPoint = js.native
  }
}
