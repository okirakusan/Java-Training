public class Student4 {
    private String name;
    private static int counter = 0;

    public Student4(String n){
        name = n;
        counter++;
        System.out.println(
            name + "さんをインスタンス化しました"
        );
    }

    public static void display(){
        System.out.println(counter + "人です");
    }
    
}
