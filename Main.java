import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj=new Scanner(System.in);
    
    System.out.println("Podaj tekst do zamiany");
    
    String tekst=myObj.nextLine();
    int rozmiar=tekst.length();
    
    char zamiana[]=new char[rozmiar];

    for(int i=0;i<rozmiar;i++){
      zamiana[i]=tekst.charAt(i);
    }
     for(int i=0;i<rozmiar;i++){
      if()
    }
   /* char a='p';
    int b=(int)a;
    System.out.println(a+" "+b);
    b=b-32;
    a=(char)b;
    System.out.println(a+" "+b);*/
    
  }
}