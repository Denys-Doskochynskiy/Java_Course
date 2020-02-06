package ua.lviv.iot.lab1;
public class ZooMaker {

	public static void main(String[] args) {
	Zoo firstZoo = new Zoo();
	Zoo secondZoo = new Zoo("Kharkiv",1983,20.56,1.50);
	Zoo thirdZoo = new Zoo("Wild_World",1976,29.87,2.55,67953,180,true);
	System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

	
	System.out.println(firstZoo);
    System.out.println(secondZoo);
    System.out.println(thirdZoo);
    System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
    
    
    Zoo.printStaticField();
    firstZoo.printField();
    System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
    
    System.out.println("    Bonus_task    ");
    int theNumberOfObjectsInTheArray = 4;
    Zoo[] Zoos = new Zoo[theNumberOfObjectsInTheArray];
    for (int iterator = 0; iterator < theNumberOfObjectsInTheArray; iterator++) {
        Zoos[iterator] = new Zoo();
    }
    for (Zoo Zoo : Zoos) {
        System.out.println(Zoo);
    }
	}

}
