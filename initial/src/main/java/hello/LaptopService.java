package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {
		
		List<Laptop> laptops = new ArrayList<>();
		
		public LaptopService() {
			laptops.add(new Laptop("Lenovo", "T530", 1700, new Feature("1TB", 8)));
			laptops.add(new Laptop("Asus", "ROG501JW", 2300, new Feature("2TB", 16)));
			laptops.add(new Laptop("Dell", "A24", 1100, new Feature("750GB", 8)));
			laptops.add(new Laptop("Lenovo", "Y700", 2700, new Feature("2TB", 16)));
		}
		
		public List<Laptop> getAllLaptops(){
			return laptops;
		}
		
		public Laptop getLaptop(String id) {
			return laptops.stream().filter(l -> l.getModel().equals(id)).findFirst().get();
		}
	    
		public void addLaptop(Laptop laptop) {
			laptops.add(laptop);
		}
		
		public void updateLaptop(String id, Laptop laptop) {
			for(int i = 0; i < laptops.size();) {
				Laptop tempLaptop = laptops.get(i);
				if(tempLaptop.getModel().equals(id))
					laptops.set(i, laptop);
				return;
			}
		}
		
		
		public void deleteLaptop(String id) {
			laptops.removeIf(t -> t.getModel().equals(id));
		}
}
