package Recursion_Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,9};
        System.out.println(search(arr, 10, 0));

        int[] arr2 = {2,3,4,5,5,9,0,8,5};
        searchAll(arr2, 5, 0);
        System.out.println(list);

        //ArrayList<Integer> list = new ArrayList<>();
        //you can directly pass intto the calling funvtion below
        ArrayList<Integer> ans = searchall(arr2, 5, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(searchall1(arr2, 5, 0));

    }
    static int search(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr, target, index+1);
    }

    //for multiple occurences of target

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchAll(arr, target, index+1);
    }

    //return an array list
    static ArrayList<Integer> searchall(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return searchall(arr, target, index+1,list);
    }


    //return the list without passing the argument
    static ArrayList<Integer> searchall1(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = searchall1(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}
