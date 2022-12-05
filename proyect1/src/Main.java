public class Main {
    public static void main(String[] args) {
        int base = 400;
        int height = 500;
        int enteredArea = 150;
        int area;

        area = (base * height) / 2;

        if(area == enteredArea) {
            System.out.println("Felicitaciones el resultado es correcto");
        }
        else {
            System.out.println("Lo siento, el area ingresada no es correcta");
        }
    }
}