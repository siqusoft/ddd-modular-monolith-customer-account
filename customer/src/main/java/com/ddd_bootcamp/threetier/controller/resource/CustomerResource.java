package com.ddd_bootcamp.threetier.controller.resource;

import com.ddd_bootcamp.domain.Customer;

import java.util.UUID;

public class CustomerResource {
    private String customerId;
    private AddressData addressData;

    public CustomerResource() {
    }

    public static CustomerResource from(Customer customer) {
        CustomerResource customerResource = new CustomerResource();
        customerResource.setCustomerId(customer.getCustomerIdAsString());

        customerResource.setAddressData(AddressData.from(customer.getAddress()));
        return customerResource;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public AddressData getAddressData() {
        return addressData;
    }

    public void setAddressData(AddressData addressData) {
        this.addressData = addressData;
    }

}
