package org.unlogged.demo.gradle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.unlogged.demo.gradle.dao.UniversityRepo;
import org.unlogged.demo.gradle.models.CustomerProfile;
import org.unlogged.demo.gradle.models.CustomerProfileRequest;
import org.unlogged.demo.gradle.models.CustomerScoreCard;
import org.unlogged.demo.gradle.models.University;
import org.unlogged.demo.gradle.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private UniversityRepo universityRepo;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/get")
    public CustomerProfile getCustomerProfile(@RequestParam long customerID) {
        CustomerProfile e = customerService.fetchCustomerProfile(customerID);
        return e;
    }

    @RequestMapping("/create")
    @PostMapping
    public CustomerProfile saveCustomerProfile(@RequestParam CustomerProfileRequest saveRequest) {
        return customerService.saveNewCustomer(saveRequest);
    }

    @RequestMapping("/remove")
    public CustomerProfile removeCustomerProfile(@RequestParam long customerID) {
        return customerService.removeCustomer(customerID);
    }

    @RequestMapping("/generateReferral")
    public CustomerProfile generateNeReferralCode(@RequestParam long customerID) {
        return customerService.generateReferralForCustomer(customerID);
    }

    public CustomerScoreCard isCustomerEligibleForLoyaltyProgram(@RequestParam long customerID) {
        return customerService.isCustomerEligibleForPremium(customerID);
    }

    public University getU2() {
        return universityRepo.getReferenceById("2");
    }

}
