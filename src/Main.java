public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("It's my Homework");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog * 2;
        System.out.println(dog);
        cat = cat * 2;
        System.out.println(cat);
        paper = paper * 2;
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println(boxersWeight);
        System.out.println(weightDifference);

        var heavier = boxer2Weight % boxer1Weight;
        System.out.println(heavier);

        var workHours = 640;
        var workingDay = 8;
        var employers = workHours / workingDay;
        System.out.println("Всего работников в компании " + employers + " человек");

        var staff = employers + 94;
        workHours = staff * workingDay;
        System.out.println("Если в компании работает " + staff +  " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");



    }
}