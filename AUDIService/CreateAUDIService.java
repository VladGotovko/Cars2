package AUDIService;

import Interfaces.IBrakePadsChange;
import Interfaces.ICarServiceFactory;
import Interfaces.IFilterChange;
import Interfaces.IOilChange;
public class CreateAUDIService implements ICarServiceFactory {
    private int year;
    public CreateAUDIService(int year){
        System.out.println("AUDI, year: " + year);
        this.year = year;
    }

    public IBrakePadsChange createPads() throws Exception{
        if(year < 1950) throw new Exception("Error, the year is incorrect");
        if(year <= 2000 ){
            return new AUDIPads2000();
        }
        else if(year <= 2010){
            return new AUDIPads2010();
        }
        else if(year <= 2020){
            return new AUDIPads2020();
        }
        else{
            throw new Exception("Error, no year");
        }
    }

    public IFilterChange createFilter() throws Exception{
        if(year < 1950) throw new Exception("Error, the year is incorrect");
        if(year <= 2000 ){
            return new AUDIFilter2000();
        }
        else if(year <= 2010){
            return new AUDIFilter2010();
        }
        else if(year <= 2020){
            return new AUDIFilter2020();
        }
        else{
            throw new Exception("Error, no year");
        }
    }
    public IOilChange createOil() throws Exception{
        if(year < 1950) throw new Exception("Error, the year is incorrect");
        if(year <= 2000 ){
            return new AUDIOil2000();
        }
        else if(year <= 2010){
            return new AUDIOil2010();
        }
        else if(year <= 2020){
            return new AUDIOil2020();
        }
        else{
            throw new Exception("Error, no year");
        }
    }
}