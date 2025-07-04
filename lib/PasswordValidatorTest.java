package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 ; "+pw+" : FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านทั้งหมดตัวเล็กจะ WEAK
        pw = "abcdefghij" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED: Expected WEAK but got " + result2);
        }

        // Test Case 3: รหัสผ่านทั้งหมดเป็นตัวเลขจะ WEAK 
        pw = "0123456789" ;
        PasswordStrength result3 = PasswordValidator.validate(pw); 
         if (result3== PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+pw+" : Passed: All integer password is WEAK.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected WEAK but got " + result3);
        }

        // Test Case 4: รหัสผ่านทั้งหมดเป็นตัวใหญ่จะ WEAK 
        pw = "ABCDEFGHIJ" ;
        PasswordStrength result4 = PasswordValidator.validate(pw); 
         if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 : "+pw+" : Passed: All uppercase password is WEAK.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected WEAK but got " + result4);
        }

        // Test Case 5: รหัสผ่านทั้งหมดเป็นตัวใหญ่ และตัวเล็กผสมกันจะ MEDIUM
        pw = "ABcdefghIJ" ;
        PasswordStrength result5 = PasswordValidator.validate(pw); 
         if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 : "+pw+" : Passed: All uppercase and lowercase password is MEDIUM.");
        } else {
            System.out.println("Test Case 5 : "+pw+" : FAILED: Expected MEDIUM but got " + result5);
        }

        // Test Case 6: รหัสผ่านทั้งหมดเป็นตัวใหญ่ ตัวเล็ก และตัวเลขผสมกันจะ STRONG
        pw = "ABCdef1234" ;
         PasswordStrength result6 = PasswordValidator.validate(pw); 
         if (result6 == PasswordStrength.STRONG) {
            System.out.println("Test Case 6 : "+pw+" : Passed: All uppercase , lowercase and integer password is STRONG.");
        } else {
            System.out.println("Test Case 6 : "+pw+" : FAILED: Expected STRONG but got " + result6);
        }





        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}
