
package myarraylist;
public class List {
    //属性
    private int[]arr;//代表的是存在数据的数组, array.length 代表的是数组的容量
    private int size;// 记录顺序表的已有数据个数

    //无参构造方法
    public List(){
        //1.申请空间
        arr=new int[20];
        //2.初始化数据个数
        size=0;
    }
    //带参构造方法
    public List(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }
    //扩容
    private void capacity(){
        if(size<arr.length){
            return;
        }
        int newCapacity=2*arr.length;
        int newArray[]=new int[newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=arr[i];
        }
        arr=newArray;
    }
    //插入
    //1.尾插
    public void pushBack(int num){
        capacity();
        arr[size++]=num;
    }
    //2.头插
    public void pushFront(int num){
        capacity();
        for(int i=size-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=num;
        size++;
    }
    //3.中间任意位置插入
    public void push(int index,int num){
         capacity();
         for(int i=size-1;i>=index;i--){
             arr[i+1]=arr[i];
         }
         arr[index]=num;
         size++;
    }
    //删除
    //1.尾删
    public void deleteBack(){
        if(size<=0){
            return;
        }
        arr[--size]=0;
    }
    public void deleteFront(){
        if(size<=0){
            return;
        }
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        arr[--size]=0;
    }
    public void delete(int index){
        if(size<=0){
            return;
        }
        if(index<0||index>=size){
            System.out.println("下标错误！");
            return;
        }
        for(int i=index;i<size-1;i++){
             arr[i]=arr[i+1];

        }
        arr[--size]=0;
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");     
        }
        System.out.println();
    }
}
