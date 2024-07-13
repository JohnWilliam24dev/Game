import java.util.Random;
import java.util.Scanner;




public class Gamemain{
    public String os=System.getProperty("os.name").toLowerCase();
    
    
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
    
        
    
    public void selection(){
        Charater charater=new Charater();
        charater.dado(3);
        Clear.clear();
        
        System.exit(0);
        
    }
        
        
}
    

