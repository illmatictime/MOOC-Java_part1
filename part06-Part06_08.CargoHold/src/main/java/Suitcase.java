
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

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
//        System.out.println("item.getWeight(): " + item.getWeight());
        int totalWeight = item.getWeight();
//        System.out.println("totalWeight: " + totalWeight);
//        System.out.println("");
        for(Item value:this.items){
            totalWeight += value.getWeight();
//            System.out.println("value.getWeight(): " + value.getWeight());
//            System.out.println("totalWeight: " + totalWeight);
//            System.out.println("");
        }
        if(this.maxWeight >= totalWeight){
            this.items.add(item);
        }
    }
    
    public String toString(){
        //ArrayList<Item> items = new ArrayList<>();
        int totalWeight = 0;
        for(int i = 0; i < items.size(); i++){
            totalWeight += items.get(i).getWeight();
        }
        
        if(items.size() == 0){
            return "no items (" + totalWeight + " kg)";
        }else if(items.size() == 1){
            return this.items.size() + " item (" + totalWeight + " kg)";
        }
        return this.items.size() + " items (" + totalWeight + " kg)";
    }
  
    public void printItems(){
        for(Item value:this.items){
            System.out.println(value);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item value:this.items){
            totalWeight += value.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item theHeaviestItem = this.items.get(0);
        for(Item weights:this.items){
            if(weights.getWeight()>theHeaviestItem.getWeight()){
                theHeaviestItem = weights;
            }
        }

        return theHeaviestItem;
    }
    
    
}
