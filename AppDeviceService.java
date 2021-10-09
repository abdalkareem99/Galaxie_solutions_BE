package application.Devices.Devices.mydevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppDeviceService {

    private final AppDeviceRepositry appDeviceRepositry;

    @Autowired
    public AppDeviceService(AppDeviceRepositry appDeviceRepositry) {
        this.appDeviceRepositry = appDeviceRepositry;
    }

    public List<AppDevice> getAppDevice() {
        return appDeviceRepositry.findAll();


    }

    public void addNewAppDecive(AppDevice appDevice) {
        Optional<AppDevice> appDeviceOptional = appDeviceRepositry
                .findAppDeviceByDescription(appDevice.getDescription());
        if (appDeviceOptional.isPresent()){
            throw new IllegalStateException("descriotion .......");
        }

        appDeviceRepositry.save(appDevice);

        //        System.out.println(appDevice);
    }

    public void deleteAppDevice(Long appDeviceId) {
        boolean exists = appDeviceRepositry.existsById(appDeviceId);
        if(!exists){
            throw new IllegalStateException("app device with id  " + appDeviceId +" dose not exists");
        }

        appDeviceRepositry.deleteById(appDeviceId);
    }


}
