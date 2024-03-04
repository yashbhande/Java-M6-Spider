class Nested_Switch_FoodMenu {
    // Simulates a menu system for selecting food and drinks using nested switch statements for category and item selection.

    public static void main(String[] args) {
        int category = 2;
        int item = 3;

        switch (category) {
            case 1: // Drinks
            {
                System.out.println("Outer Case 1 Executed !!!");
                switch (item) {

                    case 1: {
                        System.out.println("Inner Case 1 Executed !!!");
                        System.out.println("NaralPani");
                    }
                    break;

                    case 2:
                        System.out.println("Inner Case 2 Executed !!!");
                        System.out.println("UssaChaRasss");
                        break;

                    case 3:
                        System.out.println("Inner Case 3 Executed !!!");
                        System.out.println("LimbuPani");
                        break;

                    case 4:
                        System.out.println("Inner Case 4 Executed !!!");
                        System.out.println("Lassi");
                        break;

                    default:
                        System.out.println("Invalid Drink selected");
                }
            }
            break;

            case 2: // Snacks
            {
                System.out.println("Outer Case 2 Executed !!!");
                switch (item) {
                    case 1:
                        System.out.println("Inner Case 1 Executed !!!");
                        System.out.println("Olli Bhel");
                        break;

                    case 2:
                        System.out.println("Inner Case 2 Executed !!!");
                        System.out.println("Ragda Pattis");
                        break;

                    case 3:
                        System.out.println("Inner Case 3 Executed !!!");
                        System.out.println("Samosa");
                        break;

                    case 4:
                        System.out.println("Inner Case 4 Executed !!!");
                        System.out.println("Kachori");
                        break;

                    default:
                        System.out.println("Invalid Snacks selected");
                }
            }
            break;

            default:
                System.out.println("Invalid Category Selected");
        }
    }
}
