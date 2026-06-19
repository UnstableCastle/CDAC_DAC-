namespace InterfaceExamples
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Inmterface Examples!");
            IPhysics phy = new Science();
            phy.PhysicsMessage();
            phy.DepartmentLocation();
            IChemistry chemistry=new Science();
            chemistry.ChemistryMessage();
            chemistry.DepartmentLocation();
            IBiology biology=new Science();
            biology.BiologyMessage();
            biology.DepartmentLocation();
            IScience scienceHod=new Science();
            scienceHod.PhysicsMessage();
            scienceHod.BiologyMessage();
            scienceHod.ChemistryMessage();
        }
    }
}
