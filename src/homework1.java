/****************************************************************
 * 假如有一个类对象，它想把自己在内存中的地址显示出来，请问如何实现？
 * 提示：之前看到过一个函数hashCode（），能返回hash值，这个值其实就是内存地址。
 ****************************************************************/
public class homework1 {
    public static void main(String[] args) {
        System.out.println("创建一个对象");
        HuZhengPeng hzp = new HuZhengPeng();
        System.out.println(hzp+"说完了");
    }
}

class HuZhengPeng {
    HuZhengPeng() {
        System.out.println(this+"说:");
        System.out.println("我是胡振鹏，我要打印我的地址");
        System.out.println(this.hashCode());
    }
}