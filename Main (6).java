import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner kbd=new Scanner(System.in);
     int R1=kbd.nextInt();
     int R2=kbd.nextInt();
     int tot=R1+R2;
     int avg=tot/2;
     int Rs=R1+R2+R2-R1-R1;
     System.out.print(Rs);

  }
}