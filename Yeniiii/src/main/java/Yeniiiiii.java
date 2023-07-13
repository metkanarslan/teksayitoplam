import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        int n,total=0;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayi Giriniz : ");
            n=inp.nextInt();
            if(n%2==0&&n%4==0){
                total+=n;
            }
        }while(n%2==0);
        System.out.println("Toplam Değer : " + total);


    }

}
