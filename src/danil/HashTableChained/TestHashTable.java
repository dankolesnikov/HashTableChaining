package danil.HashTable;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * CS 146 HW2 Fall 2017
 * Professor: Dr. Mike Wu
 */

/** TestHashTable class is responsible for testing HashTableChained program
 */
public class TestHashTable {

    public static void main(String[] args) {

        System.out.print("*** Hash Table utilizing chaining (closed addressing) with single linked list in Java ***");
        // Initialization
        HashTableChained table = new HashTableChained();
        Patient alex = new Patient((int)(Math.random() * 1000), "Alex");
        Patient danil = new Patient((int)(Math.random() * 1000), "Danil");
        Patient minh = new Patient((int)(Math.random() * 1000), "Minh");
        Patient laura = new Patient((int)(Math.random() * 1000), "Laura");
        Patient alina = new Patient((int)(Math.random() * 1000), "Alina");
        Patient pranav = new Patient((int)(Math.random() * 1000), "Pranav");
        Patient ari = new Patient((int)(Math.random() * 1000), "Ari");
        Patient heather = new Patient((int)(Math.random() * 1000), "Heather");
        Patient casey = new Patient((int)(Math.random() * 1000), "Casey");
        Patient katie = new Patient((int)(Math.random() * 1000), "Katie");
        Patient jeff = new Patient((int)(Math.random() * 1000), "Jeff");
        Patient andrew = new Patient((int)(Math.random() * 1000), "Andrew");
        Patient kevin = new Patient((int)(Math.random() * 1000), "Kevin");
        Patient isaac = new Patient((int)(Math.random() * 1000), "Isaac");
        Patient vivian = new Patient((int)(Math.random() * 1000), "Vivian");
        Patient ahmad = new Patient((int)(Math.random() * 1000), "Ahmad");
        Patient vidya = new Patient((int)(Math.random() * 1000), "Vidya");
        Patient mila = new Patient((int)(Math.random() * 1000), "Mila");
        Patient dima = new Patient((int)(Math.random() * 1000), "Dima");
        Patient mike = new Patient((int)(Math.random() * 1000), "Dr. Mike");

        // Insert 20 patients into Hash Table
        System.out.print("\n\nInsert function test:");
        table.insert(alex);
        table.insert(danil);
        table.insert(minh);
        table.insert(laura);
        table.insert(alina);
        table.insert(pranav);
        table.insert(ari);
        table.insert(heather);
        table.insert(casey);
        table.insert(katie);
        table.insert(jeff);
        table.insert(andrew);
        table.insert(kevin);
        table.insert(isaac);
        table.insert(vivian);
        table.insert(ahmad);
        table.insert(vidya);
        table.insert(mila);
        table.insert(dima);
        table.insert(mike);

        // Print table after insertion
        System.out.println();
        table.printList();

        // Delete Minh, Danil Alex
        System.out.print("\nDelete function test:");
        table.delete(minh.getPriority());
        table.delete(vivian.getPriority());
        table.delete(mike.getPriority());

        // Search Patients after insertion
        System.out.print("\n\nSearch function test:");
        table.searchPatient(alex.getPriority());
        table.searchPatient(danil.getPriority());
        table.searchPatient(minh.getPriority());
        table.searchPatient(laura.getPriority());
        table.searchPatient(alina.getPriority());
        table.searchPatient(pranav.getPriority());
        table.searchPatient(ari.getPriority());
        table.searchPatient(heather.getPriority());
        table.searchPatient(casey.getPriority());
        table.searchPatient(katie.getPriority());
        table.searchPatient(jeff.getPriority());
        table.searchPatient(andrew.getPriority());
        table.searchPatient(kevin.getPriority());
        table.searchPatient(isaac.getPriority());
        table.searchPatient(vivian.getPriority());
        table.searchPatient(ahmad.getPriority());
        table.searchPatient(vidya.getPriority());
        table.searchPatient(mila.getPriority());
        table.searchPatient(dima.getPriority());
        table.searchPatient(mike.getPriority());

    }
}
