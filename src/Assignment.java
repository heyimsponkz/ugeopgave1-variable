
public class Assignment {

    public static void main(String[] args) {
        // Opgave 1

        double[] prices = {25.50, 15.00, 30.00};
        double sumOfPrices = prices[0] + prices[1] + prices[2];
        double tax = 25.0;
        double totalPriceTaxed = sumOfPrices + (sumOfPrices * tax / 100);
        System.out.println(sumOfPrices);
        System.out.println(totalPriceTaxed);

        // Opgave 2

        double food = 450.0;
        double drink = 120.0;
        double tip = 50.0;
        int amountOfPeople = 4;
        double totalBill = food + drink + tip;
        double paymentPerPerson = (food + drink + tip) / amountOfPeople;
        System.out.println(paymentPerPerson);

        // Opgave 3

        double initialPrice = 300.0;
        double discountPrice = 20.0;
        double priceDiscount = initialPrice - (initialPrice * discountPrice / 100);
        double priceDiscountTax = priceDiscount + (priceDiscount * tax / 100);
        System.out.println(initialPrice);
        System.out.println(priceDiscount);
        System.out.println(priceDiscountTax);

        // Opgave 4

        int guestAmount = 15;
        int cupcakeAmount = 40;
        int cakeForEach = cupcakeAmount/ guestAmount;
        System.out.println("Each persons gets " + cakeForEach + " cupcakes");
        int cakeLeftover = cupcakeAmount % guestAmount;
        System.out.println("There are " + cakeLeftover + " cupcakes left");

        // Opgave 5

        StringBuilder sb = new StringBuilder();
        String name = "Anna";
        int age = 25;
        sb.append("Hello ");
        sb.append(name);
        sb.append("!");
        sb.append(" You are ");
        sb.append(age);
        sb.append(" years old!");
        System.out.println(sb.toString());

        // Opgave 6

        int score = 100;
        System.out.println(score);
        score += 50;
        System.out.println(score);
        score += 25;
        System.out.println(score);

        // Opgave 7

        int health = 100;
        health -= 15;
        System.out.println(health);
        health += 20;
        System.out.println(health);

        // Opgave 8
        double specialPrice = 50.0;
        System.out.println(specialPrice);
        specialPrice *= 2;
        System.out.println(specialPrice);

        // Opgave 9

        int counter = 10;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        // Opgave 10

        int number = 10;
        number += 5;
        System.out.println(number);
        number -= 3;
        System.out.println(number);
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        // Opgave 11

        String itemForSale = "Laptop";
        double customerPayment = 7999.99;
        boolean itemLeftOver = true;
        int itemsLeft = 15;
        double discountAmount = 10.0;
        String itemCategory = "Electronics";

        // Opgave 12

        String studentName = "Anna";
        int testScore = 85;
        int assignmentScore = 92;
        double finalGrade = 88.5;
        boolean studentPassed = true;

        // Opgave 13

        String guestName = "Peter Hansen";
        int roomNumber = 204;
        int guestNights = 3;
        double amountPerNight = 899.0;
        boolean breakfastIncluded = true;
        double fullGuestPrice = 2697.00;

        // Opgave 14

        int stepsToday = 8547;
        int preferredSteps = 10000;
        double stepsInKilometer = 6.2;
        int caloriesBurned = 420;
        boolean goalAchieved = false;

        // Opgave 15

        String bookTitle = "Introduction to Java";
        String authorName = "John Johnsen";
        String isbn = "978-0-123456-78-9";
        int bookPages = 469;
        boolean isAvailable = true;
        String currentBorrower = "Jim Jameson";
        String dueDate = "29-01-2026";
        double fine = 69.420;
        boolean isBestseller = false;
        double rating = 6.5;
    }
}