public class Main {
    public static void main(String[] args) {
        // Exercise 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Exercise 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Exercise 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Exercise 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Exercise 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Exercise 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println(firstBoxer + secondBoxer);
        System.out.println(secondBoxer - firstBoxer);
        // Exercise 7
        var bigWeight = 10;
        var smallWeight = 4;
        var modulo = bigWeight % smallWeight;
        System.out.println(modulo);
        // Exercise 8
            // Part 1
        var allHours = 640;
        var workTime = 8;
        var countOfWorkers = allHours / workTime;
        System.out.println("Всего работников в компании " + countOfWorkers + " человек");
            // Part 2
        countOfWorkers = countOfWorkers + 94;
        allHours = countOfWorkers * workTime;
        System.out.println("Если в компании работает "+ countOfWorkers + " человек, то всего "
                + allHours + " часов работы может быть поделено между сотрудниками");
    }
}