package cs.com.java.demo4;
/**
 *  单列模式实现:定义一个使用private构造方法并且使用静态字段来持有与该类的仅有的实例
 * */
//1、双重检查形式
public class Single3 {
    private volatile static Single3 single; // TODO: 2018/7/8 volatile关键字
    private Single3(){

    }
    // 这个是懒汉形式的加强版，
    // 将synchronized关键字移到了newInstance方法里面，同时将singleton对象加上volatile关键字，
    // 这种方式既可以避免多线程问题，又不会降低程序的性能。但volatile关键字也有一些性能问题，不建议大量使用。
    public static synchronized Single3 getInstance(){
        if (single==null){
            synchronized (Single3.class){
                if(single==null){

                    single=new Single3();
                }
            }
        }
        return single;
    }
}
