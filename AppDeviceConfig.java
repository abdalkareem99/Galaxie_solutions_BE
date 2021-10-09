package application.Devices.Devices.mydevice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class AppDeviceConfig {

    @Bean
    CommandLineRunner commandLineRunner(AppDeviceRepositry repositry){
        return args -> {
           /* new AppDevice(
                    true,
                    1L,
                    2L,
                    "name ss",
                    "type aa",
                    "amman city",
                    "no desc cnt",
                    "no im",
                    "ver ne",
                    "created on",
                    "kkf"

            );*/
            AppDevice swa = new AppDevice(

                    true,
                    2L,
                    "swa",
                    "elctronic",
                    "new yourk ",
                    "in hand",
                    "no im",
                    "4",
                    "12/12/2020",
                    "Apple",
                    LocalDate.of(2002,Month.JULY,5)
            );

            AppDevice freg = new AppDevice(

                    true,
                    3L,
                    "freg",
                    "elctronic",
                    "irbd",
                    "fregrator",
                    "no im",
                    "2",
                    "10/10/2020",
                    "sharp",
                    LocalDate.of(2002, Month.APRIL,5)

            );

            repositry.saveAll(
                    List.of(swa,freg)
            );
        };
    }

}
