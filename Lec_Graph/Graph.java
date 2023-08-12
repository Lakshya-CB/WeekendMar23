package Lec_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
//HashMap<emailID,Nbrs>
//	HashMap<V1,HashMap<V1,Wt>>
	HashMap<Integer, HashMap<Integer, Integer>> G;

	public Graph() {
		// TODO Auto-generated constructor stub
		G = new HashMap<>();
		for (int V = 1; V <= 7; V++) {
			signUp(V);
		}
	}

	public void signUp(int V) {
		G.put(V, new HashMap<>());
	}

	public void addEdge(int V1, int V2, int Wt) {
		HashMap<Integer, Integer> V1_Nbrs = G.get(V1);
		V1_Nbrs.put(V2, Wt);

		HashMap<Integer, Integer> V2_Nbrs = G.get(V2);
		V2_Nbrs.put(V1, Wt);
	}

	public int getEdge(int V1, int V2) {
		return G.get(V1).get(V2);
	}

	public void removeEdge(int V1, int V2) {
		HashMap<Integer, Integer> V1_Nbrs = G.get(V1);
		V1_Nbrs.remove(V2);

		HashMap<Integer, Integer> V2_Nbrs = G.get(V2);
		V2_Nbrs.remove(V1);
	}

	public int numOfEdge() {
		int cnt = 0;
		for (int V : G.keySet()) {
			cnt = cnt + G.get(V).size();
		}
		return cnt / 2;
	}

	public boolean hasPath(int curr, int dest) {
		return hasPath(curr, "", dest, new HashSet<>());
	}

	private boolean hasPath(int curr, String path, int dest, HashSet<Integer> Visited) {
		if (curr == dest) {
			System.out.println(path);
			return true;
		}
		if (Visited.contains(curr)) {
			return false;
		}
		Visited.add(curr);

		boolean ans = false;
		for (int nbr : G.get(curr).keySet()) {
			boolean sp = hasPath(nbr, path + nbr + " ", dest, Visited);
			ans = ans || sp;
		}
		Visited.remove(curr);
		return ans;
	}

	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(src);
		HashSet<Integer> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			int curr = Q.poll();
			if (Visited.contains(curr)) {
				System.out.println("cycle hein!!");
			}
			Visited.add(curr);
			for (int nbr : G.get(curr).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}

	public void BFT() {
		HashSet<Integer> Visited = new HashSet<>();
		int numOfComp = 0;
		boolean hasCycle = false;
		for (int src : G.keySet()) {
			if (Visited.contains(src)) {
				continue;
			}
			Queue<Integer> Q = new LinkedList<>();
			Q.add(src);
			while (!Q.isEmpty()) {
				int curr = Q.poll();
				if (Visited.contains(curr)) {
					hasCycle = true;
					System.out.println("cycle hein!!");
				}
				Visited.add(curr);
				for (int nbr : G.get(curr).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
			numOfComp++;
		}
		System.out.println(numOfComp);
		if (numOfComp == 1 && !hasCycle) {
			System.out.println("tree hein");
		}
	}

	class DijPair implements Comparable<DijPair> {
		public DijPair(int src, int i) {
			V = src;
			eff_D = i;
		}

		int V;
		int eff_D;

		@Override
		public int compareTo(DijPair o) {

			return this.eff_D - o.eff_D;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<DijPair> PQ = new PriorityQueue<>();
		PQ.add(new DijPair(src, 0));
		HashSet<Integer> Visited = new HashSet<>();
		while (!PQ.isEmpty()) {
			DijPair curr = PQ.poll();
			if (Visited.contains(curr.V)) {
				continue;
			}
			Visited.add(curr.V);
			System.out.println(curr.V + " -> " + curr.eff_D);
			for (int nbr : G.get(curr.V).keySet()) {
				if (!Visited.contains(nbr)) {
					int E = getEdge(nbr, curr.V);// nbr curr.V
					PQ.add(new DijPair(nbr, curr.eff_D + E));
				}
			}
		}
	}
}
