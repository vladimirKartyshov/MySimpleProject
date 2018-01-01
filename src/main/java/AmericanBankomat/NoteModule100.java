package AmericanBankomat;

 class NoteModule100 extends NoteModule{


     void takeMoney(Money money) {
         int countNote = money.getAmt()/Note.R100;
         int remind = money.getAmt()%Note.R100;
         if (countNote>0){
             System.out.println("Выдано " + countNote  + " Купюр достоинством " + Note.R100);
         }
         if(remind>0 && next!=null){
             next.takeMoney(new Money(remind));
         }
     }
 }
