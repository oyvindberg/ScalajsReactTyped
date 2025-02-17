package typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.Alt
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.CourseWorkStates
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.Fields
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CourseWorkResource extends StObject {
  
  def create(request: Alt, body: CourseWork): Request[CourseWork] = js.native
  /**
    * Creates course work. The resulting course work (and corresponding student submissions) are associated with the Developer Console project of the [OAuth client
    * ID](https://support.google.com/cloud/answer/6158849) used to make the request. Classroom API requests to modify course work and student submissions must be made with an OAuth client
    * ID from the associated Developer Console project. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, create course work in the requested course, share a Drive attachment, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the
    * requested course does not exist. * `FAILED_PRECONDITION` for the following request error: * AttachmentNotVisible
    */
  def create(request: Xgafv): Request[CourseWork] = js.native
  
  /**
    * Deletes a course work. This request must be made by the Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the
    * corresponding course work item. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding course
    * work, if the requesting user is not permitted to delete the requested course or for access errors. * `FAILED_PRECONDITION` if the requested course work has already been deleted. *
    * `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /**
    * Returns course work. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work, or
    * for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or course work does not exist.
    */
  def get(): Request[CourseWork] = js.native
  def get(request: Fields): Request[CourseWork] = js.native
  
  /**
    * Returns a list of course work that the requester is permitted to view. Course students may only view `PUBLISHED` course work. Course teachers and domain administrators may view all
    * course work. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or for access errors. *
    * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
    */
  def list(): Request[ListCourseWorkResponse] = js.native
  def list(request: CourseWorkStates): Request[ListCourseWorkResponse] = js.native
  
  /**
    * Modifies assignee mode and options of a coursework. Only a teacher of the course that contains the coursework may call this method. This method returns the following error codes: *
    * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or course work or for access errors. * `INVALID_ARGUMENT` if the request is malformed. *
    * `NOT_FOUND` if the requested course or course work does not exist.
    */
  def modifyAssignees(request: AccesstokenAlt): Request[CourseWork] = js.native
  def modifyAssignees(request: Fields, body: ModifyCourseWorkAssigneesRequest): Request[CourseWork] = js.native
  
  /**
    * Updates one or more fields of a course work. See google.classroom.v1.CourseWork for details of which fields may be updated and who may change them. This request must be made by the
    * Developer Console project of the [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to create the corresponding course work item. This method returns the
    * following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding course work, if the user is not permitted to make the requested
    * modification to the student submission, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `FAILED_PRECONDITION` if the requested course work has already been
    * deleted. * `NOT_FOUND` if the requested course, course work, or student submission does not exist.
    */
  def patch(request: AltCallback): Request[CourseWork] = js.native
  def patch(request: Oauthtoken, body: CourseWork): Request[CourseWork] = js.native
  
  var studentSubmissions: StudentSubmissionsResource = js.native
}
