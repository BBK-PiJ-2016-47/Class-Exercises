/*16 Rock, Paper, Scissors (*)
Write a program that reads 2 characters from either the keyboard or a file. The characters are either PP, PR, PS, RP,
RR, RS, SP, SR, or SS. They correspond to the selections made by 2 players playing the game of rock-paper-scissors.
Make the program accept inputs until one player’s score is more than 3 points ahead of the other.
Hint: remember that you can use .substring() to get the elements of a String. */

println "Welcome to Rock Paper Scissors!"

int player1score = 0;
int player2score = 0;
boolean keepPlaying = true;

	while (keepPlaying) {
		println "Please enter your selection and your opponent's selection: "
		String plays = System.console().readLine().toUpperCase();

		String player1 = plays.substring(0,1);
		String player2 = plays.substring(1,2);

			if ((player1 == "P") && (player2 == "P")) {
				println "It's a draw, play again!"
			}

			if ((player1 == "P") && (player2 == "R")) {
				println "Player 1 wins the point!"
				player1score++;
			}

			if ((player1 == "P") && (player2 == "S")) {
				println "Player 2 wins the point!"
				player2score++;
			}

			if ((player1 == "R") && (player2 == "R")) {
				println "It's a draw, play again!"
			}

			if ((player1 == "R") && (player2 == "P")) {
				println "Player 2 wins the point!"
				player2score++;
			}

			if ((player1 == "R") && (player2 == "S")) {
				println "Player 1 wins the point!"
				player1score++;
			}

			if ((player1 == "S") && (player2 == "S")) {
				println "It's a draw, play again!"
			}

			if ((player1 == "S") && (player2 == "P")) {
				println "Player 1 wins the point!"
				player1score++;
			}

			if ((player1 == "S") && (player2 == "R")) {
				println "Player 2 wins the point!"
				player2score++;
			}
		println "Player 1: " + player1score + "\nPlayer 2: " + player2score
			if (player1score >= 3) {
				keepPlaying = false;
			} else if (player2score >= 3) {
				keepPlaying = false;
			} else {
				keepPlaying = true;
			}
	}

	if (player1score > player2score) {
		println "Player 1 wins! \nPlayer 1 scored " + player1score + " points. \nPlayer 2 scored " + player2score + " points."
	} else {
		println "Player 2 wins! \nPlayer 1 scored " + player1score + " points. \nPlayer 2 scored " + player2score + " points."
	}