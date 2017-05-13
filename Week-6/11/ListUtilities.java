
import java.util.List;

public class ListUtilities {
	
	public static void BubbleSort(List list) {
		int size = list.size();
		
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - 1; j++) {
            	int first = (int) list.get(j);
            	int second = (int) list.get(j+1);
                 if (first > second) {
                   int temp = first;
                    first = second;
                    second = temp;
                }
            }
        }
	}

}