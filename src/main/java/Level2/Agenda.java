package Level2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Address address;
    private List<Address> addresses;
    private PhoneNumber phoneNumber;
    private List<PhoneNumber> phoneNumbers;

    public Agenda(ContactFactory factory){
        addresses = new ArrayList<>();
        phoneNumbers = new ArrayList<>();
    }

    public void addAddress(Address address){
        try{
            address.addAddress();
            addresses.add(address);
        }catch(InvalidAddressException e){
            System.out.println(e.getMessage());
        }
    }

    public void addPhoneNumber(PhoneNumber phoneNumber){
        try{
            phoneNumber.addPhoneNumber();
            phoneNumbers.add(phoneNumber);
        }catch(InvalidPhoneNumberException e){
            System.out.println(e.getMessage());
        }
    }
    public void getAddresses() {
        System.out.println("Addresses:");
            for (Address a : addresses){
                System.out.println(a.getAddress());
            }
    }

    public void getPhoneNumbers() {
        System.out.println("Phone numbers:");
        for (PhoneNumber p : phoneNumbers){
            System.out.println(p.getPhoneNumber());
        }
    }
}
