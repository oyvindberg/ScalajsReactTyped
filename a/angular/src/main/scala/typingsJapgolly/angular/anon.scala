package typingsJapgolly.angular

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angular.mod.IController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Capacity extends StObject {
    
    var capacity: js.UndefOr[Double] = js.undefined
  }
  object Capacity {
    
    inline def apply(): Capacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capacity]
    }
    
    extension [Self <: Capacity](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    }
  }
  
  trait CodeName extends StObject {
    
    var codeName: String
    
    var dot: Double
    
    var full: String
    
    var major: Double
    
    var minor: Double
  }
  object CodeName {
    
    inline def apply(codeName: String, dot: Double, full: String, major: Double, minor: Double): CodeName = {
      val __obj = js.Dynamic.literal(codeName = codeName.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeName]
    }
    
    extension [Self <: CodeName](x: Self) {
      
      inline def setCodeName(value: String): Self = StObject.set(x, "codeName", value.asInstanceOf[js.Any])
      
      inline def setDot(value: Double): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var requireBase: js.UndefOr[Boolean] = js.undefined
    
    var rewriteLinks: js.UndefOr[Boolean] = js.undefined
  }
  object Enabled {
    
    inline def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setRequireBase(value: Boolean): Self = StObject.set(x, "requireBase", value.asInstanceOf[js.Any])
      
      inline def setRequireBaseUndefined: Self = StObject.set(x, "requireBase", js.undefined)
      
      inline def setRewriteLinks(value: Boolean): Self = StObject.set(x, "rewriteLinks", value.asInstanceOf[js.Any])
      
      inline def setRewriteLinksUndefined: Self = StObject.set(x, "rewriteLinks", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    /**
      * the id of the cache instance
      */
    var id: String
    
    /**
      * the number of entries kept in the cache instance
      */
    var size: Double
  }
  object Id {
    
    inline def apply(id: String, size: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Instance extends StObject {
    
    var instance: IController
  }
  object Instance {
    
    inline def apply(instance: IController): Instance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setInstance(value: IController): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
}
