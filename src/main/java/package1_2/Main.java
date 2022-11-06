package package1_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Publisher publisher1 = new Publisher();// первое издательство
        try {
            publisher1.setNamePublisher("Проспект");
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение1");
        }
        try {
            publisher1.setCity("Москва");
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение2");
        }
        Publisher publisher2 = new Publisher();// второе издательство
        publisher2.setNamePublisher("Питер");
        publisher2.setCity("Санкт-Петербург");

        Publisher publisher3 = new Publisher();// третье издательство
        publisher3.setNamePublisher("БХВ");
        publisher3.setCity("Санкт-Петебург");// намеренная ошибка


        Publisher publisher4 = new Publisher();// четверное издательство
        publisher4.setNamePublisher("Диалектика");
        publisher4.setCity("Киев");

        //Массив
        Books[] booksArray = new Books[5];
        booksArray[0] = new Books(new String[]{"Седжвик Роберт", "Уэйн Кевин",},  "Computer Science: основы программирования на Java, ООП, алгоритмы структурных данных", 2018, publisher2);
        booksArray[1] = new Books(new String[]{"Вигерс Карл"}, "Разработка требований к программному обеспечениюю 3-е издание, дополненное",2019, publisher3);
        booksArray[2] = new Books(new String[]{"Шилдт Герберт"}, "Java. Полное руководство, 10-е издание",2018,  publisher4);
        booksArray[3] = new Books(new String[]{"Полубенцева М.И."}, "C/C++. Процедурное программирование", 2017, publisher3);
        booksArray[4] = new Books( "Конституция РФ", 2020, publisher1);
        // Возвращаем количество авторов книги
        int authorsBack = booksArray[0].getAuthorsLot();
        System.out.println("Количество авторов = "+authorsBack);
        // Возвращаем автора по индексу
        String a = booksArray[0].getIndex(booksArray);
        System.out.println("Автор по индексу"+ a);
        System.out.println("----------");
        System.out.println("----------");
        Books.print(new Books[]{booksArray[4]});
        //переименовываем город
        Books.rename(booksArray);
        //System.out.println("Исправляем ошибку в названии города");
       // Books.printAll(booksArray);
        System.out.println("----------");
        System.out.println("----------");

        for (int i = 0; i < booksArray.length; ++i) {
            {
                if (booksArray[i].getAuthors() != null) {
                    System.out.println("Книга {"+
                            " Авторство = " + Arrays.toString(booksArray[i].getAuthors()) +
                            ", Название =" + booksArray[i].getName() + '\'' +
                            ", Издатель =" + booksArray[i].getPublisher().getNamePublisher() + '\'' +
                            ", Год издания =" + booksArray[i].getYear() + '\'' +
                            '}');

                } else if (booksArray[i].getAuthors() == null) {
                    System.out.println("Книга {"  +
                            " Название =" + booksArray[i].getName() + '\'' +
                            ", Издатель =" + booksArray[i].getPublisher().getNamePublisher() + '\'' +
                            ", Год издания =" + booksArray[i].getYear() + '\'' +
                            '}');
                }

            }

        }

    }

}


