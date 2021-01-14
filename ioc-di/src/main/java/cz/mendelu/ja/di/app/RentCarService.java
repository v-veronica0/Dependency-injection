package cz.mendelu.ja.di.app;

public class RentCarService {

    private CustomerService customerService;

    public RentRecord rent(int idCustomer, String spz, int days) {
        Customer customer = customerService.getById(idCustomer);

        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
