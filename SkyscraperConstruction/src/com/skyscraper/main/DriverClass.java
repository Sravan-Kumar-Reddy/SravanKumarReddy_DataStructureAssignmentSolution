package com.skyscraper.main;

import java.util.*;
import com.skyscraper.service.*;

public class DriverClass {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the total number of floors in the building:");
		int numberOfFloors = scanner.nextInt();
		TreeMap<Integer,Integer> floorMap = new TreeMap<Integer,Integer>();
		for(int i=0;i<numberOfFloors;i++){
			System.out.println("Enter the floor size given on day: "+(i+1));
			floorMap.put(scanner.nextInt(),i+1);
		}
		Construction constructor = new Construction();
		constructor.getDayByDayAssemblingPattern(floorMap,numberOfFloors);

	}
}
