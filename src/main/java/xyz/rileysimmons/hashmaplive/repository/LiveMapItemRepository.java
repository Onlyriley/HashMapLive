package xyz.rileysimmons.hashmaplive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.rileysimmons.hashmaplive.model.LiveMapItem;

public interface LiveMapItemRepository extends JpaRepository<LiveMapItem, String> {
}
