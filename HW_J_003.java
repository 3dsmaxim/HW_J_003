import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HW_J_003 {
    public static void main(String[] args) {
        Random rand = new Random();
        // 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

        ArrayList<Integer> frstList = new ArrayList<Integer>();
        ArrayList<Integer> sortList = new ArrayList<Integer>();

        
        for (int i = 0; i < 19; i++) {
            frstList.add(rand.nextInt(40));
        }

        System.out.println(frstList);
        System.out.println("Среднее " + MeanNumber(frstList));
        System.out.println("Среднее " + MeanNumber2(frstList));
        sortList = frstList;
        Collections.sort(sortList);
        System.out.println(sortList);
        System.out.println(sortList.get(0));
        System.out.println(sortList.get(sortList.size()-1));
        // 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        // 
        // 2 Пусть дан произвольный список целых чисел, удалить из него четные числа
        System.out.println("Второе задание");
        System.out.println(frstList);
        System.out.println(OddNumbers(frstList));
        
        // 2 Пусть дан произвольный список целых чисел, удалить из него четные числа

        // 3* Реализовать алгоритм сортировки слиянием  -----  пока никак
        System.out.println("Третье задание");

        ArrayList<Integer> secondList = new ArrayList<Integer>();
        ArrayList<Integer> secondList2 = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            secondList.add(rand.nextInt(40));
        }
        System.out.println(secondList);

        try {
          
            for (int i = 0; i < secondList.size(); i+=2) {
                if (secondList.get(i) > secondList.get(i+1)){
                    secondList2.add(secondList.get(i+1));
                    secondList2.add(secondList.get(i));
    
                } else {
                    secondList2.add(secondList.get(i));
                    secondList2.add(secondList.get(i+1));
                }
            }
        } catch (Exception e) {
            secondList2.add(secondList.get(secondList.size()-1));
        }
        System.out.println(secondList2);
        secondList.clear();

       
        
        
        


    }
   
    // 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    // среднее арифметическое из этого списка.
    static double MeanNumber(ArrayList<Integer> intList){
        double result = 0;
        for (int i = 0; i < intList.size(); i++) {
            result += intList.get(i);            
        }
        result = result/ intList.size();
        return result;

    }
    
    static int MeanNumber2(ArrayList<Integer> intList) {
        double result = 0;
        for (int i = 0; i < intList.size(); i++) {
            result += intList.get(i);
        }
        result = result / intList.size();
        if (result > (double)(int) result + 0.5){
            return (int) result + 1;

        } else{
            return (int) result;
        }
        

    }
    // 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    // среднее арифметическое из этого списка.
    //
    //
    // 2 Пусть дан произвольный список целых чисел, удалить из него четные числа
    
    static ArrayList<Integer> OddNumbers(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i)%2 == 0){
                intList.remove(i);
                i--;
            }
        }
        
        return intList;

    }

    // 2 Пусть дан произвольный список целых чисел, удалить из него четные числа
    //
    //


    
  








}
