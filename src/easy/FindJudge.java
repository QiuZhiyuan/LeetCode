package easy;

public class FindJudge {
    public int findJudge(int N, int[][] trust) {
        int[] persons = new int[N];
        boolean[] hasTrust = new boolean[N];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = 0;
            hasTrust[i] = false;
        }
        for (int[] ints : trust) {
            int p1 = ints[0] - 1;
            int p2 = ints[1] - 1;
            persons[p2]++;
            hasTrust[p1] = true;
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == persons.length - 1 && !hasTrust[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}
