/*15 Guess my number (*)
Write a program that thinks of a random number between 0 and 1000, and then lets the user try to guess it. For every guess, the 
computer says whether the guess is correct, or too low, or too high. When the user finds the number, the computer will tell how 
many guesses were needed. The output could be similar to the following example:
Try to guess my number!
Tell me a number: 2
No! My number is higher.
Tell me a number: 800
No! My number is lower.
Tell me a number: 500
No! My number is lower.
Tell me a number: 350
No! My number is higher.
Tell me a number: 376
CORRECT!
You needed 5 guesses.
*/

int numberToGuess = Math.abs(1000 * Math.random())
int count = 1;
println "Try to guess the number: "
String s = System.console().readLine()
int guess = Integer.parseInt(s);


  while (guess != numberToGuess) {
    if (guess > numberToGuess) {
      println "No! My number is lower!"
      } else {
      println "No! My number is higher!"
      }
    println "Guess again: "
    String s = System.console().readLine()
    int guess = Integer.parseInt(s);
    count++;
    }

  if (guess == numberToGuess) {
    println "You guessed it! Well done!"
    println "You tried to guess the number " + count + " times."
