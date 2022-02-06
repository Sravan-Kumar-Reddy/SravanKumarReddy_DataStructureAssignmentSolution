package com.skyscraper.service;

import java.util.*;

public class Construction {
	public void getDayByDayAssemblingPattern(TreeMap<Integer, Integer> floorMap,int numberOfFloors){
		
		Stack<Integer> floorStack = prepareFloorStack(numberOfFloors);
		// System.out.println(floorMap);
		int dayCount = 1;
		try{
			while(!floorStack.isEmpty()){
				System.out.println("day: "+dayCount);
				int currentFloorSize = floorStack.peek();
				if(dayCount <= floorMap.get(currentFloorSize)){
					getDaySchedule(dayCount,floorMap,floorStack);
				}else{
					System.out.println(" ");
				}
				dayCount++;
			}
		}catch(EmptyStackException e){
			System.out.println("Error:"+e.getMessage());
			System.out.println("Cause:"+e.getCause());
		}

	}

	public Stack<Integer> prepareFloorStack(int numberOfFloors){
		
		Stack<Integer> floorStack = new Stack<Integer>();
		for(int i=1;i<numberOfFloors+1;i++){
			floorStack.push(i);//Pushing floor sizes from 1-numberOfFlooors;
		}
		return floorStack;

	}

	public void getDaySchedule(int day,TreeMap<Integer,Integer> floorMap, Stack<Integer> floorStack){
		
		try{
			while((!floorStack.isEmpty())&&(day>=floorMap.get(floorStack.peek()))){
				System.out.print(floorStack.pop()+" ");
			}
			System.out.println(" ");
		}catch(EmptyStackException e){
			System.out.println("Error:"+e.getMessage());
			System.out.println("Cause:"+e.getCause());
		}

	}
}
