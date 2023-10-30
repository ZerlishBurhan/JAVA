/*
 *
 *Purpose:  Inheritance
            e.g.,
            1) Interface class since it has all abstract methods 
            2) Interface Class: An interface is similar to an abstract class that has all abstract methods. A class that is used to group related methods with empty bodies.
            3) An Interface class cannot be instantiated.
            
*/

public interface Relatable
{
    boolean isEqual(Object obj); //public, abstract are optional to write here
	boolean isLess(Object obj);
	boolean isGreater(Object obj);
	
}//interface