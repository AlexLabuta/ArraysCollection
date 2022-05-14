import java.util.Arrays;

/**
 * нарисовать крестик с помошью 2мерного массива
 *
 * @Author Adaye
 * creat 2022-04-17   7:56
 **/

public class X2Arrays {
    public static void main(String[] args) {
        char[][] arr = new char[5][5];
        for( int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j ++){
                arr[i][j] = ( j == i ||  j == arr.length - 1 -i) ? 'x' : ' ';
                System.out.print(arr[i][j]);

//                if (i == j || (arr.length - i -1) == j){
//                    System.out.print(arr[i][j] = 'X');
//                } else{
//                    System.out.print(arr[i][j] = ' ');
//                }

            }
            System.out.println();
        }


    }
}
