//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("What's the yearly maintenance cost?");
        int costSpring = 150;
        int costSummer = 120;
        int costFall = 180;
        int costWinter = 240;
        int costYearly;

        costYearly = costSpring + costSummer + costFall + costWinter;
        System.out.println("The yearly maintenance cost is $" + costYearly + " if the cost in spring is $" +  costSpring + ", cost in summer is $" +  costSummer + ", cost in fall is $" + costFall + ", and cost in winter is $" + costWinter);

    }
}