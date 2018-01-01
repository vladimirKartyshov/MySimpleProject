package AmericanBankomat;

public class NoteModule20 extends NoteModule{
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R20;
        int remind = money.getAmt()%Note.R20;
        if (countNote>0){
            System.out.println("Выдано " + countNote  + " Купюр достоинством " + Note.R20);
        }
        if(remind>0 && next!=null){
            next.takeMoney(new Money(remind));
        }
    }
}
