public class VariablesAndNames {
    public static void main( String[] args ) {
        int cars, drivers, passengers, cars_not_driven, cars_driven, space_in_a_car, carpool_capacity;
        // Space in a car can't be a fractional number, so carpool capacity is also an integer
        double /*space_in_a_car, carpool_capacity,*/ average_passengers_per_car;

        // Number of cars
        cars = 100;
        // Number of passengers aside from driver (floating point is not necessary here as you can't have a fraction of car slots)
        space_in_a_car = /*4.0*/ 4;
        // Number of drivers available
        drivers = 30;
        // Number of passengers available
        passengers = 90;
        // There's one driver per car, so the number of cars not driven are the result of (number of cars) - (number of drivers)
        cars_not_driven = cars - drivers;
        // As said above, there's one driver for each car, so the number of cars driven is equal to the number of drivers
        cars_driven = drivers;
        // The quantity of passengers the drivers can move is equal to the number of cars times the space inside one single car
        carpool_capacity = cars_driven * space_in_a_car;
        // Average passengers per car is thee number of passengers divided by the number of cars being used
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}