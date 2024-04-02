/*
* 有一只鸽子，每年会生一只小鸽子。鸽子出生后的第三年又开始生小鸽子，请问第20年末共有多少只鸽子？假设鸽子寿命足够长。
*/
public class homework3 {
    public static void main(String[] args) {
        int[] dp=new int[21];
        dp[1]=2;
        dp[2]=3;
        dp[3]=4;
        for(int i=4;i<=20;i++) {
            dp[i]=dp[i-1]+dp[i-3];
        }

        System.out.println(dp[20]);
    }
}
