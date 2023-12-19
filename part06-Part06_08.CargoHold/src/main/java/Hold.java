/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoda
 */
import java.util.ArrayList;

public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        this.suitcases.add(suitcase);
    }
    
    public String toString(){
        int totalWeight = 0;
        
        for(Suitcase weight:this.suitcases){
            //System.out.println(weight.totalWeight());
            totalWeight += weight.totalWeight();
        }
        
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
