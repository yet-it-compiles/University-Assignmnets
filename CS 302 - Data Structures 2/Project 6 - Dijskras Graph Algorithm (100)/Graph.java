package Lab6;

import java.util.*;

public class Graph {
    public int noOfVertices = -1;

    public int[][] edges = null;
    public int[][] weights = null;

    // Creates a new empty graph.
    public Graph() {
    }

    public Graph(int[][] data, boolean weighted) {
        if (weighted) initWeighted(data);
        else initUnweighted(data);
    }

    private void initWeighted(int[][] data) {
        // Structure of data
        // ------------------
        // length: 2 times number of vertices
        //     2i: neighbours of vertex i.
        // 2i + 1: weight of edges from vertex i to corresponding neighbour.

        noOfVertices = data.length / 2;

        edges = new int[noOfVertices][];
        weights = new int[noOfVertices][];

        for (int i = 0; i < noOfVertices; i++) {
            int dataInd = 2 * i;
            int deg = data[dataInd].length;

            edges[i] = new int[deg];
            weights[i] = new int[deg];

            for (int j = 0; j < deg; j++) {
                edges[i][j] = data[dataInd][j];
                weights[i][j] = data[dataInd + 1][j];
            }
        }
    }

    private void initUnweighted(int[][] data) {
        noOfVertices = data.length;

        edges = new int[noOfVertices][];

        for (int i = 0; i < noOfVertices; i++) {
            edges[i] = data[i].clone();
        }
    }

    /**
     * Relexas an edge of the graph based on the given distances.
     *
     * @param vInd     The vertex from which the edge starts.
     * @param neighInd The index of the vertex in the neighbourhood of v to
     *                 which the edge points. That is, the edge goes from vId
     *                 to edges[vId][neighInd].
     */
    public boolean relax(int vInd, int neighInd, int[] distances) {
        int uInd = edges[vInd][neighInd];

        int uDis = distances[uInd];
        int vDis = distances[vInd];

        int vuWeight = weights[vInd][neighInd];

        boolean update = false;

        // Avoid problems with overflow.
        if (vuWeight > 0) {
            update = vDis < uDis - vuWeight;
        } else {
            update = vDis + vuWeight < uDis;
        }

        if (update) {
            distances[uInd] = vDis + vuWeight;
            return true;
        }

        return false;
    }

    public int[][] dfs(int startId) {
        // Output data
        int[] parIds = new int[noOfVertices];

        int[] preOrder = new int[noOfVertices];
        int[] postOrder = new int[noOfVertices];

        int preCount = 0;
        int postCount = 0;


        // Helpers to compute DFS
        int[] neighIndex = new int[noOfVertices];
        int[] stack = new int[noOfVertices];
        int stackSize = 0;

        boolean[] visited = new boolean[noOfVertices];

        for (int vId = 0; vId < noOfVertices; vId++) {
            parIds[vId] = -1;

            preOrder[vId] = -1;
            postOrder[vId] = -1;

            visited[vId] = false;
            neighIndex[vId] = 0;
        }

        // Push
        stack[stackSize] = startId;
        stackSize++;

        while (stackSize > 0) {
            int vId = stack[stackSize - 1];
            int nInd = neighIndex[vId];

            if (nInd == 0) {
                visited[vId] = true;

                // *** Pre-order for vId ***
                preOrder[preCount] = vId;
                preCount++;
            }

            if (nInd < edges[vId].length) {
                int neighId = edges[vId][nInd];

                if (!visited[neighId]) {
                    // Push
                    stack[stackSize] = neighId;
                    stackSize++;

                    parIds[neighId] = vId;
                }

                neighIndex[vId]++;
            } else {
                // All neighbours checked, backtrack.
                stackSize--; // Pop;

                // *** Post-order for vId ***
                postOrder[postCount] = vId;
                postCount++;
            }
        }

        return new int[][]
                {
                        parIds,
                        preOrder,
                        postOrder
                };
    }

    public int[][] bfs(int startId) {
        // Output data
        // 0: distances from start vertex
        // 1: BFS-order
        // 2: parent-IDs
        int[][] bfsResult = new int[3][noOfVertices];

        int[] distances = bfsResult[0];
        int[] q = bfsResult[1];
        int[] parents = bfsResult[2];

        for (int i = 0; i < noOfVertices; i++) {
            distances[i] = Integer.MAX_VALUE;
            q[i] = -1;
            parents[i] = -1;
        }


        // Set start vertex
        distances[startId] = 0;
        q[0] = startId;
        int qSize = 1;

        for (int qInd = 0; qInd < qSize; qInd++) {
            int vInd = q[qInd];
            int nDis = distances[vInd] + 1;

            for (int nInd = 0; nInd < edges[vInd].length; nInd++) {
                int uInd = edges[vInd][nInd];

                if (nDis < distances[uInd]) {
                    distances[uInd] = nDis;
                    parents[uInd] = vInd;

                    q[qSize] = uInd;
                    qSize++;
                }
            }
        }

        return bfsResult;
    }

    public int[] bellmanFord(int startId) {
        int[] distances = new int[noOfVertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startId] = 0;

        HashSet<Integer> updatedLast = new HashSet<Integer>();
        HashSet<Integer> updateNext = new HashSet<Integer>();

        updatedLast.add(startId);

        while (updatedLast.size() > 0) {
            for (int vId : updatedLast) {
                for (int i = 0; i < edges[vId].length; i++) {
                    if (relax(vId, i, distances)) {
                        updateNext.add(edges[vId][i]);
                    }
                }
            }

            updatedLast.clear();

            HashSet<Integer> tmp = updatedLast;
            updatedLast = updateNext;
            updateNext = tmp;
        }

        return distances;
    }
}





