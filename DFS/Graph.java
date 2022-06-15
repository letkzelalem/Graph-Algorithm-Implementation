
import java.util.*;

class Graph {
  private LinkedList<Integer> adjLists[];
  private boolean visited[];


  Graph(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }
  void addEdge(int src, int dest) {
    adjLists[src].add(dest);
  }
  void DFS(int vertex) {
    visited[vertex] = true;
    System.out.println(vertex + " ");

    Iterator<Integer> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        DFS(adj);
    }
  }

  
}
