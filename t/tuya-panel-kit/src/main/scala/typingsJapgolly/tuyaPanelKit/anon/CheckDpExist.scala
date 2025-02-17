package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.std.Record
import typingsJapgolly.tuyaPanelKit.mod.DevInfo
import typingsJapgolly.tuyaPanelKit.mod.DpSchema
import typingsJapgolly.tuyaPanelKit.mod.DpType
import typingsJapgolly.tuyaPanelKit.mod.DpValue
import typingsJapgolly.tuyaPanelKit.mod.I18NLanMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckDpExist extends StObject {
  
  def checkDpExist(idOrCode: String): Boolean = js.native
  def checkDpExist(idOrCode: Double): Boolean = js.native
  
  def deleteDeviceInfo(): js.Promise[Unit] = js.native
  
  def formatDps(data: Record[Double, Any]): Record[String, Any] = js.native
  
  def getBleManagerState(): js.Promise[Boolean] = js.native
  
  def getBluetoothState(): js.Promise[Double] = js.native
  
  def getDeviceInfo(): js.Promise[DevInfo[Record[String, DpType]]] = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  def getDeviceState[S](): js.Promise[S] = js.native
  
  def getDpCodeById(id: String): String = js.native
  def getDpCodeById(id: Double): String = js.native
  
  def getDpCodes(): js.Array[String] = js.native
  
  /**
    * @desc 主动从设备获取 dp 点状态
    */
  def getDpDataFromDevice(idOrCode: String): js.Promise[Unit] = js.native
  def getDpDataFromDevice(idOrCode: Double): js.Promise[Unit] = js.native
  
  def getDpIdByCode(code: String): String = js.native
  
  def getDpSchema(): js.Array[DpSchema] = js.native
  def getDpSchema(code: String): DpSchema = js.native
  
  def getFunConfig(): Record[String, Any] = js.native
  
  /**
    * @deprecated
    */
  def getGState(dp: String): Any = js.native
  
  def getState(): Any = js.native
  def getState(dp: String): Any = js.native
  
  def getUnpackPanelInfo(): js.Promise[I18NLanMap] = js.native
  
  def gotoBlePermissions(): Unit = js.native
  
  def gotoDeviceWifiNetworkMonitor(): Unit = js.native
  
  def initDevice(): js.Promise[DevInfo[Record[String, DpType]]] = js.native
  
  def isBleDevice(): Boolean = js.native
  
  def isLocalLAN(): Boolean = js.native
  
  def isMeshDevice(): Boolean = js.native
  
  def isMeshWifiDevice(): Boolean = js.native
  
  def isShareDevice(): Boolean = js.native
  
  def isSigMeshDevice(): Boolean = js.native
  
  def isWifiDevice(): Boolean = js.native
  
  /**
    * @desc 下发 dp 点
    */
  def putDeviceData(cmd: Record[String, Any]): js.Promise[Success] = js.native
  
  /**
    * @desc 局域网下发 dp 点
    */
  def putLocalDpData(cmd: Record[String, Any]): js.Promise[Unit] = js.native
  
  def setDevState(state: Record[String, DpValue]): DevInfo[Record[String, DpType]] = js.native
  
  def setDeviceInfo(d: DevInfo[Record[String, DpType]]): Unit = js.native
  
  /**
    * @deprecated
    */
  def setGState(dp: String, `val`: Any): Any = js.native
  
  def setState(dp: String, `val`: Any): Record[String, Any] = js.native
}
