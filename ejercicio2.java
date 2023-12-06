
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Ingrese una hora del día de (0-23): ");
        /* try{
            int hora = Integer.parseInt(System.console().readLine());
            if (hora>=6 && hora<=12){
                System.out.println("Buenos días");
            }else if (hora>12 && hora<=20){
                System.out.println("Buenas tardes");
            }else if (hora>=21 && hora<=24) || (hora<=5 && hora>=0) {
                System.out.println("Buenas noches");
            }
            else{
                System.out.println("La hora introducida no es válida");
            }
        }catch (NumberFormatException e){
            System.out.println("La hora introducida no es válida");
        }catch (Exception e) {
            System.out.println("Se ha introducido un valor inesperado");
        } */
        int hora =Integer.parseInt(System.console().readLine());
        if (( hora >= 6 ) && ( hora <= 12 )){
            System.out.println("¡Buenos días!");

        }
        if (( hora >= 13 ) && ( hora <= 20 )){
            System.out.println("¡Buenas tardes!");
        }
        if (( hora >= 21 ) && ( hora<=24 ) || ( hora <= 5 ) && ( hora >= 0 )){
            System.out.println("¡Buenas noches!");
        }
        if (( hora >= 24 ) || ( hora < 0 )){
            System.out.println("La hora introducida no es válida.");
        }

    }
}
