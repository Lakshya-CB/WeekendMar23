package Lec_Graph;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
//HashMap<emailID,Nbrs>
//	HashMap<V1,HashMap<V1,Wt>>
	HashMap<Integer,HashMap<Integer,Integer>> G;
	public Graph() {
		// TODO Auto-generated constructor stub
		G = new HashMap<>();
		for(int V = 1;V<=7;V++) {
			signUp(V);
		}
	}
	public void signUp(int V) {
		G.put(V, new HashMap<>());
	}
	public void addEdge(int V1, int V2 , int Wt) {
		HashMap<Integer,Integer> V1_Nbrs = G.get(V1);
		V1_Nbrs.put(V2, Wt);
		
		HashMap<Integer,Integer> V2_Nbrs = G.get(V2);
		V2_Nbrs.put(V1, Wt);
	}
	public int getEdge(int V1,int V2) {
		return G.get(V1).get(V2);
	}
	public void removeEdge(int V1, int V2) {
		HashMap<Integer,Integer> V1_Nbrs = G.get(V1);
		V1_Nbrs.remove(V2);
		
		HashMap<Integer,Integer> V2_Nbrs = G.get(V2);
		V2_Nbrs.remove(V1);
	}
	public int numOfEdge() {
		int cnt = 0;
		for(int V: G.keySet()) {
			cnt = cnt + G.get(V).size();
		}
		return cnt/2;	
	}
	public boolean hasPath(int curr, int dest) {
		return hasPath(curr, "",dest,new HashSet<>());
	}
	private boolean hasPath(int curr, String path, int dest,HashSet<Integer> Visited) {
		if(curr==dest) {
			System.out.println(path);
			return true;
		}
		if(Visited.contains(curr)) {
			return false;
		}
		Visited.add(curr);
		
		boolean ans = false;
		for(int nbr: G.get(curr).keySet()) {
			boolean sp = hasPath(nbr,path+nbr+" ", dest,Visited );
			ans =ans ||sp;
		}
		Visited.remove(curr);
		return ans;
	}
}
