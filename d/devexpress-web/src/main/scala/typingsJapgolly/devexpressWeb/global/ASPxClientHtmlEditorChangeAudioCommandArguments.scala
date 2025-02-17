package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.CHANGEAUDIO_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorChangeAudioCommandArguments")
@js.native
open class ASPxClientHtmlEditorChangeAudioCommandArguments protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  /* private */ def this(htmlEditor: typingsJapgolly.devexpressWeb.ASPxClientHtmlEditor, selectedElement: Any) = this()
  
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  /* CompleteClass */
  override def GetCommandName(): String = js.native
  
  /**
    * Determines the position of the target media element.
    */
  /* CompleteClass */
  var align: String = js.native
  
  /**
    * Determines if a media file will start playing automatically.
    */
  /* CompleteClass */
  var autoPlay: Boolean = js.native
  
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML "id"</a> attribute of the target media element.
    */
  /* CompleteClass */
  var id: String = js.native
  
  /**
    * Determines if a media file repeats indefinitely, or stops when it reaches the last frame.
    */
  /* CompleteClass */
  var loop: Boolean = js.native
  
  /**
    * Determines how a media file should be loaded when the page loads.
    */
  /* CompleteClass */
  var preloadMode: String = js.native
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  /* CompleteClass */
  var selectedElement: Any = js.native
  
  /**
    * Determines if the media player controls should be displayed.
    */
  /* CompleteClass */
  var showPlayerControls: Boolean = js.native
  
  /**
    * Defines the source of the target media element.
    */
  /* CompleteClass */
  var src: String = js.native
  
  /**
    * Contains the style settings defining the appearance of the target media element.
    */
  /* CompleteClass */
  var styleSettings: typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorCommandStyleSettings = js.native
}
