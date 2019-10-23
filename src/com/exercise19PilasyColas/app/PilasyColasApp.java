package com.exercise19PilasyColas.app;
import java.util.Stack;
public class PilasyColasApp {

	public static void main(String[] args) 
	{
		/*
		 * ejemplos de StringBuilder  
		 * int num = 5000;
		  StringBuilder s = new StringBuilder("Hola Caracola");
		  System.out.println(s);
		  
		  System.out.println("La capacidad es "+s.capacity());
		  System.out.println("La longitud es: "+s.length());
		  System.out.println(s.replace(0, 29, "Hay Caracolas"));
		  
		  System.out.println(s.insert(4, num+" "));
		  System.out.println(s.insert(18, " en el mar "));
		  
		// TODO Auto-generated method stub*/
		String cad = " From the hierarchy diagram, they all implement List interface. They are very similar to use. Their main difference is their implementation which causes different performance for different operations.  ArrayList is implemented as a resizable array. As more elements are added to ArrayList, its size is increased dynamically. It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array. LinkedList is implemented as a double linked list. Its performance on add and remove is better than Arraylist, but worse on get and set methods. Vector is similar with ArrayList, but it is synchronized. ArrayList is a better choice if your program is thread-safe. Vector and ArrayList require space as more elements are added. Vector each time doubles its array size, while ArrayList grow 50% of its size each time. LinkedList, however, also implements Queue interface which adds more methods than ArrayList and Vector, such as offer(), peek(), poll(), etc.    Note: The default initial capacity of an ArrayList is pretty small. It is a good habit to construct the ArrayList with a higher initial capacity. This can avoid the resizing cost.   ";
				
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		for (Character c: lettersArray)
		{
			if(Character.toUpperCase(c)=='A')									//if (c=='a' || c=='A')
			{
				letters.push(c);
			}
		}
		while (!letters.isEmpty())
		//for (Character c:letters )
		{
			System.out.println(letters.pop());
		}

	}

}
