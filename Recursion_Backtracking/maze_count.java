package Recursion_Backtracking;

import java.util.*;

public class maze_count {
    public static void main(String[] args) {
        // System.out.println(maze_count(3, 3));
        // print_path("", 3, 3);
        // ArrayList<String> list = print_path_list_diagnol("", 3, 3);
        // System.out.println(list);

        boolean[][] maze = {{true, true, true},
                            {true, false, true},
                            {true, true, true}};
        print_path_restrictions("", maze, 0, 0);

    }

    static int maze_count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = maze_count(r-1, c);
        int right = maze_count(r, c-1);
        return left+right;
    }

    static void print_path(String up, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(up);
            return;
        }
        if(r != 1){
            print_path(up + "D", r-1, c);
        }
        if(c != 1){
            print_path(up + "R", r, c-1);
        }
    }

    static ArrayList<String> print_path_list(String up, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r != 1){
            ans.addAll(print_path_list(up + "D", r-1, c));
        }
        if(c != 1){
            ans.addAll(print_path_list(up + "R", r, c-1));
        }
        return ans;
    }

    //it incudes diagnol moment also
    static ArrayList<String> print_path_list_diagnol(String up, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r != 1){
            ans.addAll(print_path_list_diagnol(up + "D", r-1, c));
        }
        if(r != 1 && c != 1){
            ans.addAll(print_path_list_diagnol(up + "d", r-1, c-1));
        }
        if(c != 1){
            ans.addAll(print_path_list_diagnol(up + "R", r, c-1));
        }
        return ans;
    }

    static void print_path_restrictions(String up, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length - 1){
            System.out.println(up);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        if(r < maze.length -1){
            print_path_restrictions(up + "D", maze,r+1, c);
        }
        if(c < maze[0].length -1){
            print_path_restrictions(up + "R", maze,r, c+1);
        }
    }
}
