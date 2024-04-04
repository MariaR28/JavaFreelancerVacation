package ru.netology.services;

public class VacantMonthService {
    public int calculate(int income, int expenses, int threshold) {
        int countVacationMonth = 0; //счетчик месяцев отдыха
        int money = 0; //количество денег на счету

        for (int month = 1; month <= 12; month++) {

            if (money < threshold) { //Работа. Накоплений меньше 20_000
                System.out.println("Месяц " + month + "." + " Денег " + money + ". " + " Придется работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;

            } else { //Отдых. Накоплений больше 20_000
                System.out.println("Месяц " + month + "." + " Денег " + money + ". " + "Буду отдыхать. Заработал +" + income + ", потратил -" + expenses);
                money = (money - expenses) / 3;
                countVacationMonth++;
            }
        }
        return countVacationMonth;
    }
}