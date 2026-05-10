package session_14;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class PrintJobs implements Runnable{
	String name;
	public PrintJobs(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name+" job started by "
	+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println(name+" job completed by "
		+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		PrintJobs jobs[] = {
				new PrintJobs("ABC"),
				new PrintJobs("MNO"),
				new PrintJobs("PQR"),
				new PrintJobs("RTF"),
				new PrintJobs("JPG"),
				new PrintJobs("TXT")
		};
		
		ExecutorService service = 
				Executors.newFixedThreadPool(3);
		
		for(PrintJobs j:jobs)
		{
			service.submit(j);
		}
		service.shutdown();
	}
}
