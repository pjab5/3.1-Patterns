package Level2;

import java.util.Objects;

public class USAddress implements Address{
    private String address;

    public USAddress(String address) {
        this.address = address;
    }

    @Override
    public void addAddress() throws InvalidAddressException {
        if(!this.isAddressValid()){
            throw new InvalidAddressException("This is not a valid US address");
        }
        System.out.println("The US address " + address + " has been added.");
    }

    @Override
    public boolean isAddressValid() {
        return address.split(",")[0].matches("^\\d+ \\w+ Street$") && address.split(",")[1]!=null && address.split(",")[2].matches("^[A-Z]{2} \\d{5}$") && Objects.equals(address.split(",")[3], "USA");
    }

    @Override
    public String getAddress() {
        return address;
    }
}
