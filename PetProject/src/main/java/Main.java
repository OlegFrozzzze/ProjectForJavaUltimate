import Users.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
// TODO: 25.05.2019
/**
 * планируеться основной функционал сделать на Spring MVC
 *  База данных будет PostgresSQL
 *      В ней будет несколько таблиц
 *          зарегестрированные пользователи
 *          каталог товаров
 *          что кто купил
 *  HTML
 *  CSS
 *
 *  Нужно реализовать способ оплаты !*
 *
 *
 *  поставить сервер (хостинг взять бесплатный)
 *  перенести сайт туда
 *
 *
 *
 */


public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = createNamesList();
        System.out.println(nameList);

        ArrayList<User> users = createUsersList();
        System.out.println(choseUserNameWithMinAge(users));
    }

    private static ArrayList<String> createNamesList() {

        String one = "first";
        String two = "second";
        String three = "third";
        ArrayList<String> result = new ArrayList<>();

        result.add(0, one);
        result.add(1, two);
        result.add(2, three);
        return result;
    }

    private static ArrayList<User> createUsersList() {
        ArrayList<User> users = new ArrayList<>();

        User user1 = new User(0, " Oleg ", 22);
        User user2 = new User(1, " Misha ", 20);
        User user3 = new User(2, " Igor ", 24);
        User user4 = new User(3, " Саша ", 21);
        User user5 = new User(4, " Катя ", 23);
        User user6 = new User(5, " Иван ", 24);

        users.add(user1);
        users.add(user2);
        users.add(user6);
        users.add(user4);
        users.add(user5);
        users.add(user3);
        return users;
    }

    public static String choseUserNameWithMinAge(ArrayList<User> users) {
      //  return users.stream().filter(user -> user.name != null ).sorted(Comparator.comparing(user -> user.getAge())).
      //          map(user -> user.name).collect(Collectors.joining());
        return users.stream().sorted(Comparator.comparing(user -> user.id)).map(user -> user.name).collect(Collectors.joining());
        //return users.stream()
        //        .filter(user -> user.name != null)
        //        //  .min(Comparator.comparingInt(User::getAge))
        //        .min(Comparator.comparingInt(user -> user.getAge()))
        //        .map(user -> user.name)
        //        .orElse("error");
    }
}
