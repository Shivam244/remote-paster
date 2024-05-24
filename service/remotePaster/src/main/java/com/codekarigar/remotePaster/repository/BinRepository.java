package com.codekarigar.remotePaster.repository;

import com.codekarigar.remotePaster.model.Bin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BinRepository extends JpaRepository<Bin, Long> {
    Bin findFirstByBinName(String binName);
}