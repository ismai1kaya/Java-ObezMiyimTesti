import java.util.Scanner;

public class ObezMiyim {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz(Örn. 75 kg):");
            double kilo = scanner.nextInt();
                 System.out.println("Boyunuzu giriniz(Örn. 180 cm)");
                    double boy = scanner.nextInt();
                        boy = boy/100;

                        double kbi = kilo/(boy*boy);

        if(kbi < 18.5){
            System.out.println("Zayıfsınız ve kitle beden indeksiniz:" + kbi);
        }
        else if(kbi >= 18.5 && kbi <25){
            System.out.println("Normal kilodasınız ve kitle beden indeksiniz:" + kbi);
        }
        else if(kbi >= 25 && kbi <30) {
            System.out.println("Fazla kilolusunuz ve kitle beden indeksiniz:" + kbi);
        }

        else {
            System.out.println("Obezsiniz ve kitle beden indeksiniz:" + kbi);
        }
    }
}