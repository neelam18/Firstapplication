# Firstapplication
class student
{
private String name;
private int rollno;

public String setname(String name)
{
this.name=name;

}
public int setroll(int rollno)
{
this.rollno=rollno;
}
public String getname()
{
return name;
}
public int getroll()
{
return rollno;
}
}
class StudentP
{
public static void main(String args[])
{
student s=new student();
s.setname("neelam");
s.setroll(27);
String s=s.getname();
int roll=s.getroll();
System.out.println("my name is"+s+"and my age is"+roll);
}
}
