/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchtostring;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("Поиски в строчке");
        System.out.println("введите текстс");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("введите строку:");
        String searchStr = scanner.nextLine();
        int i = str.indexOf(searchStr);
        StringBuilder sbStr = new StringBuilder(str);
        if (i>0) {
             System.out.println("Искомая строка начинается на %d позиции%, i");        
        }else{
            System.out.println("искомая строка не найдена");
            System.out.println("---конец программы---");
            System.exit(0);
        }
        
        System.out.println("задачи");
        System.out.println("1 Удалить искомую строку из исходной строки");
        System.out.println("2 заменить искомую строку на другую");
        System.out.println("3 удалить все теги из html документа");
        System.out.println("4 Удалить конкретный тег из html документа");
        System.out.println("выберите задачу");
        String task = scanner.nextLine();
        switch (task) {
            case "0":
                System.out.println("Выбрана задача 0");
                break;
            case "1":
                System.out.println("выбрана задача 1");
                //находим индекс вхождения строки.
                int startIndex = str.indexOf (searchStr);
                // находим Index окончания строки
                int endIndex = startIndex + searchStr.length();
                sbStr.delete(startIndex, endIndex);
                System.out.println("результат");
                System.out.println(sbStr.toString());  
                break;
            case "2":
                System.out.println("выбрана задача 2");
                break;
        }
    
    
    }
    
}
