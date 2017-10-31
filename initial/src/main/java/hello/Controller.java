package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
	@Autowired
	LaptopService laptopService;
	
	 @RequestMapping("/")
	    public String Hello() {
	        return "Hello!";
	    }
	 
	 //test
	 
	 @RequestMapping("/laptops")
	 	public List<Laptop> getAllLaptops(){
	 		return laptopService.getAllLaptops();
	 	}
	
	 @RequestMapping("/laptops/{id}")
	 public Laptop getLaptop(@PathVariable String id) {
		 return laptopService.getLaptop(id);
	 }
	 
	 @RequestMapping(method=RequestMethod.POST, value = "/laptops")
	 public void addLaptop(@RequestBody Laptop laptop) {
		 laptopService.addLaptop(laptop);
	 }
   
	 @RequestMapping(method=RequestMethod.PUT, value = "/laptops/{id}")
	 public void updateLaptop(@RequestBody Laptop laptop, @PathVariable String id) {
		 laptopService.updateLaptop(id, laptop);
	 }
	 
	 @RequestMapping(method=RequestMethod.DELETE, value = "/laptops/{id}")
	 public void deleteLaptop(@PathVariable String id) {
		 laptopService.deleteLaptop(id);
	 }
}
