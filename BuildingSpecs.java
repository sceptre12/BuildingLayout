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
        this class needs about 3700sqft of eco cement; 185000
        digging and setting up the landscape takes 3 weeks; 
        The Foundation takes up 2500 sqft of that same cement to make that takes a week to fully settle; 

        it has 24 pillars each taking 12 hours to be fully stable 
        but only 6 can be set up at any given time thats 4 days ;

        each pillar takes up about 50 sqft of cement to make; 1200 sqft used 
        
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
        Cost for addtional pipes, wiring, plumbing, etc.. = 90000

        This class also needs about 450 steel(type) beams;       
        this class also needs about 300 4ft by 12ft dry wall ;        
        

        An additional 2000 sqft of cement is necessary to start constructing the next floor

        base cost for this floor is $122,500
    */
    private static final int addtionalCost =  122500;
    /*
        create your own instance of cement which you will choose to build the 
        first floor;
    */
    private EcoCement EcoCement ;
    private CheapCement CheapCement ;
    private FastDryCement FastDryCement ;
    
    private CarbonSteel CarbonSteel;
    private AluminumSteel AluminumSteel;
    private ColdFinishSteel ColdFinishSteel;
    
    public firstFloor(EcoCement Cement, CarbonSteel Steel){
        this.EcoCement = Cement;
        this.CarbonSteel = Steel;
    }
    public double totalCost(String type){
        return this.EcoCement.getTotalcost() + SteelTypeCost(type);
    }
    public double SteelTypeCost(String type){
        this.CarbonSteel.setTypeCost(type);
        return this.CarbonSteel.getTotalCost();
    }
    public int totalTime(){
        this.EcoCement
    }
    
    
}
class SecondFloor{
    
    /*
        Cost for addtional pipes, wiring, plumbing, etc.. = 90000

        This class also needs about 450 steel(type) beams;       
        this class also needs about 300 4ft by 12ft dry wall ;        
        

        An additional 2000 sqft of cement is necessary to start constructing the next floor

        base cost for this floor is $62,500
    */
    private static final int addtionalCost =  90000;
    /*
        create your own instance of cement which you will choose to build the 
        first floor;
    */
    private EcoCement EcoCement ;
    private CheapCement CheapCement ;
    private FastDryCement FastDryCement ;
    
    private CarbonSteel CarbonSteel;
    private AluminumSteel AluminumSteel;
    private ColdFinishSteel ColdFinishSteel;
    
    public SecondFloor(EcoCement Cement, int amount){
        
    }
    public SecondFloor(CheapCement Cement, int amount){
        
    }
    public SecondFloor(FastDryCement Cement, int amount){
        
    }    
}
class ThirdFloor{
    
    /*
        Cost for addtional pipes, wiring, plumbing, etc.. = 90000

        This class also needs about 450 steel(type) beams;       
        this class also needs about 300 4ft by 12ft dry wall ;        
        

        An additional 2000 sqft of cement is necessary to start constructing the next floor

        base cost for this floor is $62,500
    */
    private static final int addtionalCost =  90000;
    /*
        create your own instance of cement which you will choose to build the 
        first floor;
    */
    private EcoCement EcoCement ;
    private CheapCement CheapCement ;
    private FastDryCement FastDryCement ;
    
    private CarbonSteel CarbonSteel;
    private AluminumSteel AluminumSteel;
    private ColdFinishSteel ColdFinishSteel;
    
    public ThirdFloor(EcoCement Cement, int amount){
        
    }
    public ThirdFloor(CheapCement Cement, int amount){
        
    }
    public ThirdFloor(FastDryCement Cement, int amount){
        
    }
}