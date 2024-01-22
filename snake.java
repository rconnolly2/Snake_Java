public class snake {

    public static void snail(int[][] array) {
        int indice_x = array[0].length-1;
        int indice_y = array[0].length-1;
        int x_actual = 0;
        int y_actual = 0;
        int contador_y = 0;


        for (int i=x_actual; i<=indice_x; i++) {
            System.out.println(array[x_actual][i]);
        }

        for (int j=x_actual+1; j<=indice_y; j++) {
            System.out.println(array[j][indice_x]);
        }
        
        for (int k=indice_x-1; k>=0; k--) {
            System.out.println(array[indice_y][k]);
        }

        indice_x -= 1;
        indice_y -= 1;

        for (int k=indice_y; k>=y_actual; k--) {
            System.out.println(array[k][x_actual]);
        }

        //nuevo ciclo
        x_actual += 1;
        y_actual += 1;
        for (int i=x_actual; i<=indice_x; i++) {
            System.out.println(array[x_actual][i]);
        }

   }

   public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                        {4, 5, 6, 7},
                        {7, 8, 9, 10},
                        {11, 12, 13, 14}};

        snail(array);
   }
}