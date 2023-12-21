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
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        System.out.println("Drawing a joke.");
        Random random = new Random();
        if(jokes.isEmpty()){
            System.out.println("Jokes is empty");
            
        }
        int index = random.nextInt(jokes.size());
        String joke = jokes.get(index);
        return joke;           
        
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");
        System.out.println(jokes);
        for(String theJokes: jokes){
            System.out.println(theJokes);
        }
    }
}
