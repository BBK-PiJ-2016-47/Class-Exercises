/*9 Going up!
Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point, print ”Yes”
if the numbers were consecutive and increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1”
should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1” should output ”No”.*/

String s = ""
int entry = 0
int compare = 0
boolean boo = true

print "Please enter a positive number: "
s = System.console().readLine()
entry = Integer.parseInt(s)
compare = entry

  while (entry != -1) {
    print "Please enter another positive number: "
    s = System.console().readLine()
    entry = Integer.parseInt(s)

    if ((entry != -1) && (entry == compare + 1)) {
      boo = true
      compare = entry
    } else if (entry != -1) {
      boo = false
    } else {
	s = (boo)? "Yes" : "No"
	print s
	}
  }
