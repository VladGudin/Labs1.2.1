package package1_2;

public class Publisher {
    private String namePublisher;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws NullPointerException{
        if (city==null&& namePublisher==null) {
            throw new NullPointerException("Значение Отсутствует 2");
        }
        this.city = city;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) throws NullPointerException {
        if (city==null&& namePublisher==null) {
            throw new NullPointerException("Значение Отсутствует 2");
        }
        this.namePublisher = namePublisher;
    }
    @Override
    public String toString() {
        return "Издательство {" +
                "Название " + namePublisher + '\'' +
                ", Город " + city + '\'' +
                '}';
    }

}
