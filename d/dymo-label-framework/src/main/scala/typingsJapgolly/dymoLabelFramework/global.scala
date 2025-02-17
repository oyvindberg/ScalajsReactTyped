package typingsJapgolly.dymoLabelFramework

import typingsJapgolly.dymoLabelFramework.anon.ErrorDetails
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.AddPrinterUriCallback
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.CreateLabelRenderParamsXmlParams
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.CreateLabelWriterPrintParamsXmlParams
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.CreateTapePrintParamsXmlParams
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.ILabel
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.ILabelSetRecord
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJob
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatusInfo
import typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrinterInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dymo {
    
    object label {
      
      object framework {
        
        @JSGlobal("dymo.label.framework")
        @js.native
        val ^ : js.Any = js.native
        
        /** Enumeration that specifies where to draw the Intellegent Mail barcode for an Address object. */
        @JSGlobal("dymo.label.framework.AddressBarcodePosition")
        @js.native
        object AddressBarcodePosition extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[
                    typingsJapgolly.dymoLabelFramework.dymo.label.framework.AddressBarcodePosition & Double
                  ] = js.native
          
          /* 0 */ val AboveAddress: typingsJapgolly.dymoLabelFramework.dymo.label.framework.AddressBarcodePosition.AboveAddress & Double = js.native
          
          /* 1 */ val BelowAddress: typingsJapgolly.dymoLabelFramework.dymo.label.framework.AddressBarcodePosition.BelowAddress & Double = js.native
          
          /* 2 */ val Suppress: typingsJapgolly.dymoLabelFramework.dymo.label.framework.AddressBarcodePosition.Suppress & Double = js.native
        }
        
        /**
          * Emuneration that specifies the direction in which objects and object text are laid out on the label.
          * For Middle East labels/content specify "RightToLeft", otherwise specify "LeftToRight" (default).
          */
        @JSGlobal("dymo.label.framework.FlowDirection")
        @js.native
        object FlowDirection extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.dymoLabelFramework.dymo.label.framework.FlowDirection & Double] = js.native
          
          /* 0 */ val LeftToRight: typingsJapgolly.dymoLabelFramework.dymo.label.framework.FlowDirection.LeftToRight & Double = js.native
          
          /* 1 */ val RightToLeft: typingsJapgolly.dymoLabelFramework.dymo.label.framework.FlowDirection.RightToLeft & Double = js.native
        }
        
        /**
          * LabelSetBuilder is used to create a LabelSet to print multiple labels in one print job.
          * LabelSet is a collection of records. Each record contains multiple pairs; each pair consists
          * of the object name and the object text data/content. The data of each record are applied to all
          * corresponend objects and for each record one label is printed.
          */
        @JSGlobal("dymo.label.framework.LabelSetBuilder")
        @js.native
        open class LabelSetBuilder ()
          extends StObject
             with typingsJapgolly.dymoLabelFramework.dymo.label.framework.LabelSetBuilder {
          
          /**
            * Adds a new record to the LabelSet. Returns a record object.
            */
          /* CompleteClass */
          override def addRecord(): ILabelSetRecord = js.native
          
          /**
            * Get all record objects in this LabelSetBuilder.
            */
          /* CompleteClass */
          override def getRecords(): js.Array[ILabelSetRecord] = js.native
        }
        object LabelSetBuilder {
          
          @JSGlobal("dymo.label.framework.LabelSetBuilder")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Converts record objects to XML format. The XML format schema is defined in [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
            * Returned XML can be passed to dymo.label.framefork.printLabel as labelSetXml parameter. This function can be used independent of other LabelSetBuilder methods, if records data is generated by other functions.
            *
            * @param records The records to convert to XML. Records should be an array-like object of associative-arrays with object names as keys and object text as values.
            *
            * @returns An XML string.
            */
          /* static member */
          inline def toXml(records: js.Array[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toXml")(records.asInstanceOf[js.Any]).asInstanceOf[String]
        }
        
        /**
          * Enumeration that specifies the print quality when printing to a LabelWriter printer.
          */
        @JSGlobal("dymo.label.framework.LabelWriterPrintQuality")
        @js.native
        object LabelWriterPrintQuality extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[
                    typingsJapgolly.dymoLabelFramework.dymo.label.framework.LabelWriterPrintQuality & Double
                  ] = js.native
          
          /* 2 */ val Auto: typingsJapgolly.dymoLabelFramework.dymo.label.framework.LabelWriterPrintQuality.Auto & Double = js.native
          
          /* 1 */ val BarcodeAndGraphics: typingsJapgolly.dymoLabelFramework.dymo.label.framework.LabelWriterPrintQuality.BarcodeAndGraphics & Double = js.native
          
          /* 0 */ val Text: typingsJapgolly.dymoLabelFramework.dymo.label.framework.LabelWriterPrintQuality.Text & Double = js.native
        }
        
        /** Print Job Status */
        @JSGlobal("dymo.label.framework.PrintJobStatus")
        @js.native
        object PrintJobStatus extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus & Double] = js.native
          
          /* 0 */ val Error: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.Error & Double = js.native
          
          /* 1 */ val Finished: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.Finished & Double = js.native
          
          /* 2 */ val InQueue: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.InQueue & Double = js.native
          
          /* 3 */ val InvalidJobId: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.InvalidJobId & Double = js.native
          
          /* 4 */ val NotSpooled: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.NotSpooled & Double = js.native
          
          /* 5 */ val PaperOut: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.PaperOut & Double = js.native
          
          /* 6 */ val PrinterBusy: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.PrinterBusy & Double = js.native
          
          /* 7 */ val Printing: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.Printing & Double = js.native
          
          /* 8 */ val ProcessingError: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.ProcessingError & Double = js.native
          
          /* 9 */ val Unknown: typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatus.Unknown & Double = js.native
        }
        
        /** Enumeration that specifies the leader and trailer for a tape label when printing to a Tape printer. */
        @JSGlobal("dymo.label.framework.TapeAlignment")
        @js.native
        object TapeAlignment extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.dymoLabelFramework.dymo.label.framework.TapeAlignment & Double] = js.native
          
          /* 0 */ val Center: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TapeAlignment.Center & Double = js.native
          
          /* 1 */ val Left: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TapeAlignment.Left & Double = js.native
          
          /* 2 */ val Right: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TapeAlignment.Right & Double = js.native
        }
        
        /** Enumeration that specifies the tape cut mode when printing multiple labels to a Tape printer. Note: This enumeration affects multiple page print jobs only. If a one page job is printed, the tape is always cut. */
        @JSGlobal("dymo.label.framework.TapeCutMode")
        @js.native
        object TapeCutMode extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.dymoLabelFramework.dymo.label.framework.TapeCutMode & Double] = js.native
          
          /* 0 */ val AutoCut: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TapeCutMode.AutoCut & Double = js.native
          
          /* 1 */ val ChainMarks: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TapeCutMode.ChainMarks & Double = js.native
        }
        
        /** Enumeration that specifies which roll to print to when printing to a Twin Turbo printer. */
        @JSGlobal("dymo.label.framework.TwinTurboRoll")
        @js.native
        object TwinTurboRoll extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.dymoLabelFramework.dymo.label.framework.TwinTurboRoll & Double] = js.native
          
          /* 2 */ val Auto: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TwinTurboRoll.Auto & Double = js.native
          
          /* 0 */ val Left: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TwinTurboRoll.Left & Double = js.native
          
          /* 1 */ val Right: typingsJapgolly.dymoLabelFramework.dymo.label.framework.TwinTurboRoll.Right & Double = js.native
        }
        
        /** Returns the library version number, e.g. "1.2.6" */
        @JSGlobal("dymo.label.framework.VERSION")
        @js.native
        def VERSION: String = js.native
        inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
        
        /**
          * Undocumented, removed, see http://developers.dymo.com/2013/08/14/dymo-sdk-qa/#comment-27119
          */
        inline def addPrinterUri(printerUri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def addPrinterUri(printerUri: String, location: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addPrinterUri(printerUri: String, location: String, successCallback: Unit, errorCallback: AddPrinterUriCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any], location.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addPrinterUri(printerUri: String, location: String, successCallback: AddPrinterUriCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any], location.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addPrinterUri(
          printerUri: String,
          location: String,
          successCallback: AddPrinterUriCallback,
          errorCallback: AddPrinterUriCallback
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any], location.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addPrinterUri(printerUri: String, location: Unit, successCallback: Unit, errorCallback: AddPrinterUriCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any], location.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addPrinterUri(printerUri: String, location: Unit, successCallback: AddPrinterUriCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any], location.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def addPrinterUri(
          printerUri: String,
          location: Unit,
          successCallback: AddPrinterUriCallback,
          errorCallback: AddPrinterUriCallback
        ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrinterUri")(printerUri.asInstanceOf[js.Any], location.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /** Checks that the browser enviroment is suitable for the Framework. */
        inline def checkEnvironment(): ErrorDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("checkEnvironment")().asInstanceOf[ErrorDetails]
        
        /**
          * Creates an XML string suitable to pass to the dymo.label.framework.renderLabel function
          * as renderParamsXml parameter. Returns an XML string.
          *
          * @param params A JavaScript object with the following properties
          *   (not all properties must be defined; if a property is not defined, a default value is used)
          */
        inline def createLabelRenderParamsXml(params: CreateLabelRenderParamsXmlParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createLabelRenderParamsXml")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * Creates an XML string suitable to to pass to the dymo.label.framework.printLabel function
          * as printParamsXml parameter. Created print parameters are for printing to LabelWriter printers.
          * Returns an XML string.
          *
          * @param params A JavaScript object with the following properties
          *   (not all properties must be defined; if a property is not defined, a default value is used)
          */
        inline def createLabelWriterPrintParamsXml(params: CreateLabelWriterPrintParamsXmlParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createLabelWriterPrintParamsXml")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * Creates an XML string suitable to pass to the dymo.label.framework.printLabel function as printParamsXml parameter. Created print parameters are for printing to Tape printers.
          * Returns an XML string.
          *
          * @param params A JavaScript object with the following properties
          *   (not all properties must be defined; if a property is not defined, a default value is used)
          */
        inline def createTapePrintParamsXml(params: CreateTapePrintParamsXmlParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createTapePrintParamsXml")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * Convenience method (overload of getPrinters) to get a list of all printers of type "LabelWriterPrinter".
          */
        inline def getLabelWriterPrinters(): js.Array[PrinterInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLabelWriterPrinters")().asInstanceOf[js.Array[PrinterInfo]]
        
        /**
          * Gets a list of all printers supported by the DYMO Label Framework.
          * Results are returned in an array-like object.
          * Each item is of the type dymo.label.framework.PrinterInfo.
          * In addition, items can be accessed by printer name.
          */
        inline def getPrinters(): js.Array[PrinterInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrinters")().asInstanceOf[js.Array[PrinterInfo]]
        
        /**
          * Convenience method (overload of getPrinters) to get a list of all printers of type "TapePrinter".
          */
        inline def getTapePrinters(): js.Array[PrinterInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTapePrinters")().asInstanceOf[js.Array[PrinterInfo]]
        
        /**
          * Loads an image from a URL or file and returns it as a base64-encoded PNG stream.
          * The loaded image is not necessarily in PNG format.
          * The image can be in any format supported by the Framework (by DYMO Label v.8).
          * The loaded data can be used to set content for an image object on a label.
          * Note: The comments for {@link openLabelFile} apply to this function as well.
          *
          * @param imageUri URL or file name to load the image from.
          *
          * @returns A base64-encoded PNG stream.
          */
        inline def loadImageAsPngBase64(imageUri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImageAsPngBase64")(imageUri.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * Loads label content from a file or URL.
          * The following considerations should be taken before using this function:
          *
          * * The full file name or URL should be specified. The function will not honor relative paths based on document.location.href.
          * * The fileName can be an http:// or file:// URL. On Windows the file name can be a regular file name, for example 'c:\\users\desktop\address.label'.
          * * The content of the label will be loaded synchronously. Therefore, if the remote server is down there will be a timeout.
          * * Any local file can be accessed or attempted to be accessed. The function is not limited by any browser restrictions. However, only a valid label file (according to label.xsd schema) can be loaded. This could still be a potential security concern.
          * * The URL is not limited to same-site-origin browser policy. Any URL can be opened.
          * * The proxy settings are the system default settings, these are not necessarily the browser settings.
          *
          * Use this function only when there is no other way to load label data. In most cases, label data should be loaded using dymo.label.framework.openLabelXml.
          *
          * @param fileName FileName or URL to load label from.
          * 
          * @returns Returns Label object; provides label manipulation methods.
          */
        inline def openLabelFile(fileName: String): ILabel = ^.asInstanceOf[js.Dynamic].applyDynamic("openLabelFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[ILabel]
        
        /**
          * Loads label content from an XML stream/string.
          * Note: This is the preferred way to load/open label files.
          * Use XMLHttpRequest() or other standard browser methods to get XML string.
          *
          * @param labelXml The label definition as an XML string.
          * @returns Label object.
          */
        inline def openLabelXml(labelXml: String): ILabel = ^.asInstanceOf[js.Dynamic].applyDynamic("openLabelXml")(labelXml.asInstanceOf[js.Any]).asInstanceOf[ILabel]
        
        /**
          * Prints one or more labels.
          *
          * @param printerName The name of the printer to print to. A list of printers can be obtained using
          *   dymo.label.framework.getPrinters.
          * @param printParamsXml The print parameters, such as number of copies, print quality, etc.
          *   See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}.
          * @param labelXml The label to print.
          * @param labelSetXml The LabelSet to print. LabelSet is used to print multiple labels with the same layout,
          *   but with different data, such as multiple addresses. Use dymo.label.framework.LabelSetBuilder class to
          *   create a LabelSet, or construct XML manualy according to
          *   [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
          */
        inline def printLabel(printerName: String, printParamsXml: String, labelXml: String, labelSetXml: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printLabel")(printerName.asInstanceOf[js.Any], printParamsXml.asInstanceOf[js.Any], labelXml.asInstanceOf[js.Any], labelSetXml.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * Prints a label and returns a print job object
          *
          * @param printerName The printer to print on. A list of printers can be obtained by getPrinters()
          * @param printParamsXml Printing parameters, like number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}
          * @param labelXml Label to print
          * @param labelSetXml
          *   LabelSet to print. LabelSet is used to print multiple labels with same layout but different data, e.g. multiple addresses.
          *   Use LabelSetBuilder to create a LabelSet or construct xml manualy according to [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
          */
        inline def printLabel2(printerName: String, printParamsXml: String, labelXml: String, labelSetXml: String): PrintJob = (^.asInstanceOf[js.Dynamic].applyDynamic("printLabel2")(printerName.asInstanceOf[js.Any], printParamsXml.asInstanceOf[js.Any], labelXml.asInstanceOf[js.Any], labelSetXml.asInstanceOf[js.Any])).asInstanceOf[PrintJob]
        
        /**
          * Prints a label and runs status checking in a loop
          *
          * @param printerName The printer to print on. A list of printers can be obtained by getPrinters()
          * @param printParamsXml Printing parameters, like number of copies, print quality, etc. See [PrintParams.xsd]{@link http://labelwriter.com/software/dls/sdk/PrintParams.xsd}
          * @param labelXml Label to print
          * @param labelSetXml
          *   LabelSet to print. LabelSet is used to print multiple labels with same layout but different data, e.g.
          *   multiple addresses.
          *   Use LabelSetBuilder to create a LabelSet or construct xml manually according to
          *   [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}
          * @param statusCallback
          *   Function to be called when a print job status is available.
          *   To continue polling the status the function should return true, false otherwise.
          * @param pollInterval Polling interval in milliseconds
          */
        inline def printLabelAndPollStatus(
          printerName: String,
          printParamsXml: String,
          labelXml: String,
          labelSetXml: String,
          statusCallback: js.Function2[/* printJob */ PrintJob, /* printJobStatusInfo */ PrintJobStatusInfo, Boolean],
          pollInterval: Double
        ): PrintJob = (^.asInstanceOf[js.Dynamic].applyDynamic("printLabelAndPollStatus")(printerName.asInstanceOf[js.Any], printParamsXml.asInstanceOf[js.Any], labelXml.asInstanceOf[js.Any], labelSetXml.asInstanceOf[js.Any], statusCallback.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any])).asInstanceOf[PrintJob]
        
        /**
          * Undocumented, removed, see http://developers.dymo.com/2013/08/14/dymo-sdk-qa/#comment-27119
          */
        inline def removeAllPrinterUri(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllPrinterUri")().asInstanceOf[Unit]
        
        /**
          * Undocumented, removed, see http://developers.dymo.com/2013/08/14/dymo-sdk-qa/#comment-27119
          */
        inline def removePrinterUri(printerUri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePrinterUri")(printerUri.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * Creates a label raster image that can be used for label previewing.
          * Returns a string that is a base64-encoded PNG stream of the label image.
          * This string can be used as data: url for  element.
          * Note: data: urls are not supported by IE6 and IE7. IE8 supports them with a 32KB limit (so it may not be possible to preview 'large' labels).
          *
          * @param labelXml Label to preview.
          * @param renderParamsXml The rendering parameters, such as shadow depth, label color, etc. See [LabelRenderParams.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelRenderParams.xsd}.
          * @param printerName The name of the printer that the preview is generated for.
          *   The preview/output can be different for different printers, especially for tape printers
          *   with different print head sizes. If it is not important what printer the label is
          *   printed to, an empty string can be passed. In this case, the default printer metrics
          *   will be used. The default is LW400 for LabelWriter printers and LW400 DUO Tape for tape printers.
          *
          * @returns A base64-encoded PNG stream of the label image.
          */
        inline def renderLabel(labelXml: String, renderParamsXml: String, printerName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLabel")(labelXml.asInstanceOf[js.Any], renderParamsXml.asInstanceOf[js.Any], printerName.asInstanceOf[js.Any])).asInstanceOf[String]
      }
    }
  }
}
