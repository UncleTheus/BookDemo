import com.demo.book.Book;
import com.demo.book.Member;

import java.time.LocalDateTime;

public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book("001", "CUMT001", "微观经济学");
        Book book2 = new Book("002", "CUMT001", "微观经济学");
        Book book3 = new Book("003", "CUMT003", "物流管理");
        Book book4 = new Book("004", "CUMT004", "计算机网络");
        Book book5 = new Book("005", "CUMT005", "电子商务概论");

        Member member1 = new Member("01", "张三");
        Member member2 = new Member("02", "李四");

        System.out.println("==========================================================");
        System.out.println(LocalDateTime.now() + ":" + member1.getName() + "尝试借" + book1.getTitle() + "...");
        if (member1.CanLoan(book1)) {
            member1.loan(book1);
        }
        System.out.println("==========================================================");
        System.out.println(LocalDateTime.now() + ":" + member1.getName() + "再尝试借" + book2.getTitle() + "...");
        if (member1.CanLoan(book2)) {
            member1.loan(book2);
        }
        System.out.println("==========================================================");
        System.out.println(LocalDateTime.now() + ":" + member2.getName() + "尝试借" + book1.getTitle() + "...");
        if (member2.CanLoan(book1)) {
            member2.loan(book1);
        }
        System.out.println("==========================================================");
        System.out.println(LocalDateTime.now() + ":" + member1.getName() + "归还" + book1.getTitle() + "...");
        member1.Return(book1);
        System.out.println("==========================================================");
        System.out.println(LocalDateTime.now() +":" + member2.getName() + "尝试借" + book3.getTitle() + "、" + book4.getTitle() + "、" + book5.getTitle()+"...");
        if(member2.CanLoan(book3)){
            member2.loan(book3);
        }
        if(member2.CanLoan(book4)){
            member2.loan(book4);
        }
        if(member2.CanLoan(book5)){
            member2.loan(book5);
        }
        System.out.println("==========================================================");
        System.out.println(LocalDateTime.now() + ":" + member2.getName() + "尝试借" + book1.getTitle() + "...");
        if(member2.CanLoan(book1)){
            member2.loan(book1);
        }
    }


}

