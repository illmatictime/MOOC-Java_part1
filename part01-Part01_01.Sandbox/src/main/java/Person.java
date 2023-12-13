/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jlanderos
 */
public class Person {

    private String name;
    private SimpleDate birthday;
    private int weight = 0;
    private int height = 0;
    
    public Person(String name, SimpleDate date){
        this.name = name;
        this.birthday = date;
    }
    
    public Person(String name, int day, int month, int year){
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }
    
    public String toString(){
        return this.name + ", born on " + this.birthday;
    }
    
}