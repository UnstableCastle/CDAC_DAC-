using System.ComponentModel.DataAnnotations;

namespace DemoWebApp.Models;

public class Employee
{

    [Key]
    public int empId { get; set; }

    [Required(ErrorMessage ="this is a required field")]
    [MaxLength(100,ErrorMessage ="max length is  100 char")]
    public string Name { get; set; } = string.Empty;

}
