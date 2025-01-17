package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrauListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(8);
        list.add(2);

        System.out.println(list);
        ArrayList<Integer> lt1 = new ArrayList<>(Arrays.asList(33,44,55));
        System.out.println(lt1);

        //multi dimensional array list

//        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
//
//        //initialization of list2
//        for(int i=0 ; i < 3; i++){
//            list2.add(new ArrayList<>());
//        }
//
//        //inserting new arrays
//        for(int i =0; i<3; i++){
//            for(int j=0; j<3; j++){
//                list2.get(i).add(in.nextInt());
//            }
//        }
//
//        System.out.println(list2);
//

        //find maximum value

        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 6, 5));

//        System.out.println(data.size());

        for (int l =0; l<data.size(); l++){
            System.out.println(data.get(l));
        }

        //reverse array using swap



    }
}
