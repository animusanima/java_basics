Scenario: Default value for uninitialized byte

Given a variable of type byte
When there is no value assigned to it
Then it should return the default value of <defaultVal>
defaultVal
0

Given a variable of type byte
When the value <value1> is assigned to it
Then the <returnValue> should be equal to <value1>
value1|returnValue
1|1