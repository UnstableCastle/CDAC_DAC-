namespace InterfaceExamples;

internal class Science : IPhysics, IChemistry,IBiology,IScience
{
    void IBiology.BiologyMessage()
    {
        Console.WriteLine("Biology Interface!");
    }

    void IChemistry.ChemistryMessage()
    {
        Console.WriteLine("Chemistry Interface!");
    }

    void IPhysics.DepartmentLocation()
    {
        Console.WriteLine("Physics East!");
    }

    void IChemistry.DepartmentLocation()
    {
        Console.WriteLine("Chemistry North!");
    }

    void IBiology.DepartmentLocation()
    {
        Console.WriteLine("Biology South!");
    }

    void IPhysics.PhysicsMessage()
    {
        Console.WriteLine("Physics Interface!");
    }
}
