/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoda
 */
public class Match {
    private String firstTeam;
    private String secondTeam;
    private int firstTeamScore;
    private int secondTeamScore;
    
    public Match(String firstTeam, String secondTeam, int firstTeamScore, int SecondTeamScore){
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = SecondTeamScore;
    }
    
    public boolean hasPlayed(String inputTeam){
        if(this.firstTeam.equals(inputTeam) || this.secondTeam.equals(inputTeam)){
            return true;
        }
        return false;
    }
    
    public String getWinner(){
        if(this.firstTeamScore>secondTeamScore){
            return this.firstTeam;
        }
        return this.secondTeam;
    }
   
    public String getFirstTeamName(){
        return this.firstTeam;
    }
    
    public String getSecondTeamName(){
        return this.secondTeam;
    }
    
    public int getFirstTeamScore(){
        return this.firstTeamScore;
    }
    
    public int getSecondTeamScore(){
        return this.secondTeamScore;
    }
    
    public String toString(){
        return "This Match was " + this.firstTeam + " against " + this.secondTeam 
                + " with a score of " + this.firstTeamScore + " to " + this.secondTeamScore; 
    }
}
