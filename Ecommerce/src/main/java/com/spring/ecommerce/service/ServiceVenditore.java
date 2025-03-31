package com.spring.ecommerce.service;


import com.spring.ecommerce.dto.ProdottoDTO;
import com.spring.ecommerce.dto.VenditoreDTO;
import com.spring.ecommerce.dto.VenditoreDTONOProdotti;

public interface ServiceVenditore {
	
	public boolean inserisci(VenditoreDTO dto);
	public VenditoreDTO cerca(int idVenditore);
	public VenditoreDTONOProdotti visualizzaSenzaProdotti(int idVenditore);
	public VenditoreDTO modificaPassword(int idvenditore , String newPass);
	public boolean aggiungiProdotto(int idVenditore , ProdottoDTO dto);
	public ProdottoDTO modificaQuantita(int idVenditore,int idProdotto,int quantita);

}
