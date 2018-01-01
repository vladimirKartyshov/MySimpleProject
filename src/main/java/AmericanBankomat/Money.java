package AmericanBankomat;

public class Money {
    private int amt;

    public Money(int amt){
        setAmt(amt);
    }
    public int getAmt() {
        return amt;
    }
    public void setAmt(int amt){
        if (amt>0 && amt<=4000 && amt%Note.R1==0){
            this.amt = amt;
        }
        else {
            throw new RuntimeException("Сумма денег должна быть не больше 4000 и кратная 1");

        }
    }
}
