package typingsJapgolly.photoswipe

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photoswipe.anon.Bottom
import typingsJapgolly.photoswipe.mod.UI
import typingsJapgolly.photoswipe.mod.UIFramework
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPhotoswipeUiDefaultMod {
  
  /**
    * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
    */
  @JSImport("photoswipe/dist/photoswipe-ui-default", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PhotoSwipeUIDefault {
    def this(pswp: typingsJapgolly.photoswipe.mod.^[Options], framework: UIFramework) = this()
    
    /**
      * Called by PhotoSwipe after it constructs the UI.
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
      */
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  
  trait Item
    extends StObject
       with typingsJapgolly.photoswipe.mod.Item {
    
    /**
      * The caption for this item.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with typingsJapgolly.photoswipe.mod.Options {
    
    /**
      * Function to build caption markup. The function takes three parameters:
      *
      * item      - slide object
      * captionEl - caption DOM element
      * isFake    - true when content is added to fake caption container
      *             (used to get size of next or previous caption)
      *
      * Return whether to show the caption or not.
      *
      * Default is:
      *
      * function(item, captionEl, isFake) {
      *     if(!item.title) {
      *         captionEl.children[0].innerHTML = '';
      *         return false;
      *     }
      *     captionEl.children[0].innerHTML = item.title;
      *     return true;
      * }
      *
      */
    var addCaptionHTMLFn: js.UndefOr[
        js.Function3[/* item */ Item, /* captionEl */ HTMLElement, /* isFake */ Boolean, Boolean]
      ] = js.undefined
    
    /**
      * Whether to show the left/right directional arrows.
      *
      * Default true.
      */
    var arrowEl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Size of top & bottom bars in pixels. "bottom" parameter can be 'auto' (will calculate height of caption).
      * Option applies only when mouse is used, or when width of screen is more than 1200px.
      * Also look at `parseVerticalMargin` event.
      *
      * Default {top: 44, bottom: "auto"}.
      */
    var barsSize: js.UndefOr[Bottom] = js.undefined
    
    /**
      * Whether to show the caption.
      *
      * Default true.
      */
    var captionEl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mouse click on image should close the gallery, only when image is smaller than size of the viewport.
      *
      * Default true.
      */
    var clickToCloseNonZoomable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the close button.
      *
      * Default true.
      */
    var closeEl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Element classes that should close PhotoSwipe when clicked on.
      * In HTML markup, class should always start with "pswp__", e.g.: "pswp__item", "pswp__caption".
      *
      * "pswp__ui--over-close" class will be added to root element of UI when mouse is over one of these elements
      * By default it's used to highlight the close button.
      *
      * Default ['item', 'caption', 'zoom-wrap', 'ui', 'top-bar'].
      */
    var closeElClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to show the current image's index in the gallery (located in top-left corner by default).
      *
      * Default true.
      */
    var counterEl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the fullscreen button.
      *
      * Default true.
      */
    var fullscreenEl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback that should return the URL for the currently selected image. The callback is passed
      * the shareButtonData entry that was clicked on.
      *
      * Default is:
      *
      * function( shareButtonData ) {
      *     // `shareButtonData` - object from shareButtons array
      *     //
      *     // `pswp` is the gallery instance object,
      *     // you should define it by yourself
      *     //
      *     return pswp.currItem.src || '';
      * }
      *
      */
    var getImageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, String]] = js.undefined
    
    /**
      * A callback that should return the "Page" associated with the selected image. (e.g. on Facebook, the shared
      * content will be associated with the returned page). The callback is passed the shareButtonData entry that
      * was clicked on.
      *
      * Default is:
      *
      * function( shareButtonData ) {
      *     return window.location.href;
      * }
      *
      */
    var getPageURLForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, String]] = js.undefined
    
    /**
      * A callback that should return the Text associated with the selected image. The callback is passed
      * the shareButtonData entry that was clicked on.
      *
      * Default is:
      *
      * function( shareButtonData ) {
      *     return pswp.currItem.title || '';
      * }
      *
      */
    var getTextForShare: js.UndefOr[js.Function1[/* shareButtonData */ ShareButtonData, String]] = js.undefined
    
    /**
      * Separator for "1 of X" counter.
      *
      * Default ' / '.
      */
    var indexIndicatorSep: js.UndefOr[String] = js.undefined
    
    /**
      * Delay in milliseconds until loading indicator is displayed.
      *
      * Default 1000.
      */
    var loadingIndicatorDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * A final output callback that you can use to further modify the share button's HTML. The callback is passed
      * (1) the shareButtonData entry being generated, and (2) the default HTML generated by PhotoSwipUI_Default.
      *
      * Default is:
      *
      * function(shareButtonData, shareButtonOut) {
      *     return shareButtonOut;
      * }
      *
      */
    var parseShareButtonOut: js.UndefOr[
        js.Function2[/* shareButtonData */ ShareButtonData, /* shareButtonOut */ String, String]
      ] = js.undefined
    
    /**
      * Whether to show the preloader element.
      *
      * Default true.
      */
    var preloaderEl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The entries that show up when you click the Share button.
      *
      * Default is:
      *
      * [
      *     {id:'facebook', label:'Share on Facebook', url:'https://www.facebook.com/sharer/sharer.php?u='},
      *     {id:'twitter', label:'Tweet', url:'https://twitter.com/intent/tweet?text=&url='},
      *     {id:'pinterest', label:'Pin it', url:'http://www.pinterest.com/pin/create/button/?url=&media=&description='},
      *     {id:'download', label:'Download image', url:'', download:true}
      * ]
      *
      */
    var shareButtons: js.UndefOr[js.Array[ShareButtonData]] = js.undefined
    
    /**
      * Whether to show the share button.
      *
      * Default true.
      */
    var shareEl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tap on sliding area should close gallery.
      *
      * Default false.
      */
    var tapToClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tap should toggle visibility of controls.
      *
      * Default true.
      */
    var tapToToggleControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds class pswp__ui--idle to pswp__ui element when mouse isn't moving for timeToIdle milliseconds.
      *
      * Default 4000.
      */
    var timeToIdle: js.UndefOr[Double] = js.undefined
    
    /**
      * Adds class pswp__ui--idle to pswp__ui element when mouse leaves the window for timeToIdleOutside milliseconds.
      *
      * Default 1000.
      */
    var timeToIdleOutside: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to show the zoom button.
      *
      * Default true.
      */
    var zoomEl: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddCaptionHTMLFn(value: (/* item */ Item, /* captionEl */ HTMLElement, /* isFake */ Boolean) => Boolean): Self = StObject.set(x, "addCaptionHTMLFn", js.Any.fromFunction3(value))
      
      inline def setAddCaptionHTMLFnUndefined: Self = StObject.set(x, "addCaptionHTMLFn", js.undefined)
      
      inline def setArrowEl(value: Boolean): Self = StObject.set(x, "arrowEl", value.asInstanceOf[js.Any])
      
      inline def setArrowElUndefined: Self = StObject.set(x, "arrowEl", js.undefined)
      
      inline def setBarsSize(value: Bottom): Self = StObject.set(x, "barsSize", value.asInstanceOf[js.Any])
      
      inline def setBarsSizeUndefined: Self = StObject.set(x, "barsSize", js.undefined)
      
      inline def setCaptionEl(value: Boolean): Self = StObject.set(x, "captionEl", value.asInstanceOf[js.Any])
      
      inline def setCaptionElUndefined: Self = StObject.set(x, "captionEl", js.undefined)
      
      inline def setClickToCloseNonZoomable(value: Boolean): Self = StObject.set(x, "clickToCloseNonZoomable", value.asInstanceOf[js.Any])
      
      inline def setClickToCloseNonZoomableUndefined: Self = StObject.set(x, "clickToCloseNonZoomable", js.undefined)
      
      inline def setCloseEl(value: Boolean): Self = StObject.set(x, "closeEl", value.asInstanceOf[js.Any])
      
      inline def setCloseElClasses(value: js.Array[String]): Self = StObject.set(x, "closeElClasses", value.asInstanceOf[js.Any])
      
      inline def setCloseElClassesUndefined: Self = StObject.set(x, "closeElClasses", js.undefined)
      
      inline def setCloseElClassesVarargs(value: String*): Self = StObject.set(x, "closeElClasses", js.Array(value*))
      
      inline def setCloseElUndefined: Self = StObject.set(x, "closeEl", js.undefined)
      
      inline def setCounterEl(value: Boolean): Self = StObject.set(x, "counterEl", value.asInstanceOf[js.Any])
      
      inline def setCounterElUndefined: Self = StObject.set(x, "counterEl", js.undefined)
      
      inline def setFullscreenEl(value: Boolean): Self = StObject.set(x, "fullscreenEl", value.asInstanceOf[js.Any])
      
      inline def setFullscreenElUndefined: Self = StObject.set(x, "fullscreenEl", js.undefined)
      
      inline def setGetImageURLForShare(value: /* shareButtonData */ ShareButtonData => String): Self = StObject.set(x, "getImageURLForShare", js.Any.fromFunction1(value))
      
      inline def setGetImageURLForShareUndefined: Self = StObject.set(x, "getImageURLForShare", js.undefined)
      
      inline def setGetPageURLForShare(value: /* shareButtonData */ ShareButtonData => String): Self = StObject.set(x, "getPageURLForShare", js.Any.fromFunction1(value))
      
      inline def setGetPageURLForShareUndefined: Self = StObject.set(x, "getPageURLForShare", js.undefined)
      
      inline def setGetTextForShare(value: /* shareButtonData */ ShareButtonData => String): Self = StObject.set(x, "getTextForShare", js.Any.fromFunction1(value))
      
      inline def setGetTextForShareUndefined: Self = StObject.set(x, "getTextForShare", js.undefined)
      
      inline def setIndexIndicatorSep(value: String): Self = StObject.set(x, "indexIndicatorSep", value.asInstanceOf[js.Any])
      
      inline def setIndexIndicatorSepUndefined: Self = StObject.set(x, "indexIndicatorSep", js.undefined)
      
      inline def setLoadingIndicatorDelay(value: Double): Self = StObject.set(x, "loadingIndicatorDelay", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorDelayUndefined: Self = StObject.set(x, "loadingIndicatorDelay", js.undefined)
      
      inline def setParseShareButtonOut(value: (/* shareButtonData */ ShareButtonData, /* shareButtonOut */ String) => String): Self = StObject.set(x, "parseShareButtonOut", js.Any.fromFunction2(value))
      
      inline def setParseShareButtonOutUndefined: Self = StObject.set(x, "parseShareButtonOut", js.undefined)
      
      inline def setPreloaderEl(value: Boolean): Self = StObject.set(x, "preloaderEl", value.asInstanceOf[js.Any])
      
      inline def setPreloaderElUndefined: Self = StObject.set(x, "preloaderEl", js.undefined)
      
      inline def setShareButtons(value: js.Array[ShareButtonData]): Self = StObject.set(x, "shareButtons", value.asInstanceOf[js.Any])
      
      inline def setShareButtonsUndefined: Self = StObject.set(x, "shareButtons", js.undefined)
      
      inline def setShareButtonsVarargs(value: ShareButtonData*): Self = StObject.set(x, "shareButtons", js.Array(value*))
      
      inline def setShareEl(value: Boolean): Self = StObject.set(x, "shareEl", value.asInstanceOf[js.Any])
      
      inline def setShareElUndefined: Self = StObject.set(x, "shareEl", js.undefined)
      
      inline def setTapToClose(value: Boolean): Self = StObject.set(x, "tapToClose", value.asInstanceOf[js.Any])
      
      inline def setTapToCloseUndefined: Self = StObject.set(x, "tapToClose", js.undefined)
      
      inline def setTapToToggleControls(value: Boolean): Self = StObject.set(x, "tapToToggleControls", value.asInstanceOf[js.Any])
      
      inline def setTapToToggleControlsUndefined: Self = StObject.set(x, "tapToToggleControls", js.undefined)
      
      inline def setTimeToIdle(value: Double): Self = StObject.set(x, "timeToIdle", value.asInstanceOf[js.Any])
      
      inline def setTimeToIdleOutside(value: Double): Self = StObject.set(x, "timeToIdleOutside", value.asInstanceOf[js.Any])
      
      inline def setTimeToIdleOutsideUndefined: Self = StObject.set(x, "timeToIdleOutside", js.undefined)
      
      inline def setTimeToIdleUndefined: Self = StObject.set(x, "timeToIdle", js.undefined)
      
      inline def setZoomEl(value: Boolean): Self = StObject.set(x, "zoomEl", value.asInstanceOf[js.Any])
      
      inline def setZoomElUndefined: Self = StObject.set(x, "zoomEl", js.undefined)
    }
  }
  
  /**
    * Default UI class for PhotoSwipe. This class is largely undocumented and doesn't seem to have a public facing API.
    */
  trait PhotoSwipeUIDefault
    extends StObject
       with UI[Options] {
    
    /**
      * Call this method to update the UI after the items array has been modified in the original PhotoSwipe element.
      */
    def update(): Unit
  }
  object PhotoSwipeUIDefault {
    
    inline def apply(init: Callback, update: Callback): PhotoSwipeUIDefault = {
      val __obj = js.Dynamic.literal(init = init.toJsFn, update = update.toJsFn)
      __obj.asInstanceOf[PhotoSwipeUIDefault]
    }
    
    extension [Self <: PhotoSwipeUIDefault](x: Self) {
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  trait ShareButtonData extends StObject {
    
    /**
      * Whether this link is a direct download button or not.
      *
      * Default false.
      */
    var download: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An id for this share button entry. The share element associated with this entry will be classed with
      * 'pswp__share--' + id
      */
    var id: String
    
    /**
      * The user-visible text to display for this entry.
      */
    var label: String
    
    /**
      * The full sharing endpoint URL for this social media site (e.g. Facebook's is facebook.com/sharer/sharer.php), with URL parameters.
      * PhotoSwipUI_Default treats the URL specially. In the url string, any of the following text is treated specially:
      * '{{url}}', '{{image_url}}, '{{raw_image_url}}, '{{text}}'. PhotoSwipeUI_Default will replace each of them with the following value:
      *
      * {{url}} becomes the (URIEncoded) url to the current "Page" (as returned by getPageURLForShare).
      * {{image_url}} becomes the (URIEncoded) url of the selected image (as returned by getImageURLForShare).
      * {{raw_image_url}} becomes the raw url of the selected image (as returned by getImageURLForShare).
      * {{text}} becomes the (URIEncoded) share text of the selected image (as returned by getTextForShare).
      */
    var url: String
  }
  object ShareButtonData {
    
    inline def apply(id: String, label: String, url: String): ShareButtonData = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareButtonData]
    }
    
    extension [Self <: ShareButtonData](x: Self) {
      
      inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
