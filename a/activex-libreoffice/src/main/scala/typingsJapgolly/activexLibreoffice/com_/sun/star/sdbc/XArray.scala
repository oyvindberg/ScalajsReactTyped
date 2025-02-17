package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for mapping the SQL type {@link com.sun.star.sdbc.DataType.ARRAY} .
  *
  * By default, an `Array` is a transaction duration reference to an SQL array. By default, an `Array` is implemented using a SQL LOCATOR(array)
  * internally.
  */
trait XArray
  extends StObject
     with XInterface {
  
  /**
    * returns the SDBC type of the elements in the array designated by this `Array` object.
    * @returns a constant from the SDBC types that is the type code for the elements in the array designated by this Array object.
    * @throws SQLException if a database access error occurs.
    */
  val BaseType: Double
  
  /**
    * returns the SQL type name of the elements in the array designated by this `Array` object.
    *
    * If the elements are a built-in type, it returns the database-specific type name of the elements. If the elements are a user-defined type (UDT), this
    * method returns the fully-qualified SQL type name.
    * @returns a String that is the database-specific name for a built-in base type or the fully-qualified SQL type name for a base type that is a UDT
    * @throws SQLException if a database access error occurs.
    */
  val BaseTypeName: String
  
  /**
    * retrieves the contents of the SQL array designated by this `Array` object, using the specified `typeMap` for type map customizations.
    *
    * If the base type of the array does not match a user-defined type in `typeMap` , the standard mapping is used instead.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an sequence that contains the ordered elements of the SQL array designated by this object.
    * @throws SQLException if an error occurs while attempting to access the array.
    */
  def getArray(typeMap: XNameAccess): SafeArray[Any]
  
  /**
    * returns an array containing a slice of the SQL array, beginning with the specified `index` and containing up to `count` successive elements of the SQL
    * array.
    * @param index is the array index of the first element to retrieve; the first element is at index 1.
    * @param count is the number of successive SQL array elements to retrieve.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an array containing up to `count` consecutive elements of the SQL array, beginning with element `index` .
    * @throws SQLException if an error occurs while attempting to access the array.
    */
  def getArrayAtIndex(index: Double, count: Double, typeMap: XNameAccess): SafeArray[Any]
  
  /**
    * returns the SDBC type of the elements in the array designated by this `Array` object.
    * @returns a constant from the SDBC types that is the type code for the elements in the array designated by this Array object.
    * @throws SQLException if a database access error occurs.
    */
  def getBaseType(): Double
  
  /**
    * returns the SQL type name of the elements in the array designated by this `Array` object.
    *
    * If the elements are a built-in type, it returns the database-specific type name of the elements. If the elements are a user-defined type (UDT), this
    * method returns the fully-qualified SQL type name.
    * @returns a String that is the database-specific name for a built-in base type or the fully-qualified SQL type name for a base type that is a UDT
    * @throws SQLException if a database access error occurs.
    */
  def getBaseTypeName(): String
  
  /**
    * returns a result set that contains the elements of the array designated by this `Array` object and uses the given `typeMap` to map the array elements.
    * If the base type of the array does not match a user-defined type in `typeMap` or the `typeMap` is `NULL` , the connection type mapping is used
    * instead.
    *
    * The result set contains one row for each array element, with two columns in each row. The second column stores the element value; the first column
    * stores the index into the array for that element (with the first array element being at index 1). The rows are in ascending order corresponding to the
    * order of the indices.
    * @param typeMap contains mapping of SQL user-defined types to classes in the UNO programming language
    * @returns a {@link ResultSet} object containing one row for each of the elements in the array designated by this Array object, with the rows in ascending o
    * @throws SQLException if a database access error occurs.
    */
  def getResultSet(typeMap: XNameAccess): XResultSet
  
  /**
    * returns a result set holding the elements of the subarray that starts at index `index` and contains up to `count` successive elements. This method
    * uses the given `typeMap` to map the array elements. If the base type of the array does not match a user-defined type in `typeMap` or the `typeMap` is
    * `NULL` , the connection type mapping is used instead.
    *
    * The result set contains one row for each array element, with two columns in each row. The second column stores the element value; the first column
    * stores the index into the array for that element (with the first array element being at index 1). The rows are in ascending order corresponding to the
    * order of the indices.
    * @param index the array index of the first element to retrieve; the first element is at index 1.
    * @param count the number of successive SQL array elements to retrieve,
    * @param typeMap the Map object that contains the mapping of SQL type names to classes in the UNO programming language.
    * @returns a {@link ResultSet} object containing up to count consecutive elements of the SQL array designated by this Array object, starting at index index.
    * @throws SQLException if a database access error occurs.
    */
  def getResultSetAtIndex(index: Double, count: Double, typeMap: XNameAccess): XResultSet
}
object XArray {
  
  inline def apply(
    BaseType: Double,
    BaseTypeName: String,
    acquire: Callback,
    getArray: XNameAccess => SafeArray[Any],
    getArrayAtIndex: (Double, Double, XNameAccess) => SafeArray[Any],
    getBaseType: CallbackTo[Double],
    getBaseTypeName: CallbackTo[String],
    getResultSet: XNameAccess => XResultSet,
    getResultSetAtIndex: (Double, Double, XNameAccess) => XResultSet,
    queryInterface: `type` => Any,
    release: Callback
  ): XArray = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], BaseTypeName = BaseTypeName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getArray = js.Any.fromFunction1(getArray), getArrayAtIndex = js.Any.fromFunction3(getArrayAtIndex), getBaseType = getBaseType.toJsFn, getBaseTypeName = getBaseTypeName.toJsFn, getResultSet = js.Any.fromFunction1(getResultSet), getResultSetAtIndex = js.Any.fromFunction3(getResultSetAtIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XArray]
  }
  
  extension [Self <: XArray](x: Self) {
    
    inline def setBaseType(value: Double): Self = StObject.set(x, "BaseType", value.asInstanceOf[js.Any])
    
    inline def setBaseTypeName(value: String): Self = StObject.set(x, "BaseTypeName", value.asInstanceOf[js.Any])
    
    inline def setGetArray(value: XNameAccess => SafeArray[Any]): Self = StObject.set(x, "getArray", js.Any.fromFunction1(value))
    
    inline def setGetArrayAtIndex(value: (Double, Double, XNameAccess) => SafeArray[Any]): Self = StObject.set(x, "getArrayAtIndex", js.Any.fromFunction3(value))
    
    inline def setGetBaseType(value: CallbackTo[Double]): Self = StObject.set(x, "getBaseType", value.toJsFn)
    
    inline def setGetBaseTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getBaseTypeName", value.toJsFn)
    
    inline def setGetResultSet(value: XNameAccess => XResultSet): Self = StObject.set(x, "getResultSet", js.Any.fromFunction1(value))
    
    inline def setGetResultSetAtIndex(value: (Double, Double, XNameAccess) => XResultSet): Self = StObject.set(x, "getResultSetAtIndex", js.Any.fromFunction3(value))
  }
}
