
/**
 * Demo ArrayClass
 * @author huangrichao
 * @date 2018/08/15
 */
public class Main {

    public static void main(String[] args) {
        Array arr = new Array(20);
        for(int i = 0; i < 10; i ++){
            arr.addLast(i);
        }
        System.out.println(arr+"\n");

        arr.addFirst(-1);
        //arr[1] = 100;
        System.out.println(arr+"\n");

        arr.remove(2);
        System.out.println(arr+"\n");
    }
}
