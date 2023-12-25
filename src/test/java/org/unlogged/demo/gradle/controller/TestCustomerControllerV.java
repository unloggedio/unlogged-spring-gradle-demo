package org.unlogged.demo.gradle.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.Class;
import java.lang.Exception;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.unlogged.demo.gradle.models.CustomerProfile;
import org.unlogged.demo.gradle.service.CustomerService;
import org.unlogged.demo.gradle.models.CustomerProfileRequest;
import static io.unlogged.UnloggedTestUtils.*;
import static org.mockito.ArgumentMatchers.*;
import org.unlogged.demo.gradle.models.CustomerScoreCard;

public final class TestCustomerControllerV {

    private CustomerController customerController;

    private CustomerService customerService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void setup() throws Exception {
        customerService = Mockito.mock(CustomerService.class);
        customerController = new CustomerController();
        injectField(customerController, "customerService", customerService);
    }

    @Test
    public void testMethodGetCustomerProfile() throws Exception {
        CustomerProfile fetchCustomerProfileResult = objectMapper.readValue("{\"customerid\":1,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]}", CustomerProfile.class);
        Mockito.when(customerService.fetchCustomerProfile(eq(0L))).thenReturn(fetchCustomerProfileResult);
        CustomerProfile fetchedProfile = customerController.getCustomerProfile(0);
        CustomerProfile fetchCustomerProfileResultExpected = objectMapper.readValue("{\"customerid\":1,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]}", CustomerProfile.class);
        Assertions.assertEquals(fetchCustomerProfileResultExpected.getCustomerid(), fetchedProfile.getCustomerid());
    }

    @Test
    public void testMethodSaveCustomerProfile() throws Exception {
        CustomerProfile saveNewCustomerResult = objectMapper.readValue("{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]}", CustomerProfile.class);
        Mockito.when(customerService.saveNewCustomer(any(CustomerProfileRequest.class))).thenReturn(saveNewCustomerResult);
        CustomerProfileRequest saveRequest = objectMapper.readValue("{\"customerName\":\"string\",\"dateOfBirth\":\"string\",\"email\":\"string\",\"primaryNumber\":\"string\",\"address\":\"string\",\"codes\":[\"string\"]}", CustomerProfileRequest.class);
        CustomerProfile actualResponse = customerController.saveCustomerProfile(saveRequest);
        CustomerProfile saveNewCustomerResultExpected = objectMapper.readValue("{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]}", CustomerProfile.class);
        Assertions.assertEquals(saveNewCustomerResultExpected.toString(), actualResponse.toString());
    }

    @Test
    public void testMethodRemoveCustomerProfile() throws Exception {
        CustomerProfile removeCustomerResult = objectMapper.readValue("{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]}", CustomerProfile.class);
        Mockito.when(customerService.removeCustomer(eq(0L))).thenReturn(removeCustomerResult);
        removeCustomerResult = customerController.removeCustomerProfile(0);
        CustomerProfile removeCustomerResultExpected = objectMapper.readValue("{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]}", CustomerProfile.class);
        Assertions.assertEquals(removeCustomerResultExpected.toString(), removeCustomerResult.toString());
    }

    @Test
    public void testMethodGenerateNeReferralCode() throws Exception {
        CustomerProfile generateReferralForCustomerResult = objectMapper.readValue("{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"ref-1\",\"new ref\"]}", CustomerProfile.class);
        Mockito.when(customerService.generateReferralForCustomer(eq(0L))).thenReturn(generateReferralForCustomerResult);
        generateReferralForCustomerResult = customerController.generateNeReferralCode(0);
        CustomerProfile generateReferralForCustomerResultExpected = objectMapper.readValue("{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"ref-1\",\"new ref\"]}", CustomerProfile.class);
        Assertions.assertEquals(generateReferralForCustomerResultExpected.toString(), generateReferralForCustomerResult.toString());
    }

    @Test
    public void testMethodIsCustomerEligibleForLoyaltyProgram() throws Exception {
        CustomerScoreCard isCustomerEligibleForPremiumResult = objectMapper.readValue("{\"customerProfile\":{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]},\"score\":50,\"customerEligible\":true}", CustomerScoreCard.class);
        Mockito.when(customerService.isCustomerEligibleForPremium(eq(0L))).thenReturn(isCustomerEligibleForPremiumResult);
        isCustomerEligibleForPremiumResult = customerController.isCustomerEligibleForLoyaltyProgram(0);
        CustomerScoreCard isCustomerEligibleForPremiumResultExpected = objectMapper.readValue("{\"customerProfile\":{\"customerid\":0,\"customername\":\"string\",\"dateofbirth\":\"string\",\"email\":\"string\",\"contactnumber\":\"string\",\"address\":\"string\",\"referralcodes\":[\"string\"]},\"score\":50,\"customerEligible\":true}", CustomerScoreCard.class);
        Assertions.assertEquals(isCustomerEligibleForPremiumResultExpected.toString(), isCustomerEligibleForPremiumResult.toString());
    }
}
