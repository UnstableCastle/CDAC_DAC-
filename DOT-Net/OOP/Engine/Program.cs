namespace Engine;

class Engine { 

    public string? Type {  get; set; }

    public Engine(string? type) {
    
    Type = type;
        
    }

    public void Start() => Console.WriteLine($"{Type} engine is roaring");
}

