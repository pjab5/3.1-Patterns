package Level2;

public class Main {
    public static void main(String[] args){
        ContactFactory factory = new USFactory();
        Agenda agenda = new Agenda(factory);
        agenda.addAddress(new USAddress("23 King Street,Boston,MA 02108,USA"));
        agenda.addAddress(new USAddress("23King Street,Boston,MA 02108,USA"));
        agenda.addPhoneNumber(new USPhoneNumber("+1 (123) 912-5387"));
        agenda.addPhoneNumber(new USPhoneNumber("+1 912-5387"));
        agenda.addPhoneNumber(new USPhoneNumber("+1 (458) 118-4787"));
        agenda.getAddresses();
        agenda.getPhoneNumbers();
    }
}
