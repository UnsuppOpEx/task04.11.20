public class Main {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        for (int j = 0; j < 10; j++) {
            byte randomNumber = (byte) (a + (byte) (Math.random() * b));
            System.out.print("Значение " + randomNumber + " в двоичной системе равно - ");

            String[] str = convertToBits(randomNumber);
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println();

        }
    }

    public static String[] convertToBits(byte value) {
        String[] array = new String[24];
        for (int i = 0; i < 24; i++) {
            array[23 - i] = "" + (value >> i) % 2;
        }
        return array;
    }
}
