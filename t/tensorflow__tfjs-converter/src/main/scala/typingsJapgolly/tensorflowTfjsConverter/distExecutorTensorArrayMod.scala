package typingsJapgolly.tensorflowTfjsConverter

import typingsJapgolly.std.Set
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExecutorTensorArrayMod {
  
  @JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_array", "TensorArray")
  @js.native
  open class TensorArray protected () extends StObject {
    def this(
      name: String,
      dtype: DataType,
      maxSize: Double,
      elementShape: js.Array[Double],
      identicalElementShapes: Boolean,
      dynamicSize: Boolean,
      clearAfterRead: Boolean
    ) = this()
    
    val clearAfterRead: Boolean = js.native
    
    /**
      * Dispose the tensors and idTensor and mark the TensoryArray as closed.
      */
    def clearAndClose(): Unit = js.native
    def clearAndClose(keepIds: Set[Double]): Unit = js.native
    
    def closed: Boolean = js.native
    
    /* private */ var closed_ : Any = js.native
    
    /**
      * Return the values in the TensorArray as a concatenated Tensor.
      */
    def concat(): Tensor[Rank] = js.native
    def concat(dtype: DataType): Tensor[Rank] = js.native
    
    val dtype: DataType = js.native
    
    val dynamicSize: Boolean = js.native
    
    /* private */ var elementShape: Any = js.native
    
    /**
      * Return selected values in the TensorArray as a packed Tensor. All of
      * selected values must have been written and their shapes must all match.
      * @param [indices] number[] Optional. Taking values in [0, max_value). If the
      *    TensorArray is not dynamic, max_value=size(). If not specified returns
      *    all tensors in the original order.
      * @param [dtype]
      */
    def gather(): Tensor[Rank] = js.native
    def gather(indices: js.Array[Double]): Tensor[Rank] = js.native
    def gather(indices: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
    def gather(indices: Unit, dtype: DataType): Tensor[Rank] = js.native
    
    def id: Double = js.native
    
    val idTensor: Tensor[Rank] = js.native
    
    val identicalElementShapes: Boolean = js.native
    
    /* private */ var maxSize: Any = js.native
    
    val name: String = js.native
    
    /**
      * Read the value at location index in the TensorArray.
      * @param index Number the index to read from.
      */
    def read(index: Double): Tensor[Rank] = js.native
    
    /**
      * Helper method to read multiple tensors from the specified indices.
      */
    def readMany(indices: js.Array[Double]): js.Array[Tensor[Rank]] = js.native
    
    /**
      * Scatter the values of a Tensor in specific indices of a TensorArray.
      * @param indices nummber[] values in [0, max_value). If the
      *    TensorArray is not dynamic, max_value=size().
      * @param tensor Tensor input tensor.
      */
    def scatter(indices: js.Array[Double], tensor: Tensor[Rank]): Unit = js.native
    
    def size(): Double = js.native
    
    /**
      * Split the values of a Tensor into the TensorArray.
      * @param length number[] with the lengths to use when splitting value along
      *    its first dimension.
      * @param tensor Tensor, the tensor to split.
      */
    def split(length: js.Array[Double], tensor: Tensor[Rank]): Unit = js.native
    
    /* private */ var tensors: Any = js.native
    
    /**
      * Write value into the index of the TensorArray.
      * @param index number the index to write to.
      * @param tensor
      */
    def write(index: Double, tensor: Tensor[Rank]): Unit = js.native
    
    /**
      * Helper method to write multiple tensors to the specified indices.
      */
    def writeMany(indices: js.Array[Double], tensors: js.Array[Tensor[Rank]]): Unit = js.native
  }
  
  trait TensorWithState extends StObject {
    
    var cleared: js.UndefOr[Boolean] = js.undefined
    
    var read: js.UndefOr[Boolean] = js.undefined
    
    var tensor: js.UndefOr[Tensor[Rank]] = js.undefined
    
    var written: js.UndefOr[Boolean] = js.undefined
  }
  object TensorWithState {
    
    inline def apply(): TensorWithState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TensorWithState]
    }
    
    extension [Self <: TensorWithState](x: Self) {
      
      inline def setCleared(value: Boolean): Self = StObject.set(x, "cleared", value.asInstanceOf[js.Any])
      
      inline def setClearedUndefined: Self = StObject.set(x, "cleared", js.undefined)
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setTensor(value: Tensor[Rank]): Self = StObject.set(x, "tensor", value.asInstanceOf[js.Any])
      
      inline def setTensorUndefined: Self = StObject.set(x, "tensor", js.undefined)
      
      inline def setWritten(value: Boolean): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
      
      inline def setWrittenUndefined: Self = StObject.set(x, "written", js.undefined)
    }
  }
}
