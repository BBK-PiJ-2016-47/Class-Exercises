
ArraySource source = new ArraySource()

int[] symmetricalArray = source.symmetricalArray
int[] nonSymmetricalArray = source.nonSymmetricalArray 

ArrayChecker myChecker = new ArrayChecker()
print "First array: "
int[] arrayToPrint = myChecker.checkAndReverse(symmetricalArray)
myChecker.printArray(arrayToPrint)
print "Second array: " 
arrayToPrint = myChecker.checkAndReverse(nonSymmetricalArray)
myChecker.printArray(arrayToPrint)






