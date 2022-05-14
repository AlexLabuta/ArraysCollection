/**
 * @Author Adaye
 * creat 2022-04-15   18:26
 **/
public class ArraysLearn {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] arr = text.split(",?\\s+");
        for ( int i = 0; i < arr.length; i++){
            String result = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = result;
            System.out.println(arr[i]);
        }

    }
}
