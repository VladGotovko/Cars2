package BMWService;

import Interfaces.IBrakePadsChange;
import Interfaces.ICarServiceFactory;
import Interfaces.IFilterChange;
import Interfaces.IOilChange;
public class CreateBMWService implements ICarServiceFactory {
    private int year;
    public CreateBMWService(int year){
        System.out.println("BMW, year: " + year);
        this.year = year;
    }

    public IBrakePadsChange createPads() throws Exception{

        if (year < 1950) throw new Exception("Error, the year is incorrect");
        if (year <= 2000) {
            return new BMWPads2000();
        } else if (year <= 2010) {
            return new BMWPads2010();
        } else if (year <= 2020) {
            return new BMWPads2020();
        } else {
            throw new Exception("Error");
        }
    }

    public IFilterChange createFilter() throws Exception{
        if(year < 1950) throw new Exception("Error, the year is incorrect");
        if(year <= 2000 ){
            return new BMWFilter2000();
        }
        else if(year <= 2010){
            return new BMWFilter2010();
        }
        else if(year <= 2020){
            return new BMWFilter2020();
        }
        else{
            throw new Exception("Error, no year");
        }
    }
    public IOilChange createOil() throws Exception{
        if(year < 1950) throw new Exception("Error, the year is incorrect");
        if(year <= 2000 ){
            return new BMWOil2000();
        }
        else if(year <= 2010){
            return new BMWOil2010();
        }
        else if(year <= 2020){
            return new BMWOil2020();
        }
        else{
            throw new Exception("Error, no year");
        }
    }
}