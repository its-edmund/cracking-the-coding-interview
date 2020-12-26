package Ch04_Trees_and_Graphs;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class Q04_01_Route_Between_Nodes {

    Digraph graph;

    public Q04_01_Route_Between_Nodes(Digraph graph) {
        this.graph = graph;
    }

    boolean hasRoute(int source, int target) {
        boolean[] visited = new boolean[graph.size()];
        dfs(source, visited);
        return visited[target];
    }
    
    void dfs(int source, boolean[] visited) {
        if(visited[source] == true) {
            return;
        }
        visited[source] = true;
        for(int i : graph.adjacent(source)) {
            dfs(i, visited);
        }
    }
}
