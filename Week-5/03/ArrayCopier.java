public class ArrayCopier {
  public static void main (String[] args) {

    int[] firstArray = {1, 2, 3};

    int[] secondArray;
    secondArray = new int[args.length];
   
    for (int i = 0; i < args.length; i++) {
      secondArray[i] = firstArray[i];
      
    }
    System.out.println("The first array: " + firstArray);
    System.out.println("The second array: " + secondArray);
  }

}


}