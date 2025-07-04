package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * เช็คตัวอักษรในการตั้ง password ว่ามีความยาก ปานกลาง หรือง่าย
     * @param การรับ String 
     * @return การส่งค่ากลับว่ารหัสสามารถใช้งานได้ไหม ถ้าไม่ได้จะขึ้นว่า INVALID ถ้าตั้งได้จะส่ง WEAK ,MEDIUM ,STRONG Pass
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 

        if(password==null || password.length()<8)
            return PasswordStrength.INVALID ;
            
        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean hasDigit = false ;
        

        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
               hasLower = true ;
            else if(Character.isUpperCase(c))
               hasUpper = true ;
            else if(Character.isDigit(c))
               hasDigit = true ;
        }
        if(hasUpper && hasLower && hasDigit) return PasswordStrength.STRONG ;
        if(hasLower && !hasUpper) return PasswordStrength.WEAK ;
        if(!hasLower && hasUpper) return PasswordStrength.WEAK ;
        if(hasDigit) return PasswordStrength.WEAK ;
        if(hasLower && hasUpper) return PasswordStrength.MEDIUM ;
      

        
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        int minLength = 8 ; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?


    }
}