package singleton;

public class Family {

    private Family(){}

        public static Family getSingleton(){
            Family family = new Family();
            return family;
         }
         public void displayFamilymenbers(){
        System.out.println(" 2 members");
         }
    }

