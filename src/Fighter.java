public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge>=0 && this.dodge<=100){
            this.dodge = dodge;
        }
        else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe){
        if(isDodge()){
            System.out.println(foe.name+" blokladı");
        }
        else {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vuruldu");
            foe.health = foe.health - this.damage;
            if (foe.health < 0) {
                return 0;
            }
        }
        return foe.health;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}

