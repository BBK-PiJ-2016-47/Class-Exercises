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
    s = System.console().readLine()
    guess = Integer.parseInt(s);
    count++;
      }

  if (guess == numberToGuess) {
    println "You guessed it! Well done!"
    println "You tried to guess the number " + count + " times."
     }
