package cz.mendelu.ja.di;

import cz.mendelu.ja.di.app.Controller;
import cz.mendelu.ja.di.provider.Context;

public class Main {

    public static void main(String[] args) {
        Context context = Context.builder().build();

        Controller controller = context.get("controller");
        // 1. Scénář vytvoření zákazníka
        controller.createCustomer(1, "Pepa Novak", 100)
                  .ifPresent(System.out::println);

        controller.rentCar("ABC1234", 1, 5)
                  .ifPresent(System.out::println);

    }
}
