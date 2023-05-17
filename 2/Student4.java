public class Student4 {
    String name;
    static int counter = 0;

    Student4(String n){
        name = n;
        counter++;
        System.out.println(
            name + "さんをインスタンス化しました"
        );
    }

    static void display(){
        System.out.println(counter + "人です");
    }
    
}
