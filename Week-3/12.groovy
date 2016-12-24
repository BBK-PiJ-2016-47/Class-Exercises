/*12 Your change, please
Write a program that reads the total cost of a purchase and an amount of money that 
is paid to buy it. Your program should output the correct change specifying the amount 
of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed*/

double price = 0.0;
double paid = 0.0;

print "Please input the price of the item: "
String sprice = System.console().readLine();
price = Double.parseDouble(sprice);

print "Please input the amount paid for the item: "
String spaid = System.console().readLine();
paid = Double.parseDouble(spaid);

if(price > paid) {
  double owed = (price - paid);
  print "You still need to pay £" + owed + " more!"
}

double zero = 0.0;

double diff = (paid - price);
println "Your change is: "
while(diff != 0.0) {
	
  if (diff > 50.00) {
    diff = diff-50.00
    println "£50 note"
  } else if (diff > 20.00) {
    diff = diff - 20.00
    println "£20 note"
  } else if (diff > 10.00) {
    diff = diff-10.00
    println "£10 note"
  } else if (diff > 5.00) {
    diff = diff-5.00
    println "£5 note"
  } else if (diff > 2.00) {
    diff = diff-2.00
    println "£2 coin"
  } else if (diff > 1.00) {
    diff = diff-1.00
    println "£1 coin"
  } else if (diff > 0.50) {
    diff = diff-0.50
    println "50p coin"
  } else if (diff > 0.20) {
    diff = diff-0.20
    println "20p coin"
  } else if (diff > 0.10) {
    diff = diff-0.10
    println "10p coin"
  } else if (diff > 0.05) {
    diff = diff-0.05
    println "5p coin"
  } else if (diff > 0.02) {
    diff = diff-0.02
    println "2p coin"
	} else if (diff > 0.01) {
    diff = diff-0.01
    println "1p coin"
	}

}
