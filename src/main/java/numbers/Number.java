package numbers;

public class Number {
    private String phoneNumber;

    public Number(String phoneNumber) {
        this.phoneNumber = phoneNumber;


        char[] cArray = phoneNumber.toCharArray();
        if (cArray.length == 12 && cArray[0]=='+' && cArray[1]== '1'){
            setPhoneNumber(phoneNumber);
        }
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
