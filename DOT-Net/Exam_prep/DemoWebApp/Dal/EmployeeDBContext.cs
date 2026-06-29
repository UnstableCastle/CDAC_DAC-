
using DemoWebApp.Models;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Text;

namespace Code_First_Make_2_Tables.Dal;

public class EmployeeDBContext : DbContext


{
    public EmployeeDBContext()
    {
    }

    public EmployeeDBContext(DbContextOptions<EmployeeDBContext> options) : base(options)
    {


    }

    public   DbSet<Employee> employees {  get; set; }
   

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            string con = "Server=localhost;Database=ExamDB1;User=root;Password=1234";

            optionsBuilder.UseMySQL(con);
        }


    }
}
