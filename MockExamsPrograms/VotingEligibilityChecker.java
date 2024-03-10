class VotingEligibilityChecker {
    public static void main(String[] args) {
        // Define variables for age and citizenship
        int age = 18; // Age of the person
        char citizen = 'Y'; // Citizenship status ('Y' for yes, 'N' for no)

        // Check if the person is eligible to vote
        if (age >= 18 && citizen == 'Y') {
            System.out.println("You are eligible to vote."); // Display message if eligible
        } else {
            System.out.println("You are not eligible to vote."); // Display message if not eligible
        }
    }
}
