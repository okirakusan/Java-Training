public class Football implements Englishable {
    public void display(){
        System.out.println("ドリブル練習");
        System.out.println("シュート練習");
        System.out.println("筋トレ");
    }
    public void displayEng(){
        System.out.println(Englishable.LANGUAGE);
        System.out.println("dribble");
        System.out.println("shoot");
        System.out.println("weight-training");

    }
}
