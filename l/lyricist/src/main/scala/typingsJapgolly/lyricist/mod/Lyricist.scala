package typingsJapgolly.lyricist.mod

import typingsJapgolly.lyricist.anon.FetchLyrics
import typingsJapgolly.lyricist.anon.FetchTracklist
import typingsJapgolly.lyricist.anon.Page
import typingsJapgolly.lyricist.anon.TextFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lyricist extends StObject {
  
  def album(id: Double): js.Promise[Album] = js.native
  def album(id: Double, opts: FetchTracklist): js.Promise[Album] = js.native
  
  def artist(id: Double, opts: TextFormat): js.Promise[Artist] = js.native
  
  def artistByName(name: String, opts: TextFormat): js.Promise[Artist] = js.native
  
  def search(query: String): js.Promise[js.Array[SearchResult]] = js.native
  
  def song(id: Double): js.Promise[Song] = js.native
  def song(id: Double, opts: FetchLyrics): js.Promise[Song] = js.native
  
  def songsByArtist(id: Double): js.Promise[js.Array[SongByArtist]] = js.native
  def songsByArtist(id: Double, opts: Page): js.Promise[js.Array[SongByArtist]] = js.native
}
