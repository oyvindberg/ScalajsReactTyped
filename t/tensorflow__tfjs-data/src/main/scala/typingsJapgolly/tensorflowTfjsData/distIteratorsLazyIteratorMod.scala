package typingsJapgolly.tensorflowTfjsData

import typingsJapgolly.std.IteratorResult
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import typingsJapgolly.tensorflowTfjsData.distTypesMod.Container
import typingsJapgolly.tensorflowTfjsData.distUtilDeepMapMod.DeepMapResult
import typingsJapgolly.tensorflowTfjsData.distUtilRingBufferMod.RingBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorsLazyIteratorMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ChainedIterator")
  @js.native
  open class ChainedIterator[T] protected () extends LazyIterator[T] {
    def this(iterators: LazyIterator[LazyIterator[T]]) = this()
    def this(
      iterators: LazyIterator[LazyIterator[T]],
      baseErrorHandler: js.Function1[/* e */ js.Error, Boolean]
    ) = this()
    
    /* private */ val baseErrorHandler: Any = js.native
    
    /* private */ var iterator: Any = js.native
    
    /* private */ var lastRead: Any = js.native
    
    /* private */ var moreIterators: Any = js.native
    
    /* private */ var readFromChain: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "LazyIterator")
  @js.native
  open class LazyIterator[T] () extends StObject {
    
    /**
      * Groups elements into batches, represented in column-major form.
      *
      * We can think of the elements of this iterator as 'rows' (even if they are
      * nested structures).  By the same token, consecutive values for a given
      * key within the elements form a 'column'.  This matches the usual sense of
      * 'row' and 'column' when processing tabular data (e.g., parsing a CSV).
      *
      * Thus, "column-major" means that the resulting batch is a (potentially
      * nested) structure representing the columns.  Each column entry, then,
      * contains a collection of the values found in that column for a range of
      * input elements.  This representation allows for vectorized computation, in
      * contrast to the row-major form.
      *
      * The inputs should all have the same nested structure (i.e., of arrays and
      * dicts).  The result is a single object with the same nested structure,
      * where the leaves are arrays collecting the values of the inputs at that
      * location (or, optionally, the result of a custom function applied to those
      * arrays).
      *
      * @param batchSize The number of elements desired per batch.
      * @param smallLastBatch Whether to emit the final batch when it has fewer
      *   than batchSize elements. Default true.
      * @param zipFn: (optional) A function that expects an array of elements at a
      *   single node of the object tree, and returns a `DeepMapResult`.  The
      *   `DeepMapResult` either provides a result value for that node (i.e.,
      *   representing the subtree), or indicates that the node should be processed
      *   recursively.  The default zipFn recurses as far as possible and places
      *   arrays at the leaves.
      * @returns A `LazyIterator` of batches of elements, represented as an object
      *   with collections at the leaves.
      */
    def columnMajorBatch(batchSize: Double): LazyIterator[TensorContainer] = js.native
    def columnMajorBatch(batchSize: Double, smallLastBatch: Boolean): LazyIterator[TensorContainer] = js.native
    def columnMajorBatch(
      batchSize: Double,
      smallLastBatch: Boolean,
      zipFn: js.Function1[/* xs */ js.Array[Any], DeepMapResult]
    ): LazyIterator[TensorContainer] = js.native
    def columnMajorBatch(
      batchSize: Double,
      smallLastBatch: Unit,
      zipFn: js.Function1[/* xs */ js.Array[Any], DeepMapResult]
    ): LazyIterator[TensorContainer] = js.native
    
    /**
      * Concatenate this `LazyIterator` with another.
      *
      * @param iterator A `LazyIterator` to be concatenated onto this one.
      * @param baseErrorHandler An optional function that can intercept `Error`s
      *   raised during a `next()` call on the base stream.  This function can
      *   decide whether the error should be propagated, whether the error should
      *   be ignored, or whether the base stream should be terminated.
      * @returns A `LazyIterator`.
      */
    def concatenate(iterator: LazyIterator[T]): LazyIterator[T] = js.native
    def concatenate(iterator: LazyIterator[T], baseErrorHandler: js.Function1[/* e */ js.Error, Boolean]): LazyIterator[T] = js.native
    
    /**
      * Filters this stream according to `predicate`.
      *
      * @param predicate A function mapping a stream element to a boolean or a
      * `Promise` for one.
      *
      * @returns A `LazyIterator` of elements for which the predicate was true.
      */
    def filter(predicate: js.Function1[/* value */ T, Boolean]): LazyIterator[T] = js.native
    
    /**
      * Maps this stream through a 1-to-many transform.
      *
      * @param transform A function mapping a stream element to an array of
      *   transformed elements.
      *
      * @returns A `DataStream` of transformed elements.
      */
    def flatmap[O](transform: js.Function1[/* value */ T, js.Array[O]]): LazyIterator[O] = js.native
    
    /**
      * Apply a function to every element of the stream.
      *
      * @param f A function to apply to each stream element.
      */
    def forEachAsync(f: js.Function1[/* value */ T, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Handles errors thrown on this stream using a provided handler function.
      *
      * @param handler A function that handles any `Error` thrown during a `next()`
      *   call and returns true if the stream should continue (dropping the failed
      *   call) or false if the stream should quietly terminate.  If the handler
      *   itself throws (or rethrows) an `Error`, that will be propagated.
      *
      * @returns A `LazyIterator` of elements passed through from upstream,
      *   possibly filtering or terminating on upstream `next()` calls that
      *   throw an `Error`.
      */
    def handleErrors(handler: js.Function1[/* error */ js.Error, Boolean]): LazyIterator[T] = js.native
    
    /**
      * Maps this stream through a 1-to-1 transform.
      *
      * @param transform A function mapping a stream element to a transformed
      *   element.
      *
      * @returns A `LazyIterator` of transformed elements.
      */
    def map[O](transform: js.Function1[/* value */ T, O]): LazyIterator[O] = js.native
    
    /**
      * Maps this stream through an async 1-to-1 transform.
      *
      * @param transform A function mapping a stream element to a `Promise` for a
      *   transformed stream element.
      *
      * @returns A `LazyIterator` of transformed elements.
      */
    def mapAsync[O](transform: js.Function1[/* value */ T, js.Promise[O]]): LazyIterator[O] = js.native
    
    /**
      * Returns a `Promise` for the next element in the stream.
      *
      * When an item can be provided successfully, the return value is
      * `{value:T, done:false}`.
      *
      * Calling next() on a closed stream returns `{value:null, done:true}`.
      */
    def next(): js.Promise[IteratorResult[T, Any]] = js.native
    
    /**
      * Prefetch the first `bufferSize` items in this stream.
      *
      * Note this prefetches Promises, but makes no guarantees about when those
      * Promises resolve.
      *
      * @param bufferSize: An integer specifying the number of elements to be
      *   prefetched.
      */
    def prefetch(bufferSize: Double): LazyIterator[T] = js.native
    
    /**
      * Draw items from the stream until it is exhausted.
      *
      * This can be useful when the stream has side effects but no output.  In
      * that case, calling this function guarantees that the stream will be
      * fully processed.
      */
    def resolveFully(): js.Promise[Unit] = js.native
    
    /**
      * Draw items from the stream until it is exhausted, or a predicate fails.
      *
      * This can be useful when the stream has side effects but no output.  In
      * that case, calling this function guarantees that the stream will be
      * fully processed.
      */
    def resolveWhile(predicate: js.Function1[/* r */ T, Boolean]): js.Promise[Unit] = js.native
    
    /**
      * Groups elements into batches, represented as arrays of elements.
      *
      * We can think of the elements of this iterator as 'rows' (even if they are
      * nested structures).  By the same token, consecutive values for a given
      * key within the elements form a 'column'.  This matches the usual sense of
      * 'row' and 'column' when processing tabular data (e.g., parsing a CSV).
      *
      * Thus, "Row-major" means that the resulting batch is simply a collection of
      * rows: `[row1, row2, row3, ...]`.  This is contrast to the column-major
      * form, which is needed for vectorized computation.
      *
      * @param batchSize The number of elements desired per batch.
      * @param smallLastBatch Whether to emit the final batch when it has fewer
      *   than batchSize elements. Default true.
      * @returns A `LazyIterator` of batches of elements, represented as arrays
      *   of the original element type.
      */
    def rowMajorBatch(batchSize: Double): LazyIterator[js.Array[T]] = js.native
    def rowMajorBatch(batchSize: Double, smallLastBatch: Boolean): LazyIterator[js.Array[T]] = js.native
    
    /**
      * Force an iterator to execute serially: each next() call will await the
      * prior one, so that they cannot execute concurrently.
      */
    def serial(): LazyIterator[T] = js.native
    
    /**
      * Apply a function to every element of the stream, forcing serial execution.
      *
      * @param f A function to apply to each stream element.  Should return 'true'
      *   to indicate that the stream should continue, or 'false' to cause it to
      *   terminate.
      */
    def serialForEach(f: js.Function1[/* value */ T, js.Promise[Boolean]]): js.Promise[Unit] = js.native
    
    /**
      * Maps this stream through a 1-to-1 transform, forcing serial execution.
      *
      * @param transform A function mapping a stream element to a transformed
      *   element.
      *
      * @returns A `LazyIterator` of transformed elements.
      */
    def serialMapAsync[O](transform: js.Function1[/* value */ T, js.Promise[O]]): LazyIterator[O] = js.native
    
    /**
      * Randomly shuffles the elements of this stream.
      *
      * @param bufferSize: An integer specifying the number of elements from
      * this stream from which the new stream will sample.
      * @param seed: (Optional.) An integer specifying the random seed that
      * will be used to create the distribution.
      */
    def shuffle(windowSize: Double): LazyIterator[T] = js.native
    def shuffle(windowSize: Double, seed: String): LazyIterator[T] = js.native
    
    /**
      * Skips the first `count` items in this stream.
      *
      * @param count The number of items to skip.  If a negative or undefined
      * value is given, the entire stream is returned unaltered.
      */
    def skip(count: Double): LazyIterator[T] = js.native
    
    def summary(): String = js.native
    
    /**
      * Limits this stream to return at most `count` items.
      *
      * @param count The maximum number of items to provide from the stream. If
      * a negative or undefined value is given, the entire stream is returned
      *   unaltered.
      */
    def take(count: Double): LazyIterator[T] = js.native
    
    /**
      * Collect all remaining elements of a bounded stream into an array.
      * Obviously this will succeed only for small streams that fit in memory.
      * Useful for testing.
      *
      * @returns A Promise for an array of stream elements, which will resolve
      *   when the stream is exhausted.
      */
    def toArray(): js.Promise[js.Array[T]] = js.native
    
    /**
      * Collect all elements of this dataset into an array with prefetching 100
      * elements. This is useful for testing, because the prefetch changes the
      * order in which the Promises are resolved along the processing pipeline.
      * This may help expose bugs where results are dependent on the order of
      * Promise resolution rather than on the logical order of the stream (i.e.,
      * due to hidden mutable state).
      *
      * @returns A Promise for an array of stream elements, which will resolve
      *   when the stream is exhausted.
      */
    def toArrayForTest(): js.Promise[js.Array[T]] = js.native
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "OneToManyIterator")
  @js.native
  open class OneToManyIterator[T] () extends LazyIterator[T] {
    
    /* private */ var lastRead: Any = js.native
    
    /* protected */ var outputQueue: RingBuffer[T] = js.native
    
    /**
      * Read one or more chunks from upstream and process them, possibly
      * reading or writing a carryover, and adding processed items to the
      * output queue.  Note it's possible that no items are added to the queue
      * on a given pump() call, even if the upstream stream is not closed
      * (e.g., because items are filtered).
      *
      * @return `true` if any action was taken, i.e. fetching items from the
      *   upstream source OR adding items to the output queue.  `false` if the
      *   upstream source is exhausted AND nothing was added to the queue
      * (i.e., any remaining carryover).
      */
    /* protected */ def pump(): js.Promise[Boolean] = js.native
    
    def serialNext(): js.Promise[IteratorResult[T, Any]] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "PrefetchIterator")
  @js.native
  open class PrefetchIterator[T] protected () extends LazyIterator[T] {
    def this(upstream: LazyIterator[T], bufferSize: Double) = this()
    
    /* protected */ var buffer: RingBuffer[js.Promise[IteratorResult[T, Any]]] = js.native
    
    /* protected */ var bufferSize: Double = js.native
    
    /**
      * Refill the prefetch buffer.  Returns only after the buffer is full, or
      * the upstream source is exhausted.
      */
    /* protected */ def refill(): Unit = js.native
    
    /* protected */ var upstream: LazyIterator[T] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ShuffleIterator")
  @js.native
  open class ShuffleIterator[T] protected () extends PrefetchIterator[T] {
    def this(upstream: LazyIterator[T], windowSize: Double) = this()
    def this(upstream: LazyIterator[T], windowSize: Double, seed: String) = this()
    
    /* protected */ def chooseIndex(): Double = js.native
    
    /* private */ var lastRead: Any = js.native
    
    /* private */ val random: Any = js.native
    
    /* private */ var randomInt: Any = js.native
    
    def serialNext(): js.Promise[IteratorResult[T, Any]] = js.native
    
    /* private */ var upstreamExhausted: Any = js.native
    
    /* protected */ var windowSize: Double = js.native
  }
  
  @js.native
  sealed trait ZipMismatchMode extends StObject
  @JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ZipMismatchMode")
  @js.native
  object ZipMismatchMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ZipMismatchMode & Double] = js.native
    
    @js.native
    sealed trait FAIL
      extends StObject
         with ZipMismatchMode
    /* 0 */ val FAIL: typingsJapgolly.tensorflowTfjsData.distIteratorsLazyIteratorMod.ZipMismatchMode.FAIL & Double = js.native
    
    @js.native
    sealed trait LONGEST
      extends StObject
         with ZipMismatchMode
    /* 2 */ val LONGEST: typingsJapgolly.tensorflowTfjsData.distIteratorsLazyIteratorMod.ZipMismatchMode.LONGEST & Double = js.native
    
    @js.native
    sealed trait SHORTEST
      extends StObject
         with ZipMismatchMode
    /* 1 */ val SHORTEST: typingsJapgolly.tensorflowTfjsData.distIteratorsLazyIteratorMod.ZipMismatchMode.SHORTEST & Double = js.native
  }
  
  inline def iteratorFromConcatenated[T](baseIterators: LazyIterator[LazyIterator[T]]): LazyIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromConcatenated")(baseIterators.asInstanceOf[js.Any]).asInstanceOf[LazyIterator[T]]
  inline def iteratorFromConcatenated[T](
    baseIterators: LazyIterator[LazyIterator[T]],
    baseErrorHandler: js.Function1[/* e */ js.Error, Boolean]
  ): LazyIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromConcatenated")(baseIterators.asInstanceOf[js.Any], baseErrorHandler.asInstanceOf[js.Any])).asInstanceOf[LazyIterator[T]]
  
  inline def iteratorFromConcatenatedFunction[T](iteratorFunc: js.Function0[IteratorResult[LazyIterator[T], Any]], count: Double): LazyIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromConcatenatedFunction")(iteratorFunc.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[LazyIterator[T]]
  inline def iteratorFromConcatenatedFunction[T](
    iteratorFunc: js.Function0[IteratorResult[LazyIterator[T], Any]],
    count: Double,
    baseErrorHandler: js.Function1[/* e */ js.Error, Boolean]
  ): LazyIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromConcatenatedFunction")(iteratorFunc.asInstanceOf[js.Any], count.asInstanceOf[js.Any], baseErrorHandler.asInstanceOf[js.Any])).asInstanceOf[LazyIterator[T]]
  
  inline def iteratorFromFunction[T](func: js.Function0[(IteratorResult[T, Any]) | (js.Promise[IteratorResult[T, Any]])]): LazyIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromFunction")(func.asInstanceOf[js.Any]).asInstanceOf[LazyIterator[T]]
  
  inline def iteratorFromIncrementing(start: Double): LazyIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromIncrementing")(start.asInstanceOf[js.Any]).asInstanceOf[LazyIterator[Double]]
  
  inline def iteratorFromItems[T](items: js.Array[T]): LazyIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromItems")(items.asInstanceOf[js.Any]).asInstanceOf[LazyIterator[T]]
  
  inline def iteratorFromZipped[O /* <: TensorContainer */](iterators: IteratorContainer): LazyIterator[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromZipped")(iterators.asInstanceOf[js.Any]).asInstanceOf[LazyIterator[O]]
  inline def iteratorFromZipped[O /* <: TensorContainer */](iterators: IteratorContainer, mismatchMode: ZipMismatchMode): LazyIterator[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorFromZipped")(iterators.asInstanceOf[js.Any], mismatchMode.asInstanceOf[js.Any])).asInstanceOf[LazyIterator[O]]
  
  type IteratorContainer = Container[LazyIterator[TensorContainer]]
}
