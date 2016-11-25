
package Path;

import java.util.Scanner;

/**
 *
 * @author Belmostapha
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T < 0 || T > 1000) {
            System.err.println("ERROR");
        } else {
            int[][] TS = new int[T][4];
            for (int i = 0; i < T; i++) {
                TS[i][0] = sc.nextInt();
                TS[i][1] = sc.nextInt();
                TS[i][2] = sc.nextInt();
                TS[i][3] = sc.nextInt();
            }
            for (int i = 0; i < T; i++) {
                Point p = new Point(TS[i][0], TS[i][1]),
                        q = new Point(TS[i][2], TS[i][3]);
                if (p.reaches(q)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }
    }
}

class Point {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean reaches(Point p) {
      int xx=x;
        boolean Xreached = false, Yreached = false;
        while (true) {
            if (p.x > x) {
                if (y > 0) {
                    x = x + y;
                    if (x > p.x) {
                        break;
                    }
                } else if (y < 0) {
                    x = x - y;
                    if (x > p.x) {
                        break;
                    }
                }
            } else if (p.x < x) {
                if (y < 0) {
                    x = x + y;
                    if (x < p.x) {
                        break;
                    }
                } else if (y > 0) {
                    x = x - y;
                    if (x < p.x) {
                        break;
                    }
                }
            } else {
                Xreached = true;
                break;
            }

        }
        x = xx;
        while (true) {
            if (p.y > y) {

                if (x > 0) {
                    y = y + x;
                    if (y > p.y) {
                        break;
                    }
                } else if (x < 0) {
                    y = y - x;
                    if (y > p.y) {
                        break;
                    }
                }
            } else if (p.y < y) {
                if (x < 0) {
                    y = y + x;
                    if (y < p.y) {
                        break;
                    }
                } else if (x > 0) {
                    y = y - x;
                    if (y < p.y) {
                        break;
                    }
                }
            } else {
                Yreached = true;
                break;
            }

        }

        return Xreached && Yreached;

    }

}


/*
Problem Statement

Adam is standing at point (a,b) in an infinite 2D grid. He wants to know if he can reach point (x,y) or not. 
The only operation he can do is to move to point (a+b,b), (a,a+b), (a-b,b), or (a,a-b) from some point (a,b).
It is given that he can move to any point on this 2D grid,i.e., the points having positive or negative X(or Y)
co-ordinates.
Tell Adam whether he can reach (x,y) or not.
Input Format
The first line contains an integer, T, followed by T lines, each containing 4 space separated integers i.e. a b x y
Output Format
For each test case, display YES or NO that indicates if Adam can reach (x,y) or not.
Constraints
0 ≤ T ≤ 1000
0 ≤ a,b,x,y ≤ 1018

Sample Input
3
1 1 2 3
2 1 2 3
3 3 1 1
Sample Output

YES
YES
NO
Explanation

(1,1) -> (2,1) -> (2,3).

*/