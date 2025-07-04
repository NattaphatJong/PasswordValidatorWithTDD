package lib ;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---") ;
        
        // Test Case 1: รหัสผ่านสั้นควรจะ (INVALID)
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate(pw) ;
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 PASSED : "+pw+" Short password is INVALID.") ;
        } else {
            System.out.println("Test Case 1 FAILED : "+pw+" Expected INVALID but got " + result1) ;
        }

        // Test Case 2 :  รหัสผ่านที่มีตัวอักษรเล็ก (WEAK)
        pw = "abcdefgh" ;
        PasswordStrength result2 = PasswordValidator.validate(pw) ;
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 PASSED : "+pw+" Password is WEAK.") ;
        } else {
            System.out.println("Test Case 2 FAILED: "+pw+" Expected WEAK but got " + result2) ;
        }

        // Test Case 3 : รหัสผ่านที่มีตัวอักษรใหญ่และเล็ก (MEDIUM)
        pw = "ABCDabcd123" ;
        PasswordStrength result3 = PasswordValidator.validate(pw) ;
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 PASSED : "+pw+" Password is MEDIUM.") ;
        } else {
            System.out.println("Test Case 3 FAILED : "+pw+" Expected MEDIUM but got " + result3) ;
        }

        // Test Case 4 : รหัสผ่านที่มีตัวอักษรใหญ่,เล็ก,ตัวเลขและสัญลักษณ์ (STRONG)
        pw = "ABCDabcd123%" ;
        PasswordStrength result4 = PasswordValidator.validate(pw) ;
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 PASSED : "+pw+" Password is STRONG.") ;
        } else {
            System.out.println("Test Case 4 FAILED : "+pw+" Expected STRONG but got " + result4) ;
        }

        System.out.println("--------------------------------") ;
    }
}
