package eshop.homedecor.shopapi.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import eshop.homedecor.shopapi.entity.OrderMain;

public interface OrderRepository extends JpaRepository<OrderMain, Integer> {
    OrderMain findByOrderId(Long orderId);


    Page<OrderMain> findAllByOrderStatusOrderByCreateTimeDesc(Integer orderStatus, Pageable pageable);


    Page<OrderMain> findAllByBuyerEmailOrderByOrderStatusAscCreateTimeDesc(String buyerEmail, Pageable pageable);

    Page<OrderMain> findAllByOrderByOrderStatusAscCreateTimeDesc(Pageable pageable);

    Page<OrderMain> findAllByBuyerPhoneOrderByOrderStatusAscCreateTimeDesc(String buyerPhone, Pageable pageable);

    
    @Query(value="select order_id,buyer_address,buyer_email,buyer_name,buyer_phone,create_time,order_amount,order_status,update_time from order_main",nativeQuery = true)
	List<OrderMain> findOrders();

//    @Query(value = "COPY order_main TO 'C:\\Users\\DELL\\Downloads\\OrderReport.csv' DELIMITER ',' CSV HEADER",
//    		nativeQuery = true)
//    List<OrderMain> findAll();
    
}
