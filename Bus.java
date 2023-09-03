public class Bus{
    private int busNo;
    private boolean Ac;
    private int capacity;

    Bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.Ac = ac;
        this.capacity = cap;
    }

    public int getbusNo(){  //it has no argument and it has only return type. It is called accessor method
        return busNo;
    }
    public void setbusNo(int no){  //it has a argument with no return type. It is called mutator method
        busNo = no;
    }

    public boolean getAc(){
        return Ac;
    }
    public void setAc(boolean ac){
        Ac = ac;
    }

    public int getcapacity(){ 
        return capacity;
    }
    public void setcapacity(int cap){  
        capacity = cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: " + busNo + " AC: " + Ac + " Total Capacity: " + capacity);
    }
}