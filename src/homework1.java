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