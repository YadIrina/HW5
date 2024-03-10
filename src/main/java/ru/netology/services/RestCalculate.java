package ru.netology.services;

public class RestCalculate {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {

            if (money < threshold) { // можем ли отдыхать?
                System.out.println("Месяц " + month + ". Денег " + money + ". Придется поработать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            } else {
                int restMoneyBalance = money - expenses;
                int restMoney = restMoneyBalance - ((money - expenses) / 3);
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + restMoney);
                money = (money - expenses) / 3;
                count++;

            }
        }

        return count;
    }
}