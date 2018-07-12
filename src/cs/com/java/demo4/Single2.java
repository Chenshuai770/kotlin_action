package cs.com.java.demo4;

/**
 * 单列模式实现:定义一个使用private构造方法并且使用静态字段来持有与该类的仅有的实例
 */
//2、饿汉形式（贪婪加载）
public class Single2 {
    private static Single2 single=new Single2();
    private Single2(){

    }
    //todo 在单例对象声明的时候就直接初始化对象，可以避免多线程问题，但是如果对象初始化比较复杂，会导致程序初始化缓慢。
    public static  Single2 getInstance(){
        return single;
    }
}
