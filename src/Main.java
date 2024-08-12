/**
 *
 * 최소 스패닝 트리
 *
 * prim
 * kruskal 간선 정렬, union
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.AbstractQueue;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int v;
    static int e;
    static int[] parents;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        parents = new int[v + 1];
        Queue<Edge> q = new PriorityQueue<>();

        for(int i=0; i < v; i++) {
            parents[i] = i;
        }

        for(int i=0; i < e; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            q.add(new Edge(from, to, weight));
        }

        while(!q.isEmpty()) {
            Edge edge = q.poll();
            int a = edge.from;
            int b = edge.to;

            if(find(a) == find(b)) continue;

            //부모가 달라야만 mst에 edge추가 => union
            union(a, b);
            answer += edge.weight;
        }

        System.out.println(answer);
    }

    static int find(int x) {
        if (parents[x] == x) return x;
        return parents[x] = find(parents[x]);
    }

    static void union(int a, int b) {
        int A = find(a);
        int B = find(b);

        if(A != B) parents[B] = A;
    }

    static class Edge implements Comparable<Edge> {
        int from;
        int to;
        int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
}