package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BEGINS_WITH
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BETWEEN
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CONTAINS
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.EQ
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GT
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.IN
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.LE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.LT
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NE
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NOT_CONTAINS
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NOT_NULL
import typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.NULL
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpectedAttributeValueMod {
  
  trait ExpectedAttributeValue extends StObject {
    
    /**
      * <p>One or more values to evaluate against the supplied attribute. The number of values in the list depends on the <code>ComparisonOperator</code> being used.</p> <p>For type Number, value comparisons are numeric.</p> <p>String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.</p> <p>For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.</p> <p>For information on specifying data types in JSON, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var AttributeValueList: js.UndefOr[js.Array[AttributeValue] | js.Iterable[AttributeValue]] = js.undefined
    
    /**
      * <p>A comparator for evaluating attributes in the <code>AttributeValueList</code>. For example, equals, greater than, less than, etc.</p> <p>The following comparison operators are available:</p> <p> <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> </p> <p>The following are descriptions of each comparison operator.</p> <ul> <li> <p> <code>EQ</code> : Equal. <code>EQ</code> is supported for all data types, including lists and maps.</p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> element of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an <code>AttributeValue</code> element of a different type than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.</p> <p/> </li> <li> <p> <code>NE</code> : Not equal. <code>NE</code> is supported for all data types, including lists and maps.</p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> of type String, Number, Binary, String Set, Number Set, or Binary Set. If an item contains an <code>AttributeValue</code> of a different type than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>.</p> <p/> </li> <li> <p> <code>LE</code> : Less than or equal. </p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> element of type String, Number, or Binary (not a set type). If an item contains an <code>AttributeValue</code> element of a different type than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.</p> <p/> </li> <li> <p> <code>LT</code> : Less than. </p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> of type String, Number, or Binary (not a set type). If an item contains an <code>AttributeValue</code> element of a different type than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.</p> <p/> </li> <li> <p> <code>GE</code> : Greater than or equal. </p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> element of type String, Number, or Binary (not a set type). If an item contains an <code>AttributeValue</code> element of a different type than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.</p> <p/> </li> <li> <p> <code>GT</code> : Greater than. </p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> element of type String, Number, or Binary (not a set type). If an item contains an <code>AttributeValue</code> element of a different type than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code>.</p> <p/> </li> <li> <p> <code>NOT_NULL</code> : The attribute exists. <code>NOT_NULL</code> is supported for all data types, including lists and maps.</p> <note> <p>This operator tests for the existence of an attribute, not its data type. If the data type of attribute "<code>a</code>" is null, and you evaluate it using <code>NOT_NULL</code>, the result is a Boolean <code>true</code>. This result is because the attribute "<code>a</code>" exists; its data type is not relevant to the <code>NOT_NULL</code> comparison operator.</p> </note> </li> <li> <p> <code>NULL</code> : The attribute does not exist. <code>NULL</code> is supported for all data types, including lists and maps.</p> <note> <p>This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "<code>a</code>" is null, and you evaluate it using <code>NULL</code>, the result is a Boolean <code>false</code>. This is because the attribute "<code>a</code>" exists; its data type is not relevant to the <code>NULL</code> comparison operator.</p> </note> </li> <li> <p> <code>CONTAINS</code> : Checks for a subsequence, or value in a set.</p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the operator looks for a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it finds an exact match with any member of the set.</p> <p>CONTAINS is supported for lists: When evaluating "<code>a CONTAINS b</code>", "<code>a</code>" can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.</p> </li> <li> <p> <code>NOT_CONTAINS</code> : Checks for absence of a subsequence, or absence of a value in a set.</p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> element of type String, Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the operator checks for the absence of a subsequence of the target that matches the input. If the target attribute of the comparison is a set ("<code>SS</code>", "<code>NS</code>", or "<code>BS</code>"), then the operator evaluates to true if it <i>does not</i> find an exact match with any member of the set.</p> <p>NOT_CONTAINS is supported for lists: When evaluating "<code>a NOT CONTAINS b</code>", "<code>a</code>" can be a list; however, "<code>b</code>" cannot be a set, a map, or a list.</p> </li> <li> <p> <code>BEGINS_WITH</code> : Checks for a prefix. </p> <p> <code>AttributeValueList</code> can contain only one <code>AttributeValue</code> of type String or Binary (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a Number or a set type).</p> <p/> </li> <li> <p> <code>IN</code> : Checks for matching elements in a list.</p> <p> <code>AttributeValueList</code> can contain one or more <code>AttributeValue</code> elements of type String, Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of the input are equal to the item attribute, the expression evaluates to true.</p> </li> <li> <p> <code>BETWEEN</code> : Greater than or equal to the first value, and less than or equal to the second value. </p> <p> <code>AttributeValueList</code> must contain two <code>AttributeValue</code> elements of the same type, either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater than, or equal to, the first element and less than, or equal to, the second element. If an item contains an <code>AttributeValue</code> element of a different type than the one provided in the request, the value does not match. For example, <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6", "2", "1"]}</code> </p> </li> </ul>
      */
    var ComparisonOperator: js.UndefOr[
        EQ | NE | IN | LE | LT | GE | GT | BETWEEN | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | String
      ] = js.undefined
    
    /**
      * <p>Causes DynamoDB to evaluate the value before attempting a conditional operation:</p> <ul> <li> <p>If <code>Exists</code> is <code>true</code>, DynamoDB will check to see if that attribute value already exists in the table. If it is found, then the operation succeeds. If it is not found, the operation fails with a <code>ConditionalCheckFailedException</code>.</p> </li> <li> <p>If <code>Exists</code> is <code>false</code>, DynamoDB assumes that the attribute value does not exist in the table. If in fact the value does not exist, then the assumption is valid and the operation succeeds. If the value is found, despite the assumption that it does not exist, the operation fails with a <code>ConditionalCheckFailedException</code>.</p> </li> </ul> <p>The default setting for <code>Exists</code> is <code>true</code>. If you supply a <code>Value</code> all by itself, DynamoDB assumes the attribute exists: You don't have to set <code>Exists</code> to <code>true</code>, because it is implied.</p> <p>DynamoDB returns a <code>ValidationException</code> if:</p> <ul> <li> <p> <code>Exists</code> is <code>true</code> but there is no <code>Value</code> to check. (You expect a value to exist, but don't specify what that value is.)</p> </li> <li> <p> <code>Exists</code> is <code>false</code> but you also provide a <code>Value</code>. (You cannot expect an attribute to have a value, while also expecting it not to exist.)</p> </li> </ul>
      */
    var Exists: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Represents the data for the expected attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var Value: js.UndefOr[AttributeValue] = js.undefined
  }
  object ExpectedAttributeValue {
    
    inline def apply(): ExpectedAttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpectedAttributeValue]
    }
    
    extension [Self <: ExpectedAttributeValue](x: Self) {
      
      inline def setAttributeValueList(value: js.Array[AttributeValue] | js.Iterable[AttributeValue]): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
      
      inline def setAttributeValueListVarargs(value: AttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
      
      inline def setComparisonOperator(
        value: EQ | NE | IN | LE | LT | GE | GT | BETWEEN | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | String
      ): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
      
      inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "Exists", js.undefined)
      
      inline def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  trait UnmarshalledExpectedAttributeValue
    extends StObject
       with ExpectedAttributeValue {
    
    /**
      * <p>One or more values to evaluate against the supplied attribute. The number of values in the list depends on the <code>ComparisonOperator</code> being used.</p> <p>For type Number, value comparisons are numeric.</p> <p>String value comparisons for greater than, equals, or less than are based on ASCII character code values. For example, <code>a</code> is greater than <code>A</code>, and <code>a</code> is greater than <code>B</code>. For a list of code values, see <a href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.</p> <p>For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.</p> <p>For information on specifying data types in JSON, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("AttributeValueList")
    var AttributeValueList_UnmarshalledExpectedAttributeValue: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.undefined
    
    /**
      * <p>Represents the data for the expected attribute.</p> <p>Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes">Data Types</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("Value")
    var Value_UnmarshalledExpectedAttributeValue: js.UndefOr[UnmarshalledAttributeValue] = js.undefined
  }
  object UnmarshalledExpectedAttributeValue {
    
    inline def apply(): UnmarshalledExpectedAttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledExpectedAttributeValue]
    }
    
    extension [Self <: UnmarshalledExpectedAttributeValue](x: Self) {
      
      inline def setAttributeValueList(value: js.Array[UnmarshalledAttributeValue]): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
      
      inline def setAttributeValueListVarargs(value: UnmarshalledAttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
      
      inline def setValue(value: UnmarshalledAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
}
