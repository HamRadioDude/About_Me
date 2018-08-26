public class main {
    // public static void main will be used in every program
    public static void main(String[] args) {
        // System.out.println("hello World"); will print hello world
        System.out.println("Good Day!");
        // ****************************** HERE I AM DEFININING MY STRINGS.  I AM LISTING CERTAIN THINGS AS STRINGS BECAUSE I MAY CHANGE ****
        // *********************** THEM IN THE FUTURE, AND IT WOULD BE EASY TO MODIFY IF THERE WAS JUST ONE PLACE. ****************
        // ************************* I WILL GIVE AN EXAMPLE BY LISTING INFORMATION MULTIPLE TIMES.
        String aName = "Sean Klechak";
        String aSeason = "Fall";
        String aAge = "35";
        String aHobby = "Photography, Computer's, and Guitar";

        //************************** Next up, Display The Information ******************************************
        System.out.println("My Name is: " + aName);
        System.out.println("My favorite season is: " + aSeason);
        System.out.println("I am " + aAge + " years old");
        System.out.println("My Hobbies Include: " + aHobby);
        System.out.println(aName + " is " + aAge + " Years Old"); // This line was done to stress the importance of assigning strings that may change

    }

}

