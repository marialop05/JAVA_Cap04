

public class ejercicio3 {
    public static void main(String[] args) {
        /* try{
            int dia = Integer.parseInt(System.console().readLine());
            switch(dia){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                default:
                    System.out.println("El dia introducido no es correcto");
            }
        }catch (NumberFormatException e){
            System.out.println("El día introducido no es válido");
        }catch (Exception e){
            System.out.println("Has introducido un valor inesperado");
        } */
        String dia;
        System.out.print("Introduzca un número del 1 al 7: ");
        int n = Integer.parseInt(System.console().readLine());
        switch(n){
            case 1:
                dia="Lunes";
                break;
            case 2:
                dia="Martes";
                break;
            case 3:
                dia="Miércoles";
                break;
            case 4:
                dia="Jueves";
                break;
            case 5:
                dia="Viernes";
                break;
            case 6:
                dia="Sábado";
                break;
            case 7:
                dia="Domingo";
                break;
            default:
                dia="Debes introducir un número del 1 al 7";
        }
        System.out.println(dia);
    }
}

