package cz.mendelu.ja.di.app;

import java.util.Optional;

public class Controller {

    private CustomerService customerService;

    private RentCarService rentCarService;

    public Optional<Customer> createCustomer(int id, String name, int credit) {
        try {
            Customer customer = new Customer(id, name, credit);
            return Optional.of(customerService.saveCustomer(customer));
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Save failed: " + e.getMessage());
            return Optional.empty();
        }
    }

    public Optional<RentRecord> rentCar(String spz, int idCustomer, int days) {
        try {
            return Optional.of(rentCarService.rent(idCustomer, spz, days));
        } catch (Exception e) {
            System.err.println("Rent failed: " + e.getMessage());
            return Optional.empty();
        }
    }
}
