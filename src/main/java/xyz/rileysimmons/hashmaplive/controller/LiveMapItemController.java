package xyz.rileysimmons.hashmaplive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.rileysimmons.hashmaplive.model.LiveMapItem;
import xyz.rileysimmons.hashmaplive.repository.LiveMapItemRepository;

@RestController
@RequestMapping("/api/map")
public class LiveMapItemController {

    @Autowired
    private LiveMapItemRepository mapRepo;

    @PostMapping
    public LiveMapItem setLiveMapItem(@RequestParam String key, @RequestParam String value) {
        LiveMapItem item = new LiveMapItem();
        item.setMapKey(key);
        item.setMapValue(value);
        return mapRepo.save(item);
    }

    @GetMapping
    public String getValue(@RequestParam String key) {
        LiveMapItem item = mapRepo.findById(key).orElse(null);
        return item != null ? item.getMapValue() : null;
    }

}
