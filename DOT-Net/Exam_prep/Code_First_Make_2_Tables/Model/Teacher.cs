using System.ComponentModel.DataAnnotations;

namespace Code_First_Make_2_Tables.Model;

public class Teacher
{
    [Key]
    [Required]
    public int teacherId { get; set; }
    [Required]
    [MaxLength(100, ErrorMessage = "max 100 char")]
    public string tName { get; set; } = string.Empty;
    [Required]
    [MaxLength]
    public  string subject { get; set; }= string.Empty;

    public int schoolId { get; set; }

    public School? school { get; set; }
}
