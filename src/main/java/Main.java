import java.util.Scanner;

public class Main {

    static String[] phoneNumbers;
    static int[][] arr;
    public static void main(String[]args){
        //phoneNumbers = new String[5];

        arr = new int[][]{
            {-1, 1, 0}, //0
            {2, 2, 0},  //1
        };
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }

        System.out.println(findMax(arr));

    }

    static public void add(String number){
        boolean isFull = true;
        for(int i = 0; i < phoneNumbers.length; i++){

            if(phoneNumbers[i] == null){
                phoneNumbers[i] = number;
                isFull = false;
                break;
            }
        }
        if (isFull)
            System.out.println("Справочник полон");

    }

    static public void delete(int numberId){
        phoneNumbers[numberId - 1] = "";
     }

     static public void showAllPhones(){
        for(String number: phoneNumbers)
            System.out.println(number);
     }

     public static int findMax(int[][] arr){
        int max = -1241244;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j])
                    max = arr[i][j];
            }
        }
        return max;
     }



}
