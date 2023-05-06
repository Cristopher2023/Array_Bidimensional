import java.util.Scanner;

public class TareaDosMatrices {

    public static void main(String[] args) {
         Operaciones();

    }

    public static void Operaciones(){

        Scanner scanner = new Scanner(System.in);
        int NumFil = 0,NumCol = 0;
        while (NumFil<1 ) {
            System.out.print("Numero de Filas que tendran las Matrices: ");
            NumFil = scanner.nextInt();
            if (NumFil<=0) {
                System.out.println("El valor que ingreso es incorrecto");
            }
            System.out.print("Número de columnas que tendran las Matrices: ");
            NumCol = scanner.nextInt();
            if (NumCol<=0) {
                System.out.println("El valor que ingreso es incorrecto");
            }
        }



        int[][] matriz1 = new int[NumFil][NumCol];
        int[][] matriz2 = new int[NumFil][NumCol];
        int[][] matriz3 = new int[NumFil][NumCol];
        int[][] matriz4 = new int[NumFil][NumCol];
        int[][] matriz5 = new int[NumFil][NumCol];

        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Posicion:[" + i + "][" + j + "] = ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Posicion:[" + i + "][" + j + "] = ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz4[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz5[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.printf("%3d", matriz1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMatriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("%3d", matriz2[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSuma de Matrices:");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.printf("%3d", matriz3[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nResta de Matrices:");
        for (int i = 0; i < matriz4.length; i++) {
            for (int j = 0; j < matriz4[i].length; j++) {
                System.out.printf("%3d", matriz4[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMultiplicación de Matrices:");
        for (int i = 0; i < matriz5.length; i++) {
            for (int j = 0; j < matriz5[i].length; j++) {
                System.out.printf("%3d", matriz5[i][j]);
            }
            System.out.println();
        }
    }

}

