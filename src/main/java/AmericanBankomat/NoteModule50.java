package AmericanBankomat;

public class NoteModule50 extends NoteModule{

    void takeMoney(Money money) {
        int countNote = money.getAmt()/Note.R50;
        int remind = money.getAmt()%Note.R50;
        if (countNote>0){
            System.out.println("Выдано " + countNote  + " Купюр достоинством " + Note.R50);
        }
        if(remind>0 && next!=null){
            next.takeMoney(new Money(remind));
        }
    }
}
