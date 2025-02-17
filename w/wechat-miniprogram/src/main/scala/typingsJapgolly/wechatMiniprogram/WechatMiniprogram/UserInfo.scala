package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`0`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`1`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramInts.`2`
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.en
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.zh_CN
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.zh_TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 用户信息 */
trait UserInfo extends StObject {
  
  /** 用户头像图片的 URL。URL 最后一个数值代表正方形头像大小（有 0、46、64、96、132 数值可选，0 代表 640x640 的正方形头像，46 表示 46x46 的正方形头像，剩余数值以此类推。默认132），用户没有头像时该项为空。若用户更换头像，原有头像 URL 将失效。 */
  var avatarUrl: String
  
  /** 用户所在城市 */
  var city: String
  
  /** 用户所在国家 */
  var country: String
  
  /** 用户性别
    *
    * 可选值：
    * - 0: 未知;
    * - 1: 男性;
    * - 2: 女性; */
  var gender: `0` | `1` | `2`
  
  /** 显示 country，province，city 所用的语言
    *
    * 可选值：
    * - 'en': 英文;
    * - 'zh_CN': 简体中文;
    * - 'zh_TW': 繁体中文; */
  var language: en | zh_CN | zh_TW
  
  /** 用户昵称 */
  var nickName: String
  
  /** 用户所在省份 */
  var province: String
}
object UserInfo {
  
  inline def apply(
    avatarUrl: String,
    city: String,
    country: String,
    gender: `0` | `1` | `2`,
    language: en | zh_CN | zh_TW,
    nickName: String,
    province: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  
  extension [Self <: UserInfo](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setGender(value: `0` | `1` | `2`): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: en | zh_CN | zh_TW): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
  }
}
