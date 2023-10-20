import java.util.Scanner;

class Vehicle 
{
    protected String make;
    protected String model;
    protected double dailyRate;

    public Vehicle(String make, String model, double dailyRate) 
	{
        this.make = make;
        this.model = model;
        this.dailyRate = dailyRate;
    }
}

class Car extends Vehicle 
{
    private int numseat;

    public Car(String make, String model, double dailyRate, int numseat) 
	{
        super(make, model, dailyRate);
        this.numseat = numseat;
    }

    public double calculateRentalCost(int numdays) 
	{
        return dailyRate * numdays;
    }
	public void display(){
		System.out.println("Car Brand:"+make);
		System.out.println("Car model:"+model);
		System.out.println("Daily Rate:"+dailyRate);
		System.out.println("Num of seats:"+numseat);
	}
}

class Bus extends Vehicle 
{
    private int numseat;
    private String type;

    public Bus(String make, String model, double dailyRate, int numseat,String type) 
	{
        super(make, model, dailyRate);
        this.numseat = numseat;
		this.type=type;
    }

    public double calculateRentalCost(int numdays) 
	{
        return dailyRate * numdays;
    }
	public void display(){
		System.out.println("Bus Brand:"+make);
		System.out.println("Bus model:"+model);
		System.out.println("Daily Rate:"+dailyRate);
		System.out.println("Num of seats:"+numseat);
		System.out.println("Bus type:"+type);
	}
}

class Threewheel extends Vehicle
{
	private String fuel;
	public Threewheel(String make, String model, double dailyRate,String fuel)
	{
		super(make, model, dailyRate);
		this.fuel=fuel;
	}
	 public double calculateRentalCost(int numdays) 
	{
        return dailyRate * numdays;
    }
	public void display()
	{
		System.out.println("Three-wheel brand:"+make);
		System.out.println("Three-wheel:"+model);
		System.out.println("Three-wheel:"+dailyRate);
		System.out.println("Three-wheel:"+fuel);
	}
}

class Bike extends Vehicle
{
	public Bike(String make, String model, double dailyRate)
	{
		super(make, model, dailyRate);
		
	}
	 public double calculateRentalCost(int numdays) 
	{
        return dailyRate * numdays;
    }

	public void display()
	{
		System.out.println("Bike brand:"+make);
		System.out.println("Bike model:"+model);
		System.out.println("Bike daily rate:"+dailyRate);
	}
}

class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Car car = new Car("Toyota", "Camry", 5000.0, 5);
        Bus bus = new Bus("Ashok Leyland", "Sensor59", 20000.0,54,"Non AC");
		Threewheel thr=new Threewheel("Bajaj","RE",3500.0,"petrol");
		Bike bike=new Bike("Yamaha","Fz-s",4000.0);
       // while (true) 
		do
		{
            System.out.println("\n------WELCOME TO RENT HOUSE------");
            System.out.println("Select a vehicle to rent");
            System.out.println("1. Car");
            System.out.println("2. Bus");
			System.out.println("3.Three-wheel");
			System.out.println("4. Motor bike");
			
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
			System.out.println("---------------------------------");

            switch (choice) 
			{
                case 1:
                    System.out.println("For renting a car");
					car.display();
                    System.out.println("Enter the number of days to rent: ");
                    int numdays = sc.nextInt();

                    double carRentalCost = car.calculateRentalCost(numdays);
                    System.out.println("Total cost for renting the car: " + carRentalCost);
                    break;

                case 2:
                    System.out.println("For renting a Bus");
					bus.display();
					
                    System.out.println("Enter the number of days to rent: ");
                    numdays = sc.nextInt();

                    double busRentalCost = bus.calculateRentalCost(numdays);
                    System.out.println("Total cost for renting the bus: " + busRentalCost);
                    break;
					
				case 3:
				    System.out.println("For renting a Three-wheel");
					thr.display();
                    System.out.println("Enter the number of days to rent: ");
                    numdays = sc.nextInt();

                    double thrRentalCost = thr.calculateRentalCost(numdays);
					//System.out.println("Car brand:"+thr.make);
                    System.out.println("Total cost for renting the bus: " + thrRentalCost);
                    break;
				case 4:
					System.out.println("For renting a Motor-Bike");
					bike.display();
                    System.out.println("Enter the number of days to rent: ");
                    numdays = sc.nextInt();

                    double bikeRentalCost = bike.calculateRentalCost(numdays);
                    System.out.println("Total cost for renting the bus: " + bikeRentalCost);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
		}
		}while(true);
				
        }
    }