/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fasam.projetoexemplo;

import br.com.fasam.projetoexemplo.entidades.Artigo;
import br.com.fasam.projetoexemplo.entidades.Usuario;
import junit.framework.TestCase;

/**
 *
 * @author Otávio
 */
public class ArtigoTest extends TestCase {
    
    public ArtigoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testUsuarioEmArtigo() {
        Artigo artigo = new Artigo(new Usuario());
        
        assertNotNull(artigo.getUsuario());
    }
}
