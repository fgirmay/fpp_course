package problem2;

/**
 * Created by fissehaye on 6/10/18.
 */

public class MyTable {

    private Entry[] entries = new Entry[26];

    //returns the String that is matched with char c in the table
    public String get(char c){
        //implement
        int index = getIndexFromChar(c);
        Entry entry = entries[index];
        return entry.str;
    }

    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        //implement

        int index = getIndexFromChar(c);
        Entry entry = new Entry(c, s);
        entries[index] = entry;
    }

    //returns a String consisting of nicely formatted display
    // of the contents of the table
    public String toString() {
        //implement
        String result = "";

        for (Entry entry : entries) {

            if (entry != null) {
                result += entry.ch + "->"+entry.str+"\n";
            }
        }

        return result;
    }

    private class Entry {

        char ch;
        String str;

        Entry(char ch, String str){
            //implement
            this.ch = ch;
            this.str = str;
        }

        //returns a String of the form "ch->str"
        public String toString() {
            //implement
            return ch + "->" + str;
        }
    }

    private int getIndexFromChar(char c) {
        return c - 'a';
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");
        String s = t.get('b');
        System.out.println(s);

        MyTable t1 = new MyTable();
        t1.add('a', "Andrew");
        t1.add('b',"Billy");
        t1.add('w',"Willie");
        System.out.println(t1);

    }
}
