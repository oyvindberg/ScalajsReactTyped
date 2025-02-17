package typingsJapgolly.typescriptCollections

import typingsJapgolly.typescriptCollections.distLibUtilMod.IEqualsFunction
import typingsJapgolly.typescriptCollections.distLibUtilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibStackMod {
  
  @JSImport("typescript-collections/dist/lib/Stack", JSImport.Default)
  @js.native
  /**
    * Creates an empty Stack.
    * @class A Stack is a Last-In-First-Out (LIFO) data structure, the last
    * element added to the stack will be the first one to be removed. This
    * implementation uses a linked list as a container.
    * @constructor
    */
  open class default[T] ()
    extends StObject
       with Stack[T]
  
  @js.native
  trait Stack[T] extends StObject {
    
    /**
      * Pushes an item onto the top of this stack.
      * @param {Object} elem the element to be pushed onto this stack.
      * @return {boolean} true if the element was pushed or false if it is undefined.
      */
    def add(elem: T): Boolean = js.native
    
    /**
      * Removes all of the elements from this stack.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns true if this stack contains the specified element.
      * <p>If the elements inside this stack are
      * not comparable with the === operator, a custom equals function should be
      * provided to perform searches, the function must receive two arguments and
      * return true if they are equal, false otherwise. Example:</p>
      *
      * <pre>
      * const petsAreEqualByName (pet1, pet2) {
      *  return pet1.name === pet2.name;
      * }
      * </pre>
      * @param {Object} elem element to search for.
      * @param {function(Object,Object):boolean=} equalsFunction optional
      * function to check if two elements are equal.
      * @return {boolean} true if this stack contains the specified element,
      * false otherwise.
      */
    def contains(elem: T): Boolean = js.native
    def contains(elem: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
    
    /**
      * Executes the provided function once for each element present in this stack in
      * LIFO order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[T]): Unit = js.native
    
    /**
      * Checks if this stack is empty.
      * @return {boolean} true if and only if this stack contains no items; false
      * otherwise.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * List containing the elements.
      * @type collections.LinkedList
      * @private
      */
    /* private */ var list: Any = js.native
    
    /**
      * Looks at the object at the top of this stack without removing it from the
      * stack.
      * @return {*} the object at the top of this stack or undefined if the
      * stack is empty.
      */
    def peek(): js.UndefOr[T] = js.native
    
    /**
      * Removes the object at the top of this stack and returns that object.
      * @return {*} the object at the top of this stack or undefined if the
      * stack is empty.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Pushes an item onto the top of this stack.
      * @param {Object} elem the element to be pushed onto this stack.
      * @return {boolean} true if the element was pushed or false if it is undefined.
      */
    def push(elem: T): Boolean = js.native
    
    /**
      * Returns the number of elements in this stack.
      * @return {number} the number of elements in this stack.
      */
    def size(): Double = js.native
  }
}
