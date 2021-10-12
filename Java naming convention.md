

																JAVA 


Java naming convention 
	Class naming convention: 
				All class names should start with a capital letter 
				Dont use underscore

	Properties & methid naming convention:
				Should start with a small letter, if there are more words first ltter should be capital

	Package naming convention:
				Always small letters
				java has so many packages 
					ex: java.lang --> frequently used package
						java.util --> utilites
						java.sql  --> database
						java.net  --> network conectivity
						java.io   --> input/output

	User defined package naming convention:
							
Using Eclipse :
	To look into projects : Project manager 
							Navigator

Java API consists of packages such as java.lang,java.sql etc..
		Inside Package :
			Classes
			Interfaces
			enums
			errors
			exception

If class is available is available in java.lang package we need not import thr class explicitly

If class is available in any other package then it has to be imported using 'import' statement

Types of methods:
	Static Methods:They are used to write utilites and generally static methods will have parameters static methods are also known as  
					class methods,static methods are called on the class name ex= minimum.min(a,b,c)
	Non Static Methods: belongs to the object and it is also called as object methods,they are called on object


Constructor : Is a method which is having name same of the class
			  Its generally public
			  Does not have return value
			  Used to initailize properties of the class

JDBC:
			  If we have where clasue then prepared statement has to be used.
        	  When we use stored procedure callable statement is used.