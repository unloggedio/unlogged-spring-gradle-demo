package org.unlogged.demo.gradle.utils;


import org.unlogged.demo.gradle.models.CustomerProfile;

public class ScoreUtils {
    public static int CalculateScoreForCenosCustomer(CustomerProfile profile, int bonus) {
        return profile.getReferralcodes().size() * bonus;
    }
}
