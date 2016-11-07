/*10 You said high, I said low. . .
Modify your former program so that it outputs ”Yes” when the numbers are consecutive, 
regardless of whether they go up or down. For example, both ”2,3,4,5,6,-1” 
and ”10,9,8,7,-1” should now result in ”Yes”.*/

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
    } else if ((entry != -1) && (entry == compare - 1)) {
      boo = true
      compare = entry
    } else if (entry != -1) {
      boo = false
    } else {
	s = (boo)? "Yes" : "No"
	print s
	  }
  }
