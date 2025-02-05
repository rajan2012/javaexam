package optimizers.address;

import optimizers.Optimizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddressOptimizer implements Optimizer {
    private final String address;

    // Constructor that initializes the address field
    public AddressOptimizer(String address) {
        this.address = address;
    }

    // Package-private method to retrieve the address
    String getAddress() {
        return address;
    }

    @Override
    public List<String> optimize() {
        String[] result = AddressUtil.splitAddress(this);
        return (result != null) ? Arrays.asList(result) : Collections.emptyList();
    }
}
