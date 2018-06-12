package problem2;

/**
 * Created by fissehaye on 6/11/18.
 */
public class MyPersonList {

    private final int INITIAL_LENGTH = 4;
    private Person[] personArray;
    private int size;

    public MyPersonList() {

        personArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Person person) {

        if(size == personArray.length) resize();
        personArray[size++] = person;
    }

    public Person get(int i) {

        if(i < 0 || i >= size) {
            return null;
        }
        return personArray[i];
    }

    public boolean find(Person person) {

        for(Person test : personArray) {

            if(test.equals(person)) return true;
        }
        return false;
    }

    public void insert(Person s, int pos) {

        if(pos > size) return;
        if(pos >= personArray.length||size+1 > personArray.length) {
            resize();
        }
        Person[] temp = new Person[personArray.length+1];
        System.arraycopy(personArray,0,temp,0,pos);
        temp[pos] = s;

        System.arraycopy(personArray,pos,temp,pos+1, personArray.length - pos);
        personArray = temp;
        ++size;

    }

    public boolean remove(Person person) {

        if(size == 0) return false;
        int index = -1;
        for(int i = 0; i < size; ++i ) {
            if(personArray[i].equals(person)){
                index = i;
                break;
            }
        }
        if(index==-1) {
            return false;
        }

        Person[] temp = new Person[personArray.length];
        System.arraycopy(personArray,0,temp,0,index);
        System.arraycopy(personArray,index+1,temp,index,personArray.length-(index+1));
        personArray = temp;
        --size;
        return true;
    }


    private void resize() {

        System.out.println("resizing");
        int len = personArray.length;
        int newlen = 2*len;
        Person[] temp = new Person[newlen];
        System.arraycopy(personArray,0,temp,0,len);
        personArray = temp;
    }


    /***********************************************************************************/
    public void sort() {

        if(personArray == null || personArray.length <=1) return;
        int len = personArray.length;
        int temp = 0;

        for(int i = 0; i < len; ++i){
            int nextMinPos = minpos(i,len-1);
            swap(i,nextMinPos);
        }

    }
    void swap(int i, int j){
        Person temp = personArray[i];
        personArray[i] = personArray[j];
        personArray[j] = temp;

    }
    //find minimum of arr between the indices bottom and top
    public int minpos(int bottom, int top){

        Person m = personArray[bottom];
        int index = bottom;

        for(int i = bottom+1; i <= top; ++i){

            if(personArray[i] != null && personArray[i].getLast().compareTo(m.getLast()) < 0){
                m = personArray[i];
                index = i;
            }
        }
        //return location of min, not the min itself
        return index;
    }
    /***********************************************************************************/


    /***********************************************************************************/
    //search a sorted array
    boolean search(Person val) {

        boolean b = recurse(0, personArray.length-1, val);
        return b;
    }

    boolean recurse(int a, int b, Person val) {

        int mid = (a+b)/2;

        if(personArray[mid].equals(val)) {
            return true;
        }

        if(a > b) {
            return false;
        }

        PersonComparator personComparator = new PersonComparator();

        //if(val > strArray[mid]) return recurse(mid+1, b, val);
        if(personComparator.compare(val, personArray[mid]) > 0) {
            return recurse(mid+1, b, val);
        }

        return recurse(a,mid-1,val);
    }
    /***********************************************************************************/

    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        for(int i = 0; i < size-1; ++i){
            sb.append(personArray[i]+", ");
        }

        sb.append(personArray[size-1]+"]");

        return sb.toString();
    }
    public int size() {

        return size;
    }

    public static void main(String[] args) {

        MyPersonList list = new MyPersonList();

        Person adeway = new Person("Adhanom", "Hilifti", 62);
        Person abeba = new Person("Mola", "Abeba", 42);
        Person mihret = new Person("Girmay", "Mihret", 38);
        Person fissehaye = new Person("Girmay", "Fissehaye", 34);
        Person temesgen = new Person("Girmay", "Temesgen", 34);
        Person tesfay = new Person("Kindeya", "Tesfay", 30);
        Person kibrom = new Person("Meles", "Kibrom", 27);
        Person haymanot = new Person("Assefa", "Haymanot", 18);
        Person danait = new Person("Assefa", "Danait", 16);
        Person selam = new Person("Asfeha", "Selamamit", 27);

        list.add(adeway);
        list.add(abeba);
        list.add(mihret);
        list.add(fissehaye);
        list.add(temesgen);
        list.add(tesfay);
        list.add(kibrom);
        list.add(haymanot);
        list.add(danait);
        list.add(selam);


        System.out.println("The value of the list before sort is \n" + list);
        System.out.println();

        System.out.println("The size of the array is " + list.personArray.length);

        list.sort();
        System.out.println("The value of the list after sort is \n" + list);

        Person fissehaye2 = new Person("Girmay", "Fissehaye", 34);
        System.out.println("Does Fissehaye exist ? " + list.search(fissehaye2));
    }
}
