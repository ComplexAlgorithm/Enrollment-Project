/** Java documentation 
 * 
 * StackInterface represents the Stack Abstract Data Type which 
 * allows items to be added to the top of the stack and allows items
 * to be removed from the top of the stack
 * 
 * 
 *
 */
public interface StackInterface<T> { //<T> is a type parameter which allows the type to be passed as argument
	//generics are classes or interfaces that have type parameters 
	//being an interface that is parameterized over types
	//interfaces are not classes, they do not have instance variables, constructors, or methods
	//they have method headings that must be implemented by a class that chooses to implement
	//the interface
	
	/**
	 * Adds an item to the top of the stack if there is room
	 * otherwise throws StackFullException
	 * @param item will be added to the top of the stack
	 * @throws StackFullException when the stack is full 
	 */
	public void push(T item) throws StackFullException; //method heading
	
	/**
	 * Removes the item from the top of the stack if there is one
	 * otherwise throws StackEmptyException
	 * @throws StackEmptyException when the stack is empty
	 */
	public void pop() throws StackEmptyException; //method heading
	
	/**
	 * Returns the item at the top of the stack
	 * @return item at the top of the stack is returned
	 */
	public String peek() throws StackEmptyException; //method heading
	
	
	
	/**
	 * It should be noted that you are asked by the computer science to also
allow a user to view all faculty members of the computer science department from newest to
oldest in terms of time with the college. This functionality should be written into the toString
method of the ArrayBasedStack<T> class which overrides the definition it receives from the
Object class. If the stack is empty then this method will return an empty string. The computer
science department would also like to be able to see the list in the reverse order from oldest to
newest in terms of time with the college. This functionality should be added to the
StackInterface<T> as the following method heading:

*/
	
/**
 * 
public String toString2();
//returns the items in the stack from the bottom up which means that the first item added to stack
//will be the first item returned and the second item added will be second one returned and so on
//if the stack is empty this method will return an empty string

Since this method heading has been added to the StackInterface<T>, this means that this method
must be implemented by the ArrayBasedStack<T> class. 
	 */
	public String toString2();
	//returns the items in the stack from the bottom up which means that the first item added to stack
	//will be the first item returned and the second item added will be second one returned and so on
	//if the stack is empty this method will return an empty string
} 

