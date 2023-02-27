package my.format.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("viewresolve")
public class ViewResolver {
		
	@Value("spring")
	private String prefix;
	@Override
	public String toString() {
		return "ViewResolver [prefix=" + prefix + ", suffix=" + suffix + ", noofpages=" + noofpages + "]";
	}
	@Value("jsp")
	private String suffix;
	@Value("100")
	private long noofpages;
}
