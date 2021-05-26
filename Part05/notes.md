# Object

Object refers to an independent entity that contains variables and behavior
Objects interect with each other through method calls- these method calls are
used to both request information from objects and give instructions.

A ***class*** contains the blueprint needed to create objects, and also defines
the objects' variables and methods. An object is created on the basis of the class constructor

The state of an object is the value of its internal variables at any given point in time.

# Class

    A class defines the types of objects that can be created from it. It contains
    instance variables describing the object's data, a constructor used to create it
    and methods that define its behavior.

# Method Overloading

    Methods can be overloaded in the same way as constructors.
    Parameters of the different versions must be different.

# Objects and References

A constructor call return the reference to an object. A ***reference*** is information 
about the location of object data.

# Object as a Method Parameter

Since objects are reference variables. any type of object can be defined to be a method parameter.

# Object of same type as Method Parameter

Create a boolean method to compare if the age of a person is greater or less
(object.olderThan(objectGivenAsParameter))
Even though the object variables 'year', 'month', 'day' are encapsulated (private) 
object variables, we can read their values by writing compared.*variableName*.
This is because 'private' variables can be accessed from all the methods contained by that class.

# Comparing the equality of objects(equals)

String must be compared using 'equals' method
If we want to compare  two objects of our own design with the 'equals' method, that method
must be defined in the class. 'equals' is  defined as a method that returns a boolean type value

The 'equals' method is implemented in such a way that it can be used to compare the 
current object  with any other object.
The 'equals' method compares if the addresses are equal: if-so, the objects are equal.
Next, the 'Object'-type object passed as the parameter is converted to the type of the object
that is being examined by using a type cast.

# Object as a method's return value

A method can return an object of any type.
