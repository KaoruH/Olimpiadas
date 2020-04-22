package app;

public class App {
    public static void main(String[] args) throws Exception {

        Olimpiada olimpiadaCoronaEdition = new Olimpiada();

        Maratonista maratonista1 = new Maratonista();

        maratonista1.nombre = "Sonic";
        maratonista1.procedencia = "Alemania";
        maratonista1.pasaporte = "A7283I";
        maratonista1.edad = 35;
        maratonista1.energia = 100;

        maratonista1.participar(olimpiadaCoronaEdition);

        while (maratonista1.energia > 0) {

            /*

            if (maratonista1.correr()) {

                System.out.println(maratonista1.nombre + " ha corrido");

            } else {

                System.out.println("No pudo correr, que triste");
            }
            */

            if (maratonista1.energia <= 0) {
                System.out.println("Se quedo sin energia");

            }
        }

        int cantidadParticipantes;
        cantidadParticipantes = olimpiadaCoronaEdition.participantes.size();

        System.out.println("La cantidad de Participantes es " + cantidadParticipantes);

    }

    int lala = 0;
}