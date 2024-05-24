package com.codekarigar.remotePaster.controller;

import com.codekarigar.remotePaster.model.Bin;
import com.codekarigar.remotePaster.repository.BinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bin")
@CrossOrigin("*")
public class BinController {
//    private static final Logger logger = LogManager.getLogger(BinController.class);

    @Autowired
    BinRepository binRepository;

    @PostMapping(value = "/saveBin")
    public void save(@RequestBody Bin bin) throws Exception{
//        logger.info("Saving bin {}", bin.getBinName());
        binRepository.save(bin);
    }

    @GetMapping(value = "/getBin/{binName}")
    public Bin getBinByName(@PathVariable String binName){
        return binRepository.findFirstByBinName(binName);
    }

    @GetMapping(value = "/all")
    public List<Bin> getAllBins(){
        return binRepository.findAll();
    }

}
