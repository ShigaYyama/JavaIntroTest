package test2;

public class TypDog {
    private String Name;
    private int Age;
    private String  Kind;

    
    public TypDog( String kd )
    {
        Kind = kd;
    }

    public void SetName( String nm )
    {
        Name = nm;
    }
    
    public void SetAge( int age )
    {
    	Age = age;
    }

    public void ShowProfile()
    {

        System.out.println( Kind + "名前は" + Name + "、年齢は" + Age + "です。" );
    }
}
