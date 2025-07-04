package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if (password == null || password.length() < 8) 
            return PasswordStrength.INVALID;

             boolean hasLower = false;
             boolean hasUpper  = false;
             boolean hasDigit = false;
             boolean hasSpecial = false;
        
       
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
                else if (Character.isUpperCase(c)) {

                hasUpper= true;
                 
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
    
        int count = 0;
        if(hasLower)count++;
        if(hasUpper)count++;
        if(hasDigit)count++;
        if(hasSpecial)count++;
        

        if (count == 4) {
            return PasswordStrength.STRONG;
        } else if (count == 3) {
            return PasswordStrength.MEDIUM;
        } else {
            return PasswordStrength.WEAK;// TODO: การคืนค่านี้ถูกต้องหรือไม่?
        }
    }
}