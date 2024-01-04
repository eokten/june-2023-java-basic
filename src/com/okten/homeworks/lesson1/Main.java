package com.okten.homeworks.lesson1;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();


        String[] authors2 = {"JoaoChowdhury", "JudithMondal", "VincentQiu"};
        String[] authors3 = {"DianaThakor", "LeiWang", "VinceSanjayPengntQiu"};
        String[] authors4 = {"DianaThakor", "KyawAnderson", "VincentQiu"};
        String[] authors5 = {"DianaThakor", "LeiWang", "VincentQiu"};

        books.add(new Book("1JK8UAFJEXW", 187, "drama", new String[]{"DianaThakor", "LeiWang", "VincentQiu"}));
        books.add(new Book("2JK8UAFJEXW", 187, "drama", authors2));
        books.add(new Book("3JK8UAFJEXW", 187, "drama", authors3));
        books.add(new Book("4JK8UAFJEXW", 187, "drama", authors4));
        books.add(new Book("5JK8UAFJEXW", 187, "drama", authors5));

        for (Book book : books) {
            System.out.println(book);
        }

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("SamiraJia", 63, 344, true));
        cars.add(new Car("XuanVu", 275, 445, true));
        cars.add(new Car("MiriamJing", 634, 393, true));
        cars.add(new Car("SunilNaik", 889, 247, true));
        cars.add(new Car("VladymyrLai", 99, 882, true));

        for (Car car : cars) {
            System.out.println(car);

//            car.setPower(100500);
//            System.out.println(car.getPower());
        }

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("1DenisQiu", 633, "ZhiyongSchmidt"));
        dogs.add(new Dog("2DenisQiu", 633, "ZhiyongSchmidt"));
        dogs.add(new Dog("3DenisQiu", 633, "ZhiyongSchmidt"));
        dogs.add(new Dog("4DenisQiu", 633, "ZhiyongSchmidt"));
        dogs.add(new Dog("5DenisQiu", 633, "ZhiyongSchmidt"));


        for (Dog dog : dogs) {
            System.out.println(dog);
        }


        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(181, 29, "IvanHe", "AlbertMejia"));
        posts.add(new Post(901, 1, "MosesJimenez", "IsmailMou"));
        posts.add(new Post(307, 594, "LiMeng", "LongGomes"));
        posts.add(new Post(165, 45, "RajeshHou", "IgorZuo"));

        for (Post post : posts) {
            System.out.println(post);
        }

        ArrayList<Comment> comments = new ArrayList<>();

        comments.add(new Comment());
        comments.add(new Comment());
        comments.add(new Comment());
        comments.add(new Comment());
        comments.add(new Comment());


        for (Comment comment : comments) {
            System.out.println(comment);
        }


    }
}
