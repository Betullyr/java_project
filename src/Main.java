public class Main {
    public static void main(String[] args){

        Fighter f1 = new Fighter("A",10,120,100,45);
        Fighter f2 = new Fighter("B",20,85,85,30);

        Match match = new Match(f1,f2,80,105);
        match.run();
    }
}
