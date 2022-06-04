public class BubbleSort{

    private String[] data;

    public BubbleSort(){
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data){
        this.data= data;
    }
    public void sortData(){

    }
    public void printData(){
        for(String datanama : this.data){
            System.out.println(datanama+" ");
        }
    }

    public static void main(String[] args){
        String[] Nama = new String[] {"Aji","Wahyu","Udin","Wawan","Rafly"};

        BubbleSort _myBubble = new BubbleSort();
        _myBubble.setData(Nama);
        _myBubble.sortData();
        _myBubble.printData();
    }
}