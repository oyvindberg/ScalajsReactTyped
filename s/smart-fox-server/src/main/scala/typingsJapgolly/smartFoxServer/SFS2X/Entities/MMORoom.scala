package typingsJapgolly.smartFoxServer.SFS2X.Entities

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.smartFoxServer.SFS2X.Entities.Data.Vec3D
import typingsJapgolly.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typingsJapgolly.smartFoxServer.SFS2X.Managers.RoomManager
import typingsJapgolly.smartFoxServer.SFS2X.Requests.MMO.MapLimits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MMORoom
  extends StObject
     with SFSRoom {
  
  /** @type {Data.Vec3D} Returns the default Area of Interest (AoI) of this MMORoom. */
  var defaultAOI: Vec3D
  
  /**
    * Retrieves an MMOItem object from its id property. The item is available to the current user if it falls within their Area of Interest only.
    * @param  {number}  id The id of the item to be retrieved.
    * @return {MMOItem}    Returns: An MMOItem object, or null if the item with the passed id is not in proximity of the current user.
    */
  def getMMOItem(id: Double): MMOItem
  
  /**
    * Retrieves all MMOItem object in the MMORoom that fall within the current user's Area of Interest.
    * @return {MMOItem[]} Returns: A list of MMOItem objects, or an empty list if no item is in proximity of the current user.
    */
  def getMMOItems(): js.Array[MMOItem]
  
  /** @type {Requests.MMO.MapLimits} Returns the higher coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
  var higherMapLimit: MapLimits
  
  /** @type {Requests.MMO.MapLimits} Returns the lower coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
  var lowerMapLimit: MapLimits
}
object MMORoom {
  
  inline def apply(
    containsUser: SFSUser => Boolean,
    containsVariable: String => Boolean,
    defaultAOI: Vec3D,
    getCapacity: CallbackTo[Double],
    getMMOItem: Double => MMOItem,
    getMMOItems: CallbackTo[js.Array[MMOItem]],
    getPlayerList: CallbackTo[js.Array[SFSUser]],
    getRoomManager: CallbackTo[RoomManager],
    getSpectatorCount: CallbackTo[Double],
    getSpectatorList: CallbackTo[js.Array[SFSUser]],
    getUserById: Double => SFSUser,
    getUserByName: String => SFSUser,
    getUserCount: CallbackTo[Double],
    getUserList: CallbackTo[js.Array[SFSUser]],
    getVariable: String => SFSRoomVariable,
    getVariables: CallbackTo[js.Array[SFSRoomVariable]],
    groupId: String,
    higherMapLimit: MapLimits,
    id: Double,
    isGame: Boolean,
    isHidden: Boolean,
    isJoined: Boolean,
    isPasswordProtected: Boolean,
    lowerMapLimit: MapLimits,
    maxSpectators: Double,
    maxUsers: Double,
    name: String,
    properties: js.Object
  ): MMORoom = {
    val __obj = js.Dynamic.literal(containsUser = js.Any.fromFunction1(containsUser), containsVariable = js.Any.fromFunction1(containsVariable), defaultAOI = defaultAOI.asInstanceOf[js.Any], getCapacity = getCapacity.toJsFn, getMMOItem = js.Any.fromFunction1(getMMOItem), getMMOItems = getMMOItems.toJsFn, getPlayerList = getPlayerList.toJsFn, getRoomManager = getRoomManager.toJsFn, getSpectatorCount = getSpectatorCount.toJsFn, getSpectatorList = getSpectatorList.toJsFn, getUserById = js.Any.fromFunction1(getUserById), getUserByName = js.Any.fromFunction1(getUserByName), getUserCount = getUserCount.toJsFn, getUserList = getUserList.toJsFn, getVariable = js.Any.fromFunction1(getVariable), getVariables = getVariables.toJsFn, groupId = groupId.asInstanceOf[js.Any], higherMapLimit = higherMapLimit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isJoined = isJoined.asInstanceOf[js.Any], isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], lowerMapLimit = lowerMapLimit.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MMORoom]
  }
  
  extension [Self <: MMORoom](x: Self) {
    
    inline def setDefaultAOI(value: Vec3D): Self = StObject.set(x, "defaultAOI", value.asInstanceOf[js.Any])
    
    inline def setGetMMOItem(value: Double => MMOItem): Self = StObject.set(x, "getMMOItem", js.Any.fromFunction1(value))
    
    inline def setGetMMOItems(value: CallbackTo[js.Array[MMOItem]]): Self = StObject.set(x, "getMMOItems", value.toJsFn)
    
    inline def setHigherMapLimit(value: MapLimits): Self = StObject.set(x, "higherMapLimit", value.asInstanceOf[js.Any])
    
    inline def setLowerMapLimit(value: MapLimits): Self = StObject.set(x, "lowerMapLimit", value.asInstanceOf[js.Any])
  }
}
