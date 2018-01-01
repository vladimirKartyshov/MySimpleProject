package AmericanBankomat;

public class NoteModule1 extends NoteModule{
    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R1;
        int remind = money.getAmt()%Note.R1;
        if (countNote>0){
            System.out.println("Выдано " + countNote  + " Купюр достоинством " + Note.R1);
        }
        if(remind>0 && next!=null){
            next.takeMoney(new Money(remind));
        }
    }
}
