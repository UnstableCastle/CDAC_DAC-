using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text;

namespace Code_First_Make_2_Tables.Model;

public class School
{
    [Required]
    [Key]
    public int schoolId { get; set; }
    [Required]
    [MaxLength(100,ErrorMessage ="School Name cant exceed 100 chars")]
    public string schoolName { get; set; } = string.Empty;
    [Required]
    [MaxLength(100,ErrorMessage ="City name cant exceed 100 char")]
    public string city { get; set; }= string.Empty;
}
