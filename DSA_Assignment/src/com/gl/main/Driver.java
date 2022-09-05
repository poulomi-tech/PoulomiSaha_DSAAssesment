package com.gl.main;

import java.io.IOException;
import java.util.Scanner;

import com.gl.service.Service;

public class Driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 int noOfFloor;
		 int[] floors;
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of floors in the building : ");
		 noOfFloor = sc.nextInt();
		 floors = new int[noOfFloor];
		 
		for(int i = 0; i<noOfFloor; i++) 
		{
			System.out.println("Enter the floor size givenm on day: " + (i+1));
			floors[i] = sc.nextInt();
		}
		System.out.println();
		
		Service service = new Service();
		service.printConstructionTable(floors);
		
		
	}

}
