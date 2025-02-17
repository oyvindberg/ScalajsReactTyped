package typingsJapgolly.smartFoxServer.global.SFS2X

import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSBuddy
import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsJapgolly.smartFoxServer.SFS2X.Entities.SFSUser
import typingsJapgolly.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Managers
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Managers.html
object Managers {
  
  @JSGlobal("SFS2X.Managers.BuddyManager")
  @js.native
  open class BuddyManager protected ()
    extends StObject
       with typingsJapgolly.smartFoxServer.SFS2X.Managers.BuddyManager {
    /**
      * Creates a new BuddyManager instance.
      * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
      */
    def this(sfs: typingsJapgolly.smartFoxServer.SFS2X.SmartFox) = this()
    
    /**
      * Indicates whether a buddy exists in user's buddy list or not.
      * @param  {string}  name The name of the buddy whose presence in the buddy list is to be checked.
      * @return {boolean}      Returns: true if the specified buddy exists in the buddy list.
      */
    /* CompleteClass */
    override def containsBuddy(name: String): Boolean = js.native
    
    /**
      * Retrieves a SFSBuddy object from its id property.
      * @param  {number}            id The id of the buddy to be found.
      * @return {Entities.SFSBuddy}   Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed id exists in the buddy list.
      */
    /* CompleteClass */
    override def getBuddyById(id: Double): SFSBuddy = js.native
    
    /**
      * Retrieves a SFSBuddy object from its name property.
      * @param  {string}            name The name of the buddy to be found.
      * @return {Entities.SFSBuddy}      Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed name exists in the buddy list.
      */
    /* CompleteClass */
    override def getBuddyByName(name: String): SFSBuddy = js.native
    
    /**
      * Retrieves a SFSBuddy object using its getNickName method.
      * @param  {string}            nickName The nickname of the buddy to be found.
      * @return {Entities.SFSBuddy}          Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed nickname exists in the buddies list.
      */
    /* CompleteClass */
    override def getBuddyByNickName(nickName: String): SFSBuddy = js.native
    
    /**
      * Returns a list of SFSBuddy objects representing all the buddies in the user's buddy list.
      * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing all the buddies.
      */
    /* CompleteClass */
    override def getBuddyList(): js.Array[SFSBuddy] = js.native
    
    /**
      * Returns a list of strings representing the available custom buddy states.
      * @return {string[]} Returns: The list of available custom buddy states in the Buddy List system.
      */
    /* CompleteClass */
    override def getBuddyStates(): js.Array[String] = js.native
    
    /**
      * Returns the current user's nickname (if set). If the nickname was never set before, null is returned.
      * @return {string} Returns: The user nickname in the Buddy List system.
      */
    /* CompleteClass */
    override def getMyNickName(): String = js.native
    
    /**
      * Returns the current user's online/offline state.
      * @return {boolean} Returns true if the user is online in the Buddy List system.
      */
    /* CompleteClass */
    override def getMyOnlineState(): Boolean = js.native
    
    /**
      * Returns the current user's custom state (if set). Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state was never set before, null is returned.
      * @return {string} Returns: The user state in the Buddy List system.
      */
    /* CompleteClass */
    override def getMyState(): String = js.native
    
    /**
      * Retrieves a Buddy Variable set for the current user from its name.
      * @param  {string}                              varName The name of the Buddy Variable to be retrieved.
      * @return {Entities.Variables.SFSBuddyVariable}         Returns: The SFSBuddyVariable object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to the current user.
      */
    /* CompleteClass */
    override def getMyVariable(varName: String): SFSBuddyVariable = js.native
    
    /**
      * Returns all the Buddy Variables set for the current user.
      * @return {Entities.Variables.SFSBuddyVariable[]} Returns: A list of SFSBuddyVariable objects representing all the Buddy Variables set for the user.
      */
    /* CompleteClass */
    override def getMyVariables(): js.Array[SFSBuddyVariable] = js.native
    
    /**
      * Returns a list of SFSBuddy objects representing all the offline buddies in the user's buddy list.
      * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the offline buddies.
      */
    /* CompleteClass */
    override def getOfflineBuddies(): js.Array[SFSBuddy] = js.native
    
    /**
      * Returns a list of SFSBuddy objects representing all the online buddies in the user's buddy list.
      * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the online buddies.
      */
    /* CompleteClass */
    override def getOnlineBuddies(): js.Array[SFSBuddy] = js.native
    
    /**
      * Indicates whether the client's Buddy List system is initialized or not. If not, an InitBuddyListRequest request should be sent to the server in order to retrieve the persistent Buddy List data.
      * @return {boolean} Returns: true if the Buddy List system is initialized in the client.
      */
    /* CompleteClass */
    override def isInited(): Boolean = js.native
  }
  
