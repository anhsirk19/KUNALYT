package Recursion_Backtracking;

import java.util.*;

public class All_Paths_maze {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                            {true, true, true},
                            {true, true, true}};
        int[][] step = new int[maze.length][maze[0].length];
        // allPathstep("", maze, 0, 0, step, 1);
        allPathstep("", maze, 0, 0, step, 1);
    }
    static void allPaths(String up, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length - 1){
            System.out.println(up);
            return;
        }
        if(maze[r][c] == false){
            return;
        }

        maze[r][c] = false;
        
        if(r < maze.length -1){
            allPaths(up + "D", maze, r+1, c);
        }
        if(c < maze[0].length -1){
            allPaths(up + "R", maze,r, c+1);
        }
        if(r > 1){
            allPaths(up + "U", maze, r-1, c);
        }
        if (c > 1) {
            allPaths(up + "L", maze, r, c-1);
        }

        maze[r][c] = true;
    }

    static void allPathstep(String up, boolean[][] maze, int r, int c, int[][] step, int count){
        if(r == maze.length-1 && c == maze[0].length - 1){
            step[r][c] = count;
            for(int[] ar : step){
                System.out.println(Arrays.toString(ar));
            }
            System.out.println(up);
            return;
        }
        if(maze[r][c] == false){
            return;
        }

        maze[r][c] = false;
        step[r][c] = count;
        
        if(r < maze.length -1){
            allPathstep(up + "D", maze, r+1, c, step, count+1);
        }
        if(c < maze[0].length -1){
            allPathstep(up + "R", maze,r, c+1 , step, count+1);
        }
        if(r > 0){
            allPathstep(up + "U", maze, r-1, c , step, count+1);
        }
        if (c > 0) {
            allPathstep(up + "L", maze, r, c-1 , step, count+1);
        }

        maze[r][c] = true;
        step[r][c] = 0;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
