package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libIOMod.IO_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6ConsoleMod {
  
  @JSImport("fp-ts/es6/Console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def info[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def log[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def warn[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
}
