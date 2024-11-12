//importing array/arraylist/list
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this is a class to remove duplicates
public class remove_duplicates {
    // this function returns a list of integers, given a list of integers and a list of elements to be removed
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        //create list to return
        List<Integer> uniqueArr = new ArrayList<>();
        //loop through elements and add them to uniqueArr if they aren't removed
        for (int i = 0; i < arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(i))) {
                uniqueArr.add(arr.get(i));
            } else {
                removedElements.add(arr.get(i));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
