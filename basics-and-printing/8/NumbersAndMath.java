public class NumbersAndMath {
    public static void main ( String[] args ){

        System.out.println( "I will now count my chickens:" );

        // Calculating simple math expressions
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );

		System.out.println( "Now I will count the eggs:" );

		// Bigger expression. Note how the code prioritazes modulus and division over addition and subtraction
        // I only need to write 1.0 as a fraction because it's the only part of the code that a floating point is mandatory
        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1.0 / 4 + 6 );

		// Using math symbols as chars inside a string. This way they are not used to call mathmatical/logic operations
        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		// Same expression used above, but now returning a boolean
        System.out.println( 3 + 2 < 5 - 7 );

        // Again using symbols as chars, and then operating with them
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

        // More logic operations
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );        
    }
}