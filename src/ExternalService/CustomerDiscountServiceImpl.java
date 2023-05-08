package ExternalService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RKM
 */
public class CustomerDiscountServiceImpl implements CustomerDiscountService {
    public double calculateDiscountPercentage(String customerId) {
        // This is a dummy implementation
        // In a real-world application, you would retrieve the customer's purchase history from a database or external service
        // For the purpose of this example, we will use a hardcoded value

        if ("123".equals(customerId)) {
            return 10.0;
        } else if ("456".equals(customerId)) {
            return 15.0;
        } else {
            return 0.0;
        }
    }
}

