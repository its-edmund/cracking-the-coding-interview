package Ch08_Recursion_and_Dynamic_Programming;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;

public class Q08_02_Robot_in_a_Grid {
    public ArrayList<Point> findPath(boolean[][] map) {
        ArrayList<Point> path = new ArrayList<>();
        if(findPath(map, map.length - 1, map[0].length - 1, path, new HashSet<Point>())) {
            return path;
        }
        return new ArrayList<Point>();
    }

    public boolean findPath(boolean[][] map, int r, int c, ArrayList<Point> path, HashSet<Point> visited) {
        if (r < 0 || c < 0 || !map[r][c]) {
            return false;
        }
        Point point = new Point(r,c);
        if(visited.contains(point)) {
            return false;
        }
        boolean atEnd = (r == 0 && c == 0); 
        if(atEnd || findPath(map, r - 1, c, path, visited) || findPath(map, r, c - 1, path, visited)) {
            path.add(new Point(r, c));
            return true;
        }

        visited.add(point);
        return false;

    }
}
