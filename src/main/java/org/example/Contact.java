package org.example;
import java.util.Scanner;
import java.util.logging.Logger;
public class Contact {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        Scanner sc=new Scanner(System.in);
        Logger log= Logger.getLogger("Contact");
        int ch;
        String s1="Enter the Name :";
        String s2="Enter the Email :";
        String s3="Enter the Number :";
        do{
            log.info("1.InsertFirst \n 2.InsertLast\n3.InsertAtPos\n4.RemoveFirst\n5.RemoveLast\n6.RemoveAtPos\n7.Display\n8.search by Name");
            log.info("Enter the Choice :");
            ch= sc.nextInt();
            switch (ch){
                case 1->{
                    log.info(s1);
                    String nameInsertFirst= sc.next();
                    log.info(s2);
                    String emailInsertFirst=sc.next();
                    log.info(s3);
                    String numberInsertFirst=sc.next();
                    l.insertFirst(nameInsertFirst,emailInsertFirst,numberInsertFirst);
                }
                case 2->{
                    log.info(s1);
                    String nameInsertLast= sc.next();
                    log.info(s2);
                    String emailInsertLast=sc.next();
                    log.info(s3);
                    String numberInsertLast=sc.next();
                    l.insertLast(nameInsertLast,emailInsertLast,numberInsertLast);
                }
                case 3->{
                    log.info(s1);
                    String nameInsertAt=sc.next();
                    log.info(s2);
                    String emailInsertAt= sc.next();
                    log.info(s3);
                    String numberInsertAt=sc.next();
                    log.info("Enter the Position :");
                    int index=sc.nextInt();
                    l.insertAt(nameInsertAt,emailInsertAt,numberInsertAt,index);
                }
                case 4-> l.removeFirst();
                case 5-> l.removeLast();
                case 6-> {
                    log.info("Enter the Position :");
                    int index = sc.nextInt();
                    l.removeAt(index);
                }
                case 7->
                        l.display();
                case 8->
                {
                    log.info(s1);
                    String name=sc.next();
                    int res=l.search(name);
                    if(res>0)
                    {
                        String s="Element is At Position :"+res;
                      log.info(s);

                    }
                    else
                    {
                        log.info("The name is not found");
                    }

                }

                default ->
                        log.info("Wrong Choice !");

            }
        }while(ch>0 && ch<=8);
    }

}