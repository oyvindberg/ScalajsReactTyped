package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSlidesElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSlidesSlidesMod {
  
  @JSImport("@ionic/core/dist/types/components/slides/slides", "Slides")
  @js.native
  open class Slides ()
    extends StObject
       with ComponentInterface {
    
    @JSName("componentWillLoad")
    def componentWillLoad_MSlides(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSlides(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSlides(): Unit = js.native
    
    var el: HTMLIonSlidesElement = js.native
    
    /**
      * Get the index of the active slide.
      */
    def getActiveIndex(): js.Promise[Double] = js.native
    
    /**
      * Get the index of the previous slide.
      */
    def getPreviousIndex(): js.Promise[Double] = js.native
    
    /**
      * Get the Swiper instance.
      * Use this to access the full Swiper API.
      * See https://swiperjs.com/swiper-api for all API options.
      */
    def getSwiper(): js.Promise[Any] = js.native
    
    /* private */ var initSwiper: Any = js.native
    
    /**
      * Emitted after the active slide has changed.
      */
    var ionSlideDidChange: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user double taps on the slide's container.
      */
    var ionSlideDoubleTap: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slider is actively being moved.
      */
    var ionSlideDrag: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the next slide has ended.
      */
    var ionSlideNextEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the next slide has started.
      */
    var ionSlideNextStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the previous slide has ended.
      */
    var ionSlidePrevEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the previous slide has started.
      */
    var ionSlidePrevStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slider is at the last slide.
      */
    var ionSlideReachEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slider is at its initial position.
      */
    var ionSlideReachStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user taps/clicks on the slide's container.
      */
    var ionSlideTap: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user releases the touch.
      */
    var ionSlideTouchEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user first touches the slider.
      */
    var ionSlideTouchStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slide transition has ended.
      */
    var ionSlideTransitionEnd: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the slide transition has started.
      */
    var ionSlideTransitionStart: EventEmitter[Unit] = js.native
    
    /**
      * Emitted before the active slide has changed.
      */
    var ionSlideWillChange: EventEmitter[Unit] = js.native
    
    /**
      * Emitted after Swiper initialization
      */
    var ionSlidesDidLoad: EventEmitter[Unit] = js.native
    
    /**
      * Get whether or not the current slide is the first slide.
      */
    def isBeginning(): js.Promise[Boolean] = js.native
    
    /**
      * Get whether or not the current slide is the last slide.
      */
    def isEnd(): js.Promise[Boolean] = js.native
    
    /**
      * Get the total number of slides.
      */
    def length(): js.Promise[Double] = js.native
    
    /**
      * Lock or unlock the ability to slide to the next slide.
      *
      * @param lock If `true`, disable swiping to the next slide.
      */
    def lockSwipeToNext(lock: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Lock or unlock the ability to slide to the previous slide.
      *
      * @param lock If `true`, disable swiping to the previous slide.
      */
    def lockSwipeToPrev(lock: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Lock or unlock the ability to slide to the next or previous slide.
      *
      * @param lock If `true`, disable swiping to the next and previous slide.
      */
    def lockSwipes(lock: Boolean): js.Promise[Unit] = js.native
    
    /* private */ var mutationO: Any = js.native
    
    /* private */ var normalizeOptions: Any = js.native
    
    /**
      * Options to pass to the swiper instance.
      * See https://swiperjs.com/swiper-api for valid options
      */
    var options: Any = js.native
    
    def optionsChanged(): js.Promise[Unit] = js.native
    
    /**
      * If `true`, show the pagination.
      */
    var pager: Boolean = js.native
    
    /* private */ var paginationEl: Any = js.native
    
    /* private */ var readySwiper: Any = js.native
    
    @JSName("render")
    def render_MSlides(): Any = js.native
    
    /**
      * If `true`, show the scrollbar.
      */
    var scrollbar: Boolean = js.native
    
    /* private */ var scrollbarEl: Any = js.native
    
    /**
      * Transition to the next slide.
      *
      * @param speed The transition duration (in ms).
      * @param runCallbacks If true, the transition will produce [Transition/SlideChange][Start/End] transition events.
      */
    def slideNext(): js.Promise[Unit] = js.native
    def slideNext(speed: Double): js.Promise[Unit] = js.native
    def slideNext(speed: Double, runCallbacks: Boolean): js.Promise[Unit] = js.native
    def slideNext(speed: Unit, runCallbacks: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Transition to the previous slide.
      *
      * @param speed The transition duration (in ms).
      * @param runCallbacks If true, the transition will produce the [Transition/SlideChange][Start/End] transition events.
      */
    def slidePrev(): js.Promise[Unit] = js.native
    def slidePrev(speed: Double): js.Promise[Unit] = js.native
    def slidePrev(speed: Double, runCallbacks: Boolean): js.Promise[Unit] = js.native
    def slidePrev(speed: Unit, runCallbacks: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Transition to the specified slide.
      *
      * @param index The index of the slide to transition to.
      * @param speed The transition duration (in ms).
      * @param runCallbacks If true, the transition will produce [Transition/SlideChange][Start/End] transition events.
      */
    def slideTo(index: Double): js.Promise[Unit] = js.native
    def slideTo(index: Double, speed: Double): js.Promise[Unit] = js.native
    def slideTo(index: Double, speed: Double, runCallbacks: Boolean): js.Promise[Unit] = js.native
    def slideTo(index: Double, speed: Unit, runCallbacks: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Start auto play.
      */
    def startAutoplay(): js.Promise[Unit] = js.native
    
    /**
      * Stop auto play.
      */
    def stopAutoplay(): js.Promise[Unit] = js.native
    
    /* private */ var swiper: Any = js.native
    
    /* private */ var swiperReady: Any = js.native
    
    /**
      * Update the underlying slider implementation. Call this if you've added or removed
      * child slides.
      */
    def update(): js.Promise[Unit] = js.native
    
    /**
      * Force swiper to update its height (when autoHeight is enabled) for the duration
      * equal to 'speed' parameter.
      *
      * @param speed The transition duration (in ms).
      */
    def updateAutoHeight(): js.Promise[Unit] = js.native
    def updateAutoHeight(speed: Double): js.Promise[Unit] = js.native
  }
}
