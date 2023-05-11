class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);//clase llamada integer que tiene el metodo parseInt, esto hace que toma el int
        //int es una variable primitiva, integer es una clase que tiene metodos
        SumaDosNumeros obj = new SumaDosNumeros();// tipo de dato y variable que va a contener el objeto
        //la palabra new genera un espacio de memoria que contiene la estructura de la clase
        System.out.println(obj.suma(a,b));
    }
}
