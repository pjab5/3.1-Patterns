package Level2;

public class USPhoneNumber implements PhoneNumber{
    private String phoneNumber;

    public USPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void addPhoneNumber() throws InvalidPhoneNumberException {
        if(!this.isPhoneNumberValid()){
            throw new InvalidPhoneNumberException("This is not a valid US phone number");
        }
        System.out.println("The US phone number " + phoneNumber + " has been added.");
    }

    @Override
    public boolean isPhoneNumberValid() {
        return phoneNumber.matches("^\\+1 \\(\\d{3}\\) \\d{3}-\\d{4}$");
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
