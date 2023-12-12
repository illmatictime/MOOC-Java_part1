/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jlanderos
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    private double percentageOfMaximum;
    private double maxHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        this.percentageOfMaximum = percentageOfMaximum;
        this.maxHeartRate = (206.3 - (0.711 * this.age));
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (this.maxHeartRate - this.restingHeartRate)*(this.percentageOfMaximum)+this.restingHeartRate;
    }
    
    @Override
    public String toString(){
        return "Target " + this.percentageOfMaximum + " of maximum: " + targetHeartRate(this.percentageOfMaximum);
    }
}
