package application.Devices.Devices.mydevice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppDeviceRepositry
        extends JpaRepository <AppDevice,Long> {
    @Query("SELECT a FROM AppDevice a WHERE a.description=?1")
    Optional<AppDevice> findAppDeviceByDescription(String desecription);
}
