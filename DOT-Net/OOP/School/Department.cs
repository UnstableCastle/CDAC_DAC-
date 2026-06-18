using System;
using System.Collections.Generic;

namespace School;

internal class Department
{
    public string DeptName { get; set; }
    private List<Teacher> teachers;

    public Department(string deptname)
    {
        DeptName = deptname;
        teachers = new List<Teacher>();
    }

    internal void AddTeacher(Teacher teacher)
    {
        teachers.Add(teacher);
    }

    internal void listTeacher()
    {
        Console.WriteLine($"Teachers in {DeptName}:");
        foreach (var teacher in teachers)
        {
            Console.WriteLine($"- {teacher.Name}");
        }
    }
}