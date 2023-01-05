package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.service.OrderAdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private OrderAdminService adminService;

    public AdminController(OrderAdminService adminService) {
        this.adminService = adminService;
    }

    @DeleteMapping("/deleteOrders")
    public String deleteAllOrders() {
        adminService.deleteAddOrders();
        return "redirect:/admin";
    }
}
