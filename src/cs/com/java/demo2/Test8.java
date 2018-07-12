package cs.com.java.demo2;

class Client1{
    String name;
    int code;

    public Client1(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
public class Test8 {
    public static void main(String[] args){
        Client1 client1 = new Client1("alice",1234);
        Client1 client2 = new Client1("alice",1234);

        System.out.println(client1 == client2);
        System.out.println(client1.equals( client2));
    }
}
