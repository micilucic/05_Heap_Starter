package UE05_TaskHeap;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestTaskHeap
{
    @Test
    public void testAdd() {
        TaskHeap heap = new TaskHeap(3);

        assertTrue(heap.insert(new Task(1, "Betriebssystem starten", 200)));
        assertTrue(heap.insert(new Task(2, "Anmeldung durchführen", 100)));
        assertTrue(heap.insert(new Task(3, "Autostart-Dienste starten", 300)));
        assertFalse(heap.insert(new Task(4, "Programm starten", 400)));

        heap.printHeap();
    }

    @Test
    public void testRemove()
    {
        TaskHeap heap = new TaskHeap(10);

        assertTrue(heap.insert(new Task(1, "Auto waschen", 600)));
        assertTrue(heap.insert(new Task(2, "Müll rausbringen", 800)));
        assertTrue(heap.insert(new Task(3, "Wohnzimmer putzen", 700)));
        assertTrue(heap.insert(new Task(4, "Mittagessen kochen", 500)));
        assertTrue(heap.insert(new Task(5, "Wäschen waschen", 400)));
        assertTrue(heap.insert(new Task(6, "Spinnweben entfernen", 200)));
        assertTrue(heap.insert(new Task(7, "Boden aufwischen", 100)));
        assertTrue(heap.insert(new Task(8, "Fenster putzen", 300)));
        assertTrue(heap.insert(new Task(9, "Rasen mähen", 900)));

        System.out.println("Gelöscht: " + heap.remove().toString());

        heap.printHeap();
    }
}
