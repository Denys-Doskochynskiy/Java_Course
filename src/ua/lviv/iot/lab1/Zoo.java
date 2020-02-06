package ua.lviv.iot.lab1;

public class Zoo {
private String name;
protected int yearOfFoundation;
private double areaOfTheZooInHectares;
private double ticketPriceInDolars;
private int numberOfVisitorsPerYear;
private int numberOfAnimals;
protected boolean theAbilityToFeedAnimals;
private static boolean thePresenceOfPenguinsInZoos = false;

public Zoo() {}



public Zoo(String name, int yearOfFoundation, double areaOfTheZooInHectares, double ticketPriceInDolars) {
	this.name=name;
	this.yearOfFoundation = yearOfFoundation;
	this.areaOfTheZooInHectares = areaOfTheZooInHectares;
	this.ticketPriceInDolars = ticketPriceInDolars;
}



public Zoo(String name, int yearOfFoundation, double areaOfTheZoo, double ticketPriceInDolars, int numberOfVisitorsPerYear, int numberOfAnimals, boolean theAbilityToFeedAnimals) {
	this.name=name;
	this.yearOfFoundation = yearOfFoundation;
	this.areaOfTheZooInHectares = areaOfTheZoo;
	this.ticketPriceInDolars = ticketPriceInDolars;
	this.numberOfVisitorsPerYear=numberOfVisitorsPerYear;
	this.numberOfAnimals=numberOfAnimals;
	this.theAbilityToFeedAnimals=theAbilityToFeedAnimals;
}


@Override
public String toString() {
    return "Zoo{" +
            "name='" + name + '\'' +
            ", yearOfFoundation=" + yearOfFoundation +
            ", areaOfTheZooInHectares=" + areaOfTheZooInHectares +
            ", ticketPriceInDolars=" + ticketPriceInDolars +
            ", numberOfVisitorsPerYear='" + numberOfVisitorsPerYear + '\'' +
            ", numberOfAnimals=" + numberOfAnimals +
            ", theAbilityToFeedAnimals='" + theAbilityToFeedAnimals + '\'' +
            '}';
}

public static void printStaticField() {
    System.out.println("Static method(thePresenceOfPenguinsInZoos): " + Zoo.thePresenceOfPenguinsInZoos);

}

public void printField() {
    System.out.println("Non-static method(thePresenceOfPenguinsInZoos): " + Zoo.thePresenceOfPenguinsInZoos);
}


public void resetValues(String name, int yearOfFoundation, double areaOfTheZoo, double ticketPriceInDolars, int numberOfVisitorsPerYear, int numberOfAnimals, boolean theAbilityToFeedAnimals) {
	this.name=name;
	this.yearOfFoundation = yearOfFoundation;
	this.areaOfTheZooInHectares = areaOfTheZoo;
	this.ticketPriceInDolars = ticketPriceInDolars;
	this.numberOfVisitorsPerYear=numberOfVisitorsPerYear;
	this.numberOfAnimals=numberOfAnimals;
	this.theAbilityToFeedAnimals=theAbilityToFeedAnimals;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



public int getYearOfFoundation() {
	return yearOfFoundation;
}
public void setYearOfFoundation(int yearOfFoundation) {
	this.yearOfFoundation = yearOfFoundation;
}



public double getAreaOfTheZoo() {
	return areaOfTheZooInHectares;
}
public void setAreaOfTheZoo(double areaOfTheZoo) {
	this.areaOfTheZooInHectares = areaOfTheZoo;
}



public double getTicketPriceInDolars() {
	return ticketPriceInDolars;
}
public void setTicketPriceInDolars(double ticketPriceInDolars) {
	this.ticketPriceInDolars = ticketPriceInDolars;
}



public int getNumberOfVisitorsPerYear() {
	return numberOfVisitorsPerYear;
}
public void setNumberOfVisitorsPerYear(int numberOfVisitorsPerYear) {
	this.numberOfVisitorsPerYear = numberOfVisitorsPerYear;
}



public int getNumberOfAnimals() {
	return numberOfAnimals;
}
public void setNumberOfAnimals(int numberOfAnimals) {
	this.numberOfAnimals = numberOfAnimals;
}



public boolean isTheAbilityToFeedAnimals() {
	return theAbilityToFeedAnimals;
}
public void setTheAbilityToFeedAnimals(boolean theAbilityToFeedAnimals) {
	this.theAbilityToFeedAnimals = theAbilityToFeedAnimals;
}



public static boolean isThePresenceOfPenguinsInZoos() {
	return thePresenceOfPenguinsInZoos;
}
public static void setThePresenceOfPenguinsInZoos(boolean thePresenceOfPenguinsInZoos) {
	Zoo.thePresenceOfPenguinsInZoos = thePresenceOfPenguinsInZoos;
}



}
