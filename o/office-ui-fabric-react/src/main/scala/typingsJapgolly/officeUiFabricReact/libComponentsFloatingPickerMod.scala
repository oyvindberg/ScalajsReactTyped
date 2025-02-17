package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.IPeopleFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsControlProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsCoreProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStoreOptions
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPeoplePicker")
  @js.native
  open class BaseFloatingPeoplePicker protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.BaseFloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPicker")
  @js.native
  open class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
  @js.native
  open class FloatingPeoplePicker protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.FloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  /* static members */
  object FloatingPeoplePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionItemType")
  @js.native
  object SuggestionItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType & Double
      ] = js.native
    
    /* 2 */ val footer: typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.footer & Double = js.native
    
    /* 0 */ val header: typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.header & Double = js.native
    
    /* 1 */ val suggestion: typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.suggestion & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsControl")
  @js.native
  open class SuggestionsControl[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsCore")
  @js.native
  open class SuggestionsCore[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsCoreMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsHeaderFooterItem")
  @js.native
  open class SuggestionsHeaderFooterItem protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsHeaderFooterItem {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsStore")
  @js.native
  open class SuggestionsStore[T] ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  inline def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("createItem")(name.asInstanceOf[js.Any], isValid.asInstanceOf[js.Any])).asInstanceOf[ISuggestionModel[IPersonaProps]]
}
