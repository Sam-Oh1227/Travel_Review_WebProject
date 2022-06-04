package com.travel.index;

import com.travel.domain.idxView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface IndexViewRepository extends JpaRepository<idxView, Long> {

    @Query(nativeQuery=true, value="select * from idx_view")
    List<idxView> findAllView();


}