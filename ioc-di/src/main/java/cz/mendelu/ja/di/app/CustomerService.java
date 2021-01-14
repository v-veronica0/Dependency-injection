package cz.mendelu.ja.di.app;

public class CustomerService {

    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        if (customer.getCredit() < 0) {
            throw new IllegalStateException("No credit");
        }

        if (customer.getName() == null || !customer.getName().matches("\\w+ \\w+")) {
            throw  new IllegalStateException("Invalid name");
        }

        return customerRepository.save(customer);
    }

    public Customer getById(int idCustomer) {
        throw new UnsupportedOperationException("Not implmented yet.");
    }
}
