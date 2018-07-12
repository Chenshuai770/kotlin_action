package cs.com.java.demo2;



public class Test7 {
    private String name="gaoshou";
    public String sayHello(){
        return name;
    }

    class inner1 {
        // TODO: 2018/7/8 内部类 能拿到外部类的应用
        private String otherName=name;

        public String innerName(){
            return sayHello();
        }
    }

    static class inner2 {
        // TODO: 2018/7/8 嵌套内部类 那么不到外部类的引用
       /* private String otherName=name;

        public String innerName(){
            return sayHello();
        }*/
    }

}
