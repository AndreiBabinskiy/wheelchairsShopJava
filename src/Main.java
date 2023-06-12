import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<WheelChair> wheelChairs = newWheelchair();
        Scanner scanner = new Scanner(System.in);
        boolean isFlag = true;
        System.out.println("-----------Административная часть-----------");
        while(isFlag) {
            System.out.print("Введите логин: ");
            String login = scanner.next();
            if(login.equals("iskov962@gmail.com")) {
                break;
            } else {
                System.out.println("Неверный ввели логин, Повторите ! ");
                isFlag = true;
            }
        }
        boolean isFlag1 = true;
        while (isFlag1) {
            System.out.print("Введите пароль: ");
            String password = scanner.next();
            if(password.equals("1234")) {
                break;
            } else {
                System.out.println("Неверный ввели пароль, Повторите ! ");
                isFlag = true;
            }
        }
        do {
            System.out.println("Магазин инвалидных колясок");
            System.out.println("------------------------------");
            System.out.println("МЕНЮ:");
            System.out.println("=================================================");
            System.out.println("1 - Добавление новой инвалидной коляски;");
            System.out.println("2 - Редактирование иналидной коляски;");
            System.out.println("3 - Поиск инвалидной коляски;");
            System.out.println("4 - Удаление инвалидной коляски;");
            System.out.println("5 - Просмотр всех инвалидной коляски;");
            System.out.println("6 - Выход;");
            System.out.println("=================================================");
            System.out.print("Выберите пункт меню: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Если вы хотите завершить программу нажмите - exit !");
                if ("exit".equals(scanner.next())){
                    System.out.println("\nПрограмма завершена !");
                    System.exit(0);
                } else {
                    System.out.println("\nВыберите пункт меню:");
                }
            }
            int choiceMenu = scanner.nextInt();
            switch (choiceMenu) {
                case 1: {
                    System.out.println("Добавление новой инвалидной коляски...");
                    System.out.println("=================================================");
                    wheelChairs = addWheelChair(wheelChairs);
                    System.out.println("Нажмите q, чтобы вернуться в меню");
                    while (scanner.hasNext()) {
                        if ("q".equals(scanner.next())) {
                            break;
                        }
                        System.out.println("Нажмите q, чтобы вернуться в меню");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Редактирование иналидной коляски...\n");
                    System.out.println("=================================================");
                    wheelChairs = changeWheelchair(wheelChairs);
                    System.out.println("Нажмите q, чтобы вернуться в меню");
                    while (scanner.hasNext()) {
                        if ("q".equals(scanner.next())) {
                            break;
                        }
                        System.out.println("Нажмите q, чтобы вернуться в меню");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Поиск инвалидной коляски...\n");
                    System.out.println("=================================================");
                    wheelChairs = searchWheelchair(wheelChairs);
                    System.out.println("Нажмите q, чтобы вернуться в меню");
                    while (scanner.hasNext()) {
                        if ("q".equals(scanner.next())) {
                            break;
                        }
                        System.out.println("Нажмите q, чтобы вернуться в меню");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Удаление инвалидной коляски...\n");
                    System.out.println("=================================================");
                    wheelChairs = deleteWheelchair(wheelChairs);
                    System.out.println("Нажмите q, чтобы вернуться в меню");
                    while (scanner.hasNext()) {
                        if ("q".equals(scanner.next())) {
                            break;
                        }
                        System.out.println("Нажмите q, чтобы вернуться в меню");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Просмотр всех инвалидных колясок...\n");
                    System.out.println("=================================================");
                    viewWheelChair(wheelChairs);
                    System.out.println("Нажмите q, чтобы вернуться в меню");
                    while (scanner.hasNext()) {
                        if ("q".equals(scanner.next())) {
                            break;
                        }
                        System.out.println("Нажмите q, чтобы вернуться в меню");
                    }
                    break;
                }
                case 6: {
                    System.out.println("*-*Программа завершена*-*\n");
                    System.out.println("*-*До свидания!*-*\n");
                    System.out.println("=================================================");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Пожалуйста, выберите из предложенных вариантов!\n\n\n");
                    break;
                }
            }

        } while (true);
    }

    public static List<WheelChair> newWheelchair() {
        List<WheelChair> wheelChairs = new ArrayList<>();
        wheelChairs.add(new WheelChair(1,"Gepard",2911,"АктивнаяКоляска"));
        wheelChairs.add(new WheelChair(2,"Pathera",3921,"АктивнаяКоляска"));
        return wheelChairs;
    }
    public static List<WheelChair> addWheelChair(List<WheelChair> wheelChairs) {
        List<WheelChair> list = new ArrayList<>(wheelChairs);
        Scanner scanner = new Scanner(System.in);
        for(WheelChair wheelChair : list) {
            System.out.println(wheelChair);
        }
        System.out.print("Введите id коляски: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Если вы хотите завершить программу нажмите - exit !");
            if ("exit".equals(scanner.next())) {
                System.out.println("\nПрограмма завершена !");
                System.exit(0);
            } else {
                System.out.print("\nВвведите id коляски:");
            }
        }
        int id = scanner.nextInt();
        System.out.print("Введите имя коляски: ");
        String name = scanner.next();

        System.out.print("Введите цену коляски: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Если вы хотите завершить программу нажмите - exit !");
            if ("exit".equals(scanner.next())) {
                System.out.println("\nПрограмма завершена !");
                System.exit(0);
            } else {
                System.out.print("\nВведите цену коляски:");
            }
        }
        int price = scanner.nextInt();
        System.out.print("Введите группу коляски: ");
        String description = scanner.next();
        list.add(new WheelChair(id, name, price, description));
        System.out.println("Инвалидная коляска успешно добавлена !");
        return list;
    }

    public static List<WheelChair> deleteWheelchair(List<WheelChair> wheelChairs) {
        List<WheelChair> list = new ArrayList<>(wheelChairs);
        Scanner scanner = new Scanner(System.in);
        for(WheelChair wheelChair : list) {
            System.out.println(wheelChair);
        }
        System.out.println("Какую коляску удалить по id ? ");
        int id = scanner.nextInt();
        for(WheelChair wheelChair : wheelChairs){
            if(id == wheelChair.getId()) {
                list.remove(wheelChair);
                System.out.println("Инвалидная коляска под id = " + id + " удалена !");
            }
        }
        return list;
    }
    public static void viewWheelChair(List<WheelChair> wheelChairs) {
        for (WheelChair wheelChair : wheelChairs) {
            System.out.println(wheelChair);
        }
    }

    public static List<WheelChair> changeWheelchair(List<WheelChair> wheelChairs) {
        List<WheelChair> list = new ArrayList<>(wheelChairs);
        Scanner scanner = new Scanner(System.in);
        for(WheelChair wheelChair : list) {
            System.out.println(wheelChair);
        }
        System.out.println("Какую коляску изменить по id ? ");
        int id = scanner.nextInt();
        for(WheelChair wheelChair : wheelChairs) {
            if (id == wheelChair.getId()) {
                boolean isFlag = true;
                while (isFlag) {
                    System.out.println("Изменить id коляски ?");
                    System.out.println("1 - Да");
                    System.out.println("2 - Нет");
                    int numberId = scanner.nextInt();
                    switch (numberId) {
                        case 1: {
                            System.out.println("Введите id коляски:");
                            int iD = scanner.nextInt();
                            wheelChair.setId(iD);
                            isFlag = false;
                            break;
                        }
                        case 2: {
                            System.out.println("Изменений id не произошло !\n");
                            isFlag = false;
                            break;
                        }
                        default: {
                            System.out.println("Пожалуйста, выберите из предложенных вариантов!\n");
                            isFlag = true;
                        }
                    }
                }
                boolean isFlag1= true;
                while (isFlag1) {
                    System.out.println("Изменить имя коляски ?");
                    System.out.println("1 - Да");
                    System.out.println("2 - Нет");
                    int numberName = scanner.nextInt();
                    switch (numberName) {
                        case 1: {
                            System.out.println("Введите имя коляски: ");
                            String name = scanner.next();
                            wheelChair.setNameWheelChair(name);
                            isFlag1 = false;
                            break;
                        }
                        case 2: {
                            System.out.println("Изменения имя не произошло !\n");
                            isFlag1 = false;
                            break;
                        }
                        default: {
                            System.out.println("Пожалуйста, выберите из предложенных вариантов!\n");
                            isFlag1 = true;
                        }
                    }
                }
                boolean isFlag2= true;
                while (isFlag2) {
                    System.out.println("Изменить цену коляски ?");
                    System.out.println("1 - Да");
                    System.out.println("2 - Нет");
                    int numberPrice = scanner.nextInt();
                    switch (numberPrice) {
                        case 1: {
                            System.out.println("Введите цену коляски: ");
                            int price = scanner.nextInt();
                            wheelChair.setPrice(price);
                            isFlag2 = false;
                            break;
                        }
                        case 2: {
                            System.out.println("Изменения цены не произошло !\n");
                            isFlag2 = false;
                            break;
                        }
                        default: {
                            System.out.println("Пожалуйста, выберите из предложенных вариантов!\n");
                            isFlag2 = true;
                        }
                    }
                }
                boolean isFlag3= true;
                while (isFlag3) {
                    System.out.println("Изменить группу коляски ?");
                    System.out.println("1 - Да");
                    System.out.println("2 - Нет");
                    int numberDescription = scanner.nextInt();
                    switch (numberDescription) {
                        case 1: {
                            System.out.println("Введите группу коляски: ");
                            String description = scanner.next();
                            wheelChair.setGroup(description);
                            isFlag3 = false;
                            break;
                        }
                        case 2: {
                            System.out.println("Изменения группы не произошло !\n");
                            isFlag3 = false;
                            break;
                        }
                        default: {
                            System.out.println("Пожалуйста, выберите из предложенных вариантов!\n");
                            isFlag3 = true;
                        }
                    }
                }

                System.out.println("\nИзменения внесены !\n");
            }
        }
        if(id > list.size()) {
            System.out.println("Такой коляски в списке нету !");
        }
        return list;
    }

    public static List<WheelChair> searchWheelchair(List<WheelChair> wheelChairs) {
        List<WheelChair> list = new ArrayList<>(wheelChairs);
        Scanner scanner = new Scanner(System.in);
        boolean isFlag= true;
        while (isFlag) {
            System.out.println("Найти инвалидную коляску по: ");
            System.out.println("1 - id");
            System.out.println("2 - имени");
            System.out.println("3 - цене");
            System.out.println("4 - группе");
            System.out.println("\nВыберите пукнт: ");
            int number = scanner.nextInt();
            switch (number) {
                case 1: {
                    System.out.println("Какую коляску найти по id ? ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Если вы хотите завершить программу нажмите - exit !");
                        if ("exit".equals(scanner.next())) {
                            System.out.println("\nПрограмма завершена !");
                            System.exit(0);
                        } else {
                            System.out.println("\nКакую коляску найти по id ?");
                        }
                    }
                    int id = scanner.nextInt();
                    for(WheelChair wheelChair : list) {
                        if (id == wheelChair.getId()) {
                            System.out.println(wheelChair);
                        }
                    }
                    if(id > list.size()) {
                        System.out.println("Такой коляски в списке нету !");
                    }
                    isFlag = false;
                    break;
                }
                case 2: {
                    System.out.println("Какую коляску найти по имени ? ");
                    String name = scanner.next();
                    for(WheelChair wheelChair : list) {
                        if (name.equals(wheelChair.getNameWheelChair())) {
                            System.out.println(wheelChair);
                        }
                    }
                    isFlag = false;
                    break;
                }
                case 3: {
                    System.out.println("Какую коляску найти по цене ? ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Если вы хотите завершить программу нажмите - exit !");
                        if ("exit".equals(scanner.next())) {
                            System.out.println("\nПрограмма завершена !");
                            System.exit(0);
                        } else {
                            System.out.println("\nКакую коляску найти по цене ?");
                        }
                    }
                    int price = scanner.nextInt();
                    for(WheelChair wheelChair : list) {
                        if (price == wheelChair.getPrice()) {
                            System.out.println(wheelChair);
                        }
                    }
                    isFlag = false;
                    break;
                }
                case 4: {
                    System.out.println("Какую коляску найти по группе ? ");
                    String name = scanner.next();
                    for(WheelChair wheelChair : list) {
                        if (name.equals(wheelChair.getGroup())) {
                            System.out.println(wheelChair);
                        }
                    }
                    isFlag = false;
                    break;
                }
                default: {
                    System.out.println("Пожалуйста, выберите из предложенных вариантов!\n");
                    isFlag = true;
                }
            }
        }
        return list;
    }
}