public class EligibilityChecker {

    public static String checkEligibility(int age, int income, boolean hasCriminalRecord) {
        if (age < 18) {
            return "Not eligible";
        }
        if (income < 20000) {
            return "Low income";
        }
        if (hasCriminalRecord) {
            return "Disqualified";
        }
        if (income > 100000 && age < 25) {
            return "Suspicious profile";
        }
        return "Eligible";
    }

    public static void main(String[] args) {
        // Example concrete input
        int age = 30;
        int income = 15000;
        boolean hasCriminalRecord = false;

        String result = checkEligibility(age, income, hasCriminalRecord);
        System.out.println("Eligibility: " + result);
    }
}
