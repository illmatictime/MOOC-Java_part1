
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents);

        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        Money newMoney = new Money(this.euros, this.cents);
        System.out.println(compared.euros);
        System.out.println(newMoney.euros);
        if(newMoney.euros<compared.euros){
            return true;
        }else if(newMoney.euros == compared.euros && newMoney.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        
        int euros = this.euros-decreaser.euros;
        int cents = this.cents-decreaser.cents;
        
        if(cents < 0){
            cents = cents + 100;
            euros = euros -1;
            Money newMoney = new Money(euros , cents);
            return newMoney;
        }else if(cents < 0 && euros>1){
            Money newMoney = new Money(euros, cents);
            return newMoney;
        }else if(euros < 0){
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        
//        if(cents < 0 && euros>1){
//            Money newMoney = new Money(euros, cents);
//            return newMoney;
//        }else if(cents < 0 && euros < 0 || euros < 0){
//            Money newMoney = new Money(0, 0);
//            return newMoney;
//        }else if(euros < 0){
//            Money newMoney = new Money(0, 0);
//            return newMoney;
//        }
        Money newMoneyClone = new Money(this.euros-decreaser.euros, this.cents-decreaser.cents);
        return newMoneyClone;
    }
}
