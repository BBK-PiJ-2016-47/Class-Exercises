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
