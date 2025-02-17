package typingsJapgolly.firebaseDatabase

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapIndexMapMod.IndexMap
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typingsJapgolly.firebaseDatabase.distSrcCoreUtilSortedMapMod.SortedMap
import typingsJapgolly.firebaseDatabase.distSrcCoreUtilSortedMapMod.SortedMapIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreSnapChildrenNodeMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
  @js.native
  open class ChildrenNode protected ()
    extends StObject
       with Node {
    def this(children_ : SortedMap[String, Node], priorityNode_ : Null, indexMap_ : IndexMap) = this()
    /**
      * @param children_ - List of children of this node..
      * @param priorityNode_ - The priority of this node (as a snapshot node).
      */
    def this(children_ : SortedMap[String, Node], priorityNode_ : Node, indexMap_ : IndexMap) = this()
    
    /* private */ val children_ : Any = js.native
    
    def compareTo(other: ChildrenNode): Double = js.native
    
    def getFirstChild(indexDefinition: Index): NamedNode | Null = js.native
    
    def getFirstChildName(indexDefinition: Index): String | Null = js.native
    
    def getIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    def getIteratorFrom(startPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    def getLastChild(indexDefinition: Index): NamedNode | Null = js.native
    
    /**
      * Given an index, return the key name of the largest value we have, according to that index
      */
    def getLastChildName(indexDefinition: Index): String | Null = js.native
    
    def getReverseIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    def getReverseIteratorFrom(endPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
    
    /* private */ var indexMap_ : Any = js.native
    
    /* private */ var lazyHash_ : Any = js.native
    
    /* private */ val priorityNode_ : Any = js.native
    
    /**
      * Returns a SortedMap ordered by index, or null if the default (by-key) ordering can be used
      * instead.
      *
      */
    /* private */ var resolveIndex_ : Any = js.native
  }
  /* static members */
  object ChildrenNode {
    
    @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode.INTEGER_REGEXP_")
    @js.native
    def INTEGER_REGEXP_ : Any = js.native
    inline def INTEGER_REGEXP__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER_REGEXP_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "MAX_NODE")
  @js.native
  val MAX_NODE: MaxNode = js.native
  
  @JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "MaxNode")
  @js.native
  open class MaxNode () extends ChildrenNode
  
  @js.native
  trait ChildrenNodeConstructor
    extends StObject
       with Instantiable3[
          /* children_ */ SortedMap[String, Node], 
          (/* priorityNode_ */ Node) | (/* priorityNode_ */ Null), 
          /* indexMap_ */ IndexMap, 
          ChildrenNode
        ] {
    
    var EMPTY_NODE: ChildrenNode = js.native
  }
  
  /**
    * Document NamedNode extensions
    */
  /* augmented module */
  object firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod {
    
    trait NamedNode extends StObject {
      
      var MAX: typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
      
      var MIN: typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
    }
    object NamedNode {
      
      inline def apply(
        MAX: typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode,
        MIN: typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
      ): typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode = {
        val __obj = js.Dynamic.literal(MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode]
      }
      
      extension [Self <: typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode](x: Self) {
        
        inline def setMAX(
          value: typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
        ): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
        
        inline def setMIN(
          value: typingsJapgolly.firebaseDatabase.distSrcCoreSnapChildrenNodeMod.firebaseDatabaseDistSrcCoreSnapNodeAugmentingMod.NamedNode
        ): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
      }
    }
  }
}
