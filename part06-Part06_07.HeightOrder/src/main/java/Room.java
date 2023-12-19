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

public class Room {
    
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(isEmpty()){
            return null;
        }
        
        Person shortest = this.persons.get(0);
        for(Person height:this.persons){
            if(shortest.getHeight() > height.getHeight()){
                shortest = height;
            }
        }
        
        return shortest;
    }
    
    public Person take(){
        if(isEmpty()){
            return null;
        }

        Person take = shortest();
        
        this.persons.remove(shortest());
                
        return take;
    }
}
