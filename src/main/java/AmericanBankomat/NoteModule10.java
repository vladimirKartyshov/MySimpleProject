package AmericanBankomat;

public class NoteModule10 extends NoteModule{
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R10;
        int remind = money.getAmt()%Note.R10;
        if (countNote>0){
            System.out.println("Выдано " + countNote  + " Купюр достоинством " + Note.R10);
        }
        if(remind>0 && next!=null){
            next.takeMoney(new Money(remind));
        }
    }
}
