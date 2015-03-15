/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildinglayout;

/**
 *
 * @author xthom001
 */
public class BuildingSpecs {
    private static final double budget = 1000000; // total budget
    private static final int days = 365; //project deadline is a year
    private static final double laborCost = 350000; // total cost of labor and machinary for the project
    
    Foundation Foundation = new Foundation();
    
    /*
     Explain gaps in side walks
    */
}
class Foundation{
    /*
        This is the base class for the building
        this class needs about 7400sqft of eco cement; 185000
        digging and setting up the landscape takes 3 weeks; 
        The Foundation takes up 2500 sqft of that same cement to make that takes a week to fully settle; 

        it has 24 pillars each taking 12 hours to be fully stable 
        but only 6 can be set up at any given time thats 4 days ;

        each pillar takes up about 50 sqft of cement to make; 2400 sqft used 
        
    */
    private EcoCement eco;
    private int timeFrame = 32; //days
    
    public Foundation(){
        eco = new EcoCement(3700);        
    }
    
    public String toString(){
        return "Foundation Construction time: "+ this.timeFrame + "\n" + "Foundation Construction cost: " + this.eco.getTotalcost(); 
    }
    // total time is 32 days and totaly cost is $185,000
    
}
class firstFloor{
    
    /*
        Cost for addtional pipes, wiring, plumbing, etc.. = 60000
        Installing the above takes a month;

        This class also needs about 450 steel(type) beams;        
        This class also needs about 650 steel(type) Round Bar;
        This class also needs about 300 steel(type) Square Bar;
        This class also needs about 150 steel(type) Flat Square;
        For every two steel that you install that takes an hour of time. 
        32 days
        An additional 4000 sqft of cement is necessary to start constructing the next floor

        base cost for this floor is $60,000
    */
    private static final int addtionalCost =  60000;
    /*
        create your own instance of cement which you will choose to build the 
        first floor;
    */
    private EcoCement EcoCement ;  
    private CarbonSteel CarbonSteel;
    private double totalCost;
    private double totalTime;
    
    public firstFloor(EcoCement Cement, CarbonSteel Steel){
        this.EcoCement = Cement;
        this.CarbonSteel = Steel;
    }
    public void totalCost(String type){
        this.totalCost = this.EcoCement.getTotalcost() + SteelTypeCost(type);
    }
    //fabodo replaced setTypeCost with setFormFactor
    private double SteelTypeCost(String type){
        this.CarbonSteel.setFormFactor(type);
        return this.CarbonSteel.getTotalCost();
    }
    public void totalTime(){
       this.totalTime = this.EcoCement.getEcoDryTime();
    }
    public String toString(){
       return "Total Project Cost: " + this.totalCost + 
               "\n Total Time: " + this.totalTime;
    }    
}
class SecondFloor{
    
    /*
        Cost for addtional pipes, wiring, plumbing, etc.. = 60000
        Installing the above takes a month;
    
        This class also needs about 250 steel(type) beams;       
        This class also needs about 650 steel(type) Round Bar;
        This class also needs about 300 steel(type) Square Bar;
        This class also needs about 150 steel(type) Flat Square;
        For every two steel that you install that takes an hour of time. 
        32 days
        An additional 4000 sqft of cement is necessary to start constructing the next floor

        base cost for this floor is $60,000
    */
    private static final int addtionalCost =  60000;
    /*
        create your own instance of cement which you will choose to build the 
        first floor;
    */
    private EcoCement EcoCement ;  
    private CarbonSteel CarbonSteel;
    private double totalCost;
    private double totalTime;
    
    public SecondFloor(EcoCement Cement, CarbonSteel Steel){
        this.EcoCement = Cement;
        this.CarbonSteel = Steel;
    }
    public void totalCost(String type){
        this.totalCost = this.EcoCement.getTotalcost() + SteelTypeCost(type);
    }
  //fabodo replaced setTypeCost with setFormFactor
    private double SteelTypeCost(String type){
        this.CarbonSteel.setFormFactor(type);
        return this.CarbonSteel.getTotalCost();
    }
    public void totalTime(){
       this.totalTime = this.EcoCement.getEcoDryTime();
    }
    public String toString(){
       return "Total Project Cost: " + this.totalCost + 
               "\n Total Time: " + this.totalTime;
    }   
}
class ThirdFloor{
    
    /*
        Cost for addtional pipes, wiring, plumbing, etc.. = 60000
        Installing the above takes a month;
        
        This class also needs about 450 steel(type) beams;         
        This class also needs about 650 steel(type) Round Bar;  
        This class also needs about 300 steel(type) Square Bar;
        This class also needs about 150 steel(type) Flat Square;
        For every two steel that you install that takes an hour of time. 
        32 days
        An additional 4000 sqft of cement is necessary to start constructing the next floor

        base cost for this floor is $60,000
    */
    private static final int addtionalCost =  60000;
    /*
        create your own instance of cement which you will choose to build the 
        first floor;
    */
    private EcoCement EcoCement ;  
    private CarbonSteel CarbonSteel;
    private double totalCost;
    private double totalTime;
    
    public ThirdFloor(EcoCement Cement, CarbonSteel Steel){
        this.EcoCement = Cement;
        this.CarbonSteel = Steel;
    }
    public void totalCost(String type){
        this.totalCost = this.EcoCement.getTotalcost() + SteelTypeCost(type);
    }
  //fabodo replaced setTypeCost with setFormFactor
    private double SteelTypeCost(String type){
        this.CarbonSteel.setFormFactor(type);
        return this.CarbonSteel.getTotalCost();
    }
    public void totalTime(){
       this.totalTime = this.EcoCement.getEcoDryTime();
    }
    public String toString(){
       return "Total Project Cost: " + this.totalCost + 
               "\n Total Time: " + this.totalTime;
    }
}