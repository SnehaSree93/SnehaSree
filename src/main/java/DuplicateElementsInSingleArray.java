import javafx.scene.control.Alert;

/**
 * Created by lovel on 11-Jan-19.
 */
public class DuplicateElementsInSingleArray {
    public static void main(String args[]){
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2,9,9,11,12,11};

        for (int i = 0; i < my_array.length; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }
}

