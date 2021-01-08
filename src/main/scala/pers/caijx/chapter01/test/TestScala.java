package pers.caijx.chapter01.test;

/**
 * @ClassName TestScala
 * @Description: 可以理解为scala在运行时，做了一个包装。
 * @Author JunXiangCai
 * @Date 2021/1/8
 * @Version V1.0
 **/
public class TestScala {

    public static void main(String[] paramArrayOfString)
    {
        TestScala$.MODULE$.main(paramArrayOfString);
    }
}

final class TestScala$
{
    // 始终是同一个对象，是单例的
    public static final TestScala$ MODULE$ = new TestScala$();

    public void main(String[] args)
    {
        System.out.println("hello,scala,idea...");
    }
}

