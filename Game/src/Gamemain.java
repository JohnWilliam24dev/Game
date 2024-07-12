import java.util.Random;
import java.util.Scanner;




public class Gamemain{
    public String os=System.getProperty("os.name").toLowerCase();
    int dado(int limite){
        Random generator= new Random();
        int result= generator.nextInt(limite)-1;
        return result;
    }
    
    public void main_menu(){
        
        Scanner scan= new Scanner(System.in);
        while(true){
            Clear.clear();
            System.out.println("-------------------------------------------------");
            System.out.println("|\t\t\tMenu\t\t\t|");
            System.out.println("|\t\t\t\t\t\t|");
            System.out.println("|\t\t    1)Novo Jogo\t\t\t|");
            System.out.println("|\t\t\t\t\t\t|");
            System.out.println("|\t\t    4)Sair\t\t\t|");
            System.out.println("|\t\t\t\t\t\t|");
            System.out.println("-------------------------------------------------");
            int option=scan.nextInt();
            switch (option) {
                case 1:
                    selection();
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Opção invalida, tente novamente");
                    break;
            }
        }
        
    }
    private void characters(){
        Personagem William_hall= new Personagem();
        William_hall.addHability("Espelho da corrupção", ()->{
            int damage=dado(8)+dado(8)+dado(8)+ William_hall.magic;
        });
        
    }
    public void selection(){
        Clear.clear();
        characters();
        
        
    }
    
}
