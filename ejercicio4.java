

public class ejercicio4 {
    public static void main(String[] args) {
        int sueldoSemanal;
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = Integer.parseInt(System.console().readLine());
        if  (horasTrabajadas <=40){
            sueldoSemanal =12*horasTrabajadas;
        } else{
            sueldoSemanal=((40*12)+(horasTrabajadas-40)*16);
        }
        System.out.println("El sueldo semanal que le corresponde es de "+sueldoSemanal+" euros");
    }
}
