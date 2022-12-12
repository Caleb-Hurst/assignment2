package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2v2 {

	public static void main(String[] args) {
			Assignment2v2 main = new Assignment2v2();
			main.game();
		}

		void game() {
			int userInput = 0; 
			int attempts = 0;
			int correctAnswer;
			correctAnswer = generateRandom();
//			System.out.println(correctAnswer);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter a number between 1 and 100");
			while (userInput < 101 || userInput > 0) {
				userInput = Integer.parseInt(scanner.nextLine());
				while (userInput>100 || userInput <=0) {
					System.out.println("your guess is not between 1 and 100, please try again");
					userInput = Integer.parseInt(scanner.nextLine());
				}
				if (userInput < correctAnswer || userInput < 0) {
					System.out.println("Please pick a higher number");
				}
				if (userInput > correctAnswer || userInput > 101) {
					System.out.println("Please pick a lower number");
				}
				if (userInput == correctAnswer) {
					System.out.println("You win!!!");
					break;
				}
				attempts++;
				if (attempts >= 5) {
					break;
				}
			}
			if (userInput != correctAnswer) {
				System.out.println("You lose, the number to guess was: " + correctAnswer);
				
			}
			scanner.close();

		}

		private int generateRandom() {
			int correctAnswer;
			Random random = new Random(); // put in method 
			correctAnswer = random.nextInt(100) + 1; // prohibits the number 0 from being created
			return correctAnswer;
		}
	
	}


