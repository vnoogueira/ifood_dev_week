package me.dio.sacola.service;

import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.repository.SacolaRepository;
import me.dio.sacola.resource.dto.ItemDto;
import org.springframework.stereotype.Service;

@Service
public class SacolaServiceImpl implements SacolaService{
    private final SacolaRepository sacolaRepository;

    public SacolaServiceImpl(SacolaRepository sacolaRepository) {
        this.sacolaRepository = sacolaRepository;
    }

    @Override
    public Item incluirItemSacola(ItemDto itemDto) {
        return null;
    }

    @Override
    public Sacola verSacola(Long id) {

        return sacolaRepository.findById(id);
    }

    @Override
    public Sacola fecharSacola(Long id, int formaPagemento) {
        return null;
    }
}
