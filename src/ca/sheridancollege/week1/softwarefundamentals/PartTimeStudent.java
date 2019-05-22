/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author briansilvera
 */
public class PartTimeStudent extends Student {
    
    private int noOfHours; //number of hours
    
    public PartTimeStudent (String name, String stdId, int noOfHours){
        super(name, stdId);
        this.noOfHours = noOfHours;
    }

    /**
     * @return the noOfHours
     */
    public int getNoOfHours() {
        return noOfHours;
    }

    /**
     * @param noOfHours the noOfHours to set
     */
    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
    
    
    
}
