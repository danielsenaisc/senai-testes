package view;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import dao.*;
import entidades.*;

public class Main {

	
	public static void main(String[] args) {
		
		/** Canal **/		
//		Canal c = new Canal("sbt");
//		Canal c1 = new Canal("globo");
//		Canal c2 = new Canal("redetv");
//		CanalDAO cd = new CanalDAO();
//		cd.insert(c);
//		cd.insert(c1);
//		cd.insert(c2);
//		CanalDAO cd = new CanalDAO();
//		Canal c2 = cd.selectById(5);
//		c2.setDescricao("sportv");
//		cd.update(c2);
//		cd.delete(c2);
//		cd.deleteById(new BigDecimal(8));
//		cd.deleteByDescricao("globo");

		/** Continente **/
//		Continente al = new Continente("América Latina", "AL");
//		Continente eu = new Continente("Europa", "EU");
//		Continente oc = new Continente("Oceania", "OC");
//		ContinenteDAO cod = new ContinenteDAO();
//		cod.insert(al);
//		cod.insert(oc);
//		Continente al = cod.select("Oceania").get(0);
//		cod.update(al);
//		cod.delete(al);
//		cod.deleteByDescricao("Europa");
//		cod.deleteById(new BigDecimal(3));

		/** Pais **/
//		Continente al = cod.selectById(3);
//		Continente eu = cod.selectById(13);
//		Continente oc = cod.selectById(12);
//		Pais br = new Pais(al, "Brasil", "BR", "brasileiro");
//		Pais it = new Pais(oc, "Itália", "It", "italiano");
//		Pais aus = new Pais(oc, "Austrália", "AUS", "australiano");
//		PaisDAO pd = new PaisDAO();
//		pd.insert(it);
//		pd.insert(aus);
//		pd.insert(br);
//		br = pd.selectByNome("Brasil").get(0);
//		br.setNome("Brasilllllll");
//		pd.update(br);
//		pd.delete(br);
//		pd.deleteById(new BigDecimal(7));
//		pd.deleteByNome("Itália");

		/** Categoria **/
//		Categoria ct = new Categoria(null, "icone", "imagem", "descricao");
//		Categoria ct2 = new Categoria(null, "icone2", "imagem2", "descricao2");
//		CategoriaDAO cd = new CategoriaDAO();
//		cd.insert(ct);
//		cd.insert(ct2);
//		Categoria ct = cd.selectByDescricao("descricao").get(0);
//		Categoria ct2 = cd.selectByDescricao("descricao2").get(0);
//		Categoria ct3 = new Categoria(ct2, "icone3", "imagem3", "descricao3");
//		cd.insert(ct3);
//		cd.deleteById(new BigDecimal(1));
//		cd.deleteByDescricao("descricao3");
//		cd.delete(ct2);		
		
		/** Marca **/
		Marca m1 = new Marca();
		Date d = Calendar.getInstance(Locale.CANADA).getTime();
		m1.setDataCriacao(d);
		m1.setDescricao("shift");
		m1.setGenero('m');
		m1.setIdadeFinal((short)10);
		m1.setIdadeInicial((short)9);
		m1.setLogomarca("logomarca");
		m1.setNome("Quip");
		m1.setStatus('q');
		MarcaDAO m = new MarcaDAO();
		m.insert(m1);
		m1.setNome("Quip22");
		m.insert(m1);
		m1.setNome("TEst22");
		m.update(m1);
		m.delete(m1);
		m.deleteById(new BigDecimal(1));
//		
//		MarcaCanal mc = new MarcaCanal(m1, c);
//		mc.setFormaAcesso("forma");
//		mc.setAbrangencia("abrag");
//		mc.setObservacoes("test");
//		MarcaCanalDAO mcd = new MarcaCanalDAO();
//		mcd.insert(mc);
//		
//		PaisMarca pm = new PaisMarca(m1, br);
//		PaisMarcaDAO pmd = new PaisMarcaDAO();
//		pmd.insert(pm);

	}

}
