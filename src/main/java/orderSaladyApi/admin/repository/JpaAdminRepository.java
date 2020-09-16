package orderSaladyApi.admin.repository;

import org.springframework.data.repository.CrudRepository;

import orderSaladyApi.entity.UserInfoEntity;

public interface JpaAdminRepository extends CrudRepository<UserInfoEntity, Integer>{

}