using Code_First_Make_2_Tables.Model;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Text;

namespace Code_First_Make_2_Tables.Dal;

public class schoolDBContext : DbContext


{
    public schoolDBContext()
    {
    }

    public schoolDBContext(DbContextOptions<schoolDBContext> options) : base(options)
    {


    }

    public   DbSet<School> schools {  get; set; }
    public   DbSet<Teacher> teachers { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            string con = "Server=localhost;Database=ExamDB;User=root;Password=1234";

            optionsBuilder.UseMySQL(con);
        }


    }
}
