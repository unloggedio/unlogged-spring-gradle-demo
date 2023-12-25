package org.unlogged.demo.gradle.models;

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

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean getCustomerEligible() {
        return customerEligible;
    }

    public void setCustomerEligible(boolean customerEligible) {
        this.customerEligible = customerEligible;
    }

    @Override
    public String toString() {
        return "CustomerScoreCard{" +
                "customerProfile=" + customerProfile +
                ", score=" + score +
                ", isCustomerEligible=" + customerEligible +
                '}';
    }
}
