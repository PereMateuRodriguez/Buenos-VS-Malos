public class Main {
  public static void main(String[] args) {
     String goodAmounts = "1 2 1 1 1 1";
     String evilAmounts = "1 1 1 1 1 1 1";
     
     String[] words = goodAmounts.split(" ");
        int [] numeros = new int[goodAmounts.length()];
        int i = 0;
        for (String word : words) {

          numeros[i] = Integer.parseInt(word);
          i = i +1;

        }
        //Pasar a string a int de los malos

        String[] wordss = evilAmounts.split(" ");
        int [] nume = new int[goodAmounts.length()];
        i = 0;
        for (String wor : wordss) {

            nume[i] = Integer.parseInt(wor);
            i = i +1;

        }
        //Modificacon de putos malos
        nume[1] = nume[1] * 2;
        nume[2] = nume[2] * 2;
        nume[3] = nume[3] * 2;
        nume[4] = nume[4] * 3;
        nume[5] = nume[5] * 5;
        nume[6] = nume[6] * 10;
       
            //Sumar los malos
        int sumaM = 0;

        for (int j = 0; j < nume.length; j++){
            sumaM = sumaM + nume[j];
        }

		//Modificacion de puntos
        numeros[1] = numeros[1] * 2;
        numeros[2] = numeros[2] * 3;
        numeros[3] = numeros[3] * 3;
        numeros[4] = numeros[4] * 4;
        numeros[5] = numeros[5] * 10;
        
            //Sumar numeros de los buenos
        int sumaB = 0;

        for (int j = 0; j < numeros.length; j++){
            sumaB = sumaB + numeros[j];
        }

        if (sumaB < sumaM){
           System.out.println("Battle Result: Evil eradicates all trace of Good");
        }
        else if(sumaB > sumaM ){
             System.out.println("Battle Result: Good triumphs over Evil");

        }
        else{
            System.out.println("Battle Result: No victor on this battle field");
        }
    
  }
}
