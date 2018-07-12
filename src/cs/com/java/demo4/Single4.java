package cs.com.java.demo4;
//内部静态类单列模式
public class Single4 {
    private Single4(){

    }
    public static class Single4Hodler{
        private static Single4 single4=new Single4();
    }

    // TODO: 2018/7/8 这里创建了一个内部静态类，通过内部类的机制使得单例对象可以延迟加载，同时内部类相当于是外部类的静态部分，所以可以通过jvm来保证其线程安全。这种形式比较推荐。
    private static Single4 getInstance(){
        return Single4Hodler.single4;
    }

}
