package typingsJapgolly.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Person extends StObject {
  
  var BraggingRights: js.UndefOr[js.Array[typingsJapgolly.gapiPeople.gapi.client.people.BraggingRights]] = js.undefined
  
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  
  var ageRange: js.UndefOr[AgeRange] = js.undefined
  
  var biographies: js.UndefOr[js.Array[Biography]] = js.undefined
  
  var birthdays: js.UndefOr[js.Array[Birthday]] = js.undefined
  
  var coverPhotos: js.Array[CoverPhoto]
  
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  
  var etag: String
  
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  
  var genders: js.UndefOr[js.Array[Gender]] = js.undefined
  
  var imClients: js.UndefOr[js.Array[ImClient]] = js.undefined
  
  var interests: js.UndefOr[js.Array[Interest]] = js.undefined
  
  var locales: js.Array[Locale]
  
  var memberships: js.UndefOr[js.Array[Membership]] = js.undefined
  
  var metadata: PersonMetadata
  
  var names: js.Array[Name]
  
  var nicknames: js.UndefOr[js.Array[Nickname]] = js.undefined
  
  var occupations: js.UndefOr[js.Array[Occupation]] = js.undefined
  
  var organizations: js.UndefOr[js.Array[Organization]] = js.undefined
  
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
  
  var photos: js.UndefOr[js.Array[Photo]] = js.undefined
  
  var relations: js.UndefOr[js.Array[Relation]] = js.undefined
  
  var relationshipInterests: js.UndefOr[js.Array[RelationshipInterest]] = js.undefined
  
  var relationshipStatuses: js.UndefOr[js.Array[RelationshipStatus]] = js.undefined
  
  var residences: js.UndefOr[js.Array[Residence]] = js.undefined
  
  var resourceName: String
  
  var skills: js.UndefOr[js.Array[Skill]] = js.undefined
  
  var taglines: js.UndefOr[js.Array[Tagline]] = js.undefined
  
  var urls: js.UndefOr[js.Array[Url]] = js.undefined
}
object Person {
  
