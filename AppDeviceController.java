package application.Devices.Devices.mydevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/mydevice")
public class AppDeviceController {
    private final AppDeviceService appDeviceService;
    @Autowired
    public AppDeviceController(AppDeviceService appDeviceService) {
        this.appDeviceService = appDeviceService;
    }


    @GetMapping
    public List<AppDevice> getAppDevice() {
        return appDeviceService.getAppDevice();

    }

    @PostMapping
    public void registerNewAppDevice(@RequestBody AppDevice appDevice){

        appDeviceService.addNewAppDecive(appDevice);
    }

    @DeleteMapping(path = "{appDeviceId}")
    public void deleteAppDevice(@PathVariable("appDeviceId")Long appDeviceId){
        appDeviceService.deleteAppDevice(appDeviceId);
    }
}
