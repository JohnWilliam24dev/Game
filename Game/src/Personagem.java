import java.util.HashMap;
import java.util.Map;
public class Personagem {
    String nome="?";
    int life=100;
    int armor=3;
    int magic_armor=3;
    int lethal=0;
    int physical=0;
    int magic=0;
    int level_hability1=0;
    int level_hability2=0;
    int level_hability3=0;
    int level_hability4=0;
    Map <String,Hability> habilitys;
    
    public Personagem(){
        this.habilitys= new HashMap<>();
    }
    public void addHability(String nome_habilidade,Hability hability){
        habilitys.put(nome_habilidade, hability);
    }
    public void useHability(String nome_habilidade){
        Hability hability = habilitys.get(nome_habilidade);
        if(hability!=null){
            hability.use();
        }else{ 
            System.out.println(nome+" Não tem essa habilidade.");
        }
    }
    void attack_magic(int damage,Personagem oponente){
        int enemy_magic_armor=oponente.magic_armor;
        
        int realdamage=damage-enemy_magic_armor;
        oponente.life=oponente.life-realdamage;
        

    }
    void attack_physical(int damage,int lethal,Personagem oponente){
        int enemy_armor=oponente.armor;
        if(lethal>enemy_armor){
            oponente.life=oponente.life-damage;
        }else if(lethal<armor && lethal!=0){
            int armor_redux=enemy_armor-lethal;
            int realdamage=damage-armor_redux;
            oponente.life=oponente.life-realdamage;
        }else if(lethal==0){
            int realdamage=damage-enemy_armor;
            oponente.life=oponente.life-realdamage;
        }
       
        

    }
  

}