  @JSGlobal("SFS2X.Managers.RoomManager")
  @js.native
  open class RoomManager protected ()
    extends StObject
       with typingsJapgolly.smartFoxServer.SFS2X.Managers.RoomManager {
    /**
      * Creates a new RoomManager instance.
      * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
      */
    def this(sfs: typingsJapgolly.smartFoxServer.SFS2X.SmartFox) = this()
    
    /**
      * Indicates whether the specified Group has been subscribed by the client or not.
      * @param  {string}  groupId The name of the Group.
      * @return {boolean}         Returns: true if the client subscribed the passed Group.
      */
    /* CompleteClass */
    override def containsGroup(groupId: String): Boolean = js.native
    
    /**
      * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
      * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
      * @return {boolean}          Returns: true if the passed Room exists in the Rooms list.
      */
    /* CompleteClass */
    override def containsRoom(idOrName: Any): Boolean = js.native
    
    /**
      * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
      * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
      * @param  {string}  groupId  The name of the Group to which the specified Room must belong.
      * @return {boolean}          Returns: true if the Rooms list contains the passed Room and it belongs to the specified Group.
      */
    /* CompleteClass */
    override def containsRoomInGroup(idOrName: Any, groupId: String): Boolean = js.native
    
    /**
      * Returns a list of Rooms currently joined by the client.
      * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms currently joined by the client.
      */
    /* CompleteClass */
    override def getJoinedRooms(): js.Array[SFSRoom] = js.native
    
    /**
      * Retrieves a SFSRoom object from its id.
      * @param  {number}           id The id of the Room.
      * @return {Entities.SFSRoom}    Returns: The object representing the requested Room; null if no SFSRoom object with the passed id exists in the Rooms list.
      */
    /* CompleteClass */
    override def getRoomById(id: Double): SFSRoom = js.native
    
    /**
      * Retrieves a SFSRoom object from its name.
      * @param  {string}           name The name of the Room.
      * @return {Entities.SFSRoom}      Returns: The object representing the requested Room; null if no SFSRoom object with the passed name exists in the Rooms list.
      */
    /* CompleteClass */
    override def getRoomByName(name: String): SFSRoom = js.native
    
    /**
      * Returns the current number of Rooms in the Rooms list.
      * @return {number} Returns: A list of Group names.
      */
    /* CompleteClass */
    override def getRoomCount(): Double = js.native
    
    /**
      * Returns the names of Groups currently subscribed by the client.
      * @return {string[]} Returns: A list of Group names.
      */
    /* CompleteClass */
    override def getRoomGroups(): js.Array[String] = js.native
    
    /**
      * Returns a list of Rooms currently "known" by the client. The list contains all the Rooms that are currently joined and all the Rooms belonging to the Room Groups that have been subscribed.
      * @return {Entities.SFSRoom[]} Returns: The list of the available SFSRoom objects.
      */
    /* CompleteClass */
    override def getRoomList(): js.Array[SFSRoom] = js.native
    
    /**
      * Retrieves the list of Rooms which are part of the specified Room Group.
      * @param  {string}             groupId The name of the Group.
      * @return {Entities.SFSRoom[]}         Returns: The list of SFSRoom objects belonging to the passed Group.
      */
    /* CompleteClass */
    override def getRoomListFromGroup(groupId: String): js.Array[SFSRoom] = js.native
    
    /**
      * Retrieves a list of Rooms joined by the specified user. The list contains only those Rooms "known" by the Room Manager; the user might have joined others the client is not aware of.
      * @param  {Entities.SFSUser}   user A SFSUser object representing the user to look for in the current Rooms list.
      * @return {Entities.SFSRoom[]}      Returns: The list of Rooms joined by the passed user.
      */
    /* CompleteClass */
    override def getUserRooms(user: SFSUser): js.Array[SFSRoom] = js.native
  }
  
  @JSGlobal("SFS2X.Managers.UserManager")
  @js.native
  open class UserManager protected ()
    extends StObject
       with typingsJapgolly.smartFoxServer.SFS2X.Managers.UserManager {
    /**
      * Creates a new UserManager instance.
      * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
      */
    def this(sfs: typingsJapgolly.smartFoxServer.SFS2X.SmartFox) = this()
    
    /**
      * Indicates whether a user exists in the local users list or not.
      * @param  {Entities.SFSUser} user The SFSUser object representing the user whose presence in the users list is to be tested.
      * @return {boolean}               Returns: true if the passed user exists in the users list.
      */
    /* CompleteClass */
    override def containsUser(user: SFSUser): Boolean = js.native
    
    /**
      * Indicates whether a user exists in the local users list or not from the id.
      * @param  {number}  userId The id of the user whose presence in the users list is to be tested.
      * @return {boolean}        Returns: true if the passed user exists in the users list.
      */
    /* CompleteClass */
    override def containsUserId(userId: Double): Boolean = js.native
    
    /**
      * Indicates whether a user exists in the local users list or not from the name.
      * @param  {string}  userName The name of the user whose presence in the users list is to be tested.
      * @return {boolean}          Returns: true if the passed user exists in the users list.
      */
    /* CompleteClass */
    override def containsUserName(userName: String): Boolean = js.native
    
    /**
      * Retrieves a SFSUser object from its id property.
      * @param  {number}           userId The id of the user to be found.
      * @return {Entities.SFSUser}        Returns: The SFSUser object representing the user, or null if no user with the passed id exists in the local users list.
      */
    /* CompleteClass */
    override def getUserById(userId: Double): SFSUser = js.native
    
    /**
      * Retrieves a SFSUser object from its name property.
      * @param  {string}           userName The name of the user to be found.
      * @return {Entities.SFSUser}          Returns: The SFSUser object representing the user, or null if no user with the passed name exists in the local users list.
      */
    /* CompleteClass */
    override def getUserByName(userName: String): SFSUser = js.native
    
    /**
      * Returns the total number of users in the local users list.
      * @return {number} Returns: The number of users in the local users list.
      */
    /* CompleteClass */
    override def getUserCount(): Double = js.native
    
    /**
      * Get the whole list of users inside the Rooms joined by the client.
      * @return {Entities.SFSUser[]} Returns: The list of SFSUser objects representing the users in the local users list.
      */
    /* CompleteClass */
    override def getUserList(): js.Array[SFSUser] = js.native
  }
}
