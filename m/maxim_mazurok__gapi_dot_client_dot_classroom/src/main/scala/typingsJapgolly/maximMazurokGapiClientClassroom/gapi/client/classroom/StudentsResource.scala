package typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.Callback
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.CourseIdEnrollmentCode
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.EnrollmentCode
import typingsJapgolly.maximMazurokGapiClientClassroom.anon.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StudentsResource extends StObject {
  
  def create(request: CourseIdEnrollmentCode, body: Student): Request[Student] = js.native
  /**
    * Adds a user as a student of a course. Domain administrators are permitted to [directly add](https://developers.google.com/classroom/guides/manage-users) users within their domain as
    * students to courses within their domain. Students are permitted to add themselves to a course using an enrollment code. This method returns the following error codes: *
    * `PERMISSION_DENIED` if the requesting user is not permitted to create students in this course or for access errors. * `NOT_FOUND` if the requested course ID does not exist. *
    * `FAILED_PRECONDITION` if the requested user's account is disabled, for the following request errors: * CourseMemberLimitReached * CourseNotModifiable *
    * UserGroupsMembershipLimitReached * InactiveCourseOwner * `ALREADY_EXISTS` if the user is already a student or teacher in the course.
    */
  def create(request: EnrollmentCode): Request[Student] = js.native
  
  /**
    * Deletes a student of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to delete students of this course or for
    * access errors. * `NOT_FOUND` if no student of this course has the requested ID or if the course does not exist.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: UserId): Request[js.Object] = js.native
  
  /**
    * Returns a student of a course. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to view students of this course or for
    * access errors. * `NOT_FOUND` if no student of this course has the requested ID or if the course does not exist.
    */
  def get(): Request[Student] = js.native
  def get(request: UserId): Request[Student] = js.native
  
  /**
    * Returns a list of students of this course that the requester is permitted to view. This method returns the following error codes: * `NOT_FOUND` if the course does not exist. *
    * `PERMISSION_DENIED` for access errors.
    */
  def list(): Request[ListStudentsResponse] = js.native
  def list(request: Callback): Request[ListStudentsResponse] = js.native
}
