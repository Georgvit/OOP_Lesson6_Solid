package solid;

import solid.srp.models.InputData;
import solid.srp.models.Order;
import solid.srp.models.SavingData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        new InputData(order).inputFromConsole(order);
        new SavingData(order).saveToJson(order);
    }
}
