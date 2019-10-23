package tugas1;

public class tesQueue {
    public static void main(String[] args) {
        queue a = new queue(3);
a.enqueue("jam 8, struktur data");
a.enqueue("jam 11, basis data");
a.enqueue("jam 2, metnum");
a.print();
        System.out.println("=================");

        System.out.println("sudah belajar");
        System.out.println(a.dequeue());
        System.out.println("=============");
        System.out.println("belum belajar");
        a.print();
    }
}