fun main() {

    //OPGAVE 1
    val employee1 : Employee = Employee("Andreas", "Pedersen", 100)
    employee1.monthlySalary = 120

    if (employee1.monthlySalary > 0) {
        println("Monthly salary is: ${employee1.monthlySalary}")
    } else {
        println("Monthly salary is 0.0")
    }

    val employee2 : Employee = Employee("Ian", "Patterson", 1500)
    employee2.monthlySalary = 130

    if (employee2.monthlySalary > 0) {
        println("Monthly salary is: ${employee2.monthlySalary}")
    } else {
        println("Monthly salary is 0.0")
    }

    println("The yearly salary for ${employee1.firstName} ${employee1.lastName} is ${employee1.yearlySalary()}")
    println("The yearly salary for ${employee2.firstName} ${employee2.lastName} is ${employee2.yearlySalary()}")

    println("The yearly salary with a 10% raise for ${employee1.firstName} ${employee1.lastName} is ${employee1.raise()}")
    println("The yearly salary with a 10% raise for ${employee2.firstName} ${employee2.lastName} is ${employee2.raise()}")


    //OPGAVE 2
    val itProduct1 : Laptop = Laptop("Macbook", "256 GB", 9500, 13.6);
    println(itProduct1.presentationOfProduct());

    val itProduct2 : Smartphone = Smartphone("Iphone", "125 GB", 6000, "Space-gray");
    println(itProduct2.presentationOfProduct());


    //OPGAVE 3
    val product1 : Shoe = Shoe("Nike Pegasus", 899.95, 2,39);
    println(product1.identifyProductCategory());

    val product2 : Tshirt = Tshirt("Weekday", 189.95, 1,false);
    println(product2.identifyProductCategory());

    val product3 : Book = Book("Harry Potter and the Deathly Hallows", 399.95, 1, 784);
    println(product3.identifyProductCategory());


    //OPGAVE 4
    val shape1 : Circle = Circle("Blue", false, 2)
    shape1.calculatePerimeter();
    shape1.calculateArea();

    val shape2 : Rectangle = Rectangle("Green", true, 4, 2)
    shape2.calculatePerimeter();
    shape2.calculateArea();

    val shape3 : Triangle = Triangle("Pink", false, 7, 4, 3.5, 3.7)
    shape3.calculatePerimeter();
    shape3.calculateArea();
}