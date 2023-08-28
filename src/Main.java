

public class Main {
    public static void main(String[] args) {
        final int sizeArray=50;
        int[] array = new int[sizeArray];
        int countNegative=0;
        int countPositive=0;
        int countZero=0;
        int sum=0;
        int sumNegative=0;
        int sumPositive=0;

        System.out.println("Элементы массива: ");
        for(int i=0;i<sizeArray;i++){
            array[i]=(int)(Math.random() * 101) -50;
            sum+=array[i];
            if (array[i]<0){
                countNegative+=1;
                sumNegative+=array[i];
            } else if (array[i]>0) {
                countPositive+=1;
                sumPositive+=array[i];
            }
            else{
                countZero+=1;
            }
            System.out.println("array["+i+"] = "+array[i]);
        }
        System.out.println("Количество отрицательных элементов: "+ countNegative);
        System.out.println("Количество положительных элементов: "+ countPositive);
        System.out.println("Количество нулевых элементов: "+ countZero);
        System.out.println("Сумма положительных элементов: "+ sumPositive);
        System.out.println("Сумма отрицательных элементов: "+ sumNegative);
        System.out.println("Среднее по массиву: "+ (double)sum/sizeArray );

    }
}