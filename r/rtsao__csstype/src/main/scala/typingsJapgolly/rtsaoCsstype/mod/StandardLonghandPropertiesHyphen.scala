package typingsJapgolly.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLonghandPropertiesHyphen[TLength] extends StObject {
  
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-content
    */
  var `align-content`: js.UndefOr[AlignContentProperty] = js.undefined
  
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **52**  | **20**  | **7** _-x-_ | **12** | **11** |
    * | 21 _-x-_ |         |             |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | n/a |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-items
    */
  var `align-items`: js.UndefOr[AlignItemsProperty] = js.undefined
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **36**  | **20**  |   No   | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
    * | :----: | :-----: | :------: | :----: | :----------: |
    * | **57** | **52**  | **10.1** | **16** | **10** _-x-_ |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-self
    */
  var `align-self`: js.UndefOr[AlignSelfProperty] = js.undefined
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **43** | **16**  |  **9**  | **12** | **10** |
    * |        | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-delay
    */
  var `animation-delay`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-direction
    */
  var `animation-direction`: js.UndefOr[AnimationDirectionProperty] = js.undefined
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **43**  | **16**  | **4** _-x-_ | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-duration
    */
  var `animation-duration`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-fill-mode
    */
  var `animation-fill-mode`: js.UndefOr[AnimationFillModeProperty] = js.undefined
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-iteration-count
    */
  var `animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-name
    */
  var `animation-name`: js.UndefOr[AnimationNameProperty] = js.undefined
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **43** | **16**  |  Yes   | **12** | **10** |
    * |        | 5 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-play-state
    */
  var `animation-play-state`: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-timing-function
    */
  var `animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    |   Firefox   |   Safari    |     Edge     | IE  |
    * | :---------: | :---------: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **1** _-x-_ | **3** _-x-_ | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/appearance
    */
  var appearance: js.UndefOr[AppearanceProperty] = js.undefined
  
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  | IE  |
    * | :----: | :-----: | :---------: | :----: | :-: |
    * |  n/a   |   No    | **9** _-x-_ | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
    */
  var `backdrop-filter`: js.UndefOr[BackdropFilterProperty] = js.undefined
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Initial value**: `visible`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  |   IE   |
    * | :----------: | :------: | :----: | :----: | :----: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | **10** |
    * |              | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
    */
  var `backface-visibility`: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  
  /**
    * The **`background-attachment`** CSS property sets whether a background image's position is fixed within the viewport, or scrolls with its containing block.
    *
    * **Initial value**: `scroll`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
    */
  var `background-attachment`: js.UndefOr[BackgroundAttachmentProperty] = js.undefined
  
  /**
    * The **`background-blend-mode`** CSS property sets how an element's background images should blend with each other and with the element's background color.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **35** | **30**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
    */
  var `background-blend-mode`: js.UndefOr[BackgroundBlendModeProperty] = js.undefined
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
    */
  var `background-clip`: js.UndefOr[BackgroundClipProperty] = js.undefined
  
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var `background-color`: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  /**
    * The **`background-image`** CSS property sets one or more background images on an element.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-image
    */
  var `background-image`: js.UndefOr[BackgroundImageProperty] = js.undefined
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
    */
  var `background-origin`: js.UndefOr[BackgroundOriginProperty] = js.undefined
  
  /**
    * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `0% 0%`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position
    */
  var `background-position`: js.UndefOr[BackgroundPositionProperty[TLength]] = js.undefined
  
  /**
    * The **`background-position-x`** CSS property sets the initial horizontal position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `left`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   | **49**  |  Yes   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
    */
  var `background-position-x`: js.UndefOr[BackgroundPositionXProperty[TLength]] = js.undefined
  
  /**
    * The **`background-position-y`** CSS property sets the initial vertical position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   | **49**  |  Yes   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
    */
  var `background-position-y`: js.UndefOr[BackgroundPositionYProperty[TLength]] = js.undefined
  
  /**
    * The **`background-repeat`** CSS property sets how background images are repeated. A background image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * **Initial value**: `repeat`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
    */
  var `background-repeat`: js.UndefOr[BackgroundRepeatProperty] = js.undefined
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **3**  |  **4**  | **4.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-size
    */
  var `background-size`: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  
  /** **Initial value**: `clip` */
  var `block-overflow`: js.UndefOr[BlockOverflowProperty] = js.undefined
  
  /**
    * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/block-size
    */
  var `block-size`: js.UndefOr[BlockSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`border-block-color`** CSS property defines the color of the logical block borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-color
    */
  var `border-block-color`: js.UndefOr[BorderBlockColorProperty] = js.undefined
  
  /**
    * The **`border-block-end-color`** CSS property defines the color of the logical block-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
    */
  var `border-block-end-color`: js.UndefOr[BorderBlockEndColorProperty] = js.undefined
  
  /**
    * The **`border-block-end-style`** CSS property defines the style of the logical block end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
    */
  var `border-block-end-style`: js.UndefOr[BorderBlockEndStyleProperty] = js.undefined
  
  /**
    * The **`border-block-end-width`** CSS property defines the width of the logical block-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
    */
  var `border-block-end-width`: js.UndefOr[BorderBlockEndWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-block-start-color`** CSS property defines the color of the logical block-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
    */
  var `border-block-start-color`: js.UndefOr[BorderBlockStartColorProperty] = js.undefined
  
  /**
    * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
    */
  var `border-block-start-style`: js.UndefOr[BorderBlockStartStyleProperty] = js.undefined
  
  /**
    * The **`border-block-start-width`** CSS property defines the width of the logical block-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
    */
  var `border-block-start-width`: js.UndefOr[BorderBlockStartWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-block-style`** CSS property defines the style of the logical block borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-style
    */
  var `border-block-style`: js.UndefOr[BorderBlockStyleProperty] = js.undefined
  
  /**
    * The **`border-block-width`** CSS property defines the width of the logical block borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-width
    */
  var `border-block-width`: js.UndefOr[BorderBlockWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-color`** CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties `border-color` or `border-bottom`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
    */
  var `border-bottom-color`: js.UndefOr[BorderBottomColorProperty] = js.undefined
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-left-radius
    */
  var `border-bottom-left-radius`: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-right-radius
    */
  var `border-bottom-right-radius`: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-style`** CSS property sets the line style of an element's bottom `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
    */
  var `border-bottom-style`: js.UndefOr[BorderBottomStyleProperty] = js.undefined
  
  /**
    * The **`border-bottom-width`** CSS property sets the width of the bottom border of a box.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-width
    */
  var `border-bottom-width`: js.UndefOr[BorderBottomWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-collapse`** CSS property sets whether cells inside a `<table>` have shared or separate borders.
    *
    * **Initial value**: `separate`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
    */
  var `border-collapse`: js.UndefOr[BorderCollapseProperty] = js.undefined
  
  /**
    * The **`border-end-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-end-radius
    */
  var `border-end-end-radius`: js.UndefOr[BorderEndEndRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-end-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-start-radius
    */
  var `border-end-start-radius`: js.UndefOr[BorderEndStartRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-image-outset`** CSS property sets the distance by which an element's border image is set out from its border box.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-outset
    */
  var `border-image-outset`: js.UndefOr[BorderImageOutsetProperty[TLength]] = js.undefined
  
  /**
    * The **`border-image-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's border image.
    *
    * **Initial value**: `stretch`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
    */
  var `border-image-repeat`: js.UndefOr[BorderImageRepeatProperty] = js.undefined
  
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Initial value**: `100%`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
    */
  var `border-image-slice`: js.UndefOr[BorderImageSliceProperty] = js.undefined
  
  /**
    * The **`border-image-source`** CSS property sets the source image used to create an element's border image.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
    */
  var `border-image-source`: js.UndefOr[BorderImageSourceProperty] = js.undefined
  
  /**
    * The **`border-image-width`** CSS property sets the width of an element's border image.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **13**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
    */
  var `border-image-width`: js.UndefOr[BorderImageWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-inline-color`** CSS property defines the color of the logical inline borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-color
    */
  var `border-inline-color`: js.UndefOr[BorderInlineColorProperty] = js.undefined
  
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
    */
  var `border-inline-end-color`: js.UndefOr[BorderInlineEndColorProperty] = js.undefined
  
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome |           Firefox            | Safari | Edge | IE  |
    * | :----: | :--------------------------: | :----: | :--: | :-: |
    * | **69** |            **41**            |   No   |  No  | No  |
    * |        | 38 _(-moz-border-end-style)_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
    */
  var `border-inline-end-style`: js.UndefOr[BorderInlineEndStyleProperty] = js.undefined
  
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
    */
  var `border-inline-end-width`: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |            Firefox             | Safari | Edge | IE  |
    * | :----: | :----------------------------: | :----: | :--: | :-: |
    * | **69** |             **41**             |   No   |  No  | No  |
    * |        | 38 _(-moz-border-start-color)_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
    */
  var `border-inline-start-color`: js.UndefOr[BorderInlineStartColorProperty] = js.undefined
  
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
    */
  var `border-inline-start-style`: js.UndefOr[BorderInlineStartStyleProperty] = js.undefined
  
  /**
    * The **`border-inline-start-width`** CSS property defines the width of the logical inline-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
    */
  var `border-inline-start-width`: js.UndefOr[BorderInlineStartWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-inline-style`** CSS property defines the style of the logical inline borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-style
    */
  var `border-inline-style`: js.UndefOr[BorderInlineStyleProperty] = js.undefined
  
  /**
    * The **`border-inline-width`** CSS property defines the width of the logical inline borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-width
    */
  var `border-inline-width`: js.UndefOr[BorderInlineWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-left-color`** CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties `border-color` or `border-left`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
    */
  var `border-left-color`: js.UndefOr[BorderLeftColorProperty] = js.undefined
  
  /**
    * The **`border-left-style`** CSS property sets the line style of an element's left `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-style
    */
  var `border-left-style`: js.UndefOr[BorderLeftStyleProperty] = js.undefined
  
  /**
    * The **`border-left-width`** CSS property sets the width of the left border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
    */
  var `border-left-width`: js.UndefOr[BorderLeftWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-right-color`** CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties `border-color` or `border-right`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
    */
  var `border-right-color`: js.UndefOr[BorderRightColorProperty] = js.undefined
  
  /**
    * The **`border-right-style`** CSS property sets the line style of an element's right `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-style
    */
  var `border-right-style`: js.UndefOr[BorderRightStyleProperty] = js.undefined
  
  /**
    * The **`border-right-width`** CSS property sets the width of the right border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
    */
  var `border-right-width`: js.UndefOr[BorderRightWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-spacing`** CSS property sets the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
    */
  var `border-spacing`: js.UndefOr[BorderSpacingProperty[TLength]] = js.undefined
  
  /**
    * The **`border-start-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-end-radius
    */
  var `border-start-end-radius`: js.UndefOr[BorderStartEndRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-start-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-start-radius
    */
  var `border-start-start-radius`: js.UndefOr[BorderStartStartRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-top-color`** CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties `border-color` or `border-top`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
    */
  var `border-top-color`: js.UndefOr[BorderTopColorProperty] = js.undefined
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-left-radius
    */
  var `border-top-left-radius`: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-right-radius
    */
  var `border-top-right-radius`: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-top-style`** CSS property sets the line style of an element's top `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-style
    */
  var `border-top-style`: js.UndefOr[BorderTopStyleProperty] = js.undefined
  
  /**
    * The **`border-top-width`** CSS property sets the width of the top border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
    */
  var `border-top-width`: js.UndefOr[BorderTopWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`bottom`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/bottom
    */
  var bottom: js.UndefOr[BottomProperty[TLength]] = js.undefined
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    *
    * |    Chrome    | Firefox | Safari  | Edge | IE  |
    * | :----------: | :-----: | :-----: | :--: | :-: |
    * | **22** _-x-_ | **32**  | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-decoration-break
    */
  var `box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  |  **4**  | **5.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-shadow
    */
  var `box-shadow`: js.UndefOr[BoxShadowProperty] = js.undefined
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Initial value**: `content-box`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  | **29**  | **5.1** | **12** | **8** |
    * | 1 _-x-_ | 1 _-x-_ |         |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-sizing
    */
  var `box-sizing`: js.UndefOr[BoxSizingProperty] = js.undefined
  
  /**
    * The **`break-after`** CSS property defines how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   No    |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-after
    */
  var `break-after`: js.UndefOr[BreakAfterProperty] = js.undefined
  
  /**
    * The **`break-before`** CSS property sets how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-before
    */
  var `break-before`: js.UndefOr[BreakBeforeProperty] = js.undefined
  
  /**
    * The **`break-inside`** CSS property defines how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
    */
  var `break-inside`: js.UndefOr[BreakInsideProperty] = js.undefined
  
  /**
    * The **`caption-side`** CSS property puts the content of a table's `<caption>` on the specified side. The values are relative to the `writing-mode` of the table.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caption-side
    */
  var `caption-side`: js.UndefOr[CaptionSideProperty] = js.undefined
  
  /**
    * The **`caret-color`** CSS property sets the color of the insertion caret, the visible marker where the next character typed will be inserted. The caret appears in elements such as `<input>` or those with the `contenteditable` attribute. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **53**  | **11.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
    */
  var `caret-color`: js.UndefOr[CaretColorProperty] = js.undefined
  
  /**
    * The **`clear`** CSS property sets whether an element must be moved below (cleared) floating elements that precede it. The `clear` property applies to floating and non-floating elements.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clear
    */
  var clear: js.UndefOr[ClearProperty] = js.undefined
  
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox | Safari |  Edge  | IE  |
    * | :------: | :-----: | :----: | :----: | :-: |
    * |  **55**  | **3.5** |   No   | **15** | Yes |
    * | 24 _-x-_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
    */
  var `clip-path`: js.UndefOr[ClipPathProperty] = js.undefined
  
  /**
    * The **`color`** CSS property sets the foreground color value of an element's text and text decorations, and sets the `currentcolor` value. `currentcolor` may be used as an indirect value on _other_ properties and is the default for other color properties, such as `border-color`.
    *
    * **Initial value**: Varies from one browser to another
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **1**  |  **1**  |  Yes   | **12** | Yes |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color
    */
  var color: js.UndefOr[ColorProperty] = js.undefined
  
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Initial value**: `economy`
    *
    * |    Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :----------: | :-----: | :---------: | :--: | :-: |
    * | **49** _-x-_ | **48**  | **6** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
    */
  var `color-adjust`: js.UndefOr[ColorAdjustProperty] = js.undefined
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **52**   | **3** _-x-_ | **12** | **10** |
    * |        | 1.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-count
    */
  var `column-count`: js.UndefOr[ColumnCountProperty] = js.undefined
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Initial value**: `balance`
    *
    * | Chrome | Firefox  | Safari |  Edge  | IE  |
    * | :----: | :------: | :----: | :----: | :-: |
    * | **50** |  **52**  |  n/a   | **12** | n/a |
    * |        | 13 _-x-_ |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
    */
  var `column-fill`: js.UndefOr[ColumnFillProperty] = js.undefined
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |        Safari         |  Edge  | IE  |
    * | :-------------: | :-------------: | :-------------------: | :----: | :-: |
    * |     **66**      |     **61**      | **10.1** _(grid-gap)_ | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ |                       |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   | **10**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-gap
    */
  var `column-gap`: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **52**   | **3** _-x-_ | **12** | **10** |
    * |        | 3.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
    */
  var `column-rule-color`: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **50** | **52**  | **3** _-x-_ | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
    */
  var `column-rule-style`: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `medium`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **50**   | **3** _-x-_ | **12** | **10** |
    * |        | 3.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
    */
  var `column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   n/a   |  Yes   | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-span
    */
  var `column-span`: js.UndefOr[ColumnSpanProperty] = js.undefined
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **50**   | **3** _-x-_ | **12** | **10** |
    * |        | 1.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-width
    */
  var `column-width`: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** |   n/a   |   No   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain
    */
  var contain: js.UndefOr[ContainProperty] = js.undefined
  
  /**
    * The **`content`** CSS property replaces an element with a generated value. Objects inserted using the `content` property are _anonymous replaced elements._
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/content
    */
  var content: js.UndefOr[ContentProperty] = js.undefined
  
  /**
    * The **`counter-increment`** CSS property increases or decreases the value of a CSS counter by a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **3.1** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
    */
  var `counter-increment`: js.UndefOr[CounterIncrementProperty] = js.undefined
  
  /**
    * The **`counter-reset`** CSS property resets a CSS counter to a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **3.1** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
    */
  var `counter-reset`: js.UndefOr[CounterResetProperty] = js.undefined
  
  /**
    * The **`cursor`** CSS property sets mouse cursor to display when the mouse pointer is over an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/cursor
    */
  var cursor: js.UndefOr[CursorProperty] = js.undefined
  
  /**
    * The **`direction`** CSS property sets the direction of text, table columns, and horizontal overflow. Use `rtl` for languages written from right to left (like Hebrew or Arabic), and `ltr` for those written from left to right (like English and most other languages).
    *
    * **Initial value**: `ltr`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/direction
    */
  var direction: js.UndefOr[DirectionProperty] = js.undefined
  
  /**
    * The **`display`** CSS property defines the _display type_ of an element, which consists of the two basic qualities of how an element generates boxes — the **outer display type** defining how the box participates in flow layout, and the **inner display type** defining how the children of the box are laid out.
    *
    * **Initial value**: `inline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/display
    */
  var display: js.UndefOr[DisplayProperty] = js.undefined
  
  /**
    * The **`empty-cells`** CSS property sets whether borders and backgrounds appear around `<table>` cells that have no visible content.
    *
    * **Initial value**: `show`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
    */
  var `empty-cells`: js.UndefOr[EmptyCellsProperty] = js.undefined
  
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  | IE  |
    * | :------: | :-----: | :---------: | :----: | :-: |
    * |  **53**  | **35**  | **6** _-x-_ | **12** | No  |
    * | 18 _-x-_ |         |             |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/filter
    */
  var filter: js.UndefOr[FilterProperty] = js.undefined
  
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Initial value**: `auto`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **22**  |  **9**  | **12** | **11** |
    * | 21 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-basis
    */
  var `flex-basis`: js.UndefOr[FlexBasisProperty[TLength]] = js.undefined
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Initial value**: `row`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-direction
    */
  var `flex-direction`: js.UndefOr[FlexDirectionProperty] = js.undefined
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox |    Safari     |  Edge  |            IE            |
    * | :------: | :-----: | :-----------: | :----: | :----------------------: |
    * |  **29**  | **20**  | **6.1** _-x-_ | **12** |          **11**          |
    * | 21 _-x-_ |         |               |        | 10 _(-ms-flex-positive)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
    */
  var `flex-grow`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Initial value**: `1`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **29**  | **20**  | **8** _-x-_ | **12** | **10** |
    * | 21 _-x-_ |         |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
    */
  var `flex-shrink`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Initial value**: `nowrap`
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **29**  | **28**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-wrap
    */
  var `flex-wrap`: js.UndefOr[FlexWrapProperty] = js.undefined
  
  /**
    * The **`float`** CSS property places an element on the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the page, though still remaining a part of the flow (in contrast to absolute positioning).
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/float
    */
  var float: js.UndefOr[FloatProperty] = js.undefined
  
  /**
    * The **`font-family`** CSS property specifies a prioritized list of one or more font family names and/or generic family names for the selected element.
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-family
    */
  var `font-family`: js.UndefOr[FontFamilyProperty] = js.undefined
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **48**  |  **34**  | **9.1** | **15** | **10** |
    * | 16 _-x-_ | 15 _-x-_ |         |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-feature-settings
    */
  var `font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Initial value**: `auto`
    *
    * |    Chrome    | Firefox | Safari | Edge | IE  |
    * | :----------: | :-----: | :----: | :--: | :-: |
    * | **32** _-x-_ | **32**  | **7**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
    */
  var `font-kerning`: js.UndefOr[FontKerningProperty] = js.undefined
  
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    * |        | 4 _-x-_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-language-override
    */
  var `font-language-override`: js.UndefOr[FontLanguageOverrideProperty] = js.undefined
  
  /**
    * The **`font-optical-sizing`** CSS property sets whether text rendering is optimized for viewing at different sizes. This only works for fonts that have an optical size variation axis.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **62**  |  n/a   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
    */
  var `font-optical-sizing`: js.UndefOr[FontOpticalSizingProperty] = js.undefined
  
  /**
    * The **`font-size`** CSS property sets the size of the font. This property is also used to compute the size of `em`, `ex`, and other relative `<length>` units.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size
    */
  var `font-size`: js.UndefOr[FontSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`font-size-adjust`** CSS property sets how the font size should be chosen based on the height of lowercase rather than capital letters.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |  **1**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
    */
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty] = js.undefined
  
  /**
    * The **`font-stretch`** CSS property selects a normal, condensed, or expanded face from a font.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **60** |  **9**  | **11** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-stretch
    */
  var `font-stretch`: js.UndefOr[FontStretchProperty] = js.undefined
  
  /**
    * The **`font-style`** CSS property sets whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-style
    */
  var `font-style`: js.UndefOr[FontStyleProperty] = js.undefined
  
  /**
    * The **`font-synthesis`** CSS property controls which missing typefaces, bold or italic, may be synthesized by the browser.
    *
    * **Initial value**: `weight style`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-synthesis
    */
  var `font-synthesis`: js.UndefOr[FontSynthesisProperty] = js.undefined
  
  /**
    * The **font-variant** CSS property is a shorthand for the longhand properties `font-variant-caps`, `font-variant-numeric`, `font-variant-alternates`, `font-variant-ligatures`, and `font-variant-east-asian`. You can also set the CSS Level 2 (Revision 1) values of `font-variant`, (that is, `normal` or `small-caps`), by using the `font` shorthand.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
    */
  var `font-variant`: js.UndefOr[FontVariantProperty] = js.undefined
  
  /**
    * The **`font-variant-caps`** CSS property controls the use of alternate glyphs for capital letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
    */
  var `font-variant-caps`: js.UndefOr[FontVariantCapsProperty] = js.undefined
  
  /**
    * The **`font-variant-east-asian`** CSS property controls the use of alternate glyphs for East Asian scripts, like Japanese and Chinese.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **63** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
    */
  var `font-variant-east-asian`: js.UndefOr[FontVariantEastAsianProperty] = js.undefined
  
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox | Safari  | Edge | IE  |
    * | :------: | :-----: | :-----: | :--: | :-: |
    * |  **34**  | **34**  | **9.1** |  No  | No  |
    * | 31 _-x-_ |         | 7 _-x-_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-ligatures
    */
  var `font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty] = js.undefined
  
  /**
    * The **`font-variant-numeric`** CSS property controls the usage of alternate glyphs for numbers, fractions, and ordinal markers.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **52** | **34**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-numeric
    */
  var `font-variant-numeric`: js.UndefOr[FontVariantNumericProperty] = js.undefined
  
  /**
    * The **`font-variant-position`** CSS property controls the use of alternate, smaller glyphs that are positioned as superscript or subscript.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
    */
  var `font-variant-position`: js.UndefOr[FontVariantPositionProperty] = js.undefined
  
  /**
    * The **`font-variation-settings`** CSS property provides low-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **62** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
    */
  var `font-variation-settings`: js.UndefOr[FontVariationSettingsProperty] = js.undefined
  
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only available in `normal` and `bold`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **1.3** | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var `font-weight`: js.UndefOr[FontWeightProperty] = js.undefined
  
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |          Edge           |             IE              |
    * | :----: | :-----: | :------: | :---------------------: | :-------------------------: |
    * | **57** | **52**  | **10.1** |         **16**          | **10** _(-ms-grid-columns)_ |
    * |        |         |          | 12 _(-ms-grid-columns)_ |                             |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
    */
  var `grid-auto-columns`: js.UndefOr[GridAutoColumnsProperty[TLength]] = js.undefined
  
  /**
    * The **`grid-auto-flow`** CSS property controls how the auto-placement algorithm works, specifying exactly how auto-placed items get flowed into the grid.
    *
    * **Initial value**: `row`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
    */
  var `grid-auto-flow`: js.UndefOr[GridAutoFlowProperty] = js.undefined
  
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |         Edge         |            IE            |
    * | :----: | :-----: | :------: | :------------------: | :----------------------: |
    * | **57** | **52**  | **10.1** |        **16**        | **10** _(-ms-grid-rows)_ |
    * |        |         |          | 12 _(-ms-grid-rows)_ |                          |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
    */
  var `grid-auto-rows`: js.UndefOr[GridAutoRowsProperty[TLength]] = js.undefined
  
  /**
    * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
    */
  var `grid-column-end`: js.UndefOr[GridColumnEndProperty] = js.undefined
  
  /**
    * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block-start edge of the grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
    */
  var `grid-column-start`: js.UndefOr[GridColumnStartProperty] = js.undefined
  
  /**
    * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
    */
  var `grid-row-end`: js.UndefOr[GridRowEndProperty] = js.undefined
  
  /**
    * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
    */
  var `grid-row-start`: js.UndefOr[GridRowStartProperty] = js.undefined
  
  /**
    * The **`grid-template-areas`** CSS property specifies named grid areas.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
    */
  var `grid-template-areas`: js.UndefOr[GridTemplateAreasProperty] = js.undefined
  
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
    */
  var `grid-template-columns`: js.UndefOr[GridTemplateColumnsProperty[TLength]] = js.undefined
  
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
    */
  var `grid-template-rows`: js.UndefOr[GridTemplateRowsProperty[TLength]] = js.undefined
  
  /**
    * The **`hanging-punctuation`** CSS property specifies whether a punctuation mark should hang at the start or end of a line of text. Hanging punctuation may be placed outside the line box.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **10** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hanging-punctuation
    */
  var `hanging-punctuation`: js.UndefOr[HangingPunctuationProperty] = js.undefined
  
  /**
    * The **`height`** CSS property specifies the height of an element. By default, the property defines the height of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the height of the border area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/height
    */
  var height: js.UndefOr[HeightProperty[TLength]] = js.undefined
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Initial value**: `manual`
    *
    * |  Chrome  | Firefox |    Safari     |     Edge     |      IE      |
    * | :------: | :-----: | :-----------: | :----------: | :----------: |
    * |  **55**  | **43**  | **5.1** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 13 _-x-_ | 6 _-x-_ |               |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hyphens
    */
  var hyphens: js.UndefOr[HyphensProperty] = js.undefined
  
  /**
    * The **`image-orientation`** CSS property specifies a layout-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
    *
    * **Initial value**: `0deg`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **26**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
    */
  var `image-orientation`: js.UndefOr[ImageOrientationProperty] = js.undefined
  
  /**
    * The **`image-rendering`** CSS property sets an image scaling algorithm. The property applies to an element itself, to any images set in its other properties, and to its descendants.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **3.6** |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
    */
  var `image-rendering`: js.UndefOr[ImageRenderingProperty] = js.undefined
  
  /** **Initial value**: `1dppx` */
  var `image-resolution`: js.UndefOr[ImageResolutionProperty] = js.undefined
  
  /**
    * The `initial-letter` CSS property sets styling for dropped, raised, and sunken initial letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
    */
  var `initial-letter`: js.UndefOr[InitialLetterProperty] = js.undefined
  
  /**
    * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
    */
  var `inline-size`: js.UndefOr[InlineSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`inset`** CSS property defines the logical block and inline start and end offsets of an element, which map to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset
    */
  var inset: js.UndefOr[InsetProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
    */
  var `inset-block`: js.UndefOr[InsetBlockProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
    */
  var `inset-block-end`: js.UndefOr[InsetBlockEndProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
    */
  var `inset-block-start`: js.UndefOr[InsetBlockStartProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
    */
  var `inset-inline`: js.UndefOr[InsetInlineProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
    */
  var `inset-inline-end`: js.UndefOr[InsetInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
    */
  var `inset-inline-start`: js.UndefOr[InsetInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The **`isolation`** CSS property determines whether an element must create a new stacking context.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **36**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/isolation
    */
  var isolation: js.UndefOr[IsolationProperty] = js.undefined
  
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **52**  | **20**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-content
    */
  var `justify-content`: js.UndefOr[JustifyContentProperty] = js.undefined
  
  /**
    * The CSS **`justify-items`** property defines the default `justify-self` for all items of the box, giving them all a default way of justifying each box along the appropriate axis.
    *
    * **Initial value**: `legacy`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **52** | **20**  | **9**  | **12** | **11** |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-items
    */
  var `justify-items`: js.UndefOr[JustifyItemsProperty] = js.undefined
  
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-self
    */
  var `justify-self`: js.UndefOr[JustifySelfProperty] = js.undefined
  
  /**
    * The **`left`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/left
    */
  var left: js.UndefOr[LeftProperty[TLength]] = js.undefined
  
  /**
    * The **`letter-spacing`** CSS property sets the spacing behavior between text characters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
    */
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength]] = js.undefined
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari |  Edge  |   IE    |
    * | :-----: | :-----: | :----: | :----: | :-----: |
    * | **58**  |   No    |  Yes   | **14** | **5.5** |
    * | 1 _-x-_ |         |        |        |         |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-break
    */
  var `line-break`: js.UndefOr[LineBreakProperty] = js.undefined
  
  /**
    * The **`line-height`** CSS property sets the amount of space used for lines, such as in text. On block-level elements, it specifies the minimum height of line boxes within the element. On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height
    */
  var `line-height`: js.UndefOr[LineHeightProperty[TLength]] = js.undefined
  
  /**
    * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |   No    |   No   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height-step
    */
  var `line-height-step`: js.UndefOr[LineHeightStepProperty[TLength]] = js.undefined
  
  /**
    * The **`list-style-image`** CSS property sets an image to be used as the list item marker.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
    */
  var `list-style-image`: js.UndefOr[ListStyleImageProperty] = js.undefined
  
  /**
    * The **`list-style-position`** CSS property sets the position of the `::marker` relative to a list item.
    *
    * **Initial value**: `outside`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
    */
  var `list-style-position`: js.UndefOr[ListStylePositionProperty] = js.undefined
  
  /**
    * The **`list-style-type`** CSS property sets the marker (such as a disc, character, or custom counter style) of a list item element.
    *
    * **Initial value**: `disc`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
    */
  var `list-style-type`: js.UndefOr[ListStyleTypeProperty] = js.undefined
  
  /**
    * The **`margin-block`** CSS property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
    */
  var `margin-block`: js.UndefOr[MarginBlockProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
    */
  var `margin-block-end`: js.UndefOr[MarginBlockEndProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
    */
  var `margin-block-start`: js.UndefOr[MarginBlockStartProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var `margin-bottom`: js.UndefOr[MarginBottomProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-inline`** CSS property defines the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
    */
  var `margin-inline`: js.UndefOr[MarginInlineProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome          |        Firefox        |            Safari            | Edge | IE  |
    * | :----------------------: | :-------------------: | :--------------------------: | :--: | :-: |
    * |          **69**          |        **41**         | **3** _(-webkit-margin-end)_ |  No  | No  |
    * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ |                              |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
    */
  var `margin-inline-end`: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome           |         Firefox         |             Safari             | Edge | IE  |
    * | :------------------------: | :---------------------: | :----------------------------: | :--: | :-: |
    * |           **69**           |         **41**          | **3** _(-webkit-margin-start)_ |  No  | No  |
    * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ |                                |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
    */
  var `margin-inline-start`: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var `margin-left`: js.UndefOr[MarginLeftProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var `margin-right`: js.UndefOr[MarginRightProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var `margin-top`: js.UndefOr[MarginTopProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Initial value**: `alpha`
    */
  var `mask-border-mode`: js.UndefOr[MaskBorderModeProperty] = js.undefined
  
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Initial value**: `0`
    */
  var `mask-border-outset`: js.UndefOr[MaskBorderOutsetProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Initial value**: `stretch`
    */
  var `mask-border-repeat`: js.UndefOr[MaskBorderRepeatProperty] = js.undefined
  
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Initial value**: `0`
    */
  var `mask-border-slice`: js.UndefOr[MaskBorderSliceProperty] = js.undefined
  
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Initial value**: `none`
    */
  var `mask-border-source`: js.UndefOr[MaskBorderSourceProperty] = js.undefined
  
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Initial value**: `auto`
    */
  var `mask-border-width`: js.UndefOr[MaskBorderWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **53**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
    */
  var `mask-clip`: js.UndefOr[MaskClipProperty] = js.undefined
  
  /**
    * The **`mask-composite`** CSS property represents a compositing operation used on the current mask layer with the mask layers below it.
    *
    * **Initial value**: `add`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **53**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-composite
    */
  var `mask-composite`: js.UndefOr[MaskCompositeProperty] = js.undefined
  
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Initial value**: `none`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-image
    */
  var `mask-image`: js.UndefOr[MaskImageProperty] = js.undefined
  
  /**
    * The **`mask-mode`** CSS property sets whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
    *
    * **Initial value**: `match-source`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **53**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
    */
  var `mask-mode`: js.UndefOr[MaskModeProperty] = js.undefined
  
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **53**  |  Yes   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
    */
  var `mask-origin`: js.UndefOr[MaskOriginProperty] = js.undefined
  
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Initial value**: `center`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **18** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
    */
  var `mask-position`: js.UndefOr[MaskPositionProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Initial value**: `no-repeat`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **18** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
    */
  var `mask-repeat`: js.UndefOr[MaskRepeatProperty] = js.undefined
  
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **53**  |   No   | **17** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
    */
  var `mask-size`: js.UndefOr[MaskSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-type`** CSS property sets whether an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
    *
    * **Initial value**: `luminance`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **24** | **35**  |  n/a   |  No  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
    */
  var `mask-type`: js.UndefOr[MaskTypeProperty] = js.undefined
  
  /**
    * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
    */
  var `max-block-size`: js.UndefOr[MaxBlockSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **18** |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-height
    */
  var `max-height`: js.UndefOr[MaxHeightProperty[TLength]] = js.undefined
  
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **57** | **41**  | **10.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
    */
  var `max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.undefined
  
  /** **Initial value**: `none` */
  var `max-lines`: js.UndefOr[MaxLinesProperty] = js.undefined
  
  /**
    * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-width
    */
  var `max-width`: js.UndefOr[MaxWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
    */
  var `min-block-size`: js.UndefOr[MinBlockSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **3**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-height
    */
  var `min-height`: js.UndefOr[MinHeightProperty[TLength]] = js.undefined
  
  /**
    * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
    */
  var `min-inline-size`: js.UndefOr[MinInlineSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-width
    */
  var `min-width`: js.UndefOr[MinWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`mix-blend-mode`** CSS property sets how an element's content should blend with the content of the element's parent and the element's background.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **32**  | **8**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
    */
  var `mix-blend-mode`: js.UndefOr[MixBlendModeProperty] = js.undefined
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `motion-distance`: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | n/a |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `motion-path`: js.UndefOr[OffsetPathProperty] = js.undefined
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `motion-rotation`: js.UndefOr[OffsetRotateProperty] = js.undefined
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Initial value**: `fill`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
    */
  var `object-fit`: js.UndefOr[ObjectFitProperty] = js.undefined
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Initial value**: `50% 50%`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-position
    */
  var `object-position`: js.UndefOr[ObjectPositionProperty[TLength]] = js.undefined
  
  /** **Initial value**: `auto` */
  var `offset-anchor`: js.UndefOr[OffsetAnchorProperty[TLength]] = js.undefined
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `offset-distance`: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | n/a |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `offset-path`: js.UndefOr[OffsetPathProperty] = js.undefined
  
  /** **Initial value**: `auto` */
  var `offset-position`: js.UndefOr[OffsetPositionProperty[TLength]] = js.undefined
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotate`: js.UndefOr[OffsetRotateProperty] = js.undefined
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | n/a |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotation`: js.UndefOr[OffsetRotateProperty] = js.undefined
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/order
    */
  var order: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`orphans`** CSS property sets the minimum number of lines in a block container that must be shown at the _bottom_ of a page, region, or column.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **25** |   No    |   No   | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/orphans
    */
  var orphans: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-color
    */
  var `outline-color`: js.UndefOr[OutlineColorProperty] = js.undefined
  
  /**
    * The **`outline-offset`** CSS property sets the amount of space between an outline and the edge or border of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  | **1.5** | **1.2** | **15** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
    */
  var `outline-offset`: js.UndefOr[OutlineOffsetProperty[TLength]] = js.undefined
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-style
    */
  var `outline-style`: js.UndefOr[OutlineStyleProperty] = js.undefined
  
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
    */
  var `outline-width`: js.UndefOr[OutlineWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`overflow`** CSS property sets what to do when an element's content is too big to fit in its block formatting context. It is a shorthand for `overflow-x` and `overflow-y`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow
    */
  var overflow: js.UndefOr[OverflowProperty] = js.undefined
  
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **56** | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var `overflow-anchor`: js.UndefOr[OverflowAnchorProperty] = js.undefined
  
  /** **Initial value**: `auto` */
  var `overflow-block`: js.UndefOr[OverflowBlockProperty] = js.undefined
  
  /**
    * The **`overflow-clip-box`** CSS property specifies relative to which box the clipping happens when there is an overflow. It is short hand for the `overflow-clip-box-inline` and `overflow-clip-box-block` properties.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **29**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Mozilla/CSS/overflow-clip-box
    */
  var `overflow-clip-box`: js.UndefOr[OverflowClipBoxProperty] = js.undefined
  
  /** **Initial value**: `auto` */
  var `overflow-inline`: js.UndefOr[OverflowInlineProperty] = js.undefined
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * |     Chrome      |      Firefox      |     Safari      |       Edge       |          IE           |
    * | :-------------: | :---------------: | :-------------: | :--------------: | :-------------------: |
    * |     **23**      |      **49**       |     **6.1**     |      **18**      | **5.5** _(word-wrap)_ |
    * | 1 _(word-wrap)_ | 3.5 _(word-wrap)_ | 1 _(word-wrap)_ | 12 _(word-wrap)_ |                       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `overflow-wrap`: js.UndefOr[OverflowWrapProperty] = js.undefined
  
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
    */
  var `overflow-x`: js.UndefOr[OverflowXProperty] = js.undefined
  
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **1.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
    */
  var `overflow-y`: js.UndefOr[OverflowYProperty] = js.undefined
  
  /**
    * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var `overscroll-behavior`: js.UndefOr[OverscrollBehaviorProperty] = js.undefined
  
  /**
    * The **`overscroll-behavior-x`** CSS property sets the browser's behavior when the horizontal boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
    */
  var `overscroll-behavior-x`: js.UndefOr[OverscrollBehaviorXProperty] = js.undefined
  
  /**
    * The **`overscroll-behavior-y`** CSS property sets the browser's behavior when the vertical boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
    */
  var `overscroll-behavior-y`: js.UndefOr[OverscrollBehaviorYProperty] = js.undefined
  
  /**
    * The **`padding-block`** CSS property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
    */
  var `padding-block`: js.UndefOr[PaddingBlockProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
    */
  var `padding-block-end`: js.UndefOr[PaddingBlockEndProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
    */
  var `padding-block-start`: js.UndefOr[PaddingBlockStartProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var `padding-bottom`: js.UndefOr[PaddingBottomProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-inline`** CSS property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
    */
  var `padding-inline`: js.UndefOr[PaddingInlineProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome           |        Firefox         |            Safari             | Edge | IE  |
    * | :-----------------------: | :--------------------: | :---------------------------: | :--: | :-: |
    * |          **69**           |         **41**         | **3** _(-webkit-padding-end)_ |  No  | No  |
    * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ |                               |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
    */
  var `padding-inline-end`: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome            |         Firefox          |             Safari              | Edge | IE  |
    * | :-------------------------: | :----------------------: | :-----------------------------: | :--: | :-: |
    * |           **69**            |          **41**          | **3** _(-webkit-padding-start)_ |  No  | No  |
    * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ |                                 |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
    */
  var `padding-inline-start`: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var `padding-left`: js.UndefOr[PaddingLeftProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var `padding-right`: js.UndefOr[PaddingRightProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var `padding-top`: js.UndefOr[PaddingTopProperty[TLength]] = js.undefined
  
  /**
    * The **`page-break-after`** CSS property adjusts page breaks _after_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-after
    */
  var `page-break-after`: js.UndefOr[PageBreakAfterProperty] = js.undefined
  
  /**
    * The **`page-break-before`** CSS property adjusts page breaks _before_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-before
    */
  var `page-break-before`: js.UndefOr[PageBreakBeforeProperty] = js.undefined
  
  /**
    * The **`page-break-inside`** CSS property adjusts page breaks _inside_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **19**  | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-inside
    */
  var `page-break-inside`: js.UndefOr[PageBreakInsideProperty] = js.undefined
  
  /**
    * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **60**  |  Yes   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
    */
  var `paint-order`: js.UndefOr[PaintOrderProperty] = js.undefined
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox  | Safari |  Edge  |   IE   |
    * | :------: | :------: | :----: | :----: | :----: |
    * |  **45**  |  **16**  |  Yes   | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective
    */
  var perspective: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Initial value**: `50% 50%`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  |   IE   |
    * | :----------: | :------: | :----: | :----: | :----: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | **10** |
    * |              | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective-origin
    */
  var `perspective-origin`: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  
  /**
    * The `**place-content**` CSS property is a shorthand for `align-content` and `justify-content`. It can be used in any layout method which utilizes both of these alignment values.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** |   Yes   |  Yes   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **53**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * _You can only specify a single value if it is valid for both <code>align-content</code> and <code>justify-content</code>_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **60**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-content
    */
  var `place-content`: js.UndefOr[PlaceContentProperty] = js.undefined
  
  /**
    * The **`pointer-events`** CSS property sets under what circumstances (if any) a particular graphic element can become the target of mouse events.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **1**  | **1.5** | **3**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
    */
  var `pointer-events`: js.UndefOr[PointerEventsProperty] = js.undefined
  
  /**
    * The **`position`** CSS property sets how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
    *
    * **Initial value**: `static`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/position
    */
  var position: js.UndefOr[PositionProperty] = js.undefined
  
  /**
    * The **`quotes`** CSS property sets how quotation marks appear.
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **11** | **1.5** | **9**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/quotes
    */
  var quotes: js.UndefOr[QuotesProperty] = js.undefined
  
  /**
    * The **`resize`** CSS property sets whether an element is resizable, and if so, in which directions.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **1**  |         | **3**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/resize
    */
  var resize: js.UndefOr[ResizeProperty] = js.undefined
  
  /**
    * The **`right`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/right
    */
  var right: js.UndefOr[RightProperty[TLength]] = js.undefined
  
  /**
    * The **`rotate`** CSS property allows you to specify rotation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/rotate
    */
  var rotate: js.UndefOr[RotateProperty] = js.undefined
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |       Chrome        |       Firefox       |          Safari           |  Edge  | IE  |
    * | :-----------------: | :-----------------: | :-----------------------: | :----: | :-: |
    * |       **66**        |       **61**        | **10.1** _(grid-row-gap)_ | **16** | No  |
    * | 57 _(grid-row-gap)_ | 52 _(grid-row-gap)_ |                           |        |     |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/row-gap
    */
  var `row-gap`: js.UndefOr[RowGapProperty[TLength]] = js.undefined
  
  /**
    * The `**ruby-align**` CSS property defines the distribution of the different ruby elements over the base.
    *
    * **Initial value**: `space-around`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **38**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-align
    */
  var `ruby-align`: js.UndefOr[RubyAlignProperty] = js.undefined
  
  /** **Initial value**: `separate` */
  var `ruby-merge`: js.UndefOr[RubyMergeProperty] = js.undefined
  
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Initial value**: `over`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **38**  |   No   | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
    */
  var `ruby-position`: js.UndefOr[RubyPositionProperty] = js.undefined
  
  /**
    * The **`scale`** CSS property allows you to specify scale transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scale
    */
  var scale: js.UndefOr[ScaleProperty] = js.undefined
  
  /**
    * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **61** | **36**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
    */
  var `scroll-behavior`: js.UndefOr[ScrollBehaviorProperty] = js.undefined
  
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-margin`: js.UndefOr[ScrollMarginProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-block` property is a shorthand property which sets the scroll-margin longhands in the block dimension.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var `scroll-margin-block`: js.UndefOr[ScrollMarginBlockProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
    */
  var `scroll-margin-block-end`: js.UndefOr[ScrollMarginBlockEndProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
    */
  var `scroll-margin-block-start`: js.UndefOr[ScrollMarginBlockStartProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var `scroll-margin-bottom`: js.UndefOr[ScrollMarginBottomProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
    */
  var `scroll-margin-inline-end`: js.UndefOr[ScrollMarginInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
    */
  var `scroll-margin-inline-start`: js.UndefOr[ScrollMarginInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var `scroll-margin-left`: js.UndefOr[ScrollMarginLeftProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var `scroll-margin-right`: js.UndefOr[ScrollMarginRightProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var `scroll-margin-top`: js.UndefOr[ScrollMarginTopProperty[TLength]] = js.undefined
  
  /**
    * The scroll-padding property is a shorthand property which sets all of the scroll-padding longhands, assigning values much like the padding property does for the padding-\* longhands.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var `scroll-padding`: js.UndefOr[ScrollPaddingProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-block` property is a shorthand property which sets the scroll-padding longhands for the block dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var `scroll-padding-block`: js.UndefOr[ScrollPaddingBlockProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
    */
  var `scroll-padding-block-end`: js.UndefOr[ScrollPaddingBlockEndProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
    */
  var `scroll-padding-block-start`: js.UndefOr[ScrollPaddingBlockStartProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
    */
  var `scroll-padding-bottom`: js.UndefOr[ScrollPaddingBottomProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-inline` property is a shorthand property which sets the scroll-padding longhands for the inline dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var `scroll-padding-inline`: js.UndefOr[ScrollPaddingInlineProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
    */
  var `scroll-padding-inline-end`: js.UndefOr[ScrollPaddingInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
    */
  var `scroll-padding-inline-start`: js.UndefOr[ScrollPaddingInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
    */
  var `scroll-padding-left`: js.UndefOr[ScrollPaddingLeftProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
    */
  var `scroll-padding-right`: js.UndefOr[ScrollPaddingRightProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-padding-top` property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
    */
  var `scroll-padding-top`: js.UndefOr[ScrollPaddingTopProperty[TLength]] = js.undefined
  
  /**
    * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
    */
  var `scroll-snap-align`: js.UndefOr[ScrollSnapAlignProperty] = js.undefined
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |     Edge     |      IE      |
    * | :----: | :-----: | :-----: | :----------: | :----------: |
    * | **69** | **39**  | **11**  | **12** _-x-_ | **10** _-x-_ |
    * |        |         | 9 _-x-_ |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-type
    */
  var `scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty] = js.undefined
  
  /**
    * The **`scrollbar-color`** CSS property sets the color of the scrollbar track and thumb.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-color
    */
  var `scrollbar-color`: js.UndefOr[ScrollbarColorProperty] = js.undefined
  
  /**
    * The `scrollbar-width` property allows the author to set the maximum thickness of an element’s scrollbars when they are shown.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-width
    */
  var `scrollbar-width`: js.UndefOr[ScrollbarWidthProperty] = js.undefined
  
  /**
    * The **`shape-image-threshold`** CSS property sets the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
    *
    * **Initial value**: `0.0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
    */
  var `shape-image-threshold`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **37** | **62**  | **10.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
    */
  var `shape-margin`: js.UndefOr[ShapeMarginProperty[TLength]] = js.undefined
  
  /**
    * The **`shape-outside`** CSS property defines a shape—which may be non-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
    */
  var `shape-outside`: js.UndefOr[ShapeOutsideProperty] = js.undefined
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Initial value**: `8`
    *
    * | Chrome |   Firefox   | Safari  | Edge | IE  |
    * | :----: | :---------: | :-----: | :--: | :-: |
    * | **21** | **4** _-x-_ | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/tab-size
    */
  var `tab-size`: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`table-layout`** CSS property sets the algorithm used to lay out `<table>` cells, rows, and columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **14** |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
    */
  var `table-layout`: js.UndefOr[TableLayoutProperty] = js.undefined
  
  /**
    * The **`text-align`** CSS property sets the horizontal alignment of an inline or table-cell box. This means it works like `vertical-align` but in the horizontal direction.
    *
    * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align
    */
  var `text-align`: js.UndefOr[TextAlignProperty] = js.undefined
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **47** | **49**  |   No   | **12** | Yes |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
    */
  var `text-align-last`: js.UndefOr[TextAlignLastProperty] = js.undefined
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |                   IE                   |
    * | :----: | :-----: | :----: | :----: | :------------------------------------: |
    * | **48** | **48**  |  Yes   | **15** | **11** _(-ms-text-combine-horizontal)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
    */
  var `text-combine-upright`: js.UndefOr[TextCombineUprightProperty] = js.undefined
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
    */
  var `text-decoration-color`: js.UndefOr[TextDecorationColorProperty] = js.undefined
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
    */
  var `text-decoration-line`: js.UndefOr[TextDecorationLineProperty] = js.undefined
  
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Initial value**: `objects`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | 57-64  |   No    | **12.1** |  No  | No  |
    * |        |         | 8 _-x-_  |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip
    */
  var `text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty] = js.undefined
  
  /**
    * The **`text-decoration-skip-ink`** CSS property specifies how overlines and underlines are drawn when they pass over glyph ascenders and descenders.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip-ink
    */
  var `text-decoration-skip-ink`: js.UndefOr[TextDecorationSkipInkProperty] = js.undefined
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
    */
  var `text-decoration-style`: js.UndefOr[TextDecorationStyleProperty] = js.undefined
  
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Initial value**: `currentcolor`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
    */
  var `text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty] = js.undefined
  
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Initial value**: `over right`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
    */
  var `text-emphasis-position`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Initial value**: `none`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
    */
  var `text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty] = js.undefined
  
  /**
    * The **`text-indent`** CSS property sets the length of empty space (indentation) that is put before lines of text in a block.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
    */
  var `text-indent`: js.UndefOr[TextIndentProperty[TLength]] = js.undefined
  
  /**
    * The **`text-justify`** CSS property sets what type of justification should be applied to text when `text-align``: justify;` is set on an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * |  n/a   | **55**  |   No   | **14** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
    */
  var `text-justify`: js.UndefOr[TextJustifyProperty] = js.undefined
  
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Initial value**: `mixed`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **48** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
    */
  var `text-orientation`: js.UndefOr[TextOrientationProperty] = js.undefined
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Initial value**: `clip`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **7**  | **1.3** | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
    */
  var `text-overflow`: js.UndefOr[TextOverflowProperty] = js.undefined
  
  /**
    * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **4**  |  **1**  | **5**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
    */
  var `text-rendering`: js.UndefOr[TextRenderingProperty] = js.undefined
  
  /**
    * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **2**  | **3.5** | **1.1** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
    */
  var `text-shadow`: js.UndefOr[TextShadowProperty] = js.undefined
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    *
    * | Chrome | Firefox | Safari |     Edge     | IE  |
    * | :----: | :-----: | :----: | :----------: | :-: |
    * | **54** |   No    |   No   | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-size-adjust
    */
  var `text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  
  /**
    * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all-uppercase or all-lowercase, or with each word capitalized. It also can help improve legibility for ruby
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
    */
  var `text-transform`: js.UndefOr[TextTransformProperty] = js.undefined
  
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **33** |   No    |   No   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-position
    */
  var `text-underline-position`: js.UndefOr[TextUnderlinePositionProperty] = js.undefined
  
  /**
    * The **`top`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/top
    */
  var top: js.UndefOr[TopProperty[TLength]] = js.undefined
  
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |    IE    |
    * | :----: | :-----: | :----: | :----: | :------: |
    * | **36** | **52**  |   No   | **12** |  **11**  |
    * |        |         |        |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/touch-action
    */
  var `touch-action`: js.UndefOr[TouchActionProperty] = js.undefined
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari   |  Edge  |   IE    |
    * | :----: | :-----: | :-------: | :----: | :-----: |
    * | **36** | **16**  |   **9**   | **12** | **10**  |
    * |        |         | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform
    */
  var transform: js.UndefOr[TransformProperty] = js.undefined
  
  /**
    * The **`transform-box`** CSS property defines the layout box to which the `transform` and `transform-origin` properties relate.
    *
    * **Initial value**: `border-box `
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** | **55**  |  n/a   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-box
    */
  var `transform-box`: js.UndefOr[TransformBoxProperty] = js.undefined
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    *
    * | Chrome |  Firefox  |    Safari     |  Edge  |   IE    |
    * | :----: | :-------: | :-----------: | :----: | :-----: |
    * |  Yes   |  **16**   | **3.1** _-x-_ | **12** | **10**  |
    * |        | 3.5 _-x-_ |               |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
    */
  var `transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Initial value**: `flat`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  | IE  |
    * | :----------: | :------: | :----: | :----: | :-: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | No  |
    * |              | 10 _-x-_ |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-style
    */
  var `transform-style`: js.UndefOr[TransformStyleProperty] = js.undefined
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **26**  | **16**  | **3** _-x-_ | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-delay
    */
  var `transition-delay`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **26**  | **16**  | **3** _-x-_ | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-duration
    */
  var `transition-duration`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **26** | **16**  |  Yes   | **12** | **10** |
    * |        | 4 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-property
    */
  var `transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **26** | **16**  |  Yes   | **12** | **10** |
    * |        | 4 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-timing-function
    */
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  
  /**
    * The **`translate`** CSS property allows you to specify translation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/translate
    */
  var translate: js.UndefOr[TranslateProperty[TLength]] = js.undefined
  
  /**
    * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left-to-right and right-to-left text, the user-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
    */
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty] = js.undefined
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  |   Firefox   |    Safari     |     Edge     |   IE   |
    * | :-----: | :---------: | :-----------: | :----------: | :----: |
    * | **54**  | **1** _-x-_ | **3.1** _-x-_ | **12** _-x-_ | **10** |
    * | 6 _-x-_ |             |               |              |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/user-select
    */
  var `user-select`: js.UndefOr[UserSelectProperty] = js.undefined
  
  /**
    * The **`vertical-align`** CSS property sets vertical alignment of an inline or table-cell box.
    *
    * **Initial value**: `baseline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
    */
  var `vertical-align`: js.UndefOr[VerticalAlignProperty[TLength]] = js.undefined
  
  /**
    * The **`visibility`** CSS property shows or hides an element without changing the layout of a document. The property can also hide rows or columns in a `<table>`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/visibility
    */
  var visibility: js.UndefOr[VisibilityProperty] = js.undefined
  
  /**
    * The **`white-space`** CSS property sets how white space inside an element is handled.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/white-space
    */
  var `white-space`: js.UndefOr[WhiteSpaceProperty] = js.undefined
  
  /**
    * The **`widows`** CSS property sets the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **25** |   No    |   No   | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/widows
    */
  var widows: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`width`** CSS property sets an element's width. By default it sets the width of the content area, but if `box-sizing` is set to `border-box`, it sets the width of the border area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    */
  var width: js.UndefOr[WidthProperty[TLength]] = js.undefined
  
  /**
    * The **`will-change`** CSS property hints to browsers how an element is expected to change. Browsers may set up optimizations before an element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work before they are actually required.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **36** | **36**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/will-change
    */
  var `will-change`: js.UndefOr[WillChangeProperty] = js.undefined
  
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **15**  |  Yes   | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-break
    */
  var `word-break`: js.UndefOr[WordBreakProperty] = js.undefined
  
  /**
    * The **`word-spacing`** CSS property sets the length of space between words and between tags.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
    */
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength]] = js.undefined
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **3.5** | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `word-wrap`: js.UndefOr[WordWrapProperty] = js.undefined
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Initial value**: `horizontal-tb`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  |     IE      |
    * | :---------: | :-----: | :-----------: | :----: | :---------: |
    * | **8** _-x-_ | **41**  | **5.1** _-x-_ | **12** | **9** _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
    */
  var `writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
  
  /**
    * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var `z-index`: js.UndefOr[ZIndexProperty] = js.undefined
  
  /**
    * The non-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * |  Yes   |   No    | **4**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/zoom
    */
  var zoom: js.UndefOr[ZoomProperty] = js.undefined
}
object StandardLonghandPropertiesHyphen {
  
  inline def apply[TLength](): StandardLonghandPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardLonghandPropertiesHyphen[TLength]]
  }
  
  extension [Self <: StandardLonghandPropertiesHyphen[?], TLength](x: Self & StandardLonghandPropertiesHyphen[TLength]) {
    
    inline def `setAlign-content`(value: AlignContentProperty): Self = StObject.set(x, "align-content", value.asInstanceOf[js.Any])
    
    inline def `setAlign-contentUndefined`: Self = StObject.set(x, "align-content", js.undefined)
    
    inline def `setAlign-items`(value: AlignItemsProperty): Self = StObject.set(x, "align-items", value.asInstanceOf[js.Any])
    
    inline def `setAlign-itemsUndefined`: Self = StObject.set(x, "align-items", js.undefined)
    
    inline def `setAlign-self`(value: AlignSelfProperty): Self = StObject.set(x, "align-self", value.asInstanceOf[js.Any])
    
    inline def `setAlign-selfUndefined`: Self = StObject.set(x, "align-self", js.undefined)
    
    inline def `setAnimation-delay`(value: GlobalsString): Self = StObject.set(x, "animation-delay", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-delayUndefined`: Self = StObject.set(x, "animation-delay", js.undefined)
    
    inline def `setAnimation-direction`(value: AnimationDirectionProperty): Self = StObject.set(x, "animation-direction", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-directionUndefined`: Self = StObject.set(x, "animation-direction", js.undefined)
    
    inline def `setAnimation-duration`(value: GlobalsString): Self = StObject.set(x, "animation-duration", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-durationUndefined`: Self = StObject.set(x, "animation-duration", js.undefined)
    
    inline def `setAnimation-fill-mode`(value: AnimationFillModeProperty): Self = StObject.set(x, "animation-fill-mode", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-fill-modeUndefined`: Self = StObject.set(x, "animation-fill-mode", js.undefined)
    
    inline def `setAnimation-iteration-count`(value: AnimationIterationCountProperty): Self = StObject.set(x, "animation-iteration-count", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-iteration-countUndefined`: Self = StObject.set(x, "animation-iteration-count", js.undefined)
    
    inline def `setAnimation-name`(value: AnimationNameProperty): Self = StObject.set(x, "animation-name", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-nameUndefined`: Self = StObject.set(x, "animation-name", js.undefined)
    
    inline def `setAnimation-play-state`(value: AnimationPlayStateProperty): Self = StObject.set(x, "animation-play-state", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-play-stateUndefined`: Self = StObject.set(x, "animation-play-state", js.undefined)
    
    inline def `setAnimation-timing-function`(value: AnimationTimingFunctionProperty): Self = StObject.set(x, "animation-timing-function", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-timing-functionUndefined`: Self = StObject.set(x, "animation-timing-function", js.undefined)
    
    inline def setAppearance(value: AppearanceProperty): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def `setBackdrop-filter`(value: BackdropFilterProperty): Self = StObject.set(x, "backdrop-filter", value.asInstanceOf[js.Any])
    
    inline def `setBackdrop-filterUndefined`: Self = StObject.set(x, "backdrop-filter", js.undefined)
    
    inline def `setBackface-visibility`(value: BackfaceVisibilityProperty): Self = StObject.set(x, "backface-visibility", value.asInstanceOf[js.Any])
    
    inline def `setBackface-visibilityUndefined`: Self = StObject.set(x, "backface-visibility", js.undefined)
    
    inline def `setBackground-attachment`(value: BackgroundAttachmentProperty): Self = StObject.set(x, "background-attachment", value.asInstanceOf[js.Any])
    
    inline def `setBackground-attachmentUndefined`: Self = StObject.set(x, "background-attachment", js.undefined)
    
    inline def `setBackground-blend-mode`(value: BackgroundBlendModeProperty): Self = StObject.set(x, "background-blend-mode", value.asInstanceOf[js.Any])
    
    inline def `setBackground-blend-modeUndefined`: Self = StObject.set(x, "background-blend-mode", js.undefined)
    
    inline def `setBackground-clip`(value: BackgroundClipProperty): Self = StObject.set(x, "background-clip", value.asInstanceOf[js.Any])
    
    inline def `setBackground-clipUndefined`: Self = StObject.set(x, "background-clip", js.undefined)
    
    inline def `setBackground-color`(value: BackgroundColorProperty): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def `setBackground-image`(value: BackgroundImageProperty): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    inline def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    inline def `setBackground-origin`(value: BackgroundOriginProperty): Self = StObject.set(x, "background-origin", value.asInstanceOf[js.Any])
    
    inline def `setBackground-originUndefined`: Self = StObject.set(x, "background-origin", js.undefined)
    
    inline def `setBackground-position`(value: BackgroundPositionProperty[TLength]): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    inline def `setBackground-position-x`(value: BackgroundPositionXProperty[TLength]): Self = StObject.set(x, "background-position-x", value.asInstanceOf[js.Any])
    
    inline def `setBackground-position-xUndefined`: Self = StObject.set(x, "background-position-x", js.undefined)
    
    inline def `setBackground-position-y`(value: BackgroundPositionYProperty[TLength]): Self = StObject.set(x, "background-position-y", value.asInstanceOf[js.Any])
    
    inline def `setBackground-position-yUndefined`: Self = StObject.set(x, "background-position-y", js.undefined)
    
    inline def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    inline def `setBackground-repeat`(value: BackgroundRepeatProperty): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    inline def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    inline def `setBackground-size`(value: BackgroundSizeProperty[TLength]): Self = StObject.set(x, "background-size", value.asInstanceOf[js.Any])
    
    inline def `setBackground-sizeUndefined`: Self = StObject.set(x, "background-size", js.undefined)
    
    inline def `setBlock-overflow`(value: BlockOverflowProperty): Self = StObject.set(x, "block-overflow", value.asInstanceOf[js.Any])
    
    inline def `setBlock-overflowUndefined`: Self = StObject.set(x, "block-overflow", js.undefined)
    
    inline def `setBlock-size`(value: BlockSizeProperty[TLength]): Self = StObject.set(x, "block-size", value.asInstanceOf[js.Any])
    
    inline def `setBlock-sizeUndefined`: Self = StObject.set(x, "block-size", js.undefined)
    
    inline def `setBorder-block-color`(value: BorderBlockColorProperty): Self = StObject.set(x, "border-block-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-colorUndefined`: Self = StObject.set(x, "border-block-color", js.undefined)
    
    inline def `setBorder-block-end-color`(value: BorderBlockEndColorProperty): Self = StObject.set(x, "border-block-end-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-end-colorUndefined`: Self = StObject.set(x, "border-block-end-color", js.undefined)
    
    inline def `setBorder-block-end-style`(value: BorderBlockEndStyleProperty): Self = StObject.set(x, "border-block-end-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-end-styleUndefined`: Self = StObject.set(x, "border-block-end-style", js.undefined)
    
    inline def `setBorder-block-end-width`(value: BorderBlockEndWidthProperty[TLength]): Self = StObject.set(x, "border-block-end-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-end-widthUndefined`: Self = StObject.set(x, "border-block-end-width", js.undefined)
    
    inline def `setBorder-block-start-color`(value: BorderBlockStartColorProperty): Self = StObject.set(x, "border-block-start-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-start-colorUndefined`: Self = StObject.set(x, "border-block-start-color", js.undefined)
    
    inline def `setBorder-block-start-style`(value: BorderBlockStartStyleProperty): Self = StObject.set(x, "border-block-start-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-start-styleUndefined`: Self = StObject.set(x, "border-block-start-style", js.undefined)
    
    inline def `setBorder-block-start-width`(value: BorderBlockStartWidthProperty[TLength]): Self = StObject.set(x, "border-block-start-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-start-widthUndefined`: Self = StObject.set(x, "border-block-start-width", js.undefined)
    
    inline def `setBorder-block-style`(value: BorderBlockStyleProperty): Self = StObject.set(x, "border-block-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-styleUndefined`: Self = StObject.set(x, "border-block-style", js.undefined)
    
    inline def `setBorder-block-width`(value: BorderBlockWidthProperty[TLength]): Self = StObject.set(x, "border-block-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-block-widthUndefined`: Self = StObject.set(x, "border-block-width", js.undefined)
    
    inline def `setBorder-bottom-color`(value: BorderBottomColorProperty): Self = StObject.set(x, "border-bottom-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottom-colorUndefined`: Self = StObject.set(x, "border-bottom-color", js.undefined)
    
    inline def `setBorder-bottom-left-radius`(value: BorderBottomLeftRadiusProperty[TLength]): Self = StObject.set(x, "border-bottom-left-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottom-left-radiusUndefined`: Self = StObject.set(x, "border-bottom-left-radius", js.undefined)
    
    inline def `setBorder-bottom-right-radius`(value: BorderBottomRightRadiusProperty[TLength]): Self = StObject.set(x, "border-bottom-right-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottom-right-radiusUndefined`: Self = StObject.set(x, "border-bottom-right-radius", js.undefined)
    
    inline def `setBorder-bottom-style`(value: BorderBottomStyleProperty): Self = StObject.set(x, "border-bottom-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottom-styleUndefined`: Self = StObject.set(x, "border-bottom-style", js.undefined)
    
    inline def `setBorder-bottom-width`(value: BorderBottomWidthProperty[TLength]): Self = StObject.set(x, "border-bottom-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-bottom-widthUndefined`: Self = StObject.set(x, "border-bottom-width", js.undefined)
    
    inline def `setBorder-collapse`(value: BorderCollapseProperty): Self = StObject.set(x, "border-collapse", value.asInstanceOf[js.Any])
    
    inline def `setBorder-collapseUndefined`: Self = StObject.set(x, "border-collapse", js.undefined)
    
    inline def `setBorder-end-end-radius`(value: BorderEndEndRadiusProperty[TLength]): Self = StObject.set(x, "border-end-end-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-end-end-radiusUndefined`: Self = StObject.set(x, "border-end-end-radius", js.undefined)
    
    inline def `setBorder-end-start-radius`(value: BorderEndStartRadiusProperty[TLength]): Self = StObject.set(x, "border-end-start-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-end-start-radiusUndefined`: Self = StObject.set(x, "border-end-start-radius", js.undefined)
    
    inline def `setBorder-image-outset`(value: BorderImageOutsetProperty[TLength]): Self = StObject.set(x, "border-image-outset", value.asInstanceOf[js.Any])
    
    inline def `setBorder-image-outsetUndefined`: Self = StObject.set(x, "border-image-outset", js.undefined)
    
    inline def `setBorder-image-repeat`(value: BorderImageRepeatProperty): Self = StObject.set(x, "border-image-repeat", value.asInstanceOf[js.Any])
    
    inline def `setBorder-image-repeatUndefined`: Self = StObject.set(x, "border-image-repeat", js.undefined)
    
    inline def `setBorder-image-slice`(value: BorderImageSliceProperty): Self = StObject.set(x, "border-image-slice", value.asInstanceOf[js.Any])
    
    inline def `setBorder-image-sliceUndefined`: Self = StObject.set(x, "border-image-slice", js.undefined)
    
    inline def `setBorder-image-source`(value: BorderImageSourceProperty): Self = StObject.set(x, "border-image-source", value.asInstanceOf[js.Any])
    
    inline def `setBorder-image-sourceUndefined`: Self = StObject.set(x, "border-image-source", js.undefined)
    
    inline def `setBorder-image-width`(value: BorderImageWidthProperty[TLength]): Self = StObject.set(x, "border-image-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-image-widthUndefined`: Self = StObject.set(x, "border-image-width", js.undefined)
    
    inline def `setBorder-inline-color`(value: BorderInlineColorProperty): Self = StObject.set(x, "border-inline-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-colorUndefined`: Self = StObject.set(x, "border-inline-color", js.undefined)
    
    inline def `setBorder-inline-end-color`(value: BorderInlineEndColorProperty): Self = StObject.set(x, "border-inline-end-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-end-colorUndefined`: Self = StObject.set(x, "border-inline-end-color", js.undefined)
    
    inline def `setBorder-inline-end-style`(value: BorderInlineEndStyleProperty): Self = StObject.set(x, "border-inline-end-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-end-styleUndefined`: Self = StObject.set(x, "border-inline-end-style", js.undefined)
    
    inline def `setBorder-inline-end-width`(value: BorderInlineEndWidthProperty[TLength]): Self = StObject.set(x, "border-inline-end-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-end-widthUndefined`: Self = StObject.set(x, "border-inline-end-width", js.undefined)
    
    inline def `setBorder-inline-start-color`(value: BorderInlineStartColorProperty): Self = StObject.set(x, "border-inline-start-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-start-colorUndefined`: Self = StObject.set(x, "border-inline-start-color", js.undefined)
    
    inline def `setBorder-inline-start-style`(value: BorderInlineStartStyleProperty): Self = StObject.set(x, "border-inline-start-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-start-styleUndefined`: Self = StObject.set(x, "border-inline-start-style", js.undefined)
    
    inline def `setBorder-inline-start-width`(value: BorderInlineStartWidthProperty[TLength]): Self = StObject.set(x, "border-inline-start-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-start-widthUndefined`: Self = StObject.set(x, "border-inline-start-width", js.undefined)
    
    inline def `setBorder-inline-style`(value: BorderInlineStyleProperty): Self = StObject.set(x, "border-inline-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-styleUndefined`: Self = StObject.set(x, "border-inline-style", js.undefined)
    
    inline def `setBorder-inline-width`(value: BorderInlineWidthProperty[TLength]): Self = StObject.set(x, "border-inline-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-inline-widthUndefined`: Self = StObject.set(x, "border-inline-width", js.undefined)
    
    inline def `setBorder-left-color`(value: BorderLeftColorProperty): Self = StObject.set(x, "border-left-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-left-colorUndefined`: Self = StObject.set(x, "border-left-color", js.undefined)
    
    inline def `setBorder-left-style`(value: BorderLeftStyleProperty): Self = StObject.set(x, "border-left-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-left-styleUndefined`: Self = StObject.set(x, "border-left-style", js.undefined)
    
    inline def `setBorder-left-width`(value: BorderLeftWidthProperty[TLength]): Self = StObject.set(x, "border-left-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-left-widthUndefined`: Self = StObject.set(x, "border-left-width", js.undefined)
    
    inline def `setBorder-right-color`(value: BorderRightColorProperty): Self = StObject.set(x, "border-right-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-right-colorUndefined`: Self = StObject.set(x, "border-right-color", js.undefined)
    
    inline def `setBorder-right-style`(value: BorderRightStyleProperty): Self = StObject.set(x, "border-right-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-right-styleUndefined`: Self = StObject.set(x, "border-right-style", js.undefined)
    
    inline def `setBorder-right-width`(value: BorderRightWidthProperty[TLength]): Self = StObject.set(x, "border-right-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-right-widthUndefined`: Self = StObject.set(x, "border-right-width", js.undefined)
    
    inline def `setBorder-spacing`(value: BorderSpacingProperty[TLength]): Self = StObject.set(x, "border-spacing", value.asInstanceOf[js.Any])
    
    inline def `setBorder-spacingUndefined`: Self = StObject.set(x, "border-spacing", js.undefined)
    
    inline def `setBorder-start-end-radius`(value: BorderStartEndRadiusProperty[TLength]): Self = StObject.set(x, "border-start-end-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-start-end-radiusUndefined`: Self = StObject.set(x, "border-start-end-radius", js.undefined)
    
    inline def `setBorder-start-start-radius`(value: BorderStartStartRadiusProperty[TLength]): Self = StObject.set(x, "border-start-start-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-start-start-radiusUndefined`: Self = StObject.set(x, "border-start-start-radius", js.undefined)
    
    inline def `setBorder-top-color`(value: BorderTopColorProperty): Self = StObject.set(x, "border-top-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-top-colorUndefined`: Self = StObject.set(x, "border-top-color", js.undefined)
    
    inline def `setBorder-top-left-radius`(value: BorderTopLeftRadiusProperty[TLength]): Self = StObject.set(x, "border-top-left-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-top-left-radiusUndefined`: Self = StObject.set(x, "border-top-left-radius", js.undefined)
    
    inline def `setBorder-top-right-radius`(value: BorderTopRightRadiusProperty[TLength]): Self = StObject.set(x, "border-top-right-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-top-right-radiusUndefined`: Self = StObject.set(x, "border-top-right-radius", js.undefined)
    
    inline def `setBorder-top-style`(value: BorderTopStyleProperty): Self = StObject.set(x, "border-top-style", value.asInstanceOf[js.Any])
    
    inline def `setBorder-top-styleUndefined`: Self = StObject.set(x, "border-top-style", js.undefined)
    
    inline def `setBorder-top-width`(value: BorderTopWidthProperty[TLength]): Self = StObject.set(x, "border-top-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-top-widthUndefined`: Self = StObject.set(x, "border-top-width", js.undefined)
    
    inline def setBottom(value: BottomProperty[TLength]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def `setBox-decoration-break`(value: BoxDecorationBreakProperty): Self = StObject.set(x, "box-decoration-break", value.asInstanceOf[js.Any])
    
    inline def `setBox-decoration-breakUndefined`: Self = StObject.set(x, "box-decoration-break", js.undefined)
    
    inline def `setBox-shadow`(value: BoxShadowProperty): Self = StObject.set(x, "box-shadow", value.asInstanceOf[js.Any])
    
    inline def `setBox-shadowUndefined`: Self = StObject.set(x, "box-shadow", js.undefined)
    
    inline def `setBox-sizing`(value: BoxSizingProperty): Self = StObject.set(x, "box-sizing", value.asInstanceOf[js.Any])
    
    inline def `setBox-sizingUndefined`: Self = StObject.set(x, "box-sizing", js.undefined)
    
    inline def `setBreak-after`(value: BreakAfterProperty): Self = StObject.set(x, "break-after", value.asInstanceOf[js.Any])
    
    inline def `setBreak-afterUndefined`: Self = StObject.set(x, "break-after", js.undefined)
    
    inline def `setBreak-before`(value: BreakBeforeProperty): Self = StObject.set(x, "break-before", value.asInstanceOf[js.Any])
    
    inline def `setBreak-beforeUndefined`: Self = StObject.set(x, "break-before", js.undefined)
    
    inline def `setBreak-inside`(value: BreakInsideProperty): Self = StObject.set(x, "break-inside", value.asInstanceOf[js.Any])
    
    inline def `setBreak-insideUndefined`: Self = StObject.set(x, "break-inside", js.undefined)
    
    inline def `setCaption-side`(value: CaptionSideProperty): Self = StObject.set(x, "caption-side", value.asInstanceOf[js.Any])
    
    inline def `setCaption-sideUndefined`: Self = StObject.set(x, "caption-side", js.undefined)
    
    inline def `setCaret-color`(value: CaretColorProperty): Self = StObject.set(x, "caret-color", value.asInstanceOf[js.Any])
    
    inline def `setCaret-colorUndefined`: Self = StObject.set(x, "caret-color", js.undefined)
    
    inline def setClear(value: ClearProperty): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def `setClip-path`(value: ClipPathProperty): Self = StObject.set(x, "clip-path", value.asInstanceOf[js.Any])
    
    inline def `setClip-pathUndefined`: Self = StObject.set(x, "clip-path", js.undefined)
    
    inline def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def `setColor-adjust`(value: ColorAdjustProperty): Self = StObject.set(x, "color-adjust", value.asInstanceOf[js.Any])
    
    inline def `setColor-adjustUndefined`: Self = StObject.set(x, "color-adjust", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def `setColumn-count`(value: ColumnCountProperty): Self = StObject.set(x, "column-count", value.asInstanceOf[js.Any])
    
    inline def `setColumn-countUndefined`: Self = StObject.set(x, "column-count", js.undefined)
    
    inline def `setColumn-fill`(value: ColumnFillProperty): Self = StObject.set(x, "column-fill", value.asInstanceOf[js.Any])
    
    inline def `setColumn-fillUndefined`: Self = StObject.set(x, "column-fill", js.undefined)
    
    inline def `setColumn-gap`(value: ColumnGapProperty[TLength]): Self = StObject.set(x, "column-gap", value.asInstanceOf[js.Any])
    
    inline def `setColumn-gapUndefined`: Self = StObject.set(x, "column-gap", js.undefined)
    
    inline def `setColumn-rule-color`(value: ColumnRuleColorProperty): Self = StObject.set(x, "column-rule-color", value.asInstanceOf[js.Any])
    
    inline def `setColumn-rule-colorUndefined`: Self = StObject.set(x, "column-rule-color", js.undefined)
    
    inline def `setColumn-rule-style`(value: ColumnRuleStyleProperty): Self = StObject.set(x, "column-rule-style", value.asInstanceOf[js.Any])
    
    inline def `setColumn-rule-styleUndefined`: Self = StObject.set(x, "column-rule-style", js.undefined)
    
    inline def `setColumn-rule-width`(value: ColumnRuleWidthProperty[TLength]): Self = StObject.set(x, "column-rule-width", value.asInstanceOf[js.Any])
    
    inline def `setColumn-rule-widthUndefined`: Self = StObject.set(x, "column-rule-width", js.undefined)
    
    inline def `setColumn-span`(value: ColumnSpanProperty): Self = StObject.set(x, "column-span", value.asInstanceOf[js.Any])
    
    inline def `setColumn-spanUndefined`: Self = StObject.set(x, "column-span", js.undefined)
    
    inline def `setColumn-width`(value: ColumnWidthProperty[TLength]): Self = StObject.set(x, "column-width", value.asInstanceOf[js.Any])
    
    inline def `setColumn-widthUndefined`: Self = StObject.set(x, "column-width", js.undefined)
    
    inline def setContain(value: ContainProperty): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
    
    inline def setContent(value: ContentProperty): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def `setCounter-increment`(value: CounterIncrementProperty): Self = StObject.set(x, "counter-increment", value.asInstanceOf[js.Any])
    
    inline def `setCounter-incrementUndefined`: Self = StObject.set(x, "counter-increment", js.undefined)
    
    inline def `setCounter-reset`(value: CounterResetProperty): Self = StObject.set(x, "counter-reset", value.asInstanceOf[js.Any])
    
    inline def `setCounter-resetUndefined`: Self = StObject.set(x, "counter-reset", js.undefined)
    
    inline def setCursor(value: CursorProperty): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDirection(value: DirectionProperty): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplay(value: DisplayProperty): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def `setEmpty-cells`(value: EmptyCellsProperty): Self = StObject.set(x, "empty-cells", value.asInstanceOf[js.Any])
    
    inline def `setEmpty-cellsUndefined`: Self = StObject.set(x, "empty-cells", js.undefined)
    
    inline def setFilter(value: FilterProperty): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def `setFlex-basis`(value: FlexBasisProperty[TLength]): Self = StObject.set(x, "flex-basis", value.asInstanceOf[js.Any])
    
    inline def `setFlex-basisUndefined`: Self = StObject.set(x, "flex-basis", js.undefined)
    
    inline def `setFlex-direction`(value: FlexDirectionProperty): Self = StObject.set(x, "flex-direction", value.asInstanceOf[js.Any])
    
    inline def `setFlex-directionUndefined`: Self = StObject.set(x, "flex-direction", js.undefined)
    
    inline def `setFlex-grow`(value: GlobalsNumber): Self = StObject.set(x, "flex-grow", value.asInstanceOf[js.Any])
    
    inline def `setFlex-growUndefined`: Self = StObject.set(x, "flex-grow", js.undefined)
    
    inline def `setFlex-shrink`(value: GlobalsNumber): Self = StObject.set(x, "flex-shrink", value.asInstanceOf[js.Any])
    
    inline def `setFlex-shrinkUndefined`: Self = StObject.set(x, "flex-shrink", js.undefined)
    
    inline def `setFlex-wrap`(value: FlexWrapProperty): Self = StObject.set(x, "flex-wrap", value.asInstanceOf[js.Any])
    
    inline def `setFlex-wrapUndefined`: Self = StObject.set(x, "flex-wrap", js.undefined)
    
    inline def setFloat(value: FloatProperty): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    inline def `setFont-family`(value: FontFamilyProperty): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    inline def `setFont-feature-settings`(value: FontFeatureSettingsProperty): Self = StObject.set(x, "font-feature-settings", value.asInstanceOf[js.Any])
    
    inline def `setFont-feature-settingsUndefined`: Self = StObject.set(x, "font-feature-settings", js.undefined)
    
    inline def `setFont-kerning`(value: FontKerningProperty): Self = StObject.set(x, "font-kerning", value.asInstanceOf[js.Any])
    
    inline def `setFont-kerningUndefined`: Self = StObject.set(x, "font-kerning", js.undefined)
    
    inline def `setFont-language-override`(value: FontLanguageOverrideProperty): Self = StObject.set(x, "font-language-override", value.asInstanceOf[js.Any])
    
    inline def `setFont-language-overrideUndefined`: Self = StObject.set(x, "font-language-override", js.undefined)
    
    inline def `setFont-optical-sizing`(value: FontOpticalSizingProperty): Self = StObject.set(x, "font-optical-sizing", value.asInstanceOf[js.Any])
    
    inline def `setFont-optical-sizingUndefined`: Self = StObject.set(x, "font-optical-sizing", js.undefined)
    
    inline def `setFont-size`(value: FontSizeProperty[TLength]): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-size-adjust`(value: FontSizeAdjustProperty): Self = StObject.set(x, "font-size-adjust", value.asInstanceOf[js.Any])
    
    inline def `setFont-size-adjustUndefined`: Self = StObject.set(x, "font-size-adjust", js.undefined)
    
    inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    inline def `setFont-stretch`(value: FontStretchProperty): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
    
    inline def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
    
    inline def `setFont-style`(value: FontStyleProperty): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    inline def `setFont-synthesis`(value: FontSynthesisProperty): Self = StObject.set(x, "font-synthesis", value.asInstanceOf[js.Any])
    
    inline def `setFont-synthesisUndefined`: Self = StObject.set(x, "font-synthesis", js.undefined)
    
    inline def `setFont-variant`(value: FontVariantProperty): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
    
    inline def `setFont-variant-caps`(value: FontVariantCapsProperty): Self = StObject.set(x, "font-variant-caps", value.asInstanceOf[js.Any])
    
    inline def `setFont-variant-capsUndefined`: Self = StObject.set(x, "font-variant-caps", js.undefined)
    
    inline def `setFont-variant-east-asian`(value: FontVariantEastAsianProperty): Self = StObject.set(x, "font-variant-east-asian", value.asInstanceOf[js.Any])
    
    inline def `setFont-variant-east-asianUndefined`: Self = StObject.set(x, "font-variant-east-asian", js.undefined)
    
    inline def `setFont-variant-ligatures`(value: FontVariantLigaturesProperty): Self = StObject.set(x, "font-variant-ligatures", value.asInstanceOf[js.Any])
    
    inline def `setFont-variant-ligaturesUndefined`: Self = StObject.set(x, "font-variant-ligatures", js.undefined)
    
    inline def `setFont-variant-numeric`(value: FontVariantNumericProperty): Self = StObject.set(x, "font-variant-numeric", value.asInstanceOf[js.Any])
    
    inline def `setFont-variant-numericUndefined`: Self = StObject.set(x, "font-variant-numeric", js.undefined)
    
    inline def `setFont-variant-position`(value: FontVariantPositionProperty): Self = StObject.set(x, "font-variant-position", value.asInstanceOf[js.Any])
    
    inline def `setFont-variant-positionUndefined`: Self = StObject.set(x, "font-variant-position", js.undefined)
    
    inline def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
    
    inline def `setFont-variation-settings`(value: FontVariationSettingsProperty): Self = StObject.set(x, "font-variation-settings", value.asInstanceOf[js.Any])
    
    inline def `setFont-variation-settingsUndefined`: Self = StObject.set(x, "font-variation-settings", js.undefined)
    
    inline def `setFont-weight`(value: FontWeightProperty): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    inline def `setGrid-auto-columns`(value: GridAutoColumnsProperty[TLength]): Self = StObject.set(x, "grid-auto-columns", value.asInstanceOf[js.Any])
    
    inline def `setGrid-auto-columnsUndefined`: Self = StObject.set(x, "grid-auto-columns", js.undefined)
    
    inline def `setGrid-auto-flow`(value: GridAutoFlowProperty): Self = StObject.set(x, "grid-auto-flow", value.asInstanceOf[js.Any])
    
    inline def `setGrid-auto-flowUndefined`: Self = StObject.set(x, "grid-auto-flow", js.undefined)
    
    inline def `setGrid-auto-rows`(value: GridAutoRowsProperty[TLength]): Self = StObject.set(x, "grid-auto-rows", value.asInstanceOf[js.Any])
    
    inline def `setGrid-auto-rowsUndefined`: Self = StObject.set(x, "grid-auto-rows", js.undefined)
    
    inline def `setGrid-column-end`(value: GridColumnEndProperty): Self = StObject.set(x, "grid-column-end", value.asInstanceOf[js.Any])
    
    inline def `setGrid-column-endUndefined`: Self = StObject.set(x, "grid-column-end", js.undefined)
    
    inline def `setGrid-column-start`(value: GridColumnStartProperty): Self = StObject.set(x, "grid-column-start", value.asInstanceOf[js.Any])
    
    inline def `setGrid-column-startUndefined`: Self = StObject.set(x, "grid-column-start", js.undefined)
    
    inline def `setGrid-row-end`(value: GridRowEndProperty): Self = StObject.set(x, "grid-row-end", value.asInstanceOf[js.Any])
    
    inline def `setGrid-row-endUndefined`: Self = StObject.set(x, "grid-row-end", js.undefined)
    
    inline def `setGrid-row-start`(value: GridRowStartProperty): Self = StObject.set(x, "grid-row-start", value.asInstanceOf[js.Any])
    
    inline def `setGrid-row-startUndefined`: Self = StObject.set(x, "grid-row-start", js.undefined)
    
    inline def `setGrid-template-areas`(value: GridTemplateAreasProperty): Self = StObject.set(x, "grid-template-areas", value.asInstanceOf[js.Any])
    
    inline def `setGrid-template-areasUndefined`: Self = StObject.set(x, "grid-template-areas", js.undefined)
    
    inline def `setGrid-template-columns`(value: GridTemplateColumnsProperty[TLength]): Self = StObject.set(x, "grid-template-columns", value.asInstanceOf[js.Any])
    
    inline def `setGrid-template-columnsUndefined`: Self = StObject.set(x, "grid-template-columns", js.undefined)
    
    inline def `setGrid-template-rows`(value: GridTemplateRowsProperty[TLength]): Self = StObject.set(x, "grid-template-rows", value.asInstanceOf[js.Any])
    
    inline def `setGrid-template-rowsUndefined`: Self = StObject.set(x, "grid-template-rows", js.undefined)
    
    inline def `setHanging-punctuation`(value: HangingPunctuationProperty): Self = StObject.set(x, "hanging-punctuation", value.asInstanceOf[js.Any])
    
    inline def `setHanging-punctuationUndefined`: Self = StObject.set(x, "hanging-punctuation", js.undefined)
    
    inline def setHeight(value: HeightProperty[TLength]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHyphens(value: HyphensProperty): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
    
    inline def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
    
    inline def `setImage-orientation`(value: ImageOrientationProperty): Self = StObject.set(x, "image-orientation", value.asInstanceOf[js.Any])
    
    inline def `setImage-orientationUndefined`: Self = StObject.set(x, "image-orientation", js.undefined)
    
    inline def `setImage-rendering`(value: ImageRenderingProperty): Self = StObject.set(x, "image-rendering", value.asInstanceOf[js.Any])
    
    inline def `setImage-renderingUndefined`: Self = StObject.set(x, "image-rendering", js.undefined)
    
    inline def `setImage-resolution`(value: ImageResolutionProperty): Self = StObject.set(x, "image-resolution", value.asInstanceOf[js.Any])
    
    inline def `setImage-resolutionUndefined`: Self = StObject.set(x, "image-resolution", js.undefined)
    
    inline def `setInitial-letter`(value: InitialLetterProperty): Self = StObject.set(x, "initial-letter", value.asInstanceOf[js.Any])
    
    inline def `setInitial-letterUndefined`: Self = StObject.set(x, "initial-letter", js.undefined)
    
    inline def `setInline-size`(value: InlineSizeProperty[TLength]): Self = StObject.set(x, "inline-size", value.asInstanceOf[js.Any])
    
    inline def `setInline-sizeUndefined`: Self = StObject.set(x, "inline-size", js.undefined)
    
    inline def setInset(value: InsetProperty[TLength]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def `setInset-block`(value: InsetBlockProperty[TLength]): Self = StObject.set(x, "inset-block", value.asInstanceOf[js.Any])
    
    inline def `setInset-block-end`(value: InsetBlockEndProperty[TLength]): Self = StObject.set(x, "inset-block-end", value.asInstanceOf[js.Any])
    
    inline def `setInset-block-endUndefined`: Self = StObject.set(x, "inset-block-end", js.undefined)
    
    inline def `setInset-block-start`(value: InsetBlockStartProperty[TLength]): Self = StObject.set(x, "inset-block-start", value.asInstanceOf[js.Any])
    
    inline def `setInset-block-startUndefined`: Self = StObject.set(x, "inset-block-start", js.undefined)
    
    inline def `setInset-blockUndefined`: Self = StObject.set(x, "inset-block", js.undefined)
    
    inline def `setInset-inline`(value: InsetInlineProperty[TLength]): Self = StObject.set(x, "inset-inline", value.asInstanceOf[js.Any])
    
    inline def `setInset-inline-end`(value: InsetInlineEndProperty[TLength]): Self = StObject.set(x, "inset-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setInset-inline-endUndefined`: Self = StObject.set(x, "inset-inline-end", js.undefined)
    
    inline def `setInset-inline-start`(value: InsetInlineStartProperty[TLength]): Self = StObject.set(x, "inset-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setInset-inline-startUndefined`: Self = StObject.set(x, "inset-inline-start", js.undefined)
    
    inline def `setInset-inlineUndefined`: Self = StObject.set(x, "inset-inline", js.undefined)
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setIsolation(value: IsolationProperty): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
    
    inline def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
    
    inline def `setJustify-content`(value: JustifyContentProperty): Self = StObject.set(x, "justify-content", value.asInstanceOf[js.Any])
    
    inline def `setJustify-contentUndefined`: Self = StObject.set(x, "justify-content", js.undefined)
    
    inline def `setJustify-items`(value: JustifyItemsProperty): Self = StObject.set(x, "justify-items", value.asInstanceOf[js.Any])
    
    inline def `setJustify-itemsUndefined`: Self = StObject.set(x, "justify-items", js.undefined)
    
    inline def `setJustify-self`(value: JustifySelfProperty): Self = StObject.set(x, "justify-self", value.asInstanceOf[js.Any])
    
    inline def `setJustify-selfUndefined`: Self = StObject.set(x, "justify-self", js.undefined)
    
    inline def setLeft(value: LeftProperty[TLength]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def `setLetter-spacing`(value: LetterSpacingProperty[TLength]): Self = StObject.set(x, "letter-spacing", value.asInstanceOf[js.Any])
    
    inline def `setLetter-spacingUndefined`: Self = StObject.set(x, "letter-spacing", js.undefined)
    
    inline def `setLine-break`(value: LineBreakProperty): Self = StObject.set(x, "line-break", value.asInstanceOf[js.Any])
    
    inline def `setLine-breakUndefined`: Self = StObject.set(x, "line-break", js.undefined)
    
    inline def `setLine-height`(value: LineHeightProperty[TLength]): Self = StObject.set(x, "line-height", value.asInstanceOf[js.Any])
    
    inline def `setLine-height-step`(value: LineHeightStepProperty[TLength]): Self = StObject.set(x, "line-height-step", value.asInstanceOf[js.Any])
    
    inline def `setLine-height-stepUndefined`: Self = StObject.set(x, "line-height-step", js.undefined)
    
    inline def `setLine-heightUndefined`: Self = StObject.set(x, "line-height", js.undefined)
    
    inline def `setList-style-image`(value: ListStyleImageProperty): Self = StObject.set(x, "list-style-image", value.asInstanceOf[js.Any])
    
    inline def `setList-style-imageUndefined`: Self = StObject.set(x, "list-style-image", js.undefined)
    
    inline def `setList-style-position`(value: ListStylePositionProperty): Self = StObject.set(x, "list-style-position", value.asInstanceOf[js.Any])
    
    inline def `setList-style-positionUndefined`: Self = StObject.set(x, "list-style-position", js.undefined)
    
    inline def `setList-style-type`(value: ListStyleTypeProperty): Self = StObject.set(x, "list-style-type", value.asInstanceOf[js.Any])
    
    inline def `setList-style-typeUndefined`: Self = StObject.set(x, "list-style-type", js.undefined)
    
    inline def `setMargin-block`(value: MarginBlockProperty[TLength]): Self = StObject.set(x, "margin-block", value.asInstanceOf[js.Any])
    
    inline def `setMargin-block-end`(value: MarginBlockEndProperty[TLength]): Self = StObject.set(x, "margin-block-end", value.asInstanceOf[js.Any])
    
    inline def `setMargin-block-endUndefined`: Self = StObject.set(x, "margin-block-end", js.undefined)
    
    inline def `setMargin-block-start`(value: MarginBlockStartProperty[TLength]): Self = StObject.set(x, "margin-block-start", value.asInstanceOf[js.Any])
    
    inline def `setMargin-block-startUndefined`: Self = StObject.set(x, "margin-block-start", js.undefined)
    
    inline def `setMargin-blockUndefined`: Self = StObject.set(x, "margin-block", js.undefined)
    
    inline def `setMargin-bottom`(value: MarginBottomProperty[TLength]): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
    
    inline def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
    
    inline def `setMargin-inline`(value: MarginInlineProperty[TLength]): Self = StObject.set(x, "margin-inline", value.asInstanceOf[js.Any])
    
    inline def `setMargin-inline-end`(value: MarginInlineEndProperty[TLength]): Self = StObject.set(x, "margin-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setMargin-inline-endUndefined`: Self = StObject.set(x, "margin-inline-end", js.undefined)
    
    inline def `setMargin-inline-start`(value: MarginInlineStartProperty[TLength]): Self = StObject.set(x, "margin-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setMargin-inline-startUndefined`: Self = StObject.set(x, "margin-inline-start", js.undefined)
    
    inline def `setMargin-inlineUndefined`: Self = StObject.set(x, "margin-inline", js.undefined)
    
    inline def `setMargin-left`(value: MarginLeftProperty[TLength]): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
    
    inline def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
    
    inline def `setMargin-right`(value: MarginRightProperty[TLength]): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
    
    inline def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
    
    inline def `setMargin-top`(value: MarginTopProperty[TLength]): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
    
    inline def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
    
    inline def `setMask-border-mode`(value: MaskBorderModeProperty): Self = StObject.set(x, "mask-border-mode", value.asInstanceOf[js.Any])
    
    inline def `setMask-border-modeUndefined`: Self = StObject.set(x, "mask-border-mode", js.undefined)
    
    inline def `setMask-border-outset`(value: MaskBorderOutsetProperty[TLength]): Self = StObject.set(x, "mask-border-outset", value.asInstanceOf[js.Any])
    
    inline def `setMask-border-outsetUndefined`: Self = StObject.set(x, "mask-border-outset", js.undefined)
    
    inline def `setMask-border-repeat`(value: MaskBorderRepeatProperty): Self = StObject.set(x, "mask-border-repeat", value.asInstanceOf[js.Any])
    
    inline def `setMask-border-repeatUndefined`: Self = StObject.set(x, "mask-border-repeat", js.undefined)
    
    inline def `setMask-border-slice`(value: MaskBorderSliceProperty): Self = StObject.set(x, "mask-border-slice", value.asInstanceOf[js.Any])
    
    inline def `setMask-border-sliceUndefined`: Self = StObject.set(x, "mask-border-slice", js.undefined)
    
    inline def `setMask-border-source`(value: MaskBorderSourceProperty): Self = StObject.set(x, "mask-border-source", value.asInstanceOf[js.Any])
    
    inline def `setMask-border-sourceUndefined`: Self = StObject.set(x, "mask-border-source", js.undefined)
    
    inline def `setMask-border-width`(value: MaskBorderWidthProperty[TLength]): Self = StObject.set(x, "mask-border-width", value.asInstanceOf[js.Any])
    
    inline def `setMask-border-widthUndefined`: Self = StObject.set(x, "mask-border-width", js.undefined)
    
    inline def `setMask-clip`(value: MaskClipProperty): Self = StObject.set(x, "mask-clip", value.asInstanceOf[js.Any])
    
    inline def `setMask-clipUndefined`: Self = StObject.set(x, "mask-clip", js.undefined)
    
    inline def `setMask-composite`(value: MaskCompositeProperty): Self = StObject.set(x, "mask-composite", value.asInstanceOf[js.Any])
    
    inline def `setMask-compositeUndefined`: Self = StObject.set(x, "mask-composite", js.undefined)
    
    inline def `setMask-image`(value: MaskImageProperty): Self = StObject.set(x, "mask-image", value.asInstanceOf[js.Any])
    
    inline def `setMask-imageUndefined`: Self = StObject.set(x, "mask-image", js.undefined)
    
    inline def `setMask-mode`(value: MaskModeProperty): Self = StObject.set(x, "mask-mode", value.asInstanceOf[js.Any])
    
    inline def `setMask-modeUndefined`: Self = StObject.set(x, "mask-mode", js.undefined)
    
    inline def `setMask-origin`(value: MaskOriginProperty): Self = StObject.set(x, "mask-origin", value.asInstanceOf[js.Any])
    
    inline def `setMask-originUndefined`: Self = StObject.set(x, "mask-origin", js.undefined)
    
    inline def `setMask-position`(value: MaskPositionProperty[TLength]): Self = StObject.set(x, "mask-position", value.asInstanceOf[js.Any])
    
    inline def `setMask-positionUndefined`: Self = StObject.set(x, "mask-position", js.undefined)
    
    inline def `setMask-repeat`(value: MaskRepeatProperty): Self = StObject.set(x, "mask-repeat", value.asInstanceOf[js.Any])
    
    inline def `setMask-repeatUndefined`: Self = StObject.set(x, "mask-repeat", js.undefined)
    
    inline def `setMask-size`(value: MaskSizeProperty[TLength]): Self = StObject.set(x, "mask-size", value.asInstanceOf[js.Any])
    
    inline def `setMask-sizeUndefined`: Self = StObject.set(x, "mask-size", js.undefined)
    
    inline def `setMask-type`(value: MaskTypeProperty): Self = StObject.set(x, "mask-type", value.asInstanceOf[js.Any])
    
    inline def `setMask-typeUndefined`: Self = StObject.set(x, "mask-type", js.undefined)
    
    inline def `setMax-block-size`(value: MaxBlockSizeProperty[TLength]): Self = StObject.set(x, "max-block-size", value.asInstanceOf[js.Any])
    
    inline def `setMax-block-sizeUndefined`: Self = StObject.set(x, "max-block-size", js.undefined)
    
    inline def `setMax-height`(value: MaxHeightProperty[TLength]): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    inline def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    inline def `setMax-inline-size`(value: MaxInlineSizeProperty[TLength]): Self = StObject.set(x, "max-inline-size", value.asInstanceOf[js.Any])
    
    inline def `setMax-inline-sizeUndefined`: Self = StObject.set(x, "max-inline-size", js.undefined)
    
    inline def `setMax-lines`(value: MaxLinesProperty): Self = StObject.set(x, "max-lines", value.asInstanceOf[js.Any])
    
    inline def `setMax-linesUndefined`: Self = StObject.set(x, "max-lines", js.undefined)
    
    inline def `setMax-width`(value: MaxWidthProperty[TLength]): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    inline def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    inline def `setMin-block-size`(value: MinBlockSizeProperty[TLength]): Self = StObject.set(x, "min-block-size", value.asInstanceOf[js.Any])
    
    inline def `setMin-block-sizeUndefined`: Self = StObject.set(x, "min-block-size", js.undefined)
    
    inline def `setMin-height`(value: MinHeightProperty[TLength]): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    inline def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    inline def `setMin-inline-size`(value: MinInlineSizeProperty[TLength]): Self = StObject.set(x, "min-inline-size", value.asInstanceOf[js.Any])
    
    inline def `setMin-inline-sizeUndefined`: Self = StObject.set(x, "min-inline-size", js.undefined)
    
    inline def `setMin-width`(value: MinWidthProperty[TLength]): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
    
    inline def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
    
    inline def `setMix-blend-mode`(value: MixBlendModeProperty): Self = StObject.set(x, "mix-blend-mode", value.asInstanceOf[js.Any])
    
    inline def `setMix-blend-modeUndefined`: Self = StObject.set(x, "mix-blend-mode", js.undefined)
    
    inline def `setMotion-distance`(value: OffsetDistanceProperty[TLength]): Self = StObject.set(x, "motion-distance", value.asInstanceOf[js.Any])
    
    inline def `setMotion-distanceUndefined`: Self = StObject.set(x, "motion-distance", js.undefined)
    
    inline def `setMotion-path`(value: OffsetPathProperty): Self = StObject.set(x, "motion-path", value.asInstanceOf[js.Any])
    
    inline def `setMotion-pathUndefined`: Self = StObject.set(x, "motion-path", js.undefined)
    
    inline def `setMotion-rotation`(value: OffsetRotateProperty): Self = StObject.set(x, "motion-rotation", value.asInstanceOf[js.Any])
    
    inline def `setMotion-rotationUndefined`: Self = StObject.set(x, "motion-rotation", js.undefined)
    
    inline def `setObject-fit`(value: ObjectFitProperty): Self = StObject.set(x, "object-fit", value.asInstanceOf[js.Any])
    
    inline def `setObject-fitUndefined`: Self = StObject.set(x, "object-fit", js.undefined)
    
    inline def `setObject-position`(value: ObjectPositionProperty[TLength]): Self = StObject.set(x, "object-position", value.asInstanceOf[js.Any])
    
    inline def `setObject-positionUndefined`: Self = StObject.set(x, "object-position", js.undefined)
    
    inline def `setOffset-anchor`(value: OffsetAnchorProperty[TLength]): Self = StObject.set(x, "offset-anchor", value.asInstanceOf[js.Any])
    
    inline def `setOffset-anchorUndefined`: Self = StObject.set(x, "offset-anchor", js.undefined)
    
    inline def `setOffset-distance`(value: OffsetDistanceProperty[TLength]): Self = StObject.set(x, "offset-distance", value.asInstanceOf[js.Any])
    
    inline def `setOffset-distanceUndefined`: Self = StObject.set(x, "offset-distance", js.undefined)
    
    inline def `setOffset-path`(value: OffsetPathProperty): Self = StObject.set(x, "offset-path", value.asInstanceOf[js.Any])
    
    inline def `setOffset-pathUndefined`: Self = StObject.set(x, "offset-path", js.undefined)
    
    inline def `setOffset-position`(value: OffsetPositionProperty[TLength]): Self = StObject.set(x, "offset-position", value.asInstanceOf[js.Any])
    
    inline def `setOffset-positionUndefined`: Self = StObject.set(x, "offset-position", js.undefined)
    
    inline def `setOffset-rotate`(value: OffsetRotateProperty): Self = StObject.set(x, "offset-rotate", value.asInstanceOf[js.Any])
    
    inline def `setOffset-rotateUndefined`: Self = StObject.set(x, "offset-rotate", js.undefined)
    
    inline def `setOffset-rotation`(value: OffsetRotateProperty): Self = StObject.set(x, "offset-rotation", value.asInstanceOf[js.Any])
    
    inline def `setOffset-rotationUndefined`: Self = StObject.set(x, "offset-rotation", js.undefined)
    
    inline def setOpacity(value: GlobalsNumber): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOrder(value: GlobalsNumber): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrphans(value: GlobalsNumber): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
    
    inline def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
    
    inline def `setOutline-color`(value: OutlineColorProperty): Self = StObject.set(x, "outline-color", value.asInstanceOf[js.Any])
    
    inline def `setOutline-colorUndefined`: Self = StObject.set(x, "outline-color", js.undefined)
    
    inline def `setOutline-offset`(value: OutlineOffsetProperty[TLength]): Self = StObject.set(x, "outline-offset", value.asInstanceOf[js.Any])
    
    inline def `setOutline-offsetUndefined`: Self = StObject.set(x, "outline-offset", js.undefined)
    
    inline def `setOutline-style`(value: OutlineStyleProperty): Self = StObject.set(x, "outline-style", value.asInstanceOf[js.Any])
    
    inline def `setOutline-styleUndefined`: Self = StObject.set(x, "outline-style", js.undefined)
    
    inline def `setOutline-width`(value: OutlineWidthProperty[TLength]): Self = StObject.set(x, "outline-width", value.asInstanceOf[js.Any])
    
    inline def `setOutline-widthUndefined`: Self = StObject.set(x, "outline-width", js.undefined)
    
    inline def setOverflow(value: OverflowProperty): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-anchor`(value: OverflowAnchorProperty): Self = StObject.set(x, "overflow-anchor", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-anchorUndefined`: Self = StObject.set(x, "overflow-anchor", js.undefined)
    
    inline def `setOverflow-block`(value: OverflowBlockProperty): Self = StObject.set(x, "overflow-block", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-blockUndefined`: Self = StObject.set(x, "overflow-block", js.undefined)
    
    inline def `setOverflow-clip-box`(value: OverflowClipBoxProperty): Self = StObject.set(x, "overflow-clip-box", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-clip-boxUndefined`: Self = StObject.set(x, "overflow-clip-box", js.undefined)
    
    inline def `setOverflow-inline`(value: OverflowInlineProperty): Self = StObject.set(x, "overflow-inline", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-inlineUndefined`: Self = StObject.set(x, "overflow-inline", js.undefined)
    
    inline def `setOverflow-wrap`(value: OverflowWrapProperty): Self = StObject.set(x, "overflow-wrap", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-wrapUndefined`: Self = StObject.set(x, "overflow-wrap", js.undefined)
    
    inline def `setOverflow-x`(value: OverflowXProperty): Self = StObject.set(x, "overflow-x", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-xUndefined`: Self = StObject.set(x, "overflow-x", js.undefined)
    
    inline def `setOverflow-y`(value: OverflowYProperty): Self = StObject.set(x, "overflow-y", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-yUndefined`: Self = StObject.set(x, "overflow-y", js.undefined)
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def `setOverscroll-behavior`(value: OverscrollBehaviorProperty): Self = StObject.set(x, "overscroll-behavior", value.asInstanceOf[js.Any])
    
    inline def `setOverscroll-behavior-x`(value: OverscrollBehaviorXProperty): Self = StObject.set(x, "overscroll-behavior-x", value.asInstanceOf[js.Any])
    
    inline def `setOverscroll-behavior-xUndefined`: Self = StObject.set(x, "overscroll-behavior-x", js.undefined)
    
    inline def `setOverscroll-behavior-y`(value: OverscrollBehaviorYProperty): Self = StObject.set(x, "overscroll-behavior-y", value.asInstanceOf[js.Any])
    
    inline def `setOverscroll-behavior-yUndefined`: Self = StObject.set(x, "overscroll-behavior-y", js.undefined)
    
    inline def `setOverscroll-behaviorUndefined`: Self = StObject.set(x, "overscroll-behavior", js.undefined)
    
    inline def `setPadding-block`(value: PaddingBlockProperty[TLength]): Self = StObject.set(x, "padding-block", value.asInstanceOf[js.Any])
    
    inline def `setPadding-block-end`(value: PaddingBlockEndProperty[TLength]): Self = StObject.set(x, "padding-block-end", value.asInstanceOf[js.Any])
    
    inline def `setPadding-block-endUndefined`: Self = StObject.set(x, "padding-block-end", js.undefined)
    
    inline def `setPadding-block-start`(value: PaddingBlockStartProperty[TLength]): Self = StObject.set(x, "padding-block-start", value.asInstanceOf[js.Any])
    
    inline def `setPadding-block-startUndefined`: Self = StObject.set(x, "padding-block-start", js.undefined)
    
    inline def `setPadding-blockUndefined`: Self = StObject.set(x, "padding-block", js.undefined)
    
    inline def `setPadding-bottom`(value: PaddingBottomProperty[TLength]): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    inline def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
    
    inline def `setPadding-inline`(value: PaddingInlineProperty[TLength]): Self = StObject.set(x, "padding-inline", value.asInstanceOf[js.Any])
    
    inline def `setPadding-inline-end`(value: PaddingInlineEndProperty[TLength]): Self = StObject.set(x, "padding-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setPadding-inline-endUndefined`: Self = StObject.set(x, "padding-inline-end", js.undefined)
    
    inline def `setPadding-inline-start`(value: PaddingInlineStartProperty[TLength]): Self = StObject.set(x, "padding-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setPadding-inline-startUndefined`: Self = StObject.set(x, "padding-inline-start", js.undefined)
    
    inline def `setPadding-inlineUndefined`: Self = StObject.set(x, "padding-inline", js.undefined)
    
    inline def `setPadding-left`(value: PaddingLeftProperty[TLength]): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
    
    inline def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
    
    inline def `setPadding-right`(value: PaddingRightProperty[TLength]): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    
    inline def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    
    inline def `setPadding-top`(value: PaddingTopProperty[TLength]): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
    
    inline def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
    
    inline def `setPage-break-after`(value: PageBreakAfterProperty): Self = StObject.set(x, "page-break-after", value.asInstanceOf[js.Any])
    
    inline def `setPage-break-afterUndefined`: Self = StObject.set(x, "page-break-after", js.undefined)
    
    inline def `setPage-break-before`(value: PageBreakBeforeProperty): Self = StObject.set(x, "page-break-before", value.asInstanceOf[js.Any])
    
    inline def `setPage-break-beforeUndefined`: Self = StObject.set(x, "page-break-before", js.undefined)
    
    inline def `setPage-break-inside`(value: PageBreakInsideProperty): Self = StObject.set(x, "page-break-inside", value.asInstanceOf[js.Any])
    
    inline def `setPage-break-insideUndefined`: Self = StObject.set(x, "page-break-inside", js.undefined)
    
    inline def `setPaint-order`(value: PaintOrderProperty): Self = StObject.set(x, "paint-order", value.asInstanceOf[js.Any])
    
    inline def `setPaint-orderUndefined`: Self = StObject.set(x, "paint-order", js.undefined)
    
    inline def setPerspective(value: PerspectiveProperty[TLength]): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    inline def `setPerspective-origin`(value: PerspectiveOriginProperty[TLength]): Self = StObject.set(x, "perspective-origin", value.asInstanceOf[js.Any])
    
    inline def `setPerspective-originUndefined`: Self = StObject.set(x, "perspective-origin", js.undefined)
    
    inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    
    inline def `setPlace-content`(value: PlaceContentProperty): Self = StObject.set(x, "place-content", value.asInstanceOf[js.Any])
    
    inline def `setPlace-contentUndefined`: Self = StObject.set(x, "place-content", js.undefined)
    
    inline def `setPointer-events`(value: PointerEventsProperty): Self = StObject.set(x, "pointer-events", value.asInstanceOf[js.Any])
    
    inline def `setPointer-eventsUndefined`: Self = StObject.set(x, "pointer-events", js.undefined)
    
    inline def setPosition(value: PositionProperty): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setQuotes(value: QuotesProperty): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
    
    inline def setResize(value: ResizeProperty): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setRight(value: RightProperty[TLength]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRotate(value: RotateProperty): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def `setRow-gap`(value: RowGapProperty[TLength]): Self = StObject.set(x, "row-gap", value.asInstanceOf[js.Any])
    
    inline def `setRow-gapUndefined`: Self = StObject.set(x, "row-gap", js.undefined)
    
    inline def `setRuby-align`(value: RubyAlignProperty): Self = StObject.set(x, "ruby-align", value.asInstanceOf[js.Any])
    
    inline def `setRuby-alignUndefined`: Self = StObject.set(x, "ruby-align", js.undefined)
    
    inline def `setRuby-merge`(value: RubyMergeProperty): Self = StObject.set(x, "ruby-merge", value.asInstanceOf[js.Any])
    
    inline def `setRuby-mergeUndefined`: Self = StObject.set(x, "ruby-merge", js.undefined)
    
    inline def `setRuby-position`(value: RubyPositionProperty): Self = StObject.set(x, "ruby-position", value.asInstanceOf[js.Any])
    
    inline def `setRuby-positionUndefined`: Self = StObject.set(x, "ruby-position", js.undefined)
    
    inline def setScale(value: ScaleProperty): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def `setScroll-behavior`(value: ScrollBehaviorProperty): Self = StObject.set(x, "scroll-behavior", value.asInstanceOf[js.Any])
    
    inline def `setScroll-behaviorUndefined`: Self = StObject.set(x, "scroll-behavior", js.undefined)
    
    inline def `setScroll-margin`(value: ScrollMarginProperty[TLength]): Self = StObject.set(x, "scroll-margin", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-block`(value: ScrollMarginBlockProperty[TLength]): Self = StObject.set(x, "scroll-margin-block", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-block-end`(value: ScrollMarginBlockEndProperty[TLength]): Self = StObject.set(x, "scroll-margin-block-end", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-block-endUndefined`: Self = StObject.set(x, "scroll-margin-block-end", js.undefined)
    
    inline def `setScroll-margin-block-start`(value: ScrollMarginBlockStartProperty[TLength]): Self = StObject.set(x, "scroll-margin-block-start", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-block-startUndefined`: Self = StObject.set(x, "scroll-margin-block-start", js.undefined)
    
    inline def `setScroll-margin-blockUndefined`: Self = StObject.set(x, "scroll-margin-block", js.undefined)
    
    inline def `setScroll-margin-bottom`(value: ScrollMarginBottomProperty[TLength]): Self = StObject.set(x, "scroll-margin-bottom", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-bottomUndefined`: Self = StObject.set(x, "scroll-margin-bottom", js.undefined)
    
    inline def `setScroll-margin-inline-end`(value: ScrollMarginInlineEndProperty[TLength]): Self = StObject.set(x, "scroll-margin-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-inline-endUndefined`: Self = StObject.set(x, "scroll-margin-inline-end", js.undefined)
    
    inline def `setScroll-margin-inline-start`(value: ScrollMarginInlineStartProperty[TLength]): Self = StObject.set(x, "scroll-margin-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-inline-startUndefined`: Self = StObject.set(x, "scroll-margin-inline-start", js.undefined)
    
    inline def `setScroll-margin-left`(value: ScrollMarginLeftProperty[TLength]): Self = StObject.set(x, "scroll-margin-left", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-leftUndefined`: Self = StObject.set(x, "scroll-margin-left", js.undefined)
    
    inline def `setScroll-margin-right`(value: ScrollMarginRightProperty[TLength]): Self = StObject.set(x, "scroll-margin-right", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-rightUndefined`: Self = StObject.set(x, "scroll-margin-right", js.undefined)
    
    inline def `setScroll-margin-top`(value: ScrollMarginTopProperty[TLength]): Self = StObject.set(x, "scroll-margin-top", value.asInstanceOf[js.Any])
    
    inline def `setScroll-margin-topUndefined`: Self = StObject.set(x, "scroll-margin-top", js.undefined)
    
    inline def `setScroll-marginUndefined`: Self = StObject.set(x, "scroll-margin", js.undefined)
    
    inline def `setScroll-padding`(value: ScrollPaddingProperty[TLength]): Self = StObject.set(x, "scroll-padding", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-block`(value: ScrollPaddingBlockProperty[TLength]): Self = StObject.set(x, "scroll-padding-block", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-block-end`(value: ScrollPaddingBlockEndProperty[TLength]): Self = StObject.set(x, "scroll-padding-block-end", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-block-endUndefined`: Self = StObject.set(x, "scroll-padding-block-end", js.undefined)
    
    inline def `setScroll-padding-block-start`(value: ScrollPaddingBlockStartProperty[TLength]): Self = StObject.set(x, "scroll-padding-block-start", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-block-startUndefined`: Self = StObject.set(x, "scroll-padding-block-start", js.undefined)
    
    inline def `setScroll-padding-blockUndefined`: Self = StObject.set(x, "scroll-padding-block", js.undefined)
    
    inline def `setScroll-padding-bottom`(value: ScrollPaddingBottomProperty[TLength]): Self = StObject.set(x, "scroll-padding-bottom", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-bottomUndefined`: Self = StObject.set(x, "scroll-padding-bottom", js.undefined)
    
    inline def `setScroll-padding-inline`(value: ScrollPaddingInlineProperty[TLength]): Self = StObject.set(x, "scroll-padding-inline", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-inline-end`(value: ScrollPaddingInlineEndProperty[TLength]): Self = StObject.set(x, "scroll-padding-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-inline-endUndefined`: Self = StObject.set(x, "scroll-padding-inline-end", js.undefined)
    
    inline def `setScroll-padding-inline-start`(value: ScrollPaddingInlineStartProperty[TLength]): Self = StObject.set(x, "scroll-padding-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-inline-startUndefined`: Self = StObject.set(x, "scroll-padding-inline-start", js.undefined)
    
    inline def `setScroll-padding-inlineUndefined`: Self = StObject.set(x, "scroll-padding-inline", js.undefined)
    
    inline def `setScroll-padding-left`(value: ScrollPaddingLeftProperty[TLength]): Self = StObject.set(x, "scroll-padding-left", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-leftUndefined`: Self = StObject.set(x, "scroll-padding-left", js.undefined)
    
    inline def `setScroll-padding-right`(value: ScrollPaddingRightProperty[TLength]): Self = StObject.set(x, "scroll-padding-right", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-rightUndefined`: Self = StObject.set(x, "scroll-padding-right", js.undefined)
    
    inline def `setScroll-padding-top`(value: ScrollPaddingTopProperty[TLength]): Self = StObject.set(x, "scroll-padding-top", value.asInstanceOf[js.Any])
    
    inline def `setScroll-padding-topUndefined`: Self = StObject.set(x, "scroll-padding-top", js.undefined)
    
    inline def `setScroll-paddingUndefined`: Self = StObject.set(x, "scroll-padding", js.undefined)
    
    inline def `setScroll-snap-align`(value: ScrollSnapAlignProperty): Self = StObject.set(x, "scroll-snap-align", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-alignUndefined`: Self = StObject.set(x, "scroll-snap-align", js.undefined)
    
    inline def `setScroll-snap-type`(value: ScrollSnapTypeProperty): Self = StObject.set(x, "scroll-snap-type", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-typeUndefined`: Self = StObject.set(x, "scroll-snap-type", js.undefined)
    
    inline def `setScrollbar-color`(value: ScrollbarColorProperty): Self = StObject.set(x, "scrollbar-color", value.asInstanceOf[js.Any])
    
    inline def `setScrollbar-colorUndefined`: Self = StObject.set(x, "scrollbar-color", js.undefined)
    
    inline def `setScrollbar-width`(value: ScrollbarWidthProperty): Self = StObject.set(x, "scrollbar-width", value.asInstanceOf[js.Any])
    
    inline def `setScrollbar-widthUndefined`: Self = StObject.set(x, "scrollbar-width", js.undefined)
    
    inline def `setShape-image-threshold`(value: GlobalsNumber): Self = StObject.set(x, "shape-image-threshold", value.asInstanceOf[js.Any])
    
    inline def `setShape-image-thresholdUndefined`: Self = StObject.set(x, "shape-image-threshold", js.undefined)
    
    inline def `setShape-margin`(value: ShapeMarginProperty[TLength]): Self = StObject.set(x, "shape-margin", value.asInstanceOf[js.Any])
    
    inline def `setShape-marginUndefined`: Self = StObject.set(x, "shape-margin", js.undefined)
    
    inline def `setShape-outside`(value: ShapeOutsideProperty): Self = StObject.set(x, "shape-outside", value.asInstanceOf[js.Any])
    
    inline def `setShape-outsideUndefined`: Self = StObject.set(x, "shape-outside", js.undefined)
    
    inline def `setTab-size`(value: TabSizeProperty[TLength]): Self = StObject.set(x, "tab-size", value.asInstanceOf[js.Any])
    
    inline def `setTab-sizeUndefined`: Self = StObject.set(x, "tab-size", js.undefined)
    
    inline def `setTable-layout`(value: TableLayoutProperty): Self = StObject.set(x, "table-layout", value.asInstanceOf[js.Any])
    
    inline def `setTable-layoutUndefined`: Self = StObject.set(x, "table-layout", js.undefined)
    
    inline def `setText-align`(value: TextAlignProperty): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
    
    inline def `setText-align-last`(value: TextAlignLastProperty): Self = StObject.set(x, "text-align-last", value.asInstanceOf[js.Any])
    
    inline def `setText-align-lastUndefined`: Self = StObject.set(x, "text-align-last", js.undefined)
    
    inline def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
    
    inline def `setText-combine-upright`(value: TextCombineUprightProperty): Self = StObject.set(x, "text-combine-upright", value.asInstanceOf[js.Any])
    
    inline def `setText-combine-uprightUndefined`: Self = StObject.set(x, "text-combine-upright", js.undefined)
    
    inline def `setText-decoration-color`(value: TextDecorationColorProperty): Self = StObject.set(x, "text-decoration-color", value.asInstanceOf[js.Any])
    
    inline def `setText-decoration-colorUndefined`: Self = StObject.set(x, "text-decoration-color", js.undefined)
    
    inline def `setText-decoration-line`(value: TextDecorationLineProperty): Self = StObject.set(x, "text-decoration-line", value.asInstanceOf[js.Any])
    
    inline def `setText-decoration-lineUndefined`: Self = StObject.set(x, "text-decoration-line", js.undefined)
    
    inline def `setText-decoration-skip`(value: TextDecorationSkipProperty): Self = StObject.set(x, "text-decoration-skip", value.asInstanceOf[js.Any])
    
    inline def `setText-decoration-skip-ink`(value: TextDecorationSkipInkProperty): Self = StObject.set(x, "text-decoration-skip-ink", value.asInstanceOf[js.Any])
    
    inline def `setText-decoration-skip-inkUndefined`: Self = StObject.set(x, "text-decoration-skip-ink", js.undefined)
    
    inline def `setText-decoration-skipUndefined`: Self = StObject.set(x, "text-decoration-skip", js.undefined)
    
    inline def `setText-decoration-style`(value: TextDecorationStyleProperty): Self = StObject.set(x, "text-decoration-style", value.asInstanceOf[js.Any])
    
    inline def `setText-decoration-styleUndefined`: Self = StObject.set(x, "text-decoration-style", js.undefined)
    
    inline def `setText-emphasis-color`(value: TextEmphasisColorProperty): Self = StObject.set(x, "text-emphasis-color", value.asInstanceOf[js.Any])
    
    inline def `setText-emphasis-colorUndefined`: Self = StObject.set(x, "text-emphasis-color", js.undefined)
    
    inline def `setText-emphasis-position`(value: GlobalsString): Self = StObject.set(x, "text-emphasis-position", value.asInstanceOf[js.Any])
    
    inline def `setText-emphasis-positionUndefined`: Self = StObject.set(x, "text-emphasis-position", js.undefined)
    
    inline def `setText-emphasis-style`(value: TextEmphasisStyleProperty): Self = StObject.set(x, "text-emphasis-style", value.asInstanceOf[js.Any])
    
    inline def `setText-emphasis-styleUndefined`: Self = StObject.set(x, "text-emphasis-style", js.undefined)
    
    inline def `setText-indent`(value: TextIndentProperty[TLength]): Self = StObject.set(x, "text-indent", value.asInstanceOf[js.Any])
    
    inline def `setText-indentUndefined`: Self = StObject.set(x, "text-indent", js.undefined)
    
    inline def `setText-justify`(value: TextJustifyProperty): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
    
    inline def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
    
    inline def `setText-orientation`(value: TextOrientationProperty): Self = StObject.set(x, "text-orientation", value.asInstanceOf[js.Any])
    
    inline def `setText-orientationUndefined`: Self = StObject.set(x, "text-orientation", js.undefined)
    
    inline def `setText-overflow`(value: TextOverflowProperty): Self = StObject.set(x, "text-overflow", value.asInstanceOf[js.Any])
    
    inline def `setText-overflowUndefined`: Self = StObject.set(x, "text-overflow", js.undefined)
    
    inline def `setText-rendering`(value: TextRenderingProperty): Self = StObject.set(x, "text-rendering", value.asInstanceOf[js.Any])
    
    inline def `setText-renderingUndefined`: Self = StObject.set(x, "text-rendering", js.undefined)
    
    inline def `setText-shadow`(value: TextShadowProperty): Self = StObject.set(x, "text-shadow", value.asInstanceOf[js.Any])
    
    inline def `setText-shadowUndefined`: Self = StObject.set(x, "text-shadow", js.undefined)
    
    inline def `setText-size-adjust`(value: TextSizeAdjustProperty): Self = StObject.set(x, "text-size-adjust", value.asInstanceOf[js.Any])
    
    inline def `setText-size-adjustUndefined`: Self = StObject.set(x, "text-size-adjust", js.undefined)
    
    inline def `setText-transform`(value: TextTransformProperty): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    inline def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    inline def `setText-underline-position`(value: TextUnderlinePositionProperty): Self = StObject.set(x, "text-underline-position", value.asInstanceOf[js.Any])
    
    inline def `setText-underline-positionUndefined`: Self = StObject.set(x, "text-underline-position", js.undefined)
    
    inline def setTop(value: TopProperty[TLength]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def `setTouch-action`(value: TouchActionProperty): Self = StObject.set(x, "touch-action", value.asInstanceOf[js.Any])
    
    inline def `setTouch-actionUndefined`: Self = StObject.set(x, "touch-action", js.undefined)
    
    inline def setTransform(value: TransformProperty): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def `setTransform-box`(value: TransformBoxProperty): Self = StObject.set(x, "transform-box", value.asInstanceOf[js.Any])
    
    inline def `setTransform-boxUndefined`: Self = StObject.set(x, "transform-box", js.undefined)
    
    inline def `setTransform-origin`(value: TransformOriginProperty[TLength]): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
    
    inline def `setTransform-originUndefined`: Self = StObject.set(x, "transform-origin", js.undefined)
    
    inline def `setTransform-style`(value: TransformStyleProperty): Self = StObject.set(x, "transform-style", value.asInstanceOf[js.Any])
    
    inline def `setTransform-styleUndefined`: Self = StObject.set(x, "transform-style", js.undefined)
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def `setTransition-delay`(value: GlobalsString): Self = StObject.set(x, "transition-delay", value.asInstanceOf[js.Any])
    
    inline def `setTransition-delayUndefined`: Self = StObject.set(x, "transition-delay", js.undefined)
    
    inline def `setTransition-duration`(value: GlobalsString): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
    
    inline def `setTransition-durationUndefined`: Self = StObject.set(x, "transition-duration", js.undefined)
    
    inline def `setTransition-property`(value: TransitionPropertyProperty): Self = StObject.set(x, "transition-property", value.asInstanceOf[js.Any])
    
    inline def `setTransition-propertyUndefined`: Self = StObject.set(x, "transition-property", js.undefined)
    
    inline def `setTransition-timing-function`(value: TransitionTimingFunctionProperty): Self = StObject.set(x, "transition-timing-function", value.asInstanceOf[js.Any])
    
    inline def `setTransition-timing-functionUndefined`: Self = StObject.set(x, "transition-timing-function", js.undefined)
    
    inline def setTranslate(value: TranslateProperty[TLength]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def `setUnicode-bidi`(value: UnicodeBidiProperty): Self = StObject.set(x, "unicode-bidi", value.asInstanceOf[js.Any])
    
    inline def `setUnicode-bidiUndefined`: Self = StObject.set(x, "unicode-bidi", js.undefined)
    
    inline def `setUser-select`(value: UserSelectProperty): Self = StObject.set(x, "user-select", value.asInstanceOf[js.Any])
    
    inline def `setUser-selectUndefined`: Self = StObject.set(x, "user-select", js.undefined)
    
    inline def `setVertical-align`(value: VerticalAlignProperty[TLength]): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
    
    inline def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
    
    inline def setVisibility(value: VisibilityProperty): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def `setWhite-space`(value: WhiteSpaceProperty): Self = StObject.set(x, "white-space", value.asInstanceOf[js.Any])
    
    inline def `setWhite-spaceUndefined`: Self = StObject.set(x, "white-space", js.undefined)
    
    inline def setWidows(value: GlobalsNumber): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
    
    inline def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
    
    inline def setWidth(value: WidthProperty[TLength]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def `setWill-change`(value: WillChangeProperty): Self = StObject.set(x, "will-change", value.asInstanceOf[js.Any])
    
    inline def `setWill-changeUndefined`: Self = StObject.set(x, "will-change", js.undefined)
    
    inline def `setWord-break`(value: WordBreakProperty): Self = StObject.set(x, "word-break", value.asInstanceOf[js.Any])
    
    inline def `setWord-breakUndefined`: Self = StObject.set(x, "word-break", js.undefined)
    
    inline def `setWord-spacing`(value: WordSpacingProperty[TLength]): Self = StObject.set(x, "word-spacing", value.asInstanceOf[js.Any])
    
    inline def `setWord-spacingUndefined`: Self = StObject.set(x, "word-spacing", js.undefined)
    
    inline def `setWord-wrap`(value: WordWrapProperty): Self = StObject.set(x, "word-wrap", value.asInstanceOf[js.Any])
    
    inline def `setWord-wrapUndefined`: Self = StObject.set(x, "word-wrap", js.undefined)
    
    inline def `setWriting-mode`(value: WritingModeProperty): Self = StObject.set(x, "writing-mode", value.asInstanceOf[js.Any])
    
    inline def `setWriting-modeUndefined`: Self = StObject.set(x, "writing-mode", js.undefined)
    
    inline def `setZ-index`(value: ZIndexProperty): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    inline def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
    
    inline def setZoom(value: ZoomProperty): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
