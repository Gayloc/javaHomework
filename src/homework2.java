/*
* 计算888的前10项之和
*/
public class homework2 {
    public static void main(String[] args) {
        long result=0;
        for(int i=0;i<10;i++) {
            for(int j=0;j<=i;j++) {
                result+= (long) (8*Math.pow(10,j));
            }
        }
        System.out.print(result);
    }
}
