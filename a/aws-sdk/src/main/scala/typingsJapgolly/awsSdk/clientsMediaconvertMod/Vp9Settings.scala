package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vp9Settings extends StObject {
  
  /**
    * Target bitrate in bits/second. For example, enter five megabits per second as 5000000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max480000000] = js.undefined
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Vp9FramerateControl] = js.undefined
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Vp9FramerateConversionAlgorithm] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * GOP Length (keyframe interval) in frames. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max47185920] = js.undefined
  
  /**
    * Ignore this setting unless you set qualityTuningLevel to MULTI_PASS. Optional. Specify the maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. The default behavior uses twice the target bitrate as the maximum bitrate.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max480000000] = js.undefined
  
  /**
    * Optional. Specify how the service determines the pixel aspect ratio for this output. The default behavior is to use the same pixel aspect ratio as your input video.
    */
  var ParControl: js.UndefOr[Vp9ParControl] = js.undefined
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
    */
  var QualityTuningLevel: js.UndefOr[Vp9QualityTuningLevel] = js.undefined
  
  /**
    * With the VP9 codec, you can use only the variable bitrate (VBR) rate control mode.
    */
  var RateControlMode: js.UndefOr[Vp9RateControlMode] = js.undefined
}
object Vp9Settings {
  
  inline def apply(): Vp9Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vp9Settings]
  }
  
  extension [Self <: Vp9Settings](x: Self) {
    
    inline def setBitrate(value: integerMin1000Max480000000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setFramerateControl(value: Vp9FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    inline def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    inline def setFramerateConversionAlgorithm(value: Vp9FramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setFramerateConversionAlgorithmUndefined: Self = StObject.set(x, "FramerateConversionAlgorithm", js.undefined)
    
    inline def setFramerateDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    inline def setGopSize(value: doubleMin0): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    inline def setHrdBufferSize(value: integerMin0Max47185920): Self = StObject.set(x, "HrdBufferSize", value.asInstanceOf[js.Any])
    
    inline def setHrdBufferSizeUndefined: Self = StObject.set(x, "HrdBufferSize", js.undefined)
    
    inline def setMaxBitrate(value: integerMin1000Max480000000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setParControl(value: Vp9ParControl): Self = StObject.set(x, "ParControl", value.asInstanceOf[js.Any])
    
    inline def setParControlUndefined: Self = StObject.set(x, "ParControl", js.undefined)
    
    inline def setParDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParDenominator", value.asInstanceOf[js.Any])
    
    inline def setParDenominatorUndefined: Self = StObject.set(x, "ParDenominator", js.undefined)
    
    inline def setParNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParNumerator", value.asInstanceOf[js.Any])
    
    inline def setParNumeratorUndefined: Self = StObject.set(x, "ParNumerator", js.undefined)
    
    inline def setQualityTuningLevel(value: Vp9QualityTuningLevel): Self = StObject.set(x, "QualityTuningLevel", value.asInstanceOf[js.Any])
    
    inline def setQualityTuningLevelUndefined: Self = StObject.set(x, "QualityTuningLevel", js.undefined)
    
    inline def setRateControlMode(value: Vp9RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
  }
}
