package typingsJapgolly.trtcJsSdk.mod

import typingsJapgolly.trtcJsSdk.trtcJsSdkStrings.auxiliary
import typingsJapgolly.trtcJsSdk.trtcJsSdkStrings.main
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteStream
  extends StObject
     with Stream {
  
  /**
    * 获取远端流类型,主要用于判断一个远端流是主音视频流还是辅路视频流，辅路视频流通常是一个屏幕分享流。
    * @returns 远端流类型
    * - `main` 主音视频流
    * - `auxiliary` 辅助视频流，通常是一个屏幕分享流
    */
  def getType(): main | auxiliary = js.native
}
