package com.fehergabornorbert.app.rest.Controller;

import com.fehergabornorbert.app.rest.Enum.Nationality;
import com.fehergabornorbert.app.rest.Models.Palettes;
import com.fehergabornorbert.app.rest.Models.Worker;
import com.fehergabornorbert.app.rest.Repo.PalettesRepo;
import com.fehergabornorbert.app.rest.Repo.WorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private WorkerRepo workerRepo;
    @Autowired
    private PalettesRepo palettesRepo;


    @GetMapping(value = "/")
    public String getpage(){
        return "Szia";
    }

    @GetMapping(value = "/workers")
    public List<Worker> getWorkers(){
        return workerRepo.findAll();
    }
    @PostMapping(value = "/save")
    public String saveWorkers(@RequestBody Worker worker){
        workerRepo.save(worker);
        return "Worker saved";
    }

    @GetMapping(value = "/palettes")
    public List<Palettes> getPalettes(){ return palettesRepo.findAll();}
    @PostMapping(value = "/savepalettes")
    public String savePalettes(@RequestBody Palettes palettes){
        palettesRepo.save(palettes);
        return "Palettes saved";
    }


    @PutMapping(value = "/update/{i}")
    public String updateWorkers(@PathVariable long i, @RequestBody Worker worker){
        Worker updatedWorker = workerRepo.findById(i).get();
        updatedWorker.setFirstname(worker.getFirstname());
        updatedWorker.setLastname(worker.getLastname());
        updatedWorker.setPosition(worker.getPosition());
        updatedWorker.setAge(worker.getAge());
        updatedWorker.setNationality(Nationality.valueOf(worker.getNationality().toString()));
        updatedWorker.setPalettes(worker.getPalettes());
        workerRepo.save(updatedWorker);
        return "Worker updated";
    }
    @PutMapping(value = "/update2/{i}")
    public String updatePalettes(@PathVariable long i, @RequestBody Palettes palettes){
        Palettes updatePalettes = palettesRepo.findById(i).get();
        updatePalettes.setGyarto(palettes.getGyarto());
        updatePalettes.setMeret(palettes.getMeret());
        updatePalettes.setSzin(palettes.getSzin());
        updatePalettes.setSuly(palettes.getSuly());
        updatePalettes.setTeherbiras(palettes.getTeherbiras());
        palettesRepo.save(updatePalettes);
        return "Palettes updated";
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        Worker deleteworker = workerRepo.findById(id).get();
        workerRepo.delete(deleteworker);
        return "Worker deleted with the following id: " + id;
    }
    @DeleteMapping(value = "/delete2/{id}")
    public String deletePalette(@PathVariable Long id){
        Palettes deletepalettes = palettesRepo.findById(id).get();
        palettesRepo.delete(deletepalettes);
        return "Palette deleted with the following id: " + id;
    }

}
