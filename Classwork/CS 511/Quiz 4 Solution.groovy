// Ben Rose
// I pledge my honor that I have abided by the Stevens Honor System.

monitor Pizzeria {

    private int smallPizzas, largePizzas = 0;
    private Condition small, largeOrTwoSmall;

    purchaseLargePizza() {
        while (largePizzas < 1 && smallPizzas < 2) {
            largeOrTwoSmall.wait();
        }
        if (largePizzas < 1) {
            smallPizzas -= 2;
        }
        else {
            largePizzas--;
        }
    }

    purchaseSmallPizza() {
        while (smallPizzas < 1) {
            small.wait();
        }
        smallPizzas--;
    }

    // Can bake unlimited pizzas at once according to instructor comment
    bakeSmallPizza() {
        smallPizzas++;
        small.signal();
    }    largeOrTwoSmall.signal(); // More efficient in this case

    bakeLargePizza() {
        largePizzas++;
        largeOrTwoSmall.signal(); // More efficient in this case
    }
}