  inline def apply(
    coverPhotos: js.Array[CoverPhoto],
    etag: String,
    locales: js.Array[Locale],
    metadata: PersonMetadata,
    names: js.Array[Name],
    resourceName: String
  ): Person = {
    val __obj = js.Dynamic.literal(coverPhotos = coverPhotos.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
  
  extension [Self <: Person](x: Self) {
    
    inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAgeRange(value: AgeRange): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setBiographies(value: js.Array[Biography]): Self = StObject.set(x, "biographies", value.asInstanceOf[js.Any])
    
    inline def setBiographiesUndefined: Self = StObject.set(x, "biographies", js.undefined)
    
    inline def setBiographiesVarargs(value: Biography*): Self = StObject.set(x, "biographies", js.Array(value*))
    
    inline def setBirthdays(value: js.Array[Birthday]): Self = StObject.set(x, "birthdays", value.asInstanceOf[js.Any])
    
    inline def setBirthdaysUndefined: Self = StObject.set(x, "birthdays", js.undefined)
    
    inline def setBirthdaysVarargs(value: Birthday*): Self = StObject.set(x, "birthdays", js.Array(value*))
    
    inline def setBraggingRights(value: js.Array[BraggingRights]): Self = StObject.set(x, "BraggingRights", value.asInstanceOf[js.Any])
    
    inline def setBraggingRightsUndefined: Self = StObject.set(x, "BraggingRights", js.undefined)
    
    inline def setBraggingRightsVarargs(value: BraggingRights*): Self = StObject.set(x, "BraggingRights", js.Array(value*))
    
    inline def setCoverPhotos(value: js.Array[CoverPhoto]): Self = StObject.set(x, "coverPhotos", value.asInstanceOf[js.Any])
    
    inline def setCoverPhotosVarargs(value: CoverPhoto*): Self = StObject.set(x, "coverPhotos", js.Array(value*))
    
    inline def setEmailAddresses(value: js.Array[EmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    inline def setEmailAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGenders(value: js.Array[Gender]): Self = StObject.set(x, "genders", value.asInstanceOf[js.Any])
    
    inline def setGendersUndefined: Self = StObject.set(x, "genders", js.undefined)
    
    inline def setGendersVarargs(value: Gender*): Self = StObject.set(x, "genders", js.Array(value*))
    
    inline def setImClients(value: js.Array[ImClient]): Self = StObject.set(x, "imClients", value.asInstanceOf[js.Any])
    
    inline def setImClientsUndefined: Self = StObject.set(x, "imClients", js.undefined)
    
    inline def setImClientsVarargs(value: ImClient*): Self = StObject.set(x, "imClients", js.Array(value*))
    
    inline def setInterests(value: js.Array[Interest]): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
    
    inline def setInterestsUndefined: Self = StObject.set(x, "interests", js.undefined)
    
    inline def setInterestsVarargs(value: Interest*): Self = StObject.set(x, "interests", js.Array(value*))
    
    inline def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    inline def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setMetadata(value: PersonMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[Name]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: Name*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setNicknames(value: js.Array[Nickname]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
    
    inline def setNicknamesUndefined: Self = StObject.set(x, "nicknames", js.undefined)
    
    inline def setNicknamesVarargs(value: Nickname*): Self = StObject.set(x, "nicknames", js.Array(value*))
    
    inline def setOccupations(value: js.Array[Occupation]): Self = StObject.set(x, "occupations", value.asInstanceOf[js.Any])
    
    inline def setOccupationsUndefined: Self = StObject.set(x, "occupations", js.undefined)
    
    inline def setOccupationsVarargs(value: Occupation*): Self = StObject.set(x, "occupations", js.Array(value*))
    
    inline def setOrganizations(value: js.Array[Organization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: Organization*): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setRelations(value: js.Array[Relation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setRelationsVarargs(value: Relation*): Self = StObject.set(x, "relations", js.Array(value*))
    
    inline def setRelationshipInterests(value: js.Array[RelationshipInterest]): Self = StObject.set(x, "relationshipInterests", value.asInstanceOf[js.Any])
    
    inline def setRelationshipInterestsUndefined: Self = StObject.set(x, "relationshipInterests", js.undefined)
    
    inline def setRelationshipInterestsVarargs(value: RelationshipInterest*): Self = StObject.set(x, "relationshipInterests", js.Array(value*))
    
    inline def setRelationshipStatuses(value: js.Array[RelationshipStatus]): Self = StObject.set(x, "relationshipStatuses", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusesUndefined: Self = StObject.set(x, "relationshipStatuses", js.undefined)
    
    inline def setRelationshipStatusesVarargs(value: RelationshipStatus*): Self = StObject.set(x, "relationshipStatuses", js.Array(value*))
    
    inline def setResidences(value: js.Array[Residence]): Self = StObject.set(x, "residences", value.asInstanceOf[js.Any])
    
    inline def setResidencesUndefined: Self = StObject.set(x, "residences", js.undefined)
    
    inline def setResidencesVarargs(value: Residence*): Self = StObject.set(x, "residences", js.Array(value*))
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setSkills(value: js.Array[Skill]): Self = StObject.set(x, "skills", value.asInstanceOf[js.Any])
    
    inline def setSkillsUndefined: Self = StObject.set(x, "skills", js.undefined)
    
    inline def setSkillsVarargs(value: Skill*): Self = StObject.set(x, "skills", js.Array(value*))
    
    inline def setTaglines(value: js.Array[Tagline]): Self = StObject.set(x, "taglines", value.asInstanceOf[js.Any])
    
    inline def setTaglinesUndefined: Self = StObject.set(x, "taglines", js.undefined)
    
    inline def setTaglinesVarargs(value: Tagline*): Self = StObject.set(x, "taglines", js.Array(value*))
    
    inline def setUrls(value: js.Array[Url]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
