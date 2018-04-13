package own.Enum;

public class WhichWay {
    Direction direction;

    public WhichWay(Direction direction) {
        this.direction = direction;
    }

    public void whatDirection(){
        switch (direction){
            case NORTH:
                System.out.println("This is NORTH");
            break;
            case SOUTH:
                System.out.println("This is SOUTH");
            break;
            case EAST:
                System.out.println("This is EAST");
            break;
            case WEST:
                System.out.println("This is WEST");
            break;
            default:
                System.out.println("No Direction Detected.");
        }

    }

}
