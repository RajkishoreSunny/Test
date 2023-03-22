using System;
namespace Emp
{
    public class Employee
    {
        private int EmpNo;
        private string EmpName;
        private double Salary;
        private double HRA = 0;
        private double TA = 0;
        private double DA = 0;
        private double PF = 0;
        private double TDS = 0;
        private double NetSalary = 0;
        private double GrossSalary = 0;

        public int Emp_No
        {
            set { EmpNo = value; }
            get { return EmpNo; }
        }

        public string Emp_Name
        {
            set { EmpName = value; }
            get { return EmpName; }
        }

        public double Sala_ry
        {
            set { Salary = value; }
            get { return Salary; }
        }

        public void HraTaDa_cal()
        {
            if(Sala_ry < 5000)
            {
                HRA += (0.1) * Sala_ry;
                TA += (0.05) * Sala_ry;
                DA += (0.15) * Sala_ry;
            }
            else if(Sala_ry < 10000)
            {
                HRA += (0.15) * Sala_ry;
                TA += (0.10) * Sala_ry;
                DA += (0.20) * Sala_ry;
            }
            else if(Sala_ry < 15000)
            {
                HRA += (0.20) * Sala_ry;
                TA += (0.15) * Sala_ry;
                DA += (0.25) * Sala_ry;
            }
            else if(Sala_ry < 20000)
            {
                HRA += (0.25) * Salary;
                TA += (0.20) * Salary;
                DA += (0.30) * Salary;
            }
            else
            {
                HRA += (0.30) * Sala_ry;
                TA += (0.25) * Sala_ry;
                DA += (0.35) * Sala_ry;
            }
        }

        public void CalculateSalary()
        {
            GrossSalary += Sala_ry + HRA + TA + DA;
            PF += (0.10) * GrossSalary;
            TDS += (0.18) * GrossSalary;
            NetSalary += GrossSalary - (PF + TDS);

            double gsalary = GrossSalary;
            double nsalary = NetSalary;

            Console.WriteLine("Gross Salary of Employee is : " + gsalary);
            Console.WriteLine("Net Salary of Employee is : " + nsalary);
            

        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            Employee emp = new Employee();
            int empID; string empNAME; double salary;

            Console.WriteLine("Enter the Employee ID : ");
            empID = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter the Name of Employee : ");
            empNAME = Console.ReadLine();
            Console.WriteLine("Enter the Salary");
            salary = double.Parse(Console.ReadLine());

            emp.Emp_No = empID;
            emp.Emp_Name = empNAME;
            emp.Sala_ry = salary;

            emp.HraTaDa_cal();
            emp.CalculateSalary();
        }
    }

}
