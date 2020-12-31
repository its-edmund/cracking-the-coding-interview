package Ch08_Recursion_and_Dynamic_Programming;

import java.awt.Point;
import java.util.ArrayList;

public class Q08_02_Robot_in_a_Grid {
    public ArrayList<Point> findPath(boolean[][] map) {
        ArrayList<Point> path = new ArrayList<>();
        if(findPath(map, map.length - 1, map[0].length - 1, path)) {
            return path;
        }
        return new ArrayList<Point>();
    }

    public boolean findPath(boolean[][] map, int r, int c, ArrayList<Point> path) {
        if (r < 0 || c < 0 || !map[r][c]) {
            return false;
        }
        boolean atEnd = (r == 0 && c == 0); 
        if(atEnd || findPath(map, r - 1, c, path) || findPath(map, r, c - 1, path)) {
            path.add(new Point(r, c));
            return true;
        }
        return false;

    }
}
