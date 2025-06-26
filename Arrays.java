public class Arrays {
    public static void main(String[] args){
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(carros);

        for (int i=0; i < carros.length; i++){
        System.out.println(carros[i]);
        }

        carros[0] = "Fusca";
        System.out.println(carros[2]);

        String[] novosCarros = new String[carros.length + 1];
        for (int i=0; i < carros.length; i++){
            novosCarros[i] = carros[i];
        }

        novosCarros[carros.length] = "Toyota";
        for (String carro : novosCarros){
        System.out.println(carro);
        }
    }
} 