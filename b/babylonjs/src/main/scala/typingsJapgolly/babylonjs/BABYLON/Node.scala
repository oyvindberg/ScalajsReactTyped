package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.anon.MaxVector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node
  extends StObject
     with IBehaviorAware[Node] {
  
  /** @internal */
  def _addToSceneRootNodes(): Unit = js.native
  
  /* private */ var _animationPropertiesOverride: Any = js.native
  
  /* private */ var _behaviors: Any = js.native
  
  /** @internal */
  var _cache: Any = js.native
  
  /** @internal */
  var _childUpdateId: Double = js.native
  
  /** @internal */
  /* protected */ var _children: Nullable[js.Array[Node]] = js.native
  
  /** @internal */
  var _currentRenderId: Double = js.native
  
  /**
    * @internal
    */
  def _getActionManagerForTrigger(): Nullable[AbstractActionManager] = js.native
  def _getActionManagerForTrigger(trigger: Double): Nullable[AbstractActionManager] = js.native
  def _getActionManagerForTrigger(trigger: Double, _initialCall: Boolean): Nullable[AbstractActionManager] = js.native
  def _getActionManagerForTrigger(trigger: Unit, _initialCall: Boolean): Nullable[AbstractActionManager] = js.native
  
  /**
    * @internal
    */
  def _getDescendants(results: js.Array[Node]): Unit = js.native
  def _getDescendants(results: js.Array[Node], directDescendantsOnly: Boolean): Unit = js.native
  def _getDescendants(
    results: js.Array[Node],
    directDescendantsOnly: Boolean,
    predicate: js.Function1[/* node */ this.type, Boolean]
  ): Unit = js.native
  def _getDescendants(
    results: js.Array[Node],
    directDescendantsOnly: Unit,
    predicate: js.Function1[/* node */ this.type, Boolean]
  ): Unit = js.native
  
  /** @internal */
  def _getWorldMatrixDeterminant(): Double = js.native
  
  /** @internal */
  def _initCache(): Unit = js.native
  
  /* protected */ var _isDirty: Boolean = js.native
  
  /** @internal */
  val _isNode: /* true */ Boolean = js.native
  
  /** @internal */
  def _isSynchronized(): Boolean = js.native
  
  /** @internal */
  def _markSyncedWithParent(): Unit = js.native
  
  /* private */ var _nodeDataStorage: Any = js.native
  
  /* private */ var _onDisposeObserver: Any = js.native
  
  /** @internal */
  var _parentContainer: Nullable[AbstractScene] = js.native
  
  /* protected */ var _parentNode: Nullable[Node] = js.native
  
  /* private */ var _parentUpdateId: Any = js.native
  
  /* protected */ var _ranges: org.scalablytyped.runtime.StringDictionary[Nullable[AnimationRange]] = js.native
  
  /** @internal */
  def _removeFromSceneRootNodes(): Unit = js.native
  
  /** @internal */
  var _scene: Scene = js.native
  
  /**
    * @internal
    */
  def _serializeAsParent(serializationObject: Any): Unit = js.native
  
  /**
    * @internal
    */
  def _setReady(state: Boolean): Unit = js.native
  
  /** @internal */
  /* protected */ def _syncParentEnabledState(): Unit = js.native
  
  /**
    * @internal
    */
  def _updateCache(): Unit = js.native
  def _updateCache(_ignoreParentClass: Boolean): Unit = js.native
  
  /** @internal */
  var _waitingParentId: Nullable[String] = js.native
  
  /** @internal */
  var _waitingParentInstanceIndex: Nullable[String] = js.native
  
  /** @internal */
  var _waitingParsedUniqueId: Nullable[Double] = js.native
  
  /** @internal */
  var _worldMatrix: Matrix = js.native
  
  /** @internal */
  var _worldMatrixDeterminant: Double = js.native
  
  /** @internal */
  var _worldMatrixDeterminantIsDirty: Boolean = js.native
  
  def addBehavior(behavior: Behavior[Node], attachImmediately: Boolean): Node = js.native
  
  /**
    * Gets or sets the animation properties override
    */
  def animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
  def animationPropertiesOverride_=(value: Nullable[AnimationPropertiesOverride]): Unit = js.native
  
  /**
    * Gets a list of Animations associated with the node
    */
  var animations: js.Array[Animation] = js.native
  
  /**
    * Will start the animation sequence
    * @param name defines the range frames for animation sequence
    * @param loop defines if the animation should loop (false by default)
    * @param speedRatio defines the speed factor in which to run the animation (1 by default)
    * @param onAnimationEnd defines a function to be executed when the animation ended (undefined by default)
    * @returns the object created for this animation. If range does not exist, it will return null
    */
  def beginAnimation(name: String): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Boolean): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Boolean, speedRatio: Double): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Boolean, speedRatio: Double, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Boolean, speedRatio: Unit, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Unit, speedRatio: Double): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Unit, speedRatio: Double, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
  def beginAnimation(name: String, loop: Unit, speedRatio: Unit, onAnimationEnd: js.Function0[Unit]): Nullable[Animatable] = js.native
  
  /**
    * Gets the list of attached behaviors
    * @see https://doc.babylonjs.com/features/behaviour
    */
  def behaviors: js.Array[Behavior[Node]] = js.native
  
  /**
    * Computes the world matrix of the node
    * @param _force defines if the cache version should be invalidated forcing the world matrix to be created from scratch
    * @returns the world matrix
    */
  def computeWorldMatrix(): Matrix = js.native
  def computeWorldMatrix(_force: Boolean): Matrix = js.native
  
  /**
    * Creates an animation range for this node
    * @param name defines the name of the range
    * @param from defines the starting key
    * @param to defines the end key
    */
  def createAnimationRange(name: String, from: Double, to: Double): Unit = js.native
  
  /**
    * Delete a specific animation range
    * @param name defines the name of the range to delete
    * @param deleteFrames defines if animation frames from the range must be deleted as well
    */
  def deleteAnimationRange(name: String): Unit = js.native
  def deleteAnimationRange(name: String, deleteFrames: Boolean): Unit = js.native
  
  /**
    * Releases resources associated with this node.
    * @param doNotRecurse Set to true to not recurse into each children (recurse into each children by default)
    * @param disposeMaterialAndTextures Set to true to also dispose referenced materials and textures (false by default)
    */
  def dispose(): Unit = js.native
  def dispose(doNotRecurse: Boolean): Unit = js.native
  def dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean): Unit = js.native
  def dispose(doNotRecurse: Unit, disposeMaterialAndTextures: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean used to define if the node must be serialized
    */
  def doNotSerialize: Boolean = js.native
  def doNotSerialize_=(value: Boolean): Unit = js.native
  
  /**
    * Get an animation by name
    * @param name defines the name of the animation to look for
    * @returns null if not found else the requested animation
    */
  def getAnimationByName(name: String): Nullable[Animation] = js.native
  
  /**
    * Get an animation range by name
    * @param name defines the name of the animation range to look for
    * @returns null if not found else the requested animation range
    */
  def getAnimationRange(name: String): Nullable[AnimationRange] = js.native
  
  /**
    * Gets the list of all animation ranges defined on this node
    * @returns an array
    */
  def getAnimationRanges(): js.Array[Nullable[AnimationRange]] = js.native
  
  /**
    * Get all child-meshes of this node
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered (Default: false)
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns an array of AbstractMesh
    */
  def getChildMeshes(): js.Array[AbstractMesh] = js.native
  def getChildMeshes(directDescendantsOnly: Boolean): js.Array[AbstractMesh] = js.native
  def getChildMeshes(directDescendantsOnly: Boolean, predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[AbstractMesh] = js.native
  def getChildMeshes(directDescendantsOnly: Unit, predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[AbstractMesh] = js.native
  /**
    * Get all child-meshes of this node
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered (Default: false)
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns an array of AbstractMesh
    */
  @JSName("getChildMeshes")
  def getChildMeshes_T[T /* <: AbstractMesh */](): js.Array[T] = js.native
  @JSName("getChildMeshes")
  def getChildMeshes_T[T /* <: AbstractMesh */](directDescendantsOnly: Boolean): js.Array[T] = js.native
  @JSName("getChildMeshes")
  def getChildMeshes_T[T /* <: AbstractMesh */](directDescendantsOnly: Boolean, predicate: js.Function1[/* node */ this.type, /* is T */ Boolean]): js.Array[T] = js.native
  @JSName("getChildMeshes")
  def getChildMeshes_T[T /* <: AbstractMesh */](directDescendantsOnly: Unit, predicate: js.Function1[/* node */ this.type, /* is T */ Boolean]): js.Array[T] = js.native
  
  /**
    * Get all direct children of this node
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered (Default: true)
    * @returns an array of Node
    */
  def getChildren(): js.Array[Node] = js.native
  def getChildren(predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[Node] = js.native
  def getChildren(predicate: js.Function1[/* node */ this.type, Boolean], directDescendantsOnly: Boolean): js.Array[Node] = js.native
  def getChildren(predicate: Unit, directDescendantsOnly: Boolean): js.Array[Node] = js.native
  /**
    * Get all direct children of this node
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered (Default: true)
    * @returns an array of Node
    */
  @JSName("getChildren")
  def getChildren_T[T /* <: Node */](): js.Array[T] = js.native
  @JSName("getChildren")
  def getChildren_T[T /* <: Node */](predicate: js.Function1[/* node */ this.type, /* is T */ Boolean]): js.Array[T] = js.native
  @JSName("getChildren")
  def getChildren_T[T /* <: Node */](predicate: js.Function1[/* node */ this.type, /* is T */ Boolean], directDescendantsOnly: Boolean): js.Array[T] = js.native
  @JSName("getChildren")
  def getChildren_T[T /* <: Node */](predicate: Unit, directDescendantsOnly: Boolean): js.Array[T] = js.native
  
  /**
    * Gets a string identifying the name of the class
    * @returns "Node" string
    */
  def getClassName(): String = js.native
  
  /**
    * Will return all nodes that have this node as ascendant
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns all children nodes of all types
    */
  def getDescendants(): js.Array[Node] = js.native
  def getDescendants(directDescendantsOnly: Boolean): js.Array[Node] = js.native
  def getDescendants(directDescendantsOnly: Boolean, predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[Node] = js.native
  def getDescendants(directDescendantsOnly: Unit, predicate: js.Function1[/* node */ this.type, Boolean]): js.Array[Node] = js.native
  /**
    * Will return all nodes that have this node as ascendant
    * @param directDescendantsOnly defines if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered
    * @param predicate defines an optional predicate that will be called on every evaluated child, the predicate must return true for a given child to be part of the result, otherwise it will be ignored
    * @returns all children nodes of all types
    */
  @JSName("getDescendants")
  def getDescendants_T[T /* <: Node */](): js.Array[T] = js.native
  @JSName("getDescendants")
  def getDescendants_T[T /* <: Node */](directDescendantsOnly: Boolean): js.Array[T] = js.native
  @JSName("getDescendants")
  def getDescendants_T[T /* <: Node */](directDescendantsOnly: Boolean, predicate: js.Function1[/* node */ this.type, /* is T */ Boolean]): js.Array[T] = js.native
  @JSName("getDescendants")
  def getDescendants_T[T /* <: Node */](directDescendantsOnly: Unit, predicate: js.Function1[/* node */ this.type, /* is T */ Boolean]): js.Array[T] = js.native
  
  /**
    * Gets the engine of the node
    * @returns a Engine
    */
  def getEngine(): Engine = js.native
  
  /**
    * Return the minimum and maximum world vectors of the entire hierarchy under current node
    * @param includeDescendants Include bounding info from descendants as well (true by default)
    * @param predicate defines a callback function that can be customize to filter what meshes should be included in the list used to compute the bounding vectors
    * @returns the new bounding vectors
    */
  def getHierarchyBoundingVectors(): MaxVector3 = js.native
  def getHierarchyBoundingVectors(includeDescendants: Boolean): MaxVector3 = js.native
  def getHierarchyBoundingVectors(
    includeDescendants: Boolean,
    predicate: Nullable[js.Function1[/* abstractMesh */ AbstractMesh, Boolean]]
  ): MaxVector3 = js.native
  def getHierarchyBoundingVectors(
    includeDescendants: Unit,
    predicate: Nullable[js.Function1[/* abstractMesh */ AbstractMesh, Boolean]]
  ): MaxVector3 = js.native
  
  /**
    * Gets the scene of the node
    * @returns a scene
    */
  def getScene(): Scene = js.native
  
  /**
    * Returns the latest update of the World matrix
    * @returns a Matrix
    */
  def getWorldMatrix(): Matrix = js.native
  
  /**
    * Gets or sets the id of the node
    */
  var id: String = js.native
  
  /**
    * List of inspectable custom properties (used by the Inspector)
    * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
    */
  var inspectableCustomProperties: js.Array[IInspectable] = js.native
  
  /**
    * Is this node a descendant of the given node?
    * The function will iterate up the hierarchy until the ancestor was found or no more parents defined
    * @param ancestor defines the parent node to inspect
    * @returns a boolean indicating if this node is a descendant of the given node
    */
  def isDescendantOf(ancestor: Node): Boolean = js.native
  
  /**
    * Gets a boolean indicating if the node has been disposed
    * @returns true if the node was disposed
    */
  def isDisposed(): Boolean = js.native
  
  /**
    * Is this node enabled?
    * If the node has a parent, all ancestors will be checked and false will be returned if any are false (not enabled), otherwise will return true
    * @param checkAncestors indicates if this method should check the ancestors. The default is to check the ancestors. If set to false, the method will return the value of this node without checking ancestors
    * @returns whether this node (and its parent) is enabled
    */
  def isEnabled(): Boolean = js.native
  def isEnabled(checkAncestors: Boolean): Boolean = js.native
  
  /**
    * Is this node ready to be used/rendered
    * @param _completeCheck defines if a complete check (including materials and lights) has to be done (false by default)
    * @returns true if the node is ready
    */
  def isReady(): Boolean = js.native
  def isReady(_completeCheck: Boolean): Boolean = js.native
  
  /** @internal */
  def isSynchronized(): Boolean = js.native
  
  /** @internal */
  def isSynchronizedWithParent(): Boolean = js.native
  
  /**
    * Flag the  node as dirty (Forcing it to update everything)
    * @param _property helps children apply precise "dirtyfication"
    * @returns this node
    */
  def markAsDirty(): Node = js.native
  def markAsDirty(_property: String): Node = js.native
  
  /**
    * Gets or sets an object used to store user defined information for the node
    */
  var metadata: Any = js.native
  
  /**
    * Gets or sets the name of the node
    */
  var name: String = js.native
  
  /**
    * An event triggered when the node is cloned
    */
  def onClonedObservable: Observable[Node] = js.native
  
  /**
    * An event triggered when the mesh is disposed
    */
  var onDisposeObservable: Observable[Node] = js.native
  
  /**
    * Sets a callback that will be raised when the node will be disposed
    */
  def onDispose_=(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * An event triggered when the enabled state of the node changes
    */
  def onEnabledStateChangedObservable: Observable[Boolean] = js.native
  
  /**
    * Callback raised when the node is ready to be used
    */
  var onReady: Nullable[js.Function1[/* node */ this.type, Unit]] = js.native
  
  def parent: Nullable[Node] = js.native
  /**
    * Gets or sets the parent of the node (without keeping the current position in the scene)
    * @see https://doc.babylonjs.com/how_to/parenting
    */
  def parent_=(parent: Nullable[Node]): Unit = js.native
  
  /**
    * For internal use only. Please do not use.
    */
  var reservedDataStore: Any = js.native
  
  /**
    * Serialize animation ranges into a JSON compatible object
    * @returns serialization object
    */
  def serializeAnimationRanges(): Any = js.native
  
  /**
    * Set the enabled state of this node
    * @param value defines the new enabled state
    */
  def setEnabled(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets a string used to store user defined state for the node
    */
  var state: String = js.native
  
  /**
    * Gets or sets the unique id of the node
    */
  var uniqueId: Double = js.native
  
  /**
    * @internal
    */
  def updateCache(): Unit = js.native
  def updateCache(force: Boolean): Unit = js.native
  
  /**
    * Returns directly the latest state of the mesh World matrix.
    * A Matrix is returned.
    */
  def worldMatrixFromCache: Matrix = js.native
}
