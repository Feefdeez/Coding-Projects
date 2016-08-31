package ticTacToe.src;
import java.util.Arrays;
import java.util.Scanner;


public class TicTacToe {

	

	public static void main(String[] args) {
		
		String [][] board = new String [3][3];	
		String userReady;
		String playerValue = "X";
		Scanner scanner = new Scanner (System.in);
		Boolean invalidInput = true;			
		int userInputX;
		int userInputY;
		
		// Prompts user to prepare to play
		System.out.println("Are you ready? ");
		do {
			userReady = scanner.nextLine();
			if (!userReady.equalsIgnoreCase("Yes"))
				System.out.println("Are you ready now? ");
		} while(!userReady.equalsIgnoreCase("Yes"));
		
		
		System.out.println("Great lets start!");
		
		// Create board, does not display
		for (int r = 0; r<board.length;r++) {
			for (int c = 0; c <board[r].length;c++){
				board[r][c] = " ";
			}
		}
		
		Game : {
		// Loops gathering user input & display board with updated user inputs
			for ( ; ; ) {
				
				
				//Switches between player 1 and player 2
				switch (playerValue) {
				
					case "X":
							 playerValue = "O";
							 break;	
					case "O":
							 playerValue = "X";
							 break;
				}
				
				//Create a while loop(while its true do x, once false break out to switch player value)
				do {
					
					// Gather user coordinate input
					scanner = new Scanner (System.in);
					
					System.out.print("Enter your X coordinate ");
					do {
						userInputX = scanner.nextInt();
						if (userInputX > 3)
						System.out.println("Please try another coordinate!");
					} while (userInputX > 3);				
					
					
					System.out.print("Enter your Y coordinate ");
					do {
						userInputY = scanner.nextInt();
						if (userInputY > 3)
						System.out.println("Please try another coordinate!");
					} while (userInputY > 3);
					
					/*
					//Where marks are placed based on player inputs 
					switch (userInput) {	
						case 0: 
								if (board[0][0].equals(" ")) {
									board[0][0] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 1: 
								if (board[0][1].equals(" ")) {
									board[0][1] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 2: 
								if (board[0][2].equals(" ")) {
									board[0][2] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 3: 
								if (board[1][0].equals(" ")) {
									board[1][0] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 4: 
								if (board[1][1].equals(" ")) {
									board[1][1] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 5: 
								if (board[1][2].equals(" ")) {
									board[1][2] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 6: 
								if (board[2][0].equals(" ")) {
									board[2][0] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 7: 
								if (board[2][1].equals(" ")) {
									board[2][1] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
						case 8: 
								if (board[2][2].equals(" ")) {
									board[2][2] = playerValue;
									invalidInput = false;
								} else {
									invalidInput = true;
									System.out.println("Please try another coordinate");
								}
								break;
					}
					
					*/
					
					// Print out board
					for (int r = 0; r<board.length;r++) {
						for (int c = 0; c <board.length;c++) {					
							System.out.print("[" +board[r][c] + "]");
						}
						System.out.println(" ");
					}
				} while (invalidInput);
				
				
				/*if (board[0][0].equals(playerValue) && board[0][1].equals(playerValue) && board[0][2].equals(playerValue)
					|| board[1][0].equals(playerValue) && board[1][1].equals(playerValue) && board[1][2].equals(playerValue)
					|| board[2][0].equals(playerValue) && board[2][1].equals(playerValue) && board[2][2].equals(playerValue)
					|| board[0][0].equals(playerValue) && board[1][0].equals(playerValue) && board[2][0].equals(playerValue)
					|| board[0][1].equals(playerValue) && board[1][1].equals(playerValue) && board[2][1].equals(playerValue)
					|| board[0][2].equals(playerValue) && board[1][2].equals(playerValue) && board[2][2].equals(playerValue)) {
					System.out.println("Game over!");
					break Game;
				}*/
			}
		}
	} 
}
