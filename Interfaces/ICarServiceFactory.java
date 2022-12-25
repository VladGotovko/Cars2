package Interfaces;

import java.util.concurrent.ExecutionException;

public interface ICarServiceFactory {
    IBrakePadsChange createPads() throws Exception;
    IFilterChange createFilter() throws Exception;
    IOilChange createOil() throws Exception;
}