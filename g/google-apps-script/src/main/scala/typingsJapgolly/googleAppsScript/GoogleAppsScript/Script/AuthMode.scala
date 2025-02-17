package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuthMode extends StObject
/**
  * An enumeration that identifies which categories of authorized services Apps Script is able to
  * execute through a triggered function. These values are exposed in triggered functions as the authMode
  * property of the event parameter, e. For
  * more information, see the guide to the
  * authorization lifecycle for add-ons.
  *
  *     function onOpen(e) {
  *       var menu = SpreadsheetApp.getUi().createAddonMenu();
  *       if (e && e.authMode == ScriptApp.AuthMode.NONE) {
  *         // Add a normal menu item (works in all authorization modes).
  *         menu.addItem('Start workflow', 'startWorkflow');
  *       } else {
  *         // Add a menu item based on properties (doesn't work in AuthMode.NONE).
  *         var properties = PropertiesService.getDocumentProperties();
  *         var workflowStarted = properties.getProperty('workflowStarted');
  *         if (workflowStarted) {
  *           menu.addItem('Check workflow status', 'checkWorkflow');
  *         } else {
  *           menu.addItem('Start workflow', 'startWorkflow');
  *         }
  *         // Record analytics.
  *         UrlFetchApp.fetch('http://www.example.com/analytics?event=open');
  *       }
  *       menu.addToUi();
  *     }
  */
@JSGlobal("GoogleAppsScript.Script.AuthMode")
@js.native
object AuthMode extends StObject {
  
  @js.native
  sealed trait CUSTOM_FUNCTION
    extends StObject
       with AuthMode
  
  @js.native
  sealed trait FULL
    extends StObject
       with AuthMode
  
  @js.native
  sealed trait LIMITED
    extends StObject
       with AuthMode
  
  @js.native
  sealed trait NONE
    extends StObject
       with AuthMode
}
