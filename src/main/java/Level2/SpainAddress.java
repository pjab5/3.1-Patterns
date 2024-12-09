package Level2;

public class SpainAddress implements Address{
    private String address;

    public SpainAddress(String address) {
        this.address = address;
    }

    @Override
    public void addAddress() throws InvalidAddressException {
        if(!this.isAddressValid()){
            throw new InvalidAddressException("This is not a valid Spanish address");
        }
        System.out.println("The Spanish address " + address +  " has been added.");
    }

    @Override
    public boolean isAddressValid() {
        return address.matches("^C\\. [A-Z]+ \\d+ \\d+ \\d [A-Z]+ [A-Z]+");
    }

    public String getAddress() {
        return address;
    }
}
