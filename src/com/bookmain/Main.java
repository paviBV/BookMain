package com.bookmain;

import java.util.ArrayList;
import java.util.List;

class BookMain{
    String bId;
    String bName;
    int bCost;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbCost() {
        return bCost;
    }

    public void setbCost(int bCost) {
        this.bCost = bCost;
    }

    @Override
    public String toString() {
        return "BookMain{" +
                "bId='" + bId + '\'' +
                ", bName='" + bName + '\'' +
                ", bCost=" + bCost +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
	    List<BookMain> bookMainList = new ArrayList<>();
	    BookMain bookMain = new BookMain();
	    bookMain.setbId("B001");
	    bookMain.setbName("Miracle");
	    bookMain.setbCost(400);
	    bookMainList.add(bookMain);

        BookMain bookMain1 = new BookMain();
        bookMain1.setbId("B002");
        bookMain1.setbName("Downning");
        bookMain1.setbCost(600);
        bookMainList.add(bookMain1);

        BookMain bookMain2 = new BookMain();
        bookMain2.setbId("B003");
        bookMain2.setbName("Raising Horizon");
        bookMain2.setbCost(900);
        bookMainList.add(bookMain2);

        for (int i = 0; i < bookMainList.size(); i++) {
            System.out.println(bookMainList.get(i));
        }

        System.out.println("Single");
        for (int i = 0; i < bookMainList.size(); i++) {
            if (bookMainList.get(i).getbId()=="B003") {
                System.out.println(bookMainList.get(i));
            }
        }

        System.out.println("Update");
        for (int i = 0; i < bookMainList.size(); i++) {
            if (bookMainList.get(i).getbId()=="B003") {
                bookMainList.get(i).setbName("Public speaking");
                bookMainList.get(i).setbCost(1200);
                System.out.println(bookMainList.get(i));
            }
        }

        System.out.println("Delete");
        for (int i = 0; i < bookMainList.size(); i++) {
            if (bookMainList.get(i).getbId()=="B003") {
                bookMainList.remove(i);
            }
        }


        for (int i = 0; i < bookMainList.size(); i++) {
            if (bookMainList.get(i).getbId()!="B003") {
                System.out.println("Not found");
                break;
            }
        }


    }
}
