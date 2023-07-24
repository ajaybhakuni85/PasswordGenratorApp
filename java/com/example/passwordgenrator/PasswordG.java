package com.example.passwordgenrator;


import java.security.SecureRandom;

public class PasswordG {

    public static String genrate() {
    String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String DIGITS = "0123456789";
    String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        //using Secure Random class to Genrate a Password
        SecureRandom random = new SecureRandom();
        StringBuilder pass= new StringBuilder();

        int length = random.nextInt(21) + 12;
        pass.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));

        //Insitilzing Variable for counting digit,upper&Lower Case Letter and for counting digit
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;



        //Genrating Sequre Password
        while (pass.length() < length) {
            String characterSet = "";

            if (lowercaseCount < 2) {
                characterSet += LOWERCASE;
            }
            if (uppercaseCount < 2) {
                characterSet += UPPERCASE;
            }
            if (digitCount < 1) {
                characterSet += DIGITS;
            }
            if (specialCount < 1) {
                characterSet += SPECIAL;
            }
            if (characterSet.isEmpty()) {
                characterSet = LOWERCASE + UPPERCASE + DIGITS + SPECIAL;
            }
            char c = characterSet.charAt(random.nextInt(characterSet.length()));
            pass.append(c);
            if (LOWERCASE.indexOf(c) != -1) {
                lowercaseCount++;
            } else if (UPPERCASE.indexOf(c) != -1) {
                uppercaseCount++;
            } else if (DIGITS.indexOf(c) != -1) {
                digitCount++;
            } else if (SPECIAL.indexOf(c) != -1) {
                specialCount++;
            }
        }
        pass.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        String password=pass.toString();

    return password;
    }
}


