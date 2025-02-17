package typingsJapgolly.microsoftLiveConnect.Microsoft.Live

import typingsJapgolly.microsoftLiveConnect.anon.Account
import typingsJapgolly.microsoftLiveConnect.anon.Mobile
import typingsJapgolly.microsoftLiveConnect.anon.Personal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The User object contains info about a user. The Live Connect REST API
  * supports reading User objects.
  */
trait IUser extends StObject {
  
  /**
    * The user's postal addresses.
    */
  var addresses: Personal
  
  /**
    * The day of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_day: Double
  
  /**
    * The month of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_month: Double
  
  /**
    * The year of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_year: Double
  
  /**
    * The user's email addresses.
    */
  var emails: Account
  
  /**
    * The user's first name.
    */
  var first_name: String
  
  /**
    * The user's gender, or null if no gender is specified.
    */
  var gender: String
  
  /**
    * The user's ID.
    */
  var id: String
  
  /**
    * The user's last name.
    */
  var last_name: String
  
  /**
    * The URL of the user's profile page.
    */
  var link: String
  
  /**
    * The user's locale code.
    */
  var locale: String
  
  /**
    * The user's full name.
    */
  var name: String
  
  /**
    * The user's phone numbers.
    */
  var phones: Mobile
  
  /**
    * The time, in ISO 8601 format, at which the user last updated the
    * object.
    */
  var updated_time: String
  
  /**
    * An array that contains the user's work info.
    */
  var work: js.Array[IWorkInfo]
}
object IUser {
  
  inline def apply(
    addresses: Personal,
    birth_day: Double,
    birth_month: Double,
    birth_year: Double,
    emails: Account,
    first_name: String,
    gender: String,
    id: String,
    last_name: String,
    link: String,
    locale: String,
    name: String,
    phones: Mobile,
    updated_time: String,
    work: js.Array[IWorkInfo]
  ): IUser = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], birth_day = birth_day.asInstanceOf[js.Any], birth_month = birth_month.asInstanceOf[js.Any], birth_year = birth_year.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUser]
  }
  
  extension [Self <: IUser](x: Self) {
    
    inline def setAddresses(value: Personal): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setBirth_day(value: Double): Self = StObject.set(x, "birth_day", value.asInstanceOf[js.Any])
    
    inline def setBirth_month(value: Double): Self = StObject.set(x, "birth_month", value.asInstanceOf[js.Any])
    
    inline def setBirth_year(value: Double): Self = StObject.set(x, "birth_year", value.asInstanceOf[js.Any])
    
    inline def setEmails(value: Account): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhones(value: Mobile): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setUpdated_time(value: String): Self = StObject.set(x, "updated_time", value.asInstanceOf[js.Any])
    
    inline def setWork(value: js.Array[IWorkInfo]): Self = StObject.set(x, "work", value.asInstanceOf[js.Any])
    
    inline def setWorkVarargs(value: IWorkInfo*): Self = StObject.set(x, "work", js.Array(value*))
  }
}
