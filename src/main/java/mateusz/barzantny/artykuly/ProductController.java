package mateusz.barzantny.artykuly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String home() {
        return "home.html";
    }

    @GetMapping("/all")
    @ResponseBody
    public String all() {
        return productRepository.getProduct();
    }

    @GetMapping("/dom")
    @ResponseBody
    public String dom(@RequestParam String category) {
        return productRepository.getProdCategory(Category.valueOf(category));
    }

    @ResponseBody
    @RequestMapping("/jedzenie")
    public String jedzenie(@RequestParam String category) {
        return productRepository.getProdCategory(Category.valueOf(category));
    }

    @ResponseBody
    @RequestMapping("/pozostale")
    public String pozostale(@RequestParam String category) {
        return productRepository.getProdCategory(Category.valueOf(category));
    }
}
