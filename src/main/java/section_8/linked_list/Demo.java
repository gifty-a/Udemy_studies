package main.java.section_8.linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String>  regions = new LinkedList<>();
        addInOrder(regions,"Volta");
        addInOrder(regions,"Ashanti");
        addInOrder(regions,"Greater Accra");
        addInOrder(regions,"Eastern");
        addInOrder(regions,"Northern");
//        printList(regions);
        addInOrder(regions,"Volta");
        addInOrder(regions,"Brong Ahafo");
//        printList(regions);
        visit(regions);

//        regions.add("Volta");
//        regions.add("Ashanti");
//        regions.add("Greater Accra");
//        regions.add("Eastern");
//        regions.add("Northern");
//        printList(regions);
//        regions.add(2,"Oti region");
//        printList(regions);

    }
    private static void printList(LinkedList<String> list){
        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        System.out.println("fin");
    }

    private static boolean addInOrder(LinkedList<String> list, String newRegion){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            int comparison = iterator.next().compareTo(newRegion);
            if (comparison == 0) {
                System.out.println(newRegion + " is already a registered region");
                return false;
            }else if (comparison < 0){
//                return true;
            }else if (comparison > 0) {
                iterator.previous();
                iterator.add(newRegion);
                return true;
            }
        }
        iterator.add(newRegion);
        return true;
    }

    private static void visit(LinkedList regions){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> stringListIterator = regions.listIterator();
        if (regions.isEmpty()){
            System.out.println("No regions in itenerary");
            return;
        }else{
            System.out.println("Now visiting " + stringListIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Tour is over");
                    quit = true;
                    break;
                case 1:
                    if (stringListIterator.hasNext()) {
                        System.out.println("You are now in the " + stringListIterator.next() + " region");
                    }else{
                        System.out.println("We have reached the end of the list");
                    }
                    break;
                case 2:
                    if (stringListIterator.hasPrevious()) {
                        if (stringListIterator.hasPrevious()){
                            System.out.println("Now visiting " + stringListIterator.previous());
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Options:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
