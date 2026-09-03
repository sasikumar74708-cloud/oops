import java.io.*;
import java.lang.*;
import java.util.*;
class employee
{
String emp_name;
int emp_id;
String address;
String mail_id;
int mob_number;
employee(String emp_name, int emp_id, String address, String main_id, int mob_number)
{
this.emp_name = emp_name;
this.emp_id = emp_id;
this.address = address;
this.mob_number = mob_number;
}
void display()
{
System.out.println("Employee Name:"+emp_name);
System.out.println("Employee_ID:"+emp_id);
System.out.println("Address:"+address);
System.out.println("Mobile Number:"+mob_number);
}
}
class Programmer extends employee
{
double basicpay,da,hra,pf,fund,netsalary,grosssalary;
Programmer(String emp_name, int emp_id, String address, String mail_id, int mob_number,double bp)
{
super(emp_name, emp_id, address, mail_id, mob_number);
basicpay = bp;
}
public void getPaySlip()
{
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra+pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp()
{
System.out.println("Name of the Employee:"+emp_name+"****payslip***");
display();
System.out.println("Grosssalary="+grosssalary);
System.out.println("Netsalary="+netsalary);
}
}
class AssistantProfessor extends employee
{
double basicpay,da,hra,pf,fund,netsalary,grosssalary;
AssistantProfessor (String emp_name, int emp_id, String address, String mail_id, int mob_number,double bp)
{
super(emp_name, emp_id, address,mail_id, mob_number);
basicpay=bp;
}
public void getPaySlip()
{
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra+pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp()
{
System.out.println("Name of the Employee:"+emp_name+"****payslip***");
display();
System.out.println("Grosssalary="+grosssalary);
System.out.println("Netsalary="+netsalary);
}
}
class AssociateProfessor extends employee
{
double basicpay,da,hra,pf,fund,netsalary,grosssalary;
AssociateProfessor (String emp_name, int emp_id, String address, String mail_id, int mob_number,double bp)
{
super(emp_name, emp_id, address,mail_id, mob_number);
basicpay=bp;
}
public void getPaySlip()
{
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra+pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp()
{
System.out.println("Name of the Employee:"+emp_name+"****payslip***");
display();
System.out.println("Grosssalary="+grosssalary);
System.out.println("Netsalary="+netsalary);
}
}
class Professor extends employee
{
double basicpay,da,hra,pf,fund,netsalary,grosssalary;
Professor (String emp_name, int emp_id, String address, String mail_id, int mob_number,double bp)
{
super(emp_name, emp_id, address,mail_id, mob_number);
basicpay=bp;
}
public void getPaySlip()
{
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra+pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp()
{
System.out.println("Name of the Employee:"+emp_name+"****payslip***");
display();
System.out.println("Grosssalary="+grosssalary);
System.out.println("Netsalary="+netsalary);
}
}
public class employeePaySlip
{
public static void main(String[] args)throws IOException
{
String name,add,mail;
int id,mob,desg;
double bp;
DataInputStream in = new DataInputStream(System.in);
System.out.println("Enter Name of Employee:");
name=in.readLine();
System.out.println("Enter ID of Employee:");
id=Integer.valueOf(in.readLine());
System.out.println("Enter Address ofEmployee:");
add=in.readLine();
System.out.println("Enter Mail ID of Employee:");
mail=in.readLine();
System.out.println("Enter Mobile Number of Employee:");
mob=Integer.valueOf(in.readLine());
System.out.println("Enter the Basicpay:");
bp=Double.valueOf(in.readLine());
System.out.println("Enter the Destination.");
System.out.println("1.Programmer\n2. AssistantP{rofessor\n3.AssociateProfessor\n4.Professor\n5.Exit");
desg=Integer.valueOf(in.readLine());
switch (desg)
{
case 1: Programmer p=new Programmer (name,id,add,mail,mob,bp);
p.getPaySlip ();
p.disp();
break;
case 2: AssistantProfessor ap=new AssistantProfessor(name,id,add,mail,mob,bp);
ap.getPaySlip ();
ap.disp();
break;
case 3: AssociateProfessor assp=new AssociateProfessor(name,id,add,mail,mob,bp);
assp.getPaySlip ();
assp.disp();
break;
case 4:Professor pf=new Professor (name,id,add,mail,mob,bp);
pf.getPaySlip ();
pf.disp();
break;
case 5: System.exit(0);
default: System.out.println("Invalid designation");
}
}
}
