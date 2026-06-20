using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Text;

namespace eCommerceSample.Models
{
    public class Product
    {
        [Key]
        public int ProductId { get; set; }
        
        [Required(ErrorMessage ="This is a Required Field")]
        [DisplayName("Product Name")]
        [MaxLength(100,ErrorMessage ="Product Name must not exceed 100 char")]
        public string ProductName { get; set; }= string.Empty;

        [Required(E)]
        public string ProductDescription { get; set; } = string.Empty;
    }
}
