import java.util.HashSet;

class Set {

public static void main(String args[]){

HashSet<Integer> hs=new HashSet<Integer>();

hs.add(52);
hs.add(25);
hs.add(65);
hs.add(65);
System.out.println(hs);
hs.remove(25);
System.out.println(hs);
}



}