package typingsJapgolly.winrtUwp.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFolder
import typingsJapgolly.winrtUwp.Windows.Storage.NameCollisionOption
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for creating and saving media playlists for playback. */
object Playlists {
  
  @js.native
  sealed trait PlaylistFormat extends StObject
  /** Indicates the format of a playlist file. */
  @JSGlobal("Windows.Media.Playlists.PlaylistFormat")
  @js.native
  object PlaylistFormat extends StObject {
    
    /** M3U playlist. */
    @js.native
    sealed trait m3u
      extends StObject
         with PlaylistFormat
    
    /** Windows Media playlist. */
    @js.native
    sealed trait windowsMedia
      extends StObject
         with PlaylistFormat
    
    /** Zune playlist. */
    @js.native
    sealed trait zune
      extends StObject
         with PlaylistFormat
  }
  
  /** Provides access to a media playlist. */
  @js.native
  trait Playlist extends StObject {
    
    /** The set of media files that make up the playlist. */
    var files: IVector[StorageFile] = js.native
    
    /**
      * Asynchronously saves the playlist to a specified file and folder.
      * @param saveLocation The folder in which to save the playlist.
      * @param desiredName The name of the playlist to save.
      * @param option The action to take if the playlist is saved to an existing file. One of the values of the NameCollisionOption enumeration.
      * @return Represents the asynchronous operation to save the playlist to a specified file and folder.
      */
    def saveAsAsync(saveLocation: IStorageFolder, desiredName: String, option: NameCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
    /**
      * Asynchronously saves the playlist to a specified file and folder, in a specified format.
      * @param saveLocation The folder in which to save the playlist.
      * @param desiredName The name of the playlist to save.
      * @param option The action to take if the playlist is saved to an existing file. One of the values of the NameCollisionOption enumeration.
      * @param playlistFormat The playlist format. One of the values of the PlaylistFormat enumeration.
      * @return Represents the asynchronous operation to save the playlist to a specified file and folder.
      */
    def saveAsAsync(
      saveLocation: IStorageFolder,
      desiredName: String,
      option: NameCollisionOption,
      playlistFormat: PlaylistFormat
    ): IPromiseWithIAsyncOperation[StorageFile] = js.native
    
    /**
      * Asynchronously saves the playlist.
      * @return Represents the asynchronous action to save the playlist.
      */
    def saveAsync(): IPromiseWithIAsyncAction = js.native
  }
}
