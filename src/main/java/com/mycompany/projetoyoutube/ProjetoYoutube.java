package com.mycompany.projetoyoutube;
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Titanic");
        v[1] = new Video("Harry Potter");
        v[2] = new Video("Greys Anatomy");
        
        /*System.out.println("----- VÍDEOS -----");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());*/
        
        Usuario p[] = new Usuario[2];
        p[0] = new Usuario("Giovana", 25, "F", "Nogg");
        p[1] = new Usuario("Henrique", 22, "M", "Henriquepvro");
        
        /*System.out.println("----- USUÁRIOS -----");;
        System.out.println(p[0].toString());
        System.out.println(p[1].toString());*/
        
        
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(p[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(p[0], v[2]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        
                
        
    }
}
