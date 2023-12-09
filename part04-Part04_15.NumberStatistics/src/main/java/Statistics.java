
public class Statistics {
    private int count;
    private int sum;
//    private int evenSum;
//    private int oddSum;
    
    public Statistics(){
        this.count = 0;
        this.sum = 0;
//        this.evenSum = 0;
//        this.oddSum = 0;
    }
    
    public void addNumber(int number){
        //this.sum = this.sum + number;
        this.count = this.count + 1;
        this.sum = this.sum + number;
        
//        if(number % 2 == 0){
//            this.sum = this.sum + number;
//            this.evenSum = this.evenSum + number;
//        }else{
//            this.sum = this.sum + number;
//            this.oddSum = this.oddSum + number;
//        }
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
//    public int evenSum(){
//        return this.evenSum;
//    }
//    
//    public int oddSum(){
//        return this.oddSum;
//    }
    
    public double average(){
        if(!(this.count <= 0)){
            return ((1.0*this.sum)/this.count);
        }
        return 0;
    }
}
