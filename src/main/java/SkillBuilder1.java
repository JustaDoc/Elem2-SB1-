import java.util.Scanner;

/**
 * Skill Builder 3
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        wallArea = wallHeight * wallWidth;
        System.out.printf("Wall area: %.0f square feet\n",wallArea);

        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", gallonsPaintNeeded);

        double paint = gallonsPaintNeeded + gallonsPerCan;
        cansNeeded = (int)paint;
        System.out.println("Cans needed: "+cansNeeded+ " can(s)");
    }
}
