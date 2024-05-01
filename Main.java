import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // заполнение списков рандомным образом
        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 10));
            list2.add((int) (Math.random() * 10));
        }
        // вычисляем среднуу значения
        double avg1 = getAverage(list1);
        double avg2 = getAverage(list2);

        System.out.println("Среднее значение первого списка: " + avg1);
        System.out.println("Среднее значение второго списка: " + avg2);

        if (avg1 > avg2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (avg2 > avg1) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }

    // метод для расчета среднего значения списка
    public static double getAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return (double) sum / list.size();
    }
}
