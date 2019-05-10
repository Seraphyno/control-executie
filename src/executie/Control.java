package executie;

public class Control {
  
  public static void main(String[] args) {
    //variatii ale structurii if
    if (1 > 0) {
      System.out.println("1 > 0");
    }
    
    
    if (5 < 4) {
      System.out.println("5 < 4");
    } else {
      System.out.println("5 > 4");
    }
    
    if (1 > 10) {
      System.out.println("1 > 10");
    } else if (5 > 10) {
      System.out.println("5 > 10");
    } else if (9 > 10) {
      System.out.println("9 > 10");
    } else if (11 > 10){
      System.out.println("11 > 10");
    } else {
      System.out.println("< 10");
    }
    
    /*
     * keywordul break - opreste executia in acel bloc
     * in cazul structurii switch: daca gasim un rezultat valid vom opri excecutia
     */
    
    
    //Controlul executiei prin switch
    char rezultat;
    char valoareEvaluata = 'F';
    switch (valoareEvaluata) {
      case 'A':
        rezultat = 'A';
        break;
      case 'B':
        rezultat = 'B';
        break;
      case 'C':
        rezultat = 'C';
        break;
      default:
        rezultat = valoareEvaluata;
    }
    System.out.println("Am gasit: " + rezultat);
    
  }
}
