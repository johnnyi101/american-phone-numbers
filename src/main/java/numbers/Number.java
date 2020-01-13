package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number {
    private String phoneNumber;

    public Number(String phoneNumber) {
        this.phoneNumber = phoneNumber;


        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : phoneNumber.toCharArray()) {
            chars.add(c);
            }
       if(!phoneNumber.matches(".*[a-zA-Z].*")){

                if (chars.size() == 12 && chars.get(0) =='+' && chars.get(1) == '1'){
                    setPhoneNumber(phoneNumber);
                }
                else
                    setPhoneNumber("Invalid");}
       else
           setPhoneNumber("Invalid");


    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
