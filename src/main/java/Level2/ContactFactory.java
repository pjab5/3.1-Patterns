package Level2;

public interface ContactFactory {
    Address createAddress(String address);
    PhoneNumber createPhoneNumber(String phoneNumber);
}
