package package1;

class Man {
    
    int health = 50;
    
//    Gun gun[];
    Gun gun[] = new Gun[3];
    
    public static void main(String[] args) {
        
        Man man = new Man();
        
        Gun gun1 = new Gun();
        gun1.bullet = 5;
        
        man.gun[0] = gun1;
        
        Gun gun2 = new Gun();
        gun2.bullet = 20;
        
        man.gun[1] = gun2;
        
        System.out.println(man.gun[0].bullet);
        System.out.println(man.gun[1].bullet);
        
    }
    
}

class Gun {
    
    int bullet;
    
}