package common;

import java.util.Arrays;

public class InversionCount{

    // 我们的算法类不允许产生任何实例
    private InversionCount(){}

    // merge函数求出在arr[l...mid]和arr[mid+1...r]有序的基础上, arr[l...r]的逆序数对个数
    private static long merge(int[] arr, int l, int mid, int r) {

        int[] aux = Arrays.copyOfRange(arr, l, r+1);//注意复制后的数组元素包括前索引位置的元素，不包括后索引位置的元素

        // 初始化逆序数对个数 res = 0
        long res = 0L;
        // 初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
        int i = l, j = mid+1;
        for( int k = l ; k <= r; k ++ ){

            if( i > mid ){  // 如果左半部分元素已经全部处理完毕
                arr[k] = aux[j-l];//注意有l个偏移量
                j ++;
            }
            else if( j > r ){   // 如果右半部分元素已经全部处理完毕
                arr[k] = aux[i-l];
                i ++;
            }
            else if( aux[i-l]<=aux[j-l] ){  // 左半部分所指元素 <= 右半部分所指元素
                arr[k] = aux[i-l];
                i ++;
            }
            else{   // 右半部分所指元素 < 左半部分所指元素
                arr[k] = aux[j-l];
                j ++;
                // 此时, 因为右半部分k所指的元素小
                // 这个元素和左半部分的所有未处理的元素都构成了逆序数对
                // 左半部分此时未处理的元素个数为 mid - i + 1
                res += (long)(mid - i + 1);
            }
        }

        return res;
    }

    // 求arr[l..r]范围的逆序数对个数
    // 思考: 归并排序的优化可否用于求逆序数对的算法? :)
    private static long solve(int[] arr, int l, int r) {

        if (l >= r)
            return 0L;

        int mid = l + (r-l)/2;
        // 求出 arr[l...mid] 范围的逆序数
        long res1 = solve(arr, l, mid);
        // 求出 arr[mid+1...r] 范围的逆序数
        long res2 = solve(arr, mid + 1, r);

//　　　　　//只有每一次merge才会返回逆序数，而最底层的res(即solve()方法的返回值)都为0
//　　　　　//所以这一句最后加的总和其实就是每次merge的返回值

        return res1 + res2 + merge(arr, l, mid, r);
    }

    public static long solve(int[] arr){

        int n = arr.length;
        return solve(arr, 0, n-1);
    }

    // 测试 InversionCount
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,4,4};
        long l=solve(arr);
        System.out.println(l);
        return;
    }
}