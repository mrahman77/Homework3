package enumExample;

public class Day {
    Weekii weekii;
    public Day(Weekii weekii){
        this.weekii = weekii;
    }

    public void whichDay(){
        switch(weekii){
            case MONDAY:
                System.out.println("Freedom time for Now");
                break;
            case TUESDAY:
                System.out.println("Gotta do my Study");
                break;
            case WEDNESDAY:
                System.out.println("Get rid of Lazyness");
                break;
            case THRUSDAY:
                System.out.println("Ending time Coming");
                break;
            case FRIDAY:
                System.out.println("Judgement Day");
                break;
            case SATURDAY:
                System.out.println("Saturday Class");
                break;
            case SUNDAY:
                System.out.println("Sunday Class");
                break;
            default:
                System.out.println("No day Selected");
                break;
        }
    }
}

