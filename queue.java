package tugas1;

public class queue {
    private String data[];
    private int tail;

    public queue(int jml){
        data = new String[jml];
        tail = -1; }

    public void enqueue(String nilai){
        if(tail <data.length){
            data[++tail]=nilai;
        }
    }
    public String dequeue(){
        if (tail >= 0){
            String temp =data[0];
            for (int i = 0; i < data.length-1 ; i++) {
                data[i]=data[i+1];
            }
            tail--;
            return temp;
        }
        return null;
    }
    public void print(){
        for (int i = 0; i < data.length ; i++) {
            System.out.println(data[i]+ " ");
        }
    }
}
