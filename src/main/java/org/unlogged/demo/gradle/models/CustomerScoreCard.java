package org.unlogged.demo.gradle.models;

import lombok.Data;

@Data
public class CustomerScoreCard {

    private CustomerProfile customerProfile;
    private int score;
    private boolean customerEligible;
//    private Date dateGenerated;

    public CustomerScoreCard(CustomerProfile customerProfile, int score, boolean CustomerEligible) {
        this.customerProfile = customerProfile;
        this.score = score;
        this.customerEligible = CustomerEligible;
//        this.dateGenerated = new Date();
    }

    public CustomerScoreCard() {
    }
}
