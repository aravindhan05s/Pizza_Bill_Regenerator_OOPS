# Pizza Bill Generator Using Object-Oriented Programming (OOP)

## Project Overview

This is a simple Java program that simulates a pizza billing system using Object-Oriented Programming (OOP) principles. The project demonstrates how to create and manage pizza orders, calculate the price based on various attributes such as extra cheese, toppings, and take-away options, and generate an itemized bill.

The program includes two types of pizzas:
1. **Normal Pizza**: A basic pizza that allows you to customize with extra cheese, toppings, and take-away.
2. **Deluxe Pizza**: A premium pizza that already includes extra cheese and toppings by default, and cannot be modified in terms of those options.

### Features:
- Allows the customer to select a vegetarian or non-vegetarian pizza.
- Option to add extra cheese and toppings to the pizza.
- Option to opt for take-away packaging (an additional charge is applied).
- Generates a detailed bill that includes the base price, additions, and the final price.

---

## Classes and Structure

### 1. **Pizza Class**

The `Pizza` class is the main class used to represent a pizza order. This class includes:

- **Attributes**:
  - `price`: The total price of the pizza after any additions.
  - `veg`: Boolean value to indicate whether the pizza is vegetarian or non-vegetarian.
  - `extraCheesePrice`: Price of extra cheese (default is 100).
  - `extraToppings`: Price of extra toppings (default is 150).
  - `backPack`: Cost for take-away packaging (default is 20).
  - `baseprize`: The initial price based on the type of pizza (veg or non-veg).
  - Flags to track whether extra cheese, toppings, or take-away packaging have been added (`isExtraCheeseAdded`, `isExtraToppingsAdded`, `isOptedForTakeAway`).

- **Methods**:
  - Constructor: Initializes the pizza based on whether it's vegetarian or non-vegetarian and sets the base price.
  - `addExtraCheese()`: Adds extra cheese to the pizza and updates the price.
  - `addExtraToppings()`: Adds extra toppings to the pizza and updates the price.
  - `takeAway()`: Marks the pizza as a take-away order and adds packaging cost.
  - `getBill()`: Generates and prints the final bill with all the additions and the total price.

### 2. **DeluxPizza Class**

The `DeluxPizza` class extends the `Pizza` class to represent a premium pizza. 

- **Constructor**: The constructor automatically adds extra cheese and toppings when the pizza is created (since deluxe pizzas include these by default).
- **Overridden Methods**: The methods `addExtraCheese()` and `addExtraToppings()` are overridden so that the customer cannot add extra cheese or toppings to a deluxe pizza, as these are already included.

### 3. **Main Class**

The `Main` class contains the `main()` method, where instances of `Pizza` and `DeluxPizza` are created, and various methods are called to simulate the ordering and billing process.

---

## How It Works

### Example:

```java
public class Main {
    public static void main(String[] args) {
       // Create a normal non-veg pizza
       Pizza base = new Pizza(false);
       base.addExtraToppings(); // Add extra toppings
       base.addExtraCheese();   // Add extra cheese
       base.takeAway();         // Opt for take-away packaging
       base.getBill();          // Print the bill

       // Create a deluxe non-veg pizza
       DeluxPizza dp = new DeluxPizza(false);
       dp.takeAway();           // Opt for take-away packaging for deluxe pizza
       dp.getBill();            // Print the bill for deluxe pizza
    }
}
```

### Output:
When you run the program, it will generate the following output:

```text
Pizza: 400
Extra Topping Added: 150
Extra Cheese Added: 100
Opted For TakeAway: 20
Bill: 670

Pizza: 400
Opted For TakeAway: 20
Bill: 420
```

---

## How to Run the Project

1. **Clone the repository**:
   Clone this project to your local machine using Git.

   ```bash
   git clone https://github.com/your-username/pizza-bill-generator.git
   ```

2. **Compile the code**:
   Use `javac` to compile the `Pizza`, `DeluxPizza`, and `Main` classes.

   ```bash
   javac Pizza.java DeluxPizza.java Main.java
   ```

3. **Run the program**:
   Use `java` to run the `Main` class and see the output.

   ```bash
   java Main
   ```

---

## Contributions

Feel free to fork this repository, make changes, and open a pull request if you have improvements or new features to contribute. If you find any bugs or issues, please create an issue in the GitHub repository.

---

## License

This project is open source and available under the MIT License.

---

## Conclusion

This project was created to demonstrate the basics of Object-Oriented Programming (OOP) principles such as inheritance, method overriding, and encapsulation. By working on this, I have learned how to structure a real-world scenario using OOP concepts. The program could be further extended with additional features like discounts, custom toppings, or different pizza sizes.

