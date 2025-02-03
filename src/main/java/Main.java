public class Main {
    public static void main(String[] args){

        //Variables básicas
        String accountNumber = "12345689";
        double balance = 1500.75;
        int pin = 1234;

        //Arreglo para montos de transacciones
        int[] transactionAmounts = {200, 100, -50};

        //Operaciones con variables
        balance += transactionAmounts[0]; // Depósito

        if (balance > 0 && pin == 1234){
            System.out.println("Acceso concedido");
        }


        //Uso de operadores -- test
        balance++;
        String status = (balance < 0) ? "Deuda" : "Crédito"; //OPerador ternario
        System.out.println("Estado de cuenta: " + status);
    }

}
