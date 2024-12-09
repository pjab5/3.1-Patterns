package Level2;

public class USFactory implements ContactFactory{
    @Override
    public Address createAddress(String address) {
        return new USAddress(address);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new USPhoneNumber(phoneNumber);
    }
}
