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
public class CustomerManagementSystem1 {
    public static void main(String[] args) {
        // Create an instance of the service implementation
        CustomerDiscountService service = new CustomerDiscountServiceImpl();

        // Define a customer ID
        String customerId = "123";

        // Calculate the discount percentage
        double discountPercentage = service.calculateDiscountPercentage(customerId);

        // Print the discount percentage to the console
        System.out.println("Discount percentage for customer " + customerId + ": " + discountPercentage + "%");
    }
}

