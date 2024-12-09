package Level2;

public class SpainPhoneNumber implements PhoneNumber{
    private String phoneNumber;

    public SpainPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void addPhoneNumber() throws InvalidPhoneNumberException {
        if(!this.isPhoneNumberValid()){
            throw new InvalidPhoneNumberException("This is not a valid Spanish phone number");
        }
        System.out.println("The Spanish phone number " + phoneNumber + " has been added.");
    }

    @Override
    public boolean isPhoneNumberValid() {
        return phoneNumber.matches("^\\+34 9\\d{8}$");
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
