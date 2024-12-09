package Level2;

public class SpainFactory implements ContactFactory{

    @Override
    public Address createAddress(String address) {
        return new SpainAddress(address);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new SpainPhoneNumber(phoneNumber);
    }
}
