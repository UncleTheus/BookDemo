# BookDemo based on OOAD
## 图书借阅实例

### 测试代码
```java


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
### 测试结果
```text


==========================================================
2018-06-25T19:28:18.979:张三尝试借微观经济学...
张三已成功借微观经济学!
==========================================================
2018-06-25T19:28:19.042:张三再尝试借微观经济学...
张三已经借了微观经济学,不能再借！
==========================================================
2018-06-25T19:28:19.043:李四尝试借微观经济学...
李四尝试借微观经济学失败，书已借出
==========================================================
2018-06-25T19:28:19.050:张三归还微观经济学...
张三已成功归还微观经济学!
==========================================================
2018-06-25T19:28:19.051:李四尝试借物流管理、计算机网络、电子商务概论...
李四已成功借物流管理!
李四已成功借计算机网络!
李四已成功借电子商务概论!
==========================================================
2018-06-25T19:28:19.052:李四尝试借微观经济学...
李四已经借了3本书，不能再借！

Process finished with exit code 0
