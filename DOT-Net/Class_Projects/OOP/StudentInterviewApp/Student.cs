namespace StudentInterviewApp;

class Student
{
    private int _StudentId;
    public int StudentId
    {
        get { return _StudentId; }
        set
        {
            if (value <= 0)
            {
                throw new ArgumentException("Student Id can not be zero or negative!");
            }
            _StudentId = value;
        }
    }
    //Auto Implemented Property
    public string StudentName { get; set; } = string.Empty;
    public string City { get; set; } = string.Empty;
    public string CompanyName { get; set; } = string.Empty;
    public int TotalMarks { get; set; }

    //public string CalculateResult(int totalMarks,out string personalMessage)
    public string CalculateResult(int totalMarks, ref string personalMessage)
    {
        if (totalMarks>80)
        {
            //personalMessage = "Keep It Up!";
            return $"{StudentName} has been selected in company {CompanyName}!";
        }
        else
        {
            //personalMessage = "Please try next time!";
            return $"{StudentName} has been rejected by company {CompanyName}!";
        }
    }
    public void Companies(string country,params string[] companyNames)
    {
        for (int i =0; i < companyNames.Length; i++)
        {
            Console.WriteLine($"Visiting Company Name is {companyNames[i]}!");
        }
    }
}
