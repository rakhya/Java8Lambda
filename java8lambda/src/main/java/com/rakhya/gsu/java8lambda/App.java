package com.rakhya.gsu.java8lambda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Greet innerGreet = new Greet() {
			
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println( "Hello World!" );
			}
		};
        
		Greet lambdaGreet = () -> System.out.println( "Hello World!" );
		
		innerGreet.sayHello();
		lambdaGreet.sayHello();
    }
}
