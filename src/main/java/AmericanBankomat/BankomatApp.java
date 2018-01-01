package AmericanBankomat;

public class BankomatApp {
    public static void main(String[] args) {

        NoteModule note100 = new NoteModule100();
        NoteModule note50 = new NoteModule50();
        NoteModule note20 = new NoteModule20();
        NoteModule note10 = new NoteModule10();
        NoteModule note1 = new NoteModule1();
        note100.setNextMoneyModule(note50);
        note50.setNextMoneyModule(note20);
        note20.setNextMoneyModule(note10);
        note10.setNextMoneyModule(note1);

        note100.takeMoney(new Money(1592));

        }

    }

