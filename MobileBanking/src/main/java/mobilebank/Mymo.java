package mobilebank;

public class Mymo extends Banking implements sound {

    public Mymo(String account_name, int bank_id, int balance) {
        super(account_name, bank_id, balance);
    }

    @Override
    public String operating_sound() {
        return "Tuddddd";
    }

    @Override
    public String transfer_sound() {
        return "MAMMMM";
    }


}
