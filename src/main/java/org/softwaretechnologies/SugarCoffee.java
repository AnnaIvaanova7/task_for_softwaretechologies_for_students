package org.softwaretechnologies;


// TODO: 09.12.2024 /**
//     Создайте класс SugarCoffee, поддерживающий интерфейс CofeIntrface
//     к стоимости базового напитка добавьте 20.
//     к описанию добавьте " + sugar"
//     */

public class SugarCoffee implements CoffeeInterface {

    private final CoffeeInterface baseCoffee;

    public SugarCoffee(CoffeeInterface baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost() + 20;
    }

    @Override
    public String description() {
        return baseCoffee.description() + " + sugar";
    }
}