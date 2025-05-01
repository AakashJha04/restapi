package in.aakash.restapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aakash.restapi.entity.ProfileEntity;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    Optional<ProfileEntity> findByEmail(String email);

    Boolean existsByEmail(String email);
}
