package com.shop.ChandraAndCompany.DAO;

import com.shop.ChandraAndCompany.Model.Ac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcDAO extends JpaRepository<Ac,Integer>
{

}
