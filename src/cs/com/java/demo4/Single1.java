package cs.com.java.demo4;
/**
 *  单列模式实现:定义一个使用private构造方法并且使用静态字段来持有与该类的仅有的实例
 * */
//1、懒汉形式（延迟加载）
public class Single1 {
    private static Single1 single;
    private Single1(){

    }
    //todo 这里加了synchronized关键字可以避免多线程问题，但会影响程序性能。
    public static synchronized Single1 getInstance(){
        if (single==null){
            single=new Single1();
        }
        return single;
    }
}
