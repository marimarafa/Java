package com.spring.ecommerce.utility;

import java.util.ArrayList;
import java.util.List;

import com.spring.ecommerce.dto.ProdottoDTO;
import com.spring.ecommerce.dto.VenditoreDTO;
import com.spring.ecommerce.entity.Prodotto;
import com.spring.ecommerce.entity.Venditore;

public class Conversioni {
	
	public static Prodotto daProdottoDTOAProdotto(ProdottoDTO dto) {
        return new Prodotto(dto.getId(), dto.getDescrizione(), dto.getQuantita(), dto.getPrezzo(), dto.getSconto(), dto.getCategoria());
    }

    public static ProdottoDTO daProdottoAProdottoDTO(Prodotto pro) {
         return new ProdottoDTO(pro.getId(), pro.getDescrizione(), pro.getQuantita(), pro.getPrezzo(), pro.getSconto(), pro.getCategoria());
    }

    public static Venditore daVenditoreDTOAVenditore(VenditoreDTO dto) {
        Venditore venditore = new Venditore(dto.getId(), dto.getNome(), dto.getCognome(), dto.getUsername(), dto.getPassword(), dto.getVia(), dto.getCitta()) ;

        List<ProdottoDTO> prodottiDto = dto.getProdotti();
        List<Prodotto> prodotti = new ArrayList<>();
        for(ProdottoDTO proD : prodottiDto) {
        	prodotti.add(Conversioni.daProdottoDTOAProdotto(proD));
        }
        venditore.setProdotti(prodotti);
        return venditore;
    }

    public static VenditoreDTO daVenditoreAVenditoreDTO(Venditore ven) {
        VenditoreDTO venditoreD = new VenditoreDTO(ven.getId(), ven.getNome(), ven.getCognome(), ven.getUsername(), ven.getPassword(), ven.getVia(), ven.getCitta()) ;

        List<Prodotto> prodotti = ven.getProdotti();
        List<ProdottoDTO> prodottiD = new ArrayList<>();
        for(Prodotto pro : prodotti) {
        	prodottiD.add(Conversioni.daProdottoAProdottoDTO(pro));
        }
        venditoreD.setProdotti(prodottiD);
        return venditoreD;
    }	

}
