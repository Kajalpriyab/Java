/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandarraysbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author simra
 */
public class LoopsAndArraysBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        spacesMethods space1 = new spacesMethods();

        for (int numbers = 0; numbers <= 10; numbers++) { //Simple loop
            System.out.println(numbers);
        }
        space1.space();
        int[] arrayExample = new int[10];
        arrayExample[0] = 1;
        arrayExample[1] = 2;
        arrayExample[2] = 3;
        arrayExample[3] = 4;
        arrayExample[4] = 5;
        arrayExample[5] = 6;
        arrayExample[6] = 7;
        arrayExample[7] = 8;
        arrayExample[8] = 9;
        arrayExample[9] = 10;

        System.out.println(arrayExample[4]);
        space1.space();

        for (int i = 0; i < arrayExample.length; i++) {
            System.out.println("Array nummer: " + i); //Hier worden het aantal array-boxes geteld.
        }

        for (int reverseArray = 0; reverseArray < arrayExample.length; reverseArray++) {
            System.out.print(" |" + arrayExample[reverseArray] + "| ");
        }
        space1.space();
        int[] arrayNew = {3, 4, 7, 5, 2};
        System.out.println(arrayNew[2]);
        System.out.println(arrayNew[0]);

        space1.space();
        //Two-dimensional arrays:
        int[][] myArray = {{2, 4, 1, 5}, {3, 7, 5, 9}, {2, 6, 3, 9}, {0, 4, 6, 2}}; //4 rows

        System.out.println(myArray[0][2]);
        System.out.println(myArray[1][1]);
        System.out.println(myArray[2][2]);
        System.out.println(myArray[3][0]);
        space1.space();

        //ArrayList:
        ArrayList<Integer> myFirstList = new ArrayList<>();
        myFirstList.add(2);
        myFirstList.add(5);
        myFirstList.add(25);
        myFirstList.add(18);

        //If you want to acces the values above, to loop-through the list
        for (Integer x : myFirstList) {
            System.out.println("My ArrayList Value: " + x);
        }
        //To print the ArrayList:
        System.out.println("myFirstList: " + myFirstList);
        //To print the size of your ArrayList:
        System.out.println("The size of myFirstList: " + myFirstList.size());

        for (int i = 0; i < myFirstList.size(); i++) {
            System.out.println(myFirstList);
        }

        System.out.println(" ");

        int countries = 7;
        int medals = 3;

        int[][] my2DArray = {{3, 4, 2}, {5, 7, 2}, {9, 6, 2}, {6, 8, 1}, {7, 4, 2}, {9, 5, 10}, {4, 3, 6}};

        for (int i = 0; i < countries; i++) {        //aantal rijen
            for (int j = 0; j < medals; j++) {
                System.out.print(" | " + my2DArray[i][j] + " ");  //We assigned values to the array
            }
            System.out.println();
        }

        int countriess = 7;
        int medalss = 3;

        int[][] tableEntries = {{5, 3, 2}, {4, 7, 3}, {2, 4, 1}, {2, 5, 1}, {7, 2, 1}, {3, 6, 2}, {6, 4, 1}};

        for (int i = 0; i < countriess; i++) {

            System.out.println(tableEntries[i]);
            int total = 0;

            for (int j = 0; j < medalss; j++) {
                System.out.print(" " + tableEntries[i][j] + " ");
                total = total + tableEntries[i][j];
            }
            System.out.println("Totaal is: " + total);
        }
        System.out.println("Hier ben je");
        System.out.println(" ");

        int rows = 5;
        int columns = 5;
        int[][] javaArray = {{5, 3, 2, 5, 6}, {6, 1, 4, 2, 7}, {9, 8, 1, 5, 7}, {5, 7, 2, 4, 7}, {1, 3, 5, 2, 2}};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" | " + javaArray[i][j] + " | ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

            System.out.println("Adia is GESLAAGD!");

        }

        //Opdracht 6.1.
        int randomInt;
        int[] arrayOpdracht = new int[10];
        Random random = new Random();
        for (int i = arrayOpdracht.length - 1; i >= 0; i--) {
            randomInt = random.nextInt();
            arrayOpdracht[i] = randomInt;
            System.out.println(arrayOpdracht[i] + " ");
        }
        System.out.println(" ");
        //First and last element of the array:
        System.out.println(arrayOpdracht[0]);
        System.out.println(arrayOpdracht[arrayOpdracht.length - 1]);
        System.out.println("");

        //Opdracht P6.6.
        int[] newArray = {5, 3, 2, 6, 4, 9, 2, 7, 9, 2};
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 == 0) {
                sum += newArray[i];
            } else {
                sum += -newArray[i];
            }

        }
        System.out.println(sum);
        System.out.println("");

        int[] reverseA = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] reverseB = new int[9];

        System.out.println("Hier");
        reverse(reverseA);
//        System.out.println("This is reverseA in reverse order from the method");
//        reverseArray(reverseA, reverseB);
//        System.out.println("");
//        neighbourArray newArray1 = new neighbourArray;
//        neighbourArray.neighborAverage();
        int[][] neighborAverage = {{3, 2, 4}, {7, 4, 1}, {3, 6, 8}};

        int total = 0;
        int row = 3;
        int column = 3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i > 0) {
                    total = total + neighborAverage[i - 1][j];
                    System.out.println("Aantal neighbours: " + total);
                } else if (i < rows - 1) {
                    total = total + neighborAverage[i + 1][j];
                    System.out.println("Aantal N; " + total); 
                }
                System.out.println(neighborAverage[i][j]);
            }
            System.out.println("");
        }

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        merge(array1, array2);

    }

    //Opdracht 6.7.
//    public static void reverseArray(int x[], int y[]) { //Method to print array in reverse order.
//
//        y[0] = x[y.length - 1];
//        x[0] = y[x.length - 1];
//        for (int i = x[y.length - 1]; i >= 0; i--) {
//            for (int j = 0; j < y.length; j++) {
//                System.out.print(y[j] + " ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//    }
    public static int[] reverse(int var[]) {
        int[] revData = Arrays.copyOf(var, var.length);
        int teller = 0;
        for (int i = var.length - 1; i >= 0; i--) {
            System.out.println(var[i]);
            System.out.println(revData[teller]);
            teller++;
        }
        return null;

    }

    //Opdracht 6.27
    public static int merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        a.add(2);
        a.add(5);
        a.add(6);
        a.add(1);

        b.add(6);
        b.add(10);
        b.add(8);
        b.add(4);
        b.add(11);

        for (int i = 0; i < b.size(); i++) {
            a.get(i);
            if ((a.get(i) == a.size() - 1)) {
                continue;
            }
            b.get(i);
            System.out.print(a.get(i) + " " + b.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("Size of arrayList a: " + a.size() + " >>  " + a);
        System.out.println("Size of arrayList b: " + b.size() + " >> " + b);

        return 0;
    }
}
