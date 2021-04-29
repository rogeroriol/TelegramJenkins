class Dividendo {

    public static void main(String[] args) 
    {

        int dividendo = 10;
        int divisor = 0;

        if(Math.random() >= 0.5) {
            divisor = 1;
        }

        int resultat = 0;

        resultat = dividendo / divisor ;

        System.out.print(resultat);
    }

}