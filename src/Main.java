public class Main {
    public static void main (String [] args){
        LinkedList linkedList=new LinkedList(5);


        //append
        System.out.println("***Append****");
        linkedList.append(6);
        linkedList.append(7);
        linkedList.pintList();

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        //prepend
        System.out.println("***Prepend****");
        linkedList.prepend(9);
        linkedList.pintList();
        //Remove first
        System.out.println("***Remove First****");
        System.out.println("removed element is: "+linkedList.removeFirst().value);//9
        linkedList.pintList();

        //set
        System.out.println("***set****");
        System.out.println(linkedList.set(3,88));
        linkedList.pintList();
        // get by index
        System.out.println("***Get****");
        linkedList.pintList();
        System.out.println("value= "+linkedList.get(0).value);
        System.out.println("value= "+linkedList.get(1).value);
        System.out.println("value= "+linkedList.get(2).value);
        System.out.println(linkedList.get(3));



        //remove
        System.out.println("***Remove****");
        linkedList.append(8);
        linkedList.append(9);
        linkedList.append(10);
        linkedList.pintList();
        System.out.println(linkedList.removeLast().value);
        //linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast());
        linkedList.pintList();


        System.out.println("*******");
        System.out.println("*******");
        System.out.println("***Remove by index****");
        // remove by index
        LinkedList newLinkedList=new LinkedList(11);
        newLinkedList.append(22);
        newLinkedList.append(33);
        newLinkedList.append(44);
        newLinkedList.append(45);
        newLinkedList.pintList();
        System.out.println("removed value "+newLinkedList.remove(5).value);
        newLinkedList.pintList();



    }
}
