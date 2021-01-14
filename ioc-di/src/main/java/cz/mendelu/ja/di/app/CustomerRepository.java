package cz.mendelu.ja.di.app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class CustomerRepository {

    private String fileName;

    private Map<Integer, Customer> cache = new LinkedHashMap<>();

    private void init() {
        // After create read data from file to cache.
    }

    private void flush() {
        // Write data to file.
    }

    public Customer save(Customer customer) {
        cache.put(customer.getId(), customer);
        flush();
        return customer;
    }

    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(cache.get(id));
    }
}
