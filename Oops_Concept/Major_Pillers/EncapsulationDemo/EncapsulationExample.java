// package Oops_Concept.Major_Pillers.EncapsulationDemo; // Uncomment if this class is part of a specific package

import java.time.LocalDate; // For modern date handling (age calculation)
import java.time.Period;   // For calculating periods between dates (age)
import java.util.regex.Matcher; // For email validation
import java.util.regex.Pattern; // For email validation

/**
 * This class demonstrates the concept of Encapsulation in Java.
 * It contains a main method to create and interact with UserProfile objects.
 */
public class EncapsulationExample {

    /**
     * Represents a user's profile, encapsulating their data and behavior.
     * The internal state (attributes) are private, and access/modification
     * is controlled through public methods.
     */
    public static class UserProfile { // Made public static for easier access from main

        // --- Data (Attrijavacbutes) ---
        // These are 'private', meaning they cannot be directly accessed or modified
        // from outside this class. This protects the internal state of the object.
        private String username;
        private String emailAddress;
        private LocalDate dateOfBirth; // Using LocalDate for better date handling
        private String storedPasswordHash; // In a real app, this would be a hash, not plain text
        private int loginAttempts;
        private boolean isAccountLocked;

        // --- Methods (Functions) - Public Interface ---
        // These are 'public', providing the controlled and official way to
        // interact with UserProfile objects.

        /**
         * Constructor to create a new user profile.
         * It initializes the user's data and sets initial states for login attempts and account lock.
         * @param initialUsername The initial username for the profile.
         * @param initialEmail The initial email address for the profile.
         * @param dob The date of birth for the user.
         * @param password The initial password (for demonstration, in real apps, use hashing).
         */
        public UserProfile(String initialUsername, String initialEmail, LocalDate dob, String password) {
            // Basic validation for constructor parameters
            if (initialUsername == null || initialUsername.trim().isEmpty()) {
                throw new IllegalArgumentException("Username cannot be empty.");
            }
            if (initialEmail == null || !isValidEmail(initialEmail)) {
                throw new IllegalArgumentException("Invalid initial email address.");
            }
            if (dob == null || dob.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Date of birth cannot be null or in the future.");
            }
            if (password == null || password.length() < 6) { // Simple password strength check
                throw new IllegalArgumentException("Password must be at least 6 characters long.");
            }

            this.username = initialUsername;
            this.emailAddress = initialEmail;
            this.dateOfBirth = dob;
            // For demonstration, storing plain password.
            // In a real application, NEVER store plain passwords. Use strong hashing (e.g., BCrypt).
            this.storedPasswordHash = password;
            this.loginAttempts = 0;
            this.isAccountLocked = false;
            System.out.println("UserProfile created for: " + username);
        }

        /**
         * Retrieves the username. This is a 'getter' method.
         * @return The username.
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * Retrieves the email address. This is a 'getter' method.
         * @return The email address.
         */
        public String getEmail() {
            return this.emailAddress;
        }

        /**
         * Attempts to log in the user with a given password guess.
         * This method encapsulates the login logic, including tracking login attempts
         * and locking the account if too many failed attempts occur.
         * @param passwordGuess The password string provided by the user.
         * @return true if the password is correct, false otherwise.
         */
        public boolean attemptLogin(String passwordGuess) {
            if (this.isAccountLocked) {
                System.out.println("Login failed for " + username + ": Account is locked.");
                return false;
            }

            // Simple password check for demonstration.
            // In a real application, compare hashes:
            // if (BCrypt.checkpw(passwordGuess, this.storedPasswordHash)) {
            if (passwordGuess.equals(this.storedPasswordHash)) { // Simulating password check
                this.loginAttempts = 0; // Reset attempts on successful login
                System.out.println("Login successful for " + username + ".");
                return true;
            } else {
                this.loginAttempts++;
                System.out.println("Login failed for " + username + ". Attempts: " + this.loginAttempts);
                if (this.loginAttempts >= 3) { // Lock after 3 failed attempts
                    this.isAccountLocked = true;
                    System.out.println("Account for " + username + " has been locked due to too many failed attempts.");
                }
                return false;
            }
        }

