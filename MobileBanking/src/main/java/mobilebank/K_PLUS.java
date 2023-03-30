package mobilebank;

public class K_PLUS extends Banking implements sound {

    public K_PLUS(String account_name, int bank_id, int balance){
        super(account_name, bank_id, balance);
    }

    @Override
    public String operating_sound() {
        return "HMMMMM";
    }

    @Override
    public String transfer_sound() {
        return "JIDJIDJIDJID";
    }
}
