package com.example.gpudb;
/**  GPU class */
/**  @author Kuvykin Nikita */

/**  GPU class */
public class GPU {

    private int price; // price
    private String GPU; // graphic processor
    private String producer; // producer
    private int memorySize; // memory size
    private String memoryType; // memory type
    private String connectionType; // connection type

    public GPU(String producer, String GPU, int memorySize, String memoryType, String connectionType, int price) {
        this.price = price;
        this.GPU = GPU;
        this.producer = producer;
        this.memorySize = memorySize;
        this.memoryType = memoryType;
        this.connectionType = connectionType;
    }


    /**  enter price */
    public void set_price(int pr){
        if (pr <= 0) {
            throw new RuntimeException("Price is empty");
        }
        else{
            price = pr;
        }

    }

    /** out price */
    public int get_price(){
        return price;
    }

    /**  enter GPU */
    public void set_GPU(String GPU1){
        if (GPU1 == null) {
            throw new RuntimeException("GPU is empty");
        }
        else{
            GPU = GPU1;
        }
    }

    /** out GPU */
    public String get_GPU(){
        return GPU;
    }

    /** enter producer */
    public void set_producer(String producer1){
        if (producer1 == null) {
            throw new RuntimeException("Producer is empty");
        }
        else{
            producer = producer1;
        }
    }

    /**  out producer */
    public String get_producer(){
        return producer;
    }


    /**  enter memory size */
    public void set_memorySize(int memorySize1){
        if (memorySize1 <= 0) {
            throw new RuntimeException("Memory size is empty");
        }
        else{
            memorySize = memorySize1;
        }
    }

    /**  out memory size */

    public int get_memorySize(){
        return memorySize;
    }

    /**  enter memory type */
    public void set_memoryType(String memoryType1){
        if (memoryType1 == null)  {
            throw new RuntimeException("Memory type is empty");
        }
        else{
            memoryType = memoryType1;
        }
    }

    /**  out memory type */
    public String get_memoryType(){
        return memoryType;
    }

    /**  enter connection type */
    public void set_connectionType(String connectionType1){
        if (connectionType1 == null) {
            throw new RuntimeException("Price is empty");
        }
        else{
            connectionType = connectionType1;
        }
    }

    /**  out connection type */
    public String get_connectionType(){
        return connectionType;
    }

    /**  out all data */
    public String toString(){
        return producer + " producer " + "\n" + price + " rub " + "\n" + GPU + " GPU " + "\n" + memorySize + " byte" + "\n" + memoryType + " memory type " + "\n" + connectionType + "connection type";
    }
}