public class Match {
    Fighter f1;
    Fighter f2;
    Fighter c;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    public void run(){
        if(isCheck()){
           while (this.f1.health>0 && this.f2.health>0){
                c = choosefighter(f1,f2);
                if(c.equals(f1)) {
                    f2.health = f1.hit(f2);
                }
                else{
                    f1.health = f2.hit(f1);
                }
                System.out.println(f1.name+" health:" +f1.health+"\n"+f2.name+" health:" +f2.health);
               System.out.println("---------------");
                if (isWin()){
                    break;
                }
           }
        }
        else{
            System.out.println("Sporcular yarış için uygun siklette değil");
        }
    }

    Fighter choosefighter(Fighter f1, Fighter f2){
        double randomNumber = Math.random() * 100;
        if (randomNumber>=50){
            return f1;
        }
        else{
            return f2;
        }
    }

    boolean isCheck(){
        return (this.f1.weight>minWeight && this.f1.weight<maxWeight) && (this.f2.weight>minWeight && this.f2.weight<maxWeight);
    }

    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name + " kazandi");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name + "kazandi");
            return true;
        }
        else{
            return false;
        }
    }
}
