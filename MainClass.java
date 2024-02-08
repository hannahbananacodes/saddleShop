//AUTHOR: Hannah Holmes
//COURSE: CPT 167
//PURPOSE: Create a program for Summerville Saddles
//STARTDATE: 30 Jan 2024

package edu.tridenttech.holmes.program3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// scanner
		Scanner console = new Scanner(System.in);
		
		// declare and initialize constants and variables
		String ONE_HOUR_NAME = "One-hour ride";
		String TWO_HOUR_NAME = "Two-hour ride";
		String HALF_DAY_NAME = "Half-day ride";
		final double ONE_HOUR_PRICE = 50.00;
		final double TWO_HOUR_PRICE = 75.00;
		final double HALF_DAY_PRICE = 125.00;
		String MENU_QUIT = "Quit";
		
		char ticketSelection = ' ';
		int ticketQuantity = 0;
		String ticketName = "";
		double ticketPrice = 0.0;
		int oneHourTotal = 0;
		int twoHourTotal = 0;
		int halfDayTotal = 0;
		double orderTotal = 0.0;
		double totalSales = 0.0;
		int totalNumSales = 0;
		
		// display welcome message 
		System.out.println("Welcome to Summerville Saddles!");
		
		// display menu
		System.out.println("\nTicket Menu");
		System.out.printf("%-6s%-14s%-2s%6.2f\n", "O for", ONE_HOUR_NAME, "$", ONE_HOUR_PRICE);
		System.out.printf("%-6s%-14s%-2s%6.2f\n", "T for", TWO_HOUR_NAME, "$", TWO_HOUR_PRICE);
		System.out.printf("%-6s%-14s%-2s%6.2f\n", "H for", HALF_DAY_NAME, "$", HALF_DAY_PRICE);
		System.out.printf("%-6s%-8s\n", "Q for", MENU_QUIT);
		System.out.println("\nEnter your selection here:");
		
		// assign ticketSelection
		ticketSelection = console.next().toUpperCase().charAt(0);
		
		// validation loop for ticketSelection
		while (ticketSelection != 'O' && ticketSelection != 'T' && ticketSelection != 'H' && ticketSelection != 'Q')
		{
			// error message
			System.out.println("\n----------------------------------------------------");
			System.out.println("----Invalid selection. Please make a new choice.----");
			
			// menu
			System.out.println("\nTicket Menu");
			System.out.printf("%-6s%-14s%-2s%6.2f\n", "O for", ONE_HOUR_NAME, "$", ONE_HOUR_PRICE);
			System.out.printf("%-6s%-14s%-2s%6.2f\n", "T for", TWO_HOUR_NAME, "$", TWO_HOUR_PRICE);
			System.out.printf("%-6s%-14s%-2s%6.2f\n", "H for", HALF_DAY_NAME, "$", HALF_DAY_PRICE);
			System.out.printf("%-6s%-8s\n", "Q for", MENU_QUIT);
			System.out.println("\nEnter your selection here:");
			
			// assign ticketSelection
			ticketSelection = console.next().toUpperCase().charAt(0);
			
		} // end of validation loop for ticketSelection
		
		// run-while not Quit loop
		while (ticketSelection != 'Q')
		{
			// menu for ticketQuantity
			System.out.println("Please enter the number of tickets you wish to purchase:");
			
			// assign ticketQuantity
			ticketQuantity = console.nextInt();
			
			// validation loop for ticketQuantity
			while (ticketQuantity <= 0)
			{
				System.out.println("\n----------------------------------------------------");
				System.out.println("----Invalid quantity. Please enter a valid number.----");
				
				// menu for ticketQuantity
				System.out.println("Please enter the number of tickets you wish to purchase:");
				
				// assign ticketQuantity
				ticketQuantity = console.nextInt();
			} // end of validation loop for ticketQuantity
		
			// if statements to assign ticketName, ticketPrice, totals	
			if (ticketSelection == 'O')
			{
				ticketName = ONE_HOUR_NAME;
				ticketPrice = ONE_HOUR_PRICE;
				oneHourTotal = oneHourTotal + ticketQuantity;
			} else if (ticketSelection == 'T')
			{
				ticketName = TWO_HOUR_NAME;
				ticketPrice = TWO_HOUR_PRICE;
				twoHourTotal = twoHourTotal + ticketQuantity;
			} else
			{
				ticketName = HALF_DAY_NAME;
				ticketPrice = HALF_DAY_PRICE;
				halfDayTotal = halfDayTotal + ticketQuantity;
			}
			
			// assign orderTotal, totalSales, totalNumSales
			orderTotal = ticketPrice * ticketQuantity;
			totalSales = totalSales + orderTotal;
			totalNumSales = totalNumSales + 1;
			
			// report for order
			System.out.println("\n----------------------------------------------------");
			System.out.println("PURCHASE SUMMARY");
			System.out.printf("%-6s%14s\n", "Type:", ticketName);
			System.out.printf("%-14s%8d\n", "Quantity:", ticketQuantity);
			System.out.printf("%-12s%2s%8.2f\n", "Unit Price:", "$", ticketPrice);
			System.out.printf("%-12s%2s%8.2f\n", "Total:", "$", orderTotal);
			System.out.println("----------------------------------------------------");
			
			// display menu
			System.out.println("\nTicket Menu");
			System.out.printf("%-6s%-14s%-2s%6.2f\n", "O for", ONE_HOUR_NAME, "$", ONE_HOUR_PRICE);
			System.out.printf("%-6s%-14s%-2s%6.2f\n", "T for", TWO_HOUR_NAME, "$", TWO_HOUR_PRICE);
			System.out.printf("%-6s%-14s%-2s%6.2f\n", "H for", HALF_DAY_NAME, "$", HALF_DAY_PRICE);
			System.out.printf("%-6s%-8s\n", "Q for", MENU_QUIT);
			System.out.println("\nEnter your selection here:");
			
			// assign ticketSelection
			ticketSelection = console.next().toUpperCase().charAt(0);
			
			// validation loop for ticketSelection
			while (ticketSelection != 'O' && ticketSelection != 'T' && ticketSelection != 'H' && ticketSelection != 'Q')
			{
				// error message
				System.out.println("\n----------------------------------------------------");
				System.out.println("----Invalid selection. Please make a new choice.----");
				
				// menu
				System.out.println("\nTicket Menu");
				System.out.printf("%-6s%-14s%-2s%6.2f\n", "O for", ONE_HOUR_NAME, "$", ONE_HOUR_PRICE);
				System.out.printf("%-6s%-14s%-2s%6.2f\n", "T for", TWO_HOUR_NAME, "$", TWO_HOUR_PRICE);
				System.out.printf("%-6s%-14s%-2s%6.2f\n", "H for", HALF_DAY_NAME, "$", HALF_DAY_PRICE);
				System.out.printf("%-6s%-8s\n", "Q for", MENU_QUIT);
				System.out.println("\nEnter your selection here:");
				
				// assign ticketSelection
				ticketSelection = console.next().toUpperCase().charAt(0);
				
			} // end of validation loop for ticketSelection
			
		
		} // end of run-while loop
	
		// if statement
		if (totalNumSales > 0)
		{
			System.out.println("\n----------------------------------------------------");
			System.out.println("FINAL REPORT");
			System.out.printf("%-17s%4d\n", "Total Purchases:", totalNumSales);
			
			/* The assignment stated "You will be accumulating totals to be used in the report at 
			the end of the program, so make sure your program takes care of those needs inside your 
			loop. In particular, you need to keep track of the number of each type of ticket." and also 
			"Print a simple message that states the number rentals that were made that day, that is, 
			how many times did customers order tickets. You do not need to keep track of how many tickets, 
			just the number of purchases." So I kept track of these totals but did not report them as
			requested and indicated by the example. */
			// System.out.printf("%-32s%1s%8.2f\n", "Total Sales:", "$", totalSales);
			// System.out.printf("%-33s%8d\n", "One-hour Ride Tickets Sold", oneHourTotal);
			// System.out.printf("%-33s%8d\n", "Two-hour Ride Tickets Sold", twoHourTotal);
			// System.out.printf("%-33s%8d\n", "Half-day Ride Tickets Sold", halfDayTotal);
		} // end of if statement
	
		// farewell message
		System.out.println("Thanks for visiting!");
		
		//close scanner
		console.close();
		

	}

}
