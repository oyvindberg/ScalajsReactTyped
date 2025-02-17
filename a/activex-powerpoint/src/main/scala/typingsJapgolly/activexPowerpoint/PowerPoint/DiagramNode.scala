package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoDiagramNodeType
import typingsJapgolly.activexOffice.Office.MsoOrgChartLayoutType
import typingsJapgolly.activexOffice.Office.MsoRelativeNodePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramNode extends StObject {
  
  /**
    * @param Office.MsoRelativeNodePosition [Pos=2]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Pos: Unit, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  
  val Application: Any = js.native
  
  val Children: DiagramNodeChildren = js.native
  
  /** @param Office.MsoRelativeNodePosition [Pos=2] */
  def CloneNode(CopyChildren: Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(CopyChildren: Boolean, TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): DiagramNode = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: typingsJapgolly.activexPowerpoint.PowerPoint.Diagram = js.native
  
  var Layout: MsoOrgChartLayoutType = js.native
  
  def MoveNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): Unit = js.native
  
  def NextNode(): DiagramNode = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.DiagramNode_typekey")
  var PowerPointDotDiagramNode_typekey: DiagramNode = js.native
  
  def PrevNode(): DiagramNode = js.native
  
  def ReplaceNode(TargetNode: DiagramNode): Unit = js.native
  
  val Root: DiagramNode = js.native
  
  val Shape: typingsJapgolly.activexPowerpoint.PowerPoint.Shape = js.native
  
  /** @param boolean [SwapChildren=true] */
  def SwapNode(TargetNode: DiagramNode): Unit = js.native
  def SwapNode(TargetNode: DiagramNode, SwapChildren: Boolean): Unit = js.native
  
  val TextShape: typingsJapgolly.activexPowerpoint.PowerPoint.Shape = js.native
  
  def TransferChildren(ReceivingNode: DiagramNode): Unit = js.native
}
