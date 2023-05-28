package Lec_22;

public class blocked_mze {
	public static void main(String[] args) {
		int[][] maze = { 
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0 },
				{ 0, 1, 0, 0 },
				{ 0, 0, 1, 0 } };
		solve(0, 0, "",new boolean[maze.length][maze[0].length], maze);

	}
	public static void solve(int r, int c, String path, 
			boolean[][] visited,int[][]maze) {
		if(r<0||c<0||r==maze.length||c==maze[0].length||
				visited[r][c]||maze[r][c]==1) {
			return;
		}
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(path);
			return;
		}
		visited[r][c] = true;
		solve(r-1, c, path+"U",visited, maze);
		solve(r+1, c, path+"D",visited, maze);
		solve(r, c-1, path+"L",visited, maze);
		solve(r, c+1, path+"R",visited, maze);
		visited[r][c] = false;
	}
}
