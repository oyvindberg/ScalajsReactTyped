package typingsJapgolly.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackedarrayPackedArrayContextMod {
  
  @JSImport("hdr-histogram-js/dist/packedarray/PackedArrayContext", "MINIMUM_INITIAL_PACKED_ARRAY_CAPACITY")
  @js.native
  val MINIMUM_INITIAL_PACKED_ARRAY_CAPACITY: /* 16 */ Double = js.native
  
  @JSImport("hdr-histogram-js/dist/packedarray/PackedArrayContext", "PackedArrayContext")
  @js.native
  open class PackedArrayContext protected () extends StObject {
    def this(virtualLength: Double, initialPhysicalLength: Double) = this()
    
    def addAndGetAtUnpackedIndex(index: Double, valueToAdd: Double): Double = js.native
    
    /**
      * add a byte value to a current byte value in the array
      * @param byteIndex index of byte value to add to
      * @param valueToAdd byte value to add
      * @return the afterAddValue. ((afterAddValue & 0x100) != 0) indicates a carry.
      */
    def addAtByteIndex(byteIndex: Double, valueToAdd: Double): Double = js.native
    
    /* private */ var array: Any = js.native
    
    /* private */ var byteArray: Any = js.native
    
    def clear(): Unit = js.native
    
    /**
      * Consolidate entry with previous entry verison if one exists
      *
      * @param entryIndex The shortIndex of the entry to be consolidated
      * @param previousVersionIndex the index of the previous version of the entry
      */
    /* private */ var consolidateEntry: Any = js.native
    
    def copyAndIncreaseSize(newPhysicalArrayLength: Double, newVirtualArrayLength: Double): PackedArrayContext = js.native
    
    /* private */ var copyEntriesAtLevelFromOther: Any = js.native
    
    def determineTopLevelShiftForVirtualLength(virtualLength: Double): Double = js.native
    
    /* private */ var expandArrayIfNeeded: Any = js.native
    
    /**
      * Expand entry as indicated.
      *
      * @param existingEntryIndex the index of the entry
      * @param entryPointerIndex  index to the slot pointing to the entry (needs to be fixed up)
      * @param insertedSlotIndex  realtive [packed] index of slot being inserted into entry
      * @param insertedSlotMask   mask value fo slot being inserted
      * @param nextLevelIsLeaf    the level below this one is a leaf level
      * @return the updated index of the entry (-1 if epansion failed due to conflict)
      * @throws RetryException if expansion fails due to concurrent conflict, and caller should try again.
      */
    def expandEntry(
      existingEntryIndex: Double,
      entryPointerIndex: Double,
      insertedSlotIndex: Double,
      insertedSlotMask: Double,
      nextLevelIsLeaf: Boolean
    ): Double = js.native
    
    def getAtByteIndex(byteIndex: Double): Double = js.native
    
    def getAtShortIndex(shortIndex: Double): Double = js.native
    
    def getAtUnpackedIndex(index: Double): Double = js.native
    
    /* private */ var getIndexAtEntrySlot: Any = js.native
    
    def getIndexAtShortIndex(shortIndex: Double): Double = js.native
    
    /**
      * Get the byte-index (into the packed array) corresponding to a given (set tree) value byte of given virtual index.
      * Inserts new set tree nodes as needed if indicated.
      *
      * @param setNumber      The set tree number (0-7, 0 corresponding with the LSByte set tree)
      * @param virtualIndex   The virtual index into the PackedArray
      * @param insertAsNeeded If true, will insert new set tree nodes as needed if they do not already exist
      * @return the byte-index corresponding to the given (set tree) value byte of the given virtual index
      */
    def getPackedIndex(setNumber: Double, virtualIndex: Double, insertAsNeeded: Boolean): Double = js.native
    
    def getPackedSlotIndicators(entryIndex: Double): Double = js.native
    
    def getPopulatedLongLength(): Double = js.native
    
    def getPopulatedShortLength(): Double = js.native
    
    def getRootEntry(setNumber: Double): Double = js.native
    def getRootEntry(setNumber: Double, insertAsNeeded: Boolean): Double = js.native
    
    def getTopLevelShift(): Double = js.native
    
    def getVirtualLength(): Double = js.native
    
    def incrementAndGetAtUnpackedIndex(index: Double): Double = js.native
    
    /* private */ var init: Any = js.native
    
    /* private */ var initArrayViews: Any = js.native
    
    val isPacked: Boolean = js.native
    
    def lazysetAtUnpackedIndex(index: Double, newValue: Double): Unit = js.native
    
    /* private */ var leafEntryToString: Any = js.native
    
    def length(): Double = js.native
    
    /* private */ var longArray: Any = js.native
    
    /* private */ var newEntry: Any = js.native
    
    /* private */ var newLeafEntry: Any = js.native
    
    /* private */ var nonLeafEntryToString: Any = js.native
    
    var physicalLength: Double = js.native
    
    /* private */ var populateEquivalentEntriesWithEntriesFromOther: Any = js.native
    
    /* private */ var populatedShortLength: Any = js.native
    
    def resizeArray(newLength: Double): Unit = js.native
    
    def setAtByteIndex(byteIndex: Double, value: Double): Unit = js.native
    
    def setAtLongIndex(longIndex: Double, value: Double): Unit = js.native
    
    def setAtShortIndex(shortIndex: Double, value: Double): Unit = js.native
    
    def setAtUnpackedIndex(index: Double, newValue: Double): Unit = js.native
    
    def setIndexAtEntrySlot(entryIndex: Double, slot: Double, newIndexValue: Double): Unit = js.native
    
    def setPackedSlotIndicators(entryIndex: Double, newPackedSlotIndicators: Double): Unit = js.native
    
    def setPopulatedLongLength(newPopulatedLongLength: Double): Unit = js.native
    
    def setVirtualLength(virtualLength: Double): Unit = js.native
    
    /* private */ var shortArray: Any = js.native
    
    /* private */ var topLevelShift: Any = js.native
    
    /* private */ var virtualLength: Any = js.native
  }
}
