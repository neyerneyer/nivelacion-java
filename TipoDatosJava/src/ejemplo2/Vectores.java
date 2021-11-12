package ejemplo2;

public class Vectores {
    public static void main(String[] args) {
        int vector[];
        int vector1[] = new int[10];
        int []vector2 = new int[10];
        int[] vector3 = new int[10];
        int vector4[] ={};
        int vector5[] ={9,8,7,6,5,4,3,2,1,0};
        int vector6[] =new int[]{9,8,7,6,5,4,3,2,1,0};

        System.out.println(vector5[8]);
        //Desarrollar un programa que, mediante el uso de dos vectores, permita almacenar 5 notas
        //de un estudiante para calcular el promedio final, los valores a calcular el promdio se
        //encuentran en un vector a parte que contiene los porcentajes asignados a cada nota.
        //Nota 1= 20%, nota2= 10% ,nota3=30%, nota4 = 20% y nota5 = 20%

        double notas[] = new double[5];
        int porcentajes[] = {20,10,30,20,20};
        notas[0]=4.5;
        notas[1]=3.2;
        notas[2]=5.0;
        notas[3]=1.5;
        notas[4]=4.3;
        double promedio=0;
        for (int i=0; i<notas.length;i++){
            promedio=(notas[i]*(porcentajes[i])/100)+promedio;
        }
        System.out.println("Promedio final " + Math.round(promedio));






    }
}
