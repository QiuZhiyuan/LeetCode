package other;

/**
 * Created by qiuzhiyuan on 2015/12/1.
 */
public class UniquePaths {
    private long[][] map;
    private int m,n;
    public int uniquePaths(int m, int n) {
        this.m = m;
        this.n = n;

        map = new long[m][n];

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                map[i][j] = 0;
            }
        }

        map[0][0] = 1;

        for(int sum = 1;sum<m+n;sum++){
            for(int i = 0;i<n;i++){
                int x = sum -i;
                if(x<0|x>=m){
                    continue;
                }
                int y = i;
//                System.out.println("x:"+x+" y:"+y);
                move(x,y,x-1,y);
                move(x,y,x,y-1);
            }
        }
//        System.out.println((int)map[m-1][n-1]);
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        return (int) map[m-1][n-1];
    }

    private void move(int x,int y,int tx,int ty){
        if(tx<0|tx>=m|ty<0|ty>n){
            return;
        }
        map[x][y] = map[tx][ty]+map[x][y];

    }
}
