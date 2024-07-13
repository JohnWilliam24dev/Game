import java.util.Random;

public class Charater {
    public int dado(int limite){
        Random generator= new Random();
        int result= generator.nextInt(limite)+1;
        return result;
    }
    public void William_hall(Personagem oponente){
        Personagem William_hall= new Personagem();
        William_hall.magic=+5;
        William_hall.magic_armor=+2;
        
        William_hall.addHability("Chamas da Corrupção", ()->{
            int damage=dado(8)+dado(8)+dado(8)+William_hall.magic;
            William_hall.attack_magic(damage, oponente);
        });
        William_hall.addHability("Expurgo das almas", ()->{
            int damage=dado(8)+dado(8)+dado(8)+dado(8)+William_hall.magic;
            William_hall.attack_magic(damage, oponente);
        });
    }
    
}
