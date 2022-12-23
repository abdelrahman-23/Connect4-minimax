import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Modes-------------\n1. AI vs AI\n2. Human Starts\n3. AI Starts");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Mode : ");
        int mode = sc.nextInt();
        if (mode==1){
            new AI_VS_AI();
        } else if (mode==2) {
            new Human_VS_AI();
        } else if (mode==3) {
            new AI_VS_Human();
        }
    }
}