        /**
         * Checks if the user's account is currently locked.
         * @return true if the account is locked, false otherwise.
         */
        public boolean isLocked() {
            return this.isAccountLocked;
        }

        /**
         * Calculates and returns the user's current age based on their date of birth.
         * The internal 'dateOfBirth' is not directly exposed, only the calculated age.
         * @return The user's age in full years.
         */
        public int getAge() {
            LocalDate today = LocalDate.now();
            // Period.between calculates the difference in years, months, and days
            Period p = Period.between(this.dateOfBirth, today);
            return p.getYears();
        }

        /**
         * Changes the user's email address after validating the new email format.
         * This method encapsulates the validation logic, ensuring that the email
         * is only updated if it's valid.
         * @param newEmail The new email address to set.
         * @return true if the email was successfully changed, false otherwise.
         */
        public boolean changeEmail(String newEmail) {
            if (isValidEmail(newEmail)) {
                this.emailAddress = newEmail;
                System.out.println("Email for " + username + " successfully changed to: " + newEmail);
                return true;
            } else {
                System.out.println("Failed to change email for " + username + ": '" + newEmail + "' is not a valid email format.");
                return false;
            }
        }

        /**
         * Private helper method for email validation.
         * This method is part of the internal implementation and not exposed publicly.
         * @param email The email string to validate.
         * @return true if the email matches a basic email pattern, false otherwise.
         */
        private boolean isValidEmail(String email) {
            // A common regex for basic email validation
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        /**
         * Resets the login attempts and unlocks the account.
         * This might be called by an administrator or after a "forgot password" flow.
         */
        public void resetLoginAttemptsAndUnlock() {
            this.loginAttempts = 0;
            this.isAccountLocked = false;
            System.out.println("Account for " + username + " has been unlocked and login attempts reset.");
        }
    }

    /**
     * The main method to demonstrate the UserProfile class and encapsulation.
     */
    public static void main(String[] args) {
        System.out.println("--- Encapsulation Demonstration ---");

        // 1. Create a UserProfile object
        // We interact with the object through its public constructor and methods.
        // The internal details (like how loginAttempts are managed) are hidden.
        UserProfile user1 = new UserProfile(
            "john_doe",
            "john.doe@example.com",
            LocalDate.of(1990, 5, 20), // May 20, 1990
            "securePass123"
        );

        System.out.println("\n--- Initial User Info ---");
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Age: " + user1.getAge() + " years"); // Age is calculated, not directly stored/exposed
        System.out.println("Account Locked: " + user1.isLocked());

        // 2. Attempting logins (demonstrating internal state change)
        System.out.println("\n--- Login Attempts ---");
        user1.attemptLogin("wrongPass"); // 1st failed attempt
        user1.attemptLogin("anotherWrongPass"); // 2nd failed attempt
        user1.attemptLogin("yetAnotherWrongPass"); // 3rd failed attempt - account should lock

        System.out.println("Account Locked after attempts: " + user1.isLocked());
        user1.attemptLogin("securePass123"); // This will fail because the account is locked

        // 3. Resetting account (another encapsulated behavior)
        System.out.println("\n--- Account Reset ---");
        user1.resetLoginAttemptsAndUnlock();
        System.out.println("Account Locked after reset: " + user1.isLocked());
        user1.attemptLogin("securePass123"); // Now it should succeed

        // 4. Changing email (demonstrating validation encapsulation)
        System.out.println("\n--- Email Change ---");
        user1.changeEmail("new.john.doe@example.com"); // Valid email
        System.out.println("Current Email: " + user1.getEmail());

        user1.changeEmail("invalid-email"); // Invalid email - should not change
        System.out.println("Current Email (after invalid attempt): " + user1.getEmail());

        user1.changeEmail("john.doe@"); // Another invalid email
        System.out.println("Current Email (after another invalid attempt): " + user1.getEmail());

        // 5. Trying to bypass encapsulation (which is prevented)
        // If 'username' was public, we could do: user1.username = "hacker";
        // But since it's private, this line would cause a compile-time error:
        // user1.username = "hacker"; // Uncommenting this line will cause a compile error!

        System.out.println("\n--- End of Demonstration ---");
    }
}
