
namespace Engine;

internal class Car
{

    private Engine? engine;
    public string Model { get; set; } 

    public Car(string  model,string engineType)
    {
        Model = model;

        engine = new Engine(engineType);
    }

    public void Drive() {
        engine.Start();
        Console.WriteLine($"{Model} is driving");
    
    }
}
