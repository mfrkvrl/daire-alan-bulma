import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        double r=0;
        double aci = 0;
        boolean i=true,j=true;

        while(i){
            System.out.println("Alanını bulmak istediğiniz daire diliminin yarı çapını giriniz ");
            r=scan.nextDouble();
            if(r<0){
                System.out.println("Yarıçap 0'dan küçük olamaz");
            }
            else{
                i=false;

            }
        }

        while(j){
            System.out.println("Alanını bulmak istediğiniz daire diliminin açısını giriniz ");
            aci=scan.nextDouble();
            if(aci<0){
                System.out.println("Açı 0-360 değerleri arasında olmalıdır");
            }
            else{
                j=false;
            }
        }

        double alan=((pi*r*r)*aci/360);
        System.out.println(alan);


    }
}
