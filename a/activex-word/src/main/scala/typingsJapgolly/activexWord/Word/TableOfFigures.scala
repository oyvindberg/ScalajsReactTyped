package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOfFigures extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var Caption: String
  
  val Creator: Double
  
  def Delete(): Unit
  
  val HeadingStyles: typingsJapgolly.activexWord.Word.HeadingStyles
  
  var HidePageNumbersInWeb: Boolean
  
  var IncludeLabel: Boolean
  
  var IncludePageNumbers: Boolean
  
  var LowerHeadingLevel: Double
  
  val Parent: Any
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  var RightAlignPageNumbers: Boolean
  
  var TabLeader: WdTabLeader
  
  var TableID: String
  
  def Update(): Unit
  
  def UpdatePageNumbers(): Unit
  
  var UpperHeadingLevel: Double
  
  var UseFields: Boolean
  
  var UseHeadingStyles: Boolean
  
  var UseHyperlinks: Boolean
  
  /* private */ @JSName("Word.TableOfFigures_typekey")
  var WordDotTableOfFigures_typekey: TableOfFigures
}
object TableOfFigures {
  
  inline def apply(
    Application: Application,
    Caption: String,
    Creator: Double,
    Delete: Callback,
    HeadingStyles: HeadingStyles,
    HidePageNumbersInWeb: Boolean,
    IncludeLabel: Boolean,
    IncludePageNumbers: Boolean,
    LowerHeadingLevel: Double,
    Parent: Any,
    Range: Range,
    RightAlignPageNumbers: Boolean,
    TabLeader: WdTabLeader,
    TableID: String,
    Update: Callback,
    UpdatePageNumbers: Callback,
    UpperHeadingLevel: Double,
    UseFields: Boolean,
    UseHeadingStyles: Boolean,
    UseHyperlinks: Boolean,
    WordDotTableOfFigures_typekey: TableOfFigures
  ): TableOfFigures = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, HeadingStyles = HeadingStyles.asInstanceOf[js.Any], HidePageNumbersInWeb = HidePageNumbersInWeb.asInstanceOf[js.Any], IncludeLabel = IncludeLabel.asInstanceOf[js.Any], IncludePageNumbers = IncludePageNumbers.asInstanceOf[js.Any], LowerHeadingLevel = LowerHeadingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RightAlignPageNumbers = RightAlignPageNumbers.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], TableID = TableID.asInstanceOf[js.Any], Update = Update.toJsFn, UpdatePageNumbers = UpdatePageNumbers.toJsFn, UpperHeadingLevel = UpperHeadingLevel.asInstanceOf[js.Any], UseFields = UseFields.asInstanceOf[js.Any], UseHeadingStyles = UseHeadingStyles.asInstanceOf[js.Any], UseHyperlinks = UseHyperlinks.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableOfFigures_typekey")(WordDotTableOfFigures_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfFigures]
  }
  
  extension [Self <: TableOfFigures](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setHeadingStyles(value: HeadingStyles): Self = StObject.set(x, "HeadingStyles", value.asInstanceOf[js.Any])
    
    inline def setHidePageNumbersInWeb(value: Boolean): Self = StObject.set(x, "HidePageNumbersInWeb", value.asInstanceOf[js.Any])
    
    inline def setIncludeLabel(value: Boolean): Self = StObject.set(x, "IncludeLabel", value.asInstanceOf[js.Any])
    
    inline def setIncludePageNumbers(value: Boolean): Self = StObject.set(x, "IncludePageNumbers", value.asInstanceOf[js.Any])
    
    inline def setLowerHeadingLevel(value: Double): Self = StObject.set(x, "LowerHeadingLevel", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRightAlignPageNumbers(value: Boolean): Self = StObject.set(x, "RightAlignPageNumbers", value.asInstanceOf[js.Any])
    
    inline def setTabLeader(value: WdTabLeader): Self = StObject.set(x, "TabLeader", value.asInstanceOf[js.Any])
    
    inline def setTableID(value: String): Self = StObject.set(x, "TableID", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "Update", value.toJsFn)
    
    inline def setUpdatePageNumbers(value: Callback): Self = StObject.set(x, "UpdatePageNumbers", value.toJsFn)
    
    inline def setUpperHeadingLevel(value: Double): Self = StObject.set(x, "UpperHeadingLevel", value.asInstanceOf[js.Any])
    
    inline def setUseFields(value: Boolean): Self = StObject.set(x, "UseFields", value.asInstanceOf[js.Any])
    
    inline def setUseHeadingStyles(value: Boolean): Self = StObject.set(x, "UseHeadingStyles", value.asInstanceOf[js.Any])
    
    inline def setUseHyperlinks(value: Boolean): Self = StObject.set(x, "UseHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setWordDotTableOfFigures_typekey(value: TableOfFigures): Self = StObject.set(x, "Word.TableOfFigures_typekey", value.asInstanceOf[js.Any])
  }
}
