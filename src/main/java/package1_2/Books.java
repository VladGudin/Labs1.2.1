package package1_2;

import java.util.Arrays;

public class Books {
    private String name;
    private int year;
    private Publisher publisher;
    private  String[] authors;


    // Если авторов нет
    public Books ( String name, int year, Publisher publisher) throws NullPointerException{// Конструктор 1
        setName(name);
        setYear(year);
        this.publisher = publisher;
    }
    // Если авторы есть
    public Books (String[] authors, String name, int year, Publisher publisher) throws NullPointerException {
        setAuthors(authors);
        setName(name);
        setYear(year);
        this.publisher = publisher;
    }
    // Метод printAll
    public static void printAll(Books[] booksArray) {
        for (int i = 0; i < booksArray.length; i++) {
            System.out.println(booksArray[i]);
        }
    }
    //метод print, печатающий данные о книге
    public static void print(Books[] booksArray){
        for (int i = 0; i < booksArray.length; i++) {
            System.out.println("Название " + booksArray[i].getName());
            System.out.println("Авторство " + booksArray[i].getAuthors());
            System.out.println("Издатель " + booksArray[i].getPublisher().getNamePublisher());
            System.out.println("Год " + booksArray[i].getYear());
            break;
        }


    }
    //  Метод возвращающий автора с заданным индексом. Исключение не работает, у меня не получилось это исправить
    public String getIndex(Books[] booksArray) throws IllegalArgumentException{

        if (booksArray.length<0) throw new IllegalArgumentException("Значение меньше допустимого");
        if (booksArray.length>5) throw new IllegalArgumentException("Значение больше допустимого");
        return ", Авторство " + Arrays.toString(authors);
    }












    // Метод, вощвращающий количество авторов
    public int getAuthorsLot() {

        return authors.length;
    }
    // метод исправляющий ошибку в названии города
    public static void rename(Books[] booksArray){
        for ( int i=0; i<booksArray.length; i++){
            if (booksArray[i].getPublisher().getCity().equals("Санкт-Петебург")){
                booksArray[i].getPublisher().setCity("Санкт-Петербург");

            }
        }
    }
    public String[] getAuthors() {

        return authors;
    }

    public void setAuthors(String[] authors) throws NullPointerException {
        if (authors==null) throw new NullPointerException("Значение null");
        this.authors = authors;
    }
    public Publisher getPublisher() {

        return publisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) throws NullPointerException {
        if (year >0)
            this.year = year;
        else throw new NullPointerException("Значение year должно быть больше 0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NullPointerException {
        if (name==null) throw new NullPointerException("Ошибка");
        this.name = name;
    }
    @Override
    public String toString() {
        return "Книга {" +
                "Название " + name + '\'' +
                ", Год " + year +
                ", Издатель " + publisher +
                ", Авторство " + Arrays.toString(authors) +
                '}';
    }

}
