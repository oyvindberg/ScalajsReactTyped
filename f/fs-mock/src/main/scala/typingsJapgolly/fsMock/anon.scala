package typingsJapgolly.fsMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BufferSize extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
  }
  object BufferSize {
    
    inline def apply(): BufferSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferSize]
    }
    
    extension [Self <: BufferSize](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: String
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(encoding: String): Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait EncodingFlag extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object EncodingFlag {
    
    inline def apply(): EncodingFlag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingFlag]
    }
    
    extension [Self <: EncodingFlag](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Fd extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object Fd {
    
    inline def apply(): Fd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fd]
    }
    
    extension [Self <: Fd](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Flag extends StObject {
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Flag {
    
    inline def apply(): Flag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flag]
    }
    
    extension [Self <: Flag](x: Self) {
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait Flags extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
  }
  object Flags {
    
    inline def apply(): Flags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  trait Interval extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object Interval {
    
    inline def apply(): Interval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interval]
    }
    
    extension [Self <: Interval](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
  
  trait Mode extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Persistent extends StObject {
    
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object Persistent {
    
    inline def apply(): Persistent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Persistent]
    }
    
    extension [Self <: Persistent](x: Self) {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
